package annotated_tree;

import javax.swing.text.AttributeSet;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import editor.CodeTree;
import editor.MyDocument;
import info.ParsingInfo;
import language.SyntaxHighlighting;

public class AnnotatedToken extends AnnotatedTree {
	public TerminalNode node;
	public int type;

	public AnnotatedToken(TerminalNode node) {
		this.node = node;
		this.type = node.getSymbol().getType();
	}

	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		Token token = node.getSymbol();
		int offset = token.getStartIndex();
		int length = token.getText().length();

		AttributeSet highlight = SyntaxHighlighting.getColor(token);
		if (highlight == null) {
			highlight = SyntaxHighlighting.UNKNOWN;
		}
		document.setCharacterAttributes(offset, length, highlight, false);
	}

	
	@Override
	public String toString() {
		Token symbol = node.getSymbol();
		String nameType = symbol.getType() == Token.EOF ? "EOF" : CodeTree.names.get(symbol.getType());
		return "[TerminalNode " + node.getText() + "<" + nameType + ">" + " ]";
	}

	@Override
	protected void buildTree() {
	}
}
