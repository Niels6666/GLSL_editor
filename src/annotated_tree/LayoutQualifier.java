package annotated_tree;

import editor.MyDocument;
import info.ParsingInfo;
import language.SyntaxHighlighting;

public class LayoutQualifier extends AnnotatedTree {
	Identifier[] identifiers;

	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		for (Identifier id : identifiers) {
			id.type = SyntaxHighlighting.LAYOUT_IDENTIFIER_TYPE;
		}
	}

	@Override
	public void build() {
		identifiers = children.stream().filter(e -> Identifier.class.isInstance(e))
				.map(e -> Identifier.class.cast(e)).toArray(Identifier[]::new);
	}
}
