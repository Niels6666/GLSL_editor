package annotated_tree;

import editor.MyDocument;
import info.ParsingInfo;

public class ArrayAccess extends AnnotatedTree {
	private int dimensions;
	
	public int getDimensions() {
		return dimensions;
	}

	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		dimensions = getChildCount() / 3;
	}
}
