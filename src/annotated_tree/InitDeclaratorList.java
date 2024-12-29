package annotated_tree;

import editor.MyDocument;
import info.ParsingInfo;

public class InitDeclaratorList extends AnnotatedTree{
	FullySpecifiedType type;
	TypelessDeclaration[] declarations;
	
	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
	}


	@Override
	public void build() {
		type = (FullySpecifiedType) children.get(0);
		declarations = children.stream().filter(e -> TypelessDeclaration.class.isInstance(e))
				.map(e -> TypelessDeclaration.class.cast(e)).toArray(TypelessDeclaration[]::new);		
	}
}
