package annotated_tree;

import editor.MyDocument;
import info.ParsingInfo;

public class StructDeclaration extends AnnotatedTree{
	FullySpecifiedType type;
	StructDeclarator[] declarators;
	
	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		
	}

	@Override
	public void build() {
		type = (FullySpecifiedType) children.get(0);
		declarators = children.stream().filter(e -> StructDeclarator.class.isInstance(e))
				.map(e -> StructDeclarator.class.cast(e)).toArray(StructDeclarator[]::new);
	}
}
