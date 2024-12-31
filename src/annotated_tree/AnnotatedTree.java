package annotated_tree;

import java.util.ArrayList;
import java.util.List;

import editor.MyDocument;
import info.ParsingInfo;
import info.Scope;

public abstract class AnnotatedTree {
	protected List<AnnotatedTree> children = new ArrayList<>();
	protected AnnotatedTree parent;

	public void addChild(AnnotatedTree child) {
		children.add(child);
		child.parent = this;
	}

	public int getChildCount() {
		return children.size();
	}

	public AnnotatedTree getChild(int index) {
		return children.get(index);
	}

	public abstract void build();

	public abstract void analyse(MyDocument document, ParsingInfo info);

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
	
	protected Scope getScope(int offset, ParsingInfo info){
		Scope result = null;
		for(Scope scope : info.scopes) {
			if(scope.start < offset && offset > scope.stop) {
				if(result != null) {
					if((result.stop - result.start) > (scope.stop - scope.start)) {
						result = scope;
					}
				}else {
					result = scope;
				}
			}
		}
		return result;
	}

}
