package editor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import javax.swing.text.JTextComponent;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;

import info.ParsingInfo;
import info.PreParsingInfo;
import info.Scope;
import language.ParsingAnalyzer;
import language.PreParsingAnalyzer;
import language.SyntaxHighlighting;
import main.java.testNVIDIA.NVIDIALexer;
import main.java.testNVIDIA.NVIDIAParser;
import main.java.testNVIDIA.NVIDIAPreParser;

public class MyDocument extends DefaultStyledDocument implements CaretListener {
	private static final long serialVersionUID = -9031257475378132878L;
	private MyDocumentFilter documentFilter;
	private boolean shiftCaret = false;

	private PreParsingAnalyzer preParsingAnalyzer;
	private ParsingAnalyzer parsingAnalyzer;
	private ParsingInfo info;

	public MyDocument() {
		documentFilter = new MyDocumentFilter();
		preParsingAnalyzer = new PreParsingAnalyzer(this);
		parsingAnalyzer = new ParsingAnalyzer(this);
	}

	public Interval getScope(int offset) {
		if (info != null) {
			Scope scope = info.getScope(offset);
			if (scope != null) {
				return new Interval(scope.start, scope.stop);
			}
		}
		return new Interval(0, getLength());
	}

	@Override
	public DocumentFilter getDocumentFilter() {
		return documentFilter;
	}

	@Override
	public void replace(int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
		super.replace(offset, length, text, attrs);
//		buildAST();
	}

	@Override
	public void remove(int offs, int len) throws BadLocationException {
		super.remove(offs, len);
//		buildAST();
	}

	@Override
	public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
		super.insertString(offs, str, a);
//		buildAST();
	}

	public void buildAST() throws BadLocationException {
		final int length = getLength();
		String text = getText(0, length);

		setCharacterAttributes(0, length, SyntaxHighlighting.COMMENT, true);

		info = null;

		// pre parsing
		{
			NVIDIALexer lexer = new NVIDIALexer(CharStreams.fromString(text));
			CommonTokenStream input = new CommonTokenStream(lexer, NVIDIALexer.DIRECTIVES);
			NVIDIAPreParser parser = new NVIDIAPreParser(input);
			parser.setProfile(false);
			parser.setTrace(false);
			parser.removeErrorListeners();

			ParseTree parseTree = parser.translation_unit(); // root rule
			if (parser.getNumberOfSyntaxErrors() == 0) {
				preParsingAnalyzer.analyze(parseTree);
				PreParsingInfo preParsingInfo = preParsingAnalyzer.info;
				char[] textArray = text.toCharArray();
				for (Token symbol : preParsingInfo.toSkip) {
					int start = symbol.getStartIndex();
					int stop = symbol.getStopIndex() + 1;
					for (int i = start; i < stop; i++) {
						textArray[i] = ' ';
					}
				}
				text = new String(textArray);
			} else {
				preParsingAnalyzer.basicHighlighting(parseTree);
			}
		}

		{
			// parsing
			NVIDIALexer lexer = new NVIDIALexer(CharStreams.fromString(text));
			CommonTokenStream input = new CommonTokenStream(lexer);
			NVIDIAParser parser = new NVIDIAParser(input);
			parser.setProfile(false);
			parser.setTrace(false);
			parser.removeErrorListeners();

			ParseTree parseTree = parser.translation_unit(); // root rule
			if (parser.getNumberOfSyntaxErrors() == 0) {
				info = parsingAnalyzer.analyze(parseTree, preParsingAnalyzer.info);
			} else {
				parsingAnalyzer.basicHighlighting(parseTree);

			}
//			abstractSyntaxTree.buildTree(parseTree);
		}

	}

	public class MyDocumentFilter extends DocumentFilter {
		private static final Set<Character> charInPairs = new HashSet<>(List.of('\'', '\"', '(', '{', '['));
		private static final Map<Character, Character> otherChar = new HashMap<>();
		static {
			otherChar.put('\'', '\'');
			otherChar.put('\"', '\"');
			otherChar.put('(', ')');
			otherChar.put('{', '}');
			otherChar.put('[', ']');
		}

		@Override
		public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
				throws BadLocationException {
			if (length == 0) {// same operation as insertString()
				if (text.length() == 1) {
					char c = text.charAt(0);
					if (charInPairs.contains(c)) {
						char o = otherChar.get(c);
						if (nextNonWhiteSpaceInLine(fb.getDocument(), offset) != o) {
							shiftCaret = true;
							fb.insertString(offset, c + "" + o, attrs);
							return;
						}
					}
				}
				fb.replace(offset, length, text, attrs);
			} else {
				fb.replace(offset, length, text, attrs);
			}
		}

		@Override
		public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
				throws BadLocationException {
			if (string.length() == 1) {
				char c = string.charAt(0);
				if (charInPairs.contains(c)) {
					char o = otherChar.get(c);
					if (nextNonWhiteSpaceInLine(fb.getDocument(), offset) != o) {
						fb.insertString(offset, c + "" + o, attr);
						return;
					}
				}
				fb.insertString(offset, string, attr);
			} else {
				fb.insertString(offset, string, attr);
			}
		}

		private char nextNonWhiteSpaceInLine(Document doc, int offset) throws BadLocationException {
			int limit = doc.getLength();
			if (offset == limit)
				return '\0';
			char next = doc.getText(offset++, 1).charAt(0);
			while (Character.isWhitespace(next) && offset < limit) {
				next = doc.getText(++offset, 1).charAt(0);
			}
			return next;
		}
	}

	@Override
	public void caretUpdate(CaretEvent e) {
		if (shiftCaret) {
			shiftCaret = false;
			JTextComponent component = (JTextComponent) e.getSource();
			component.setCaretPosition(component.getCaretPosition() - 1);
		}
	}

}
