package editor;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Set;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class MyTabbedPane extends JTabbedPane {
	private static final long serialVersionUID = 1L;

	private static class FileTab extends JScrollPane {
		TextEditor editor;
		String pathToFile;

		public FileTab(TextEditor editor, String pathToFile) {
			this.editor = editor;
			this.pathToFile = pathToFile;
			TextLineNumber lineNumbers = new TextLineNumber(editor);

			this.setBackground(editor.getBackground());
			this.getViewport().setView(editor);
			this.setRowHeaderView(lineNumbers);
		}
	}

	private Workspace workspace;

	private HashMap<String, FileTab> tabs = new HashMap<>();

	public MyTabbedPane(Workspace workspace) {
		this.workspace = workspace;
		this.setBackground(Color.gray);
	}

	public void openTab(String pathToFile) throws IOException {
		File file = new File(pathToFile);
		TextEditor textEditor = new TextEditor(file.getName(), true);
		textEditor.setText(Files.readString(file.toPath()));
		FileTab tab = new FileTab(textEditor, pathToFile);
		this.addTab("", tab);
		Box box = Box.createHorizontalBox();
		box.add(textEditor.getTitle());
		box.add(Box.createHorizontalStrut(10));
		box.add(createCloseButton(tab));
		this.setTabComponentAt(this.getTabCount() - 1, box);
		tabs.put(pathToFile, tab);
	}

	public void closeTab(String pathTofile) {

	}

	public String[] getOpenTabs() {
		int count = this.getTabCount();
		String[] res = new String[count];
		for (int i = 0; i < count; i++) {
			res[i] = ((FileTab) getComponentAt(i)).pathToFile;
		}
		return res;
	}

	public String getCurrentTab() {
		int index = getSelectedIndex();
		if (index == -1) {
			return null;
		}
		return ((FileTab) getComponentAt(index)).pathToFile;
	}

	private JButton createCloseButton(Component comp) {
		JButton button = new JButton("╳");
		button.setFont(button.getFont().deriveFont(Font.BOLD));
		button.setBackground(Color.white);
		button.setFocusable(false);
		button.setBorder(null);
		button.setForeground(Color.black);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button.setForeground(Color.red);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				button.setForeground(Color.black);
			}
		});
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int length = getTabCount();
				for (int i = 0; i < length; i++) {
					if (getComponentAt(i) == comp) {
						removeTabAt(i);
						break;
					}
				}
			}
		});
		return button;
	}

	public void close() {
		System.err.println("implement close method in MyTabbedPane.java");
	}
}
