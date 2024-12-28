package annotated_tree;

import editor.MyDocument;
import info.ParsingInfo;

public class InitDeclaratorList extends AnnotatedTree{
	boolean global = false;
	FullySpecifiedType type;
	TypelessDeclaration[] declarations;
	
	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		for(TypelessDeclaration child: declarations) {
			child.global = global;
		}
		
		for(AnnotatedTree child: children) {
			child.analyse(document, info);
		}
	}

	@Override
	protected void buildTree() {
		type = (FullySpecifiedType) children.get(0);
		declarations = children.stream().filter(e -> TypelessDeclaration.class.isInstance(e))
				.map(e -> TypelessDeclaration.class.cast(e)).toArray(TypelessDeclaration[]::new);
		for(AnnotatedTree child: children) {
			child.buildTree();
		}
	}
}
