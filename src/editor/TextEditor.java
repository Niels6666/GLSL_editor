package editor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Point2D;

import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.EditorKit;
import javax.swing.text.Element;
import javax.swing.undo.UndoManager;
import javax.swing.undo.UndoableEdit;

public class TextEditor extends JTextPane implements UndoableEditListener {
	private static final long serialVersionUID = 3287125221658043840L;
	private static final Color backgroundColor = new Color(57, 57, 57);
	private static final Font editorFont = new Font("Consolas", Font.PLAIN, 15);

	private String title;
	private JLabel label;

	private UndoManager undoManager = new UndoManager();

	public TextEditor(String title, boolean editable) {
		this.setFont(editorFont);
		this.setBackground(backgroundColor);
		this.setCaretColor(Color.white);
		this.setEditable(editable);
		this.getDocument().addUndoableEditListener(this);

		this.title = title;
		this.label = new JLabel(title);
	}

	public JLabel getTitle() {
		return label;
	}

	@Override
	public void setDocument(Document doc) {
		Document old = getDocument();
		if (old instanceof MyDocument) {
			this.removeCaretListener((MyDocument) old);
		}

		if (!(doc instanceof MyDocument)) {
			throw new IllegalArgumentException("doc must be an instance of MyDocument");
		}
		this.addCaretListener((MyDocument) doc);
		super.setDocument(doc);
	}

	@Override
	protected EditorKit createDefaultEditorKit() {
		return new MyEditorKit();
	}

	@Override
	public boolean getScrollableTracksViewportWidth() {
		// https://stackoverflow.com/questions/7156038/how-to-turn-off-jtextpane-line-wrapping
		// Only track viewport width when the viewport is wider than the preferred width
		return getUI().getPreferredSize(this).width <= getParent().getSize().width;
	}

	@Override
	public Dimension getPreferredSize() {
		// https://stackoverflow.com/questions/7156038/how-to-turn-off-jtextpane-line-wrapping
		// Avoid substituting the minimum width for the preferred width when the
		// viewport is too narrow
		return getUI().getPreferredSize(this);
	}

	public MyDocument getMyDocument() {
		return (MyDocument) getDocument();
	}

	@Override
	public void setText(String t) {
		super.setText(t);
		undoManager.discardAllEdits();
	}

	@Override
	public void undoableEditHappened(UndoableEditEvent e) {
		UndoableEdit edit = e.getEdit();
		if (edit.getPresentationName().equals("style change")) {
			return;
		}
		try {
			getMyDocument().buildAST();
		} catch (BadLocationException e1) {
			e1.printStackTrace();
		}
		undoManager.undoableEditHappened(e);
	}

	public void undo() {
		if (undoManager.canUndo()) {
			undoManager.undo();
		}
	}

	public void redo() {
		if (undoManager.canRedo()) {
			undoManager.redo();
		}
	}

	public void deleteLine() {
		Caret caret = this.getCaret();
		int dot = caret.getDot();
		int mark = caret.getMark();
		int start = Math.min(dot, mark);
		int end = Math.max(dot, mark);

		Document doc = getDocument();

		Element root = doc.getDefaultRootElement();
		int p0 = root.getElement(root.getElementIndex(start)).getStartOffset() - 1;
		int p1 = root.getElement(root.getElementIndex(end)).getEndOffset() - 1;
		p0 = Math.max(p0, 0);
		try {
			doc.remove(p0, p1 - p0);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		caret.setDot(Math.min(start, doc.getLength()));
	}
}