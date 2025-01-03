package annotated_tree;

import javax.swing.text.AttributeSet;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import editor.CodeTree;
import editor.MyDocument;
import info.FunctionInfo;
import info.ParsingInfo;
import info.Scope;
import language.SyntaxHighlighting;

public class Identifier extends AnnotatedTree {
	public Token symbol;
	public int type;

	public Identifier(TerminalNode node) {
		this.symbol = node.getSymbol();
		type = symbol.getType();
	}
	
	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		int offset = symbol.getStartIndex();
		int length = symbol.getText().length();

		AttributeSet highlight = SyntaxHighlighting.getColor(type);
		if (highlight == null) {
			Scope scope = getScope(symbol.getStartIndex(), info);
			if(scope != null) {
				FunctionInfo function = null;
				for(FunctionInfo func:info.functions) {
					
				}
			}
		}

		if (highlight == null) {
			highlight = SyntaxHighlighting.UNKNOWN;
		}
		document.setCharacterAttributes(offset, length, highlight, false);
	}

	
	@Override
	public String toString() {
		String nameType = symbol.getType() == Token.EOF ? "EOF" : CodeTree.names.get(symbol.getType());
		return "[TerminalNode " + symbol.getText() + "<" + nameType + ">" + " ]";
	}

	@Override
	public void build() {
	}

}
