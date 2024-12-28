package annotated_tree;

import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import editor.MyDocument;
import info.ParsingInfo;
import language.SyntaxHighlighting;

public class TypelessDeclaration extends AnnotatedTree{
	boolean global = false;
	Pointer pointer;
	AnnotatedToken name;
	ArraySpecifier arraySpec;
	Initializer initializer;
	
	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		if(global) {
			name.type = SyntaxHighlighting.GLOBAL_IDENTIFIER_TYPE;
		}else {
			name.type = SyntaxHighlighting.LOCALVAR_IDENTIFIER_TYPE;
		}
		
		for(AnnotatedTree child: children) {
			child.analyse(document, info);
		}
	}

	@Override
	protected void buildTree() {
		List<Object> types = Arrays.asList(children.stream().map(e -> e.getClass()).toArray());
		int indexOf = types.indexOf(Pointer.class);
		if (indexOf != -1) {
			pointer = (Pointer) children.get(indexOf);
		}
		
		indexOf = types.indexOf(AnnotatedToken.class);
		if (indexOf != -1) {
			name = (AnnotatedToken) children.get(indexOf);
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
