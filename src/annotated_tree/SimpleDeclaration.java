package annotated_tree;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import editor.MyDocument;
import info.ParsingInfo;

public class SimpleDeclaration extends AnnotatedTree{
	boolean global = false;

	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		
	}

	@Override
	protected void buildTree() {
		for(AnnotatedTree child: children) {
			child.buildTree();
		}		
	}
}
