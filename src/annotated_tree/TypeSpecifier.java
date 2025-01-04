package annotated_tree;

import editor.MyDocument;
import info.ParsingInfo;
import language.SyntaxHighlighting;

public class TypeSpecifier extends AnnotatedTree{
	Identifier type;
	
	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		if(type != null) {
			type.type = SyntaxHighlighting.TYPE_NAME_TYPE;
		}
	}

	@Override
	public void build() {
		if(children.get(0) instanceof Identifier) {
			type = (Identifier) children.get(0);
		}
	}
}
