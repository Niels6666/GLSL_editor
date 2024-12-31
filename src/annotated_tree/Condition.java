package annotated_tree;

import editor.MyDocument;
import info.ParsingInfo;
import language.SyntaxHighlighting;

public class Condition extends AnnotatedTree{
	Identifier variable;
	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		variable.type = SyntaxHighlighting.LOCALVAR_IDENTIFIER_TYPE;
	}

	@Override
	public void build() {
		if(children.get(1) instanceof Pointer) {
			variable = (Identifier) children.get(2);
		}else {
			variable = (Identifier) children.get(1);
		}
	}
}
