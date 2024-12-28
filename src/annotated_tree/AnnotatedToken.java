package annotated_tree;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import editor.CodeTree;
import editor.MyDocument;
import info.ParsingInfo;

public class AnnotatedToken extends AnnotatedTree {
	public TerminalNode node;
	public int type;

	public AnnotatedToken(TerminalNode node) {
		this.node = node;
		this.type = node.getSymbol().getType();
	}

	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
	}

	
	@Override
	public String toString() {
		Token symbol = node.getSymbol();
		String nameType = symbol.getType() == Token.EOF ? "EOF" : CodeTree.names.get(symbol.getType());
		return "[TerminalNode " + node.getText() + "<" + nameType + ">" + " ]";
	}
}
