package editor;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;

import org.antlr.v4.runtime.misc.Interval;

/**
 * <p>
 * From github : </br>
 * https://github.com/tips4java/tips4java/blob/main/source/TextLineNumber.java
 * </p>
 */
public class TextLineNumber extends JPanel implements CaretListener, DocumentListener {
	private static final long serialVersionUID = -4805391428202814917L;
	private static final Color backgroundColor = new Color(47, 47, 47);
	private static final Color numbersColor = new Color(119, 145, 154);
	private static final Font editorFont = new Font("Consolas", Font.PLAIN, 15);

	private final static Color scopeColor = new Color(30, 118, 150);
	private final static int scopeWidth = 10;

	private TextEditor component;
	private Interval currentScope;

	public TextLineNumber(TextEditor component) {
		this.component = component;
		setBackground(backgroundColor);
		setFont(editorFont);
		component.getDocument().addDocumentListener(this);
		component.addCaretListener(this);

		currentScope = Interval.INVALID;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
		drawLineNumbers(g2d);
		g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
		g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
	}

	private void drawLineNumbers(Graphics2D g2d) {
		// Determine the width of the space available to draw the line number
		FontMetrics fontMetrics = component.getFontMetrics(component.getFont());

		// Determine the rows to draw within the clipped bounds.
		Rectangle clip = g2d.getClipBounds();
		int rowStartOffset = component.viewToModel2D(new Point(0, clip.y));
		int endOffset = component.viewToModel2D(new Point(0, clip.y + clip.height));

		g2d.setColor(numbersColor);
		Element root = component.getDocument().getDefaultRootElement();
		try {
			while (rowStartOffset <= endOffset) {
				// Get the line number as a string and then determine the
				// "X" and "Y" offsets for drawing the string.

				int index = root.getElementIndex(rowStartOffset);
				String lineNumber = String.valueOf(index + 1);

				int stringWidth = fontMetrics.stringWidth(lineNumber);
				int x = getWidth() - stringWidth;

				Rectangle2D r = component.modelToView2D(rowStartOffset);
				int descent = fontMetrics.getDescent();
				int y = (int) (r.getMaxY() - descent);
				g2d.drawString(lineNumber, x, y);

				// Move to the next row
				Element line = root.getElement(index);
				rowStartOffset = line.getEndOffset();
			}
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		
		final int lineHeight = fontMetrics.getHeight();

		final int scopeY = clip.y + (currentScope.a) * lineHeight;
		final int scopeH = (currentScope.b - currentScope.a + 1) * lineHeight;

		g2d.setColor(scopeColor);
		g2d.fillRect(0, scopeY, scopeWidth, scopeH);
	}

	@Override
	public void caretUpdate(CaretEvent e) {
		Element root = component.getDocument().getDefaultRootElement();
		MyDocument doc = component.getMyDocument();
		Interval offsets = doc.getScope(e.getDot());
		int line1 = root.getElementIndex(offsets.a);
		int line2 = root.getElementIndex(offsets.b);
		currentScope = new Interval(line1, line2);
		getParent().repaint();
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		documentChanged();
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		documentChanged();
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
	}

	private void documentChanged() {
		SwingUtilities.invokeLater(this::update);
	}

	private void update() {
		Element root = component.getDocument().getDefaultRootElement();
		int lines = root.getElementCount();
		int digits = (int) (Math.log10(lines) + 1);
		FontMetrics fontMetrics = getFontMetrics(getFont());
		int stringWidth = fontMetrics.charWidth('0') * digits;
		Dimension d = new Dimension(scopeWidth + stringWidth, Integer.MAX_VALUE - 1000000);
		setPreferredSize(d);
		setSize(d);
		getParent().repaint();
	}
}