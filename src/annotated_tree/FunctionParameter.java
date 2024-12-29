package annotated_tree;

import java.util.Arrays;
import java.util.List;

import editor.MyDocument;
import info.ParsingInfo;
import language.SyntaxHighlighting;

public class FunctionParameter extends AnnotatedTree {
	TypeQualifier qualifier;
	TypeSpecifier specifier;
	Pointer pointer;
	AnnotatedToken name;
	ArraySpecifier arraySpec;

	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		if(name != null) {
			name.type = SyntaxHighlighting.PARAMETER_IDENTIFIER_TYPE;
		}
		for(AnnotatedTree child: children) {
			child.analyse(document, info);
		}
	}

	@Override
	public void build() {
		List<Object> types = Arrays.asList(children.stream().map(e -> e.getClass()).toArray());
		int indexOf = types.indexOf(TypeQualifier.class);
		if (indexOf != -1) {
			qualifier = (TypeQualifier) children.get(indexOf);
		}
		indexOf = types.indexOf(TypeSpecifier.class);
		if (indexOf != -1) {
			specifier = (TypeSpecifier) children.get(indexOf);
		}
		indexOf = types.indexOf(Pointer.class);
		if (indexOf != -1) {
			pointer = (Pointer) children.get(indexOf);
		}
		indexOf = types.indexOf(AnnotatedToken.class);
		if (indexOf != -1) {
			name = (AnnotatedToken) children.get(indexOf);
		}
		indexOf = types.indexOf(ArraySpecifier.class);
		if (indexOf != -1) {
			arraySpec = (ArraySpecifier) children.get(indexOf);
		}		
	}

}
