package annotated_tree;

import java.util.ArrayList;
import java.util.List;

import editor.MyDocument;
import info.ParsingInfo;

public abstract class AnnotatedTree {
	protected List<AnnotatedTree> children = new ArrayList<>();
	
	public void addChild(AnnotatedTree child) {
		children.add(child);
	}

	public int getChildCount() {
		return children.size();
	}

	public AnnotatedTree getChild(int index) {
		return children.get(index);
	}
	
	public abstract void analyse(MyDocument document, ParsingInfo info);
	
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
}
