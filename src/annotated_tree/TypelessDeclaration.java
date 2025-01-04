package annotated_tree;

import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import editor.MyDocument;
import info.ParsingInfo;
import info.Scope;
import info.VariableInfo;
import language.SyntaxHighlighting;

public class TypelessDeclaration extends AnnotatedTree{
	Pointer pointer;
	Identifier name;
	ArraySpecifier arraySpec;
	Initializer initializer;
	
	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		if(parent.parent instanceof TranslationUnit) {
			name.type = SyntaxHighlighting.GLOBAL_IDENTIFIER_TYPE;
			info.variables.add(createInfo());
		}else {
			name.type = SyntaxHighlighting.LOCALVAR_IDENTIFIER_TYPE;
			Scope scope = info.getScope(name.symbol.getStartIndex());
			scope.variables.add(createInfo());
		}
	}

	private VariableInfo createInfo() {
		VariableInfo result = new VariableInfo();
		result.name = name.symbol.getText();
		result.offset = name.symbol.getStartIndex();
		return result;
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
		
		indexOf = types.indexOf(Initializer.class);
		if (indexOf != -1) {
			initializer = (Initializer) children.get(indexOf);
		}
	}
}
