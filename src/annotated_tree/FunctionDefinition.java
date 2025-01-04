package annotated_tree;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Stream;

import editor.MyDocument;
import info.FunctionInfo;
import info.ParsingInfo;
import language.SyntaxHighlighting;

public class FunctionDefinition extends AnnotatedTree {
	FullySpecifiedType type;
	Pointer pointer;
	Identifier name;
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
		res.start = body.rule.getStart().getStartIndex();
		res.stop = body.rule.getStop().getStopIndex();
		res.params = Set.of(Stream.of(parameters).filter(p->p.name != null).map(p -> p.name.symbol.getText()).toArray(String[]::new));
		return res;
	}

	@Override
	public void build() {
		type = (FullySpecifiedType) children.get(0);
		AnnotatedTree child2 = children.get(1);
		if (child2 instanceof Pointer) {
			pointer = (Pointer) child2;
			name = (Identifier) children.get(2);
		} else {
			name = (Identifier) child2;
		}
		body = (CompoundStatement) children.get(children.size() - 1);
		parameters = children.stream().filter(e -> FunctionParameter.class.isInstance(e))
				.map(e -> FunctionParameter.class.cast(e)).toArray(FunctionParameter[]::new);
	}
}
