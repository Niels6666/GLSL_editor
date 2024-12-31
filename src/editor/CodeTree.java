package editor;

import java.lang.reflect.Field;
import java.util.HashMap;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import annotated_tree.AnnotatedTree;
import main.java.testNVIDIA.NVIDIALexer;

public class CodeTree extends JTree {
	private static final long serialVersionUID = 1L;

	public CodeTree() {
		this.setEditable(false);
	}

	public void buildTree(AnnotatedTree tree) {
		DefaultMutableTreeNode root = new DefaultMutableTreeNode(tree);
		walk(tree, root);
		DefaultTreeModel model = new DefaultTreeModel(root);
		this.setModel(model);
		this.revalidate();
	}

	private static void walk(AnnotatedTree t, DefaultMutableTreeNode node) {
		int n = t.getChildCount();
		if (n == 0)
			return;
		for (int i = 0; i < n; i++) {
			AnnotatedTree child = t.getChild(i);
			DefaultMutableTreeNode childNode = new DefaultMutableTreeNode(child);
			walk(child, childNode);
			node.add(childNode);
		}
	}

	public static final HashMap<Integer, String> names = new HashMap<Integer, String>();

	static {
		Field[] fields = NVIDIALexer.class.getFields();
		for (Field f : fields) {
			if (f.getType().equals(int.class) && f.canAccess(null)) {
				try {
					names.put(f.getInt(null), f.getName());
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
			if (f.getName().equals("SPACE_TAB_8")) {
				break;
			}
		}
	}
	
}
