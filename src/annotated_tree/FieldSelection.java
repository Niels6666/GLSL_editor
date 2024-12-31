package annotated_tree;

import editor.MyDocument;
import info.ParsingInfo;
import language.SyntaxHighlighting;

public class FieldSelection extends AnnotatedTree {
	Identifier variableID;

	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		variableID.type = SyntaxHighlighting.TYPE_MEMBER_TYPE;
	}

	@Override
	public void build() {
		variableID = (Identifier) children.get(getChildCount() - 1);
	}
}
