package annotated_tree;

import javax.swing.text.Element;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;

import editor.MyDocument;
import info.ParsingInfo;
import language.SyntaxHighlighting;

public class AnnotatedError extends AnnotatedTree{
	public ErrorNode node;
	
	public AnnotatedError(ErrorNode node) {
		this.node = node;
	}

	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		Token token = node.getSymbol();
		int line = token.getLine();
		int pos = token.getCharPositionInLine();
		Element root = document.getDefaultRootElement();
		Element row = root.getElement(line - 1);
		int offs0 = row.getStartOffset() + pos;
		int offs1 = row.getEndOffset();
		document.setCharacterAttributes(offs0, offs1 - offs0, SyntaxHighlighting.ERROR_HIGHLIGHT, false);
	}

	
	@Override
	public String toString() {
		return "[ErrorNode " + node.getText() + " ]";
	}

	@Override
	public void build() {
	}
}
