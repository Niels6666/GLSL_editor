package annotated_tree;

import java.util.Arrays;
import java.util.List;

import editor.MyDocument;
import info.ParsingInfo;
import language.SyntaxHighlighting;

public class StructDeclarator extends AnnotatedTree {
	Pointer pointer;
	Identifier name;
	ArraySpecifier arraySpec;

	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		name.type = SyntaxHighlighting.TYPE_MEMBER_TYPE;
	}

	@Override
	public void build() {
		List<Object> types = Arrays.asList(children.stream().map(e -> e.getClass()).toArray());
		int indexOf = types.indexOf(Pointer.class);
		if (indexOf != -1) {
			pointer = (Pointer) children.get(indexOf);
		}
		indexOf = types.indexOf(Identifier.class);
		if (indexOf != -1) {
			name = (Identifier) children.get(indexOf);
		}
		indexOf = types.indexOf(ArraySpecifier.class);
		if (indexOf != -1) {
			arraySpec = (ArraySpecifier) children.get(indexOf);
		}
	}
}
