package annotated_tree;

import editor.MyDocument;
import info.FunctionInfo;
import info.ParsingInfo;
import language.SyntaxHighlighting;

public class FunctionDefinition extends AnnotatedTree {
	FullySpecifiedType type;
	Pointer pointer;
	AnnotatedToken name;
	FunctionParameter[] parameters;
	CompoundStatement body;

	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		name.type = SyntaxHighlighting.FUNCTION_DECLARATION_TYPE;
		info.functions.add(createInfo());
	}
	
	private FunctionInfo createInfo() {
		FunctionInfo res = new FunctionInfo();
		res.name = name.toString();
		
		return res;
	}

	@Override
	public void build() {
		type = (FullySpecifiedType) children.get(0);
		AnnotatedTree child2 = children.get(1);
		if (child2 instanceof Pointer) {
			pointer = (Pointer) child2;
			name = (AnnotatedToken) children.get(2);
		} else {
			name = (AnnotatedToken) child2;
		}
		body = (CompoundStatement) children.get(children.size() - 1);
		parameters = children.stream().filter(e -> FunctionParameter.class.isInstance(e))
				.map(e -> FunctionParameter.class.cast(e)).toArray(FunctionParameter[]::new);
	}
}
