package editor;

import java.lang.reflect.Field;
import java.util.HashMap;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import main.java.testNVIDIA.NVIDIALexer;

public class AbstractSyntaxTree extends JTree {
	private static final long serialVersionUID = 1L;

	public AbstractSyntaxTree() {
		this.setEditable(false);
	}

	public void buildTree(ParseTree tree) {
		DefaultMutableTreeNode root = new DefaultMutableTreeNode(new ParseTreeWrapper(tree));
		walk(tree, root);
		DefaultTreeModel model = new DefaultTreeModel(root);
		this.setModel(model);
		this.revalidate();
	}

	public static class ParseTreeWrapper {
		public final ParseTree t;

		public ParseTreeWrapper(ParseTree t) {
			this.t = t;
		}

		@Override
		public String toString() {
			if (t instanceof TerminalNode) {
				Token symbol = ((TerminalNode) t).getSymbol();
				String nameType = symbol.getType() == Token.EOF ? "EOF" : names.get(symbol.getType());
				return "[TerminalNode " + t.getText() + "<" + nameType + ">" + " ]";
			} else if (t instanceof ErrorNode) {
				return "[ErrorNode " + t.getText() + " ]";
			} else {
				RuleNode r = (RuleNode) t;
				return r.getRuleContext().getClass().getSimpleName().replace("Context", "");
			}
		}
	}

	private static void walk(ParseTree t, DefaultMutableTreeNode node) {
		int n = t.getChildCount();
		if (n == 0)
			return;
		for (int i = 0; i < n; i++) {
			ParseTree child = t.getChild(i);
			DefaultMutableTreeNode childNode = new DefaultMutableTreeNode(new ParseTreeWrapper(child));
			walk(child, childNode);
			node.add(childNode);
		}
	}

	private static final HashMap<Integer, String> names = new HashMap<Integer, String>();

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
