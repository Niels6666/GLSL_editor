package annotated_tree;

import java.util.Arrays;
import java.util.List;

import editor.MyDocument;
import info.ParsingInfo;
import info.Scope;
import info.VariableInfo;
import language.SyntaxHighlighting;

public class StructDeclarator extends AnnotatedTree {
	Pointer pointer;
	Identifier name;
	ArraySpecifier arraySpec;

	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		name.type = SyntaxHighlighting.TYPE_MEMBER_TYPE;
		if (parent.parent instanceof BlockStructure && ((BlockStructure)parent.parent).instanceName == null) {
			Scope scope = info.getScope(name.symbol.getStartIndex());
			VariableInfo varInfo = createInfo();
			if(scope != null) {
				scope.variables.add(varInfo);
				name.type = SyntaxHighlighting.LOCALVAR_IDENTIFIER_TYPE;
			}else {
				info.variables.add(varInfo);
				name.type = SyntaxHighlighting.GLOBAL_IDENTIFIER_TYPE;
			}
		}
	}
	
	private VariableInfo createInfo() {
		VariableInfo res = new VariableInfo();
		res.name = name.symbol.getText();
		res.offset = name.symbol.getStartIndex();
		return res;
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
