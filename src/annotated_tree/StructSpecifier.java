package annotated_tree;

import editor.MyDocument;
import info.ParsingInfo;
import language.SyntaxHighlighting;

public class StructSpecifier extends AnnotatedTree{
	Identifier name;
	StructDeclaration[] members;
	
	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		if(name != null) {
			name.type = SyntaxHighlighting.TYPE_NAME_TYPE;
		}
	}

	@Override
	public void build() {
		AnnotatedTree child1 = children.get(1);
		if(child1 instanceof Identifier) {
			name = (Identifier) child1;
		}
		members = children.stream().filter(e -> StructDeclaration.class.isInstance(e))
				.map(e -> StructDeclaration.class.cast(e)).toArray(StructDeclaration[]::new);
	}
}
