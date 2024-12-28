package editor;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;

import editor.AbstractSyntaxTree.ParseTreeWrapper;

public class MainClass {
	public static void main(String[] args) {
//		try {
//			GLSLSpecification.makeBuiltins();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		setWindowsLAF(); // windows look and feel
		setupWindow();
	}

	private static void setWindowsLAF() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	}

	private static void setupWindow() {
		CodeTree tree = new CodeTree();
		TextEditor textEditor = new TextEditor();
		TextLineNumber lineNumbers = new TextLineNumber(textEditor);
		textEditor.getMyDocument().setCodeTree(tree);

//		tree.addTreeSelectionListener(new TreeSelectionListener() {
//
//			@Override
//			public void valueChanged(TreeSelectionEvent e) {
//				ParseTreeWrapper wrapper = (ParseTreeWrapper) ((DefaultMutableTreeNode) e.getPath()
//						.getLastPathComponent()).getUserObject();
//				ParseTree node = wrapper.t;
//				Interval interval = getInterval(node);
//				if (interval != null) {
//					sh.addHighlight(interval.a, interval.b + 1, SyntaxHighlighter.ruleHP);
//				}
//			}
//
//			private Interval getInterval(ParseTree node) {
//				if (node instanceof ParserRuleContext) {
//					Token start = ((ParserRuleContext) node).getStart();
//					Token stop = ((ParserRuleContext) node).getStop();
//					return new Interval(start.getStartIndex(), stop.getStopIndex());
//				}
//				if (node instanceof ErrorNode) {
//					return null;
//				}
//				if (node instanceof TerminalNode) {
//					Token token = ((TerminalNode) node).getSymbol();
//					return new Interval(token.getStartIndex(), token.getStopIndex());
//				}
//				return null;
//			}
//		});

		JScrollPane scrollTree = new JScrollPane();
		scrollTree.setBackground(tree.getBackground());
		scrollTree.getViewport().setView(tree);

		JScrollPane scrollText = new JScrollPane();
		scrollText.setBackground(textEditor.getBackground());
		scrollText.getViewport().setView(textEditor);
		scrollText.setRowHeaderView(lineNumbers);

		// content Pane
		JSplitPane splitPane = new JSplitPane();
		splitPane.setContinuousLayout(true);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setLeftComponent(scrollText);
		splitPane.setRightComponent(scrollTree);
		splitPane.setResizeWeight(0.7);

		JMenuBar menuBar = new JMenuBar();

		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");

		menuBar.add(fileMenu);
		menuBar.add(editMenu);

		JFrame frame = new JFrame("glsl editor");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setMinimumSize(new Dimension(640, 350));
		frame.setLocationRelativeTo(null);
		frame.setContentPane(splitPane);
		frame.setJMenuBar(menuBar);
		frame.setVisible(true);
	}
}
