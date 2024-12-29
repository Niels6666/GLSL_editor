package annotated_tree;

import editor.MyDocument;
import info.ParsingInfo;

public class FullySpecifiedType extends AnnotatedTree {
	TypeQualifier qualifier;
	TypeSpecifier specifier;

	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
	}


	@Override
	public void build() {
		AnnotatedTree child0 = children.get(0);
		if(child0 instanceof TypeQualifier) {
			qualifier = (TypeQualifier) child0;
			specifier = (TypeSpecifier) children.get(1);
		}else {
			specifier = (TypeSpecifier) child0;
		}
	}
}
