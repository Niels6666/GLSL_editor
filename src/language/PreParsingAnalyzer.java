package language;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import editor.MyDocument;
import info.PreParsingInfo;
import main.java.testNVIDIA.NVIDIALexer;
import main.java.testNVIDIA.NVIDIAPreParser.BehaviorContext;
import main.java.testNVIDIA.NVIDIAPreParser.Compiler_directiveContext;
import main.java.testNVIDIA.NVIDIAPreParser.Constant_expressionContext;
import main.java.testNVIDIA.NVIDIAPreParser.Define_directiveContext;
import main.java.testNVIDIA.NVIDIAPreParser.Elif_directiveContext;
import main.java.testNVIDIA.NVIDIAPreParser.Else_directiveContext;
import main.java.testNVIDIA.NVIDIAPreParser.Endif_directiveContext;
import main.java.testNVIDIA.NVIDIAPreParser.Error_directiveContext;
import main.java.testNVIDIA.NVIDIAPreParser.Error_messageContext;
import main.java.testNVIDIA.NVIDIAPreParser.Extension_directiveContext;
import main.java.testNVIDIA.NVIDIAPreParser.Extension_nameContext;
import main.java.testNVIDIA.NVIDIAPreParser.Glsl_file_nameContext;
import main.java.testNVIDIA.NVIDIAPreParser.Group_of_linesContext;
import main.java.testNVIDIA.NVIDIAPreParser.If_directiveContext;
import main.java.testNVIDIA.NVIDIAPreParser.Ifdef_directiveContext;
import main.java.testNVIDIA.NVIDIAPreParser.Ifndef_directiveContext;
import main.java.testNVIDIA.NVIDIAPreParser.Include_directiveContext;
import main.java.testNVIDIA.NVIDIAPreParser.Line_directiveContext;
import main.java.testNVIDIA.NVIDIAPreParser.Line_expressionContext;
import main.java.testNVIDIA.NVIDIAPreParser.Macro_esc_newlineContext;
import main.java.testNVIDIA.NVIDIAPreParser.Macro_identifierContext;
import main.java.testNVIDIA.NVIDIAPreParser.Macro_nameContext;
import main.java.testNVIDIA.NVIDIAPreParser.Macro_textContext;
import main.java.testNVIDIA.NVIDIAPreParser.Macro_text_Context;
import main.java.testNVIDIA.NVIDIAPreParser.NumberContext;
import main.java.testNVIDIA.NVIDIAPreParser.OffContext;
import main.java.testNVIDIA.NVIDIAPreParser.OnContext;
import main.java.testNVIDIA.NVIDIAPreParser.Pragma_debugContext;
import main.java.testNVIDIA.NVIDIAPreParser.Pragma_directiveContext;
import main.java.testNVIDIA.NVIDIAPreParser.Pragma_optimizeContext;
import main.java.testNVIDIA.NVIDIAPreParser.ProfileContext;
import main.java.testNVIDIA.NVIDIAPreParser.Program_textContext;
import main.java.testNVIDIA.NVIDIAPreParser.StdglContext;
import main.java.testNVIDIA.NVIDIAPreParser.Translation_unitContext;
import main.java.testNVIDIA.NVIDIAPreParser.Undef_directiveContext;
import main.java.testNVIDIA.NVIDIAPreParser.Version_directiveContext;
import main.java.testNVIDIA.NVIDIAPreParserBaseListener;
import main.java.testNVIDIA.NVIDIAPreParserListener;

public class PreParsingAnalyzer extends NVIDIAPreParserBaseListener {
	public PreParsingInfo info;
	private MyDocument document;

	public PreParsingAnalyzer(MyDocument document) {
		this.document = document;
	}

	public PreParsingInfo analyze(ParseTree parseTree) {
		info = new PreParsingInfo();
		ParseTreeWalker.DEFAULT.walk(this, parseTree);
		return info;
	}

	@Override
	public void visitTerminal(TerminalNode node) {
		Token token = node.getSymbol();
		final int type = token.getType();
		final String text = token.getText();
		
		if (type == NVIDIALexer.PROGRAM_TEXT) {
			return;
		} else {
			info.toSkip.add(token);
		}
		
		if(type == NVIDIALexer.GLSL_FILE_NAME) {
			info.includes.add(text);
		}

		int offset = token.getStartIndex();
		int length = text.length();
		AttributeSet highlight = SyntaxHighlighting.getColor(token.getType());
		document.setCharacterAttributes(offset, length, highlight, true);
	}
	

	@Override
	public void visitErrorNode(ErrorNode node) {
		Token token = node.getSymbol();
		int line = token.getLine();
		int pos = token.getCharPositionInLine();
		Element root = document.getDefaultRootElement();
		Element row = root.getElement(line - 1);
		int offs0 = row.getStartOffset() + pos;
		int offs1 = row.getEndOffset();
		document.setCharacterAttributes(offs0, offs1-offs0, SyntaxHighlighting.ERROR_HIGHLIGHT, false);
	}
}
