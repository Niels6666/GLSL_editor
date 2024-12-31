package annotated_tree;

import editor.MyDocument;
import info.ParsingInfo;
import language.SyntaxHighlighting;

public class PrimaryExpression extends AnnotatedTree{
	Identifier identifier;

	@Override
	public void build() {
		if(children.get(0) instanceof Identifier) {
			identifier = (Identifier) children.get(0);
		}
	}

	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		if(identifier != null) {
			identifier.type = SyntaxHighlighting.LOCALVAR_IDENTIFIER_TYPE;
		}
	}
	
}
