package annotated_tree;

import javax.swing.text.AttributeSet;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import editor.MyDocument;
import info.ParsingInfo;
import language.SyntaxHighlighting;

public class AnnotatedToken extends AnnotatedTree {
	public Token symbol;

	public AnnotatedToken(TerminalNode node) {
		this.symbol = node.getSymbol();
	}

	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		int offset = symbol.getStartIndex();
		int length = symbol.getText().length();

		AttributeSet highlight = SyntaxHighlighting.getColor(symbol.getType());
		if (highlight == null) {
			highlight = SyntaxHighlighting.UNKNOWN;
		}
		document.setCharacterAttributes(offset, length, highlight, false);
	}

	
	public String toString() {
		return "[TerminalNode " + symbol.getText() + " ]";
	}

	@Override
	public void build() {
	}
}
