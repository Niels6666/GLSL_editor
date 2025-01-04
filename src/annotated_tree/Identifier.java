package annotated_tree;

import javax.swing.text.AttributeSet;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import editor.MyDocument;
import info.FunctionInfo;
import info.ParsingInfo;
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
		String text = symbol.getText();
		int length = text.length();

		AttributeSet highlight = SyntaxHighlighting.getColor(type);
		if (highlight == null) {
			FunctionInfo function = info.getFunction(offset);
			if (function != null) {
				if (function.params.contains(text)) {
					this.type = SyntaxHighlighting.PARAMETER_IDENTIFIER_TYPE;
				}

				if (info.getScope(offset).variables.stream().anyMatch(v -> v.name.equals(text))) {
					this.type = SyntaxHighlighting.LOCALVAR_IDENTIFIER_TYPE;
				}

				if (info.variables.stream().anyMatch(v -> v.name.equals(text))) {
					this.type = SyntaxHighlighting.GLOBAL_IDENTIFIER_TYPE;
				}
			}
		}

		highlight = SyntaxHighlighting.getColor(type);
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
