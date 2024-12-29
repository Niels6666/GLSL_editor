package annotated_tree;

import editor.MyDocument;
import info.ParsingInfo;

public class ArraySpecifier extends AnnotatedTree{

	private int dimensions;
	
	public int getDimensions() {
		return dimensions;
	}

	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		
	}

	@Override
	public void build() {
		dimensions = getChildCount() / 3;
	}
}
