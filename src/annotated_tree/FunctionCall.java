package annotated_tree;

import editor.MyDocument;
import info.ParsingInfo;
import language.SyntaxHighlighting;

public class FunctionCall extends AnnotatedTree {
	Identifier name;

	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		if(name != null) {
			name.type = SyntaxHighlighting.FUNCTION_CALL_TYPE;
		}
	}

	@Override
	public void build() {
		AnnotatedTree child = children.get(0);
		if(child instanceof PrimaryExpression && child.getChild(0) instanceof Identifier) {
			name = (Identifier) child.getChild(0);
			children.set(0, name);
		}
	}
}
