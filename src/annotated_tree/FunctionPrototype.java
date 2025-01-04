package annotated_tree;

import java.util.Set;
import java.util.stream.Stream;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import editor.MyDocument;
import info.FunctionInfo;
import info.ParsingInfo;
import language.SyntaxHighlighting;

public class FunctionPrototype extends AnnotatedTree{
	FullySpecifiedType type;
	Pointer pointer;
	Identifier name;
	FunctionParameter[] parameters;
	
	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		name.type = SyntaxHighlighting.FUNCTION_DECLARATION_TYPE;
		info.functions.add(createInfo());
	}
	
	private FunctionInfo createInfo() {
		FunctionInfo res = new FunctionInfo();
		res.name = name.toString();
		res.start = -1;
		res.stop = -1;
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
		parameters = children.stream().filter(e -> FunctionParameter.class.isInstance(e))
				.map(e -> FunctionParameter.class.cast(e)).toArray(FunctionParameter[]::new);
				
	}
}
