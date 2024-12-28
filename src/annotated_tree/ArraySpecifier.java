package annotated_tree;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import editor.MyDocument;
import info.ParsingInfo;

public class ArraySpecifier extends AnnotatedTree{

	private int dimensions;
	
	public int getDimensions() {
		return dimensions;
	}

	@Override
	protected void buildTree() {
		dimensions = getChildCount() / 3;
	}
	
	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		
	}
}
