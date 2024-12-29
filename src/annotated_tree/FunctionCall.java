package annotated_tree;

import editor.MyDocument;
import info.ParsingInfo;
import language.SyntaxHighlighting;

public class FunctionCall extends AnnotatedTree{
	AnnotatedToken name;
	
	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		if(name != null) {
			name.type = SyntaxHighlighting.FUNCTION_CALL_TYPE;
		}
	}

	@Override
	public void build() {
		name = (AnnotatedToken) children.get(0);
	}
}
