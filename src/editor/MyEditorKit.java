package editor;

import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Consumer;

import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JEditorPane;
import javax.swing.KeyStroke;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.TabSet;
import javax.swing.text.TabStop;
import javax.swing.text.TextAction;

public class MyEditorKit extends StyledEditorKit {
	private static final long serialVersionUID = -6989337563193982083L;

	private static final MutableAttributeSet TABSIZE = new SimpleAttributeSet();
	static {
		StyleConstants.setTabSet(TABSIZE, new MyTabSet());
	}

	@Override
	public Document createDefaultDocument() {
		MyDocument res = new MyDocument();
		res.setParagraphAttributes(0, res.getLength(), TABSIZE, false);
		return res;
	}

	@Override
	public void install(JEditorPane c) {
		super.install(c);
		installActions(c);
	}

	@Override
	public void deinstall(JEditorPane c) {
		super.deinstall(c);
		deinstallActions(c);
	}

	private void installActions(JEditorPane c) {
		InputMap imp = c.getInputMap();
		ActionMap amp = c.getActionMap();
		for (MyAction a : defaultActions) {
			imp.put(a.keystroke, a.name);
			amp.put(a.name, a);
		}
	}

	private void deinstallActions(JEditorPane c) {
		InputMap imp = c.getInputMap();
		ActionMap amp = c.getActionMap();
		for (MyAction a : defaultActions) {
			imp.remove(a.keystroke);
			amp.remove(a.name);
		}
	}

	private static final MyAction[] defaultActions = new MyAction[] { //
			new MyAction("undo", KeyEvent.VK_Z, InputEvent.CTRL_DOWN_MASK, TextEditor::undo), //
			new MyAction("redo", KeyEvent.VK_Y, InputEvent.CTRL_DOWN_MASK, TextEditor::redo), //
//			new MyAction("paste", KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK, TextEditor::redo), //
			new MyAction("delete-line", KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK, TextEditor::deleteLine),//
	};

	private static class MyAction extends TextAction {
		private static final long serialVersionUID = -8041756314223979847L;

		public final String name;
		public final KeyStroke keystroke;
		public final Consumer<TextEditor> action;

		public MyAction(String name, int keyEvent, int modifiers, Consumer<TextEditor> action) {
			super(name);
			this.name = name;
			this.keystroke = KeyStroke.getKeyStroke(keyEvent, modifiers);
			this.action = action;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			JTextComponent c = getTextComponent(e);
			if (c instanceof TextEditor) {
				action.accept((TextEditor) c);
			}
		}
	}

	private static class MyTabSet extends TabSet {
		private static final int TAB_COUNT = 1_000_000;

		public MyTabSet() {
			super(null);
		}

		@Override
		public TabStop getTab(int index) {
			return new TabStop(index * 32 + 32);
		}

		@Override
		public int getTabCount() {
			return TAB_COUNT;
		}

		@Override
		public int getTabIndex(TabStop tab) {
			float pos = tab.getPosition();
			if (pos % 32 != 0) {
				return -1;
			}
			return Math.round(pos) / 32 - 1;
		}

		@Override
		public TabStop getTabAfter(float location) {
			int index = getTabIndexAfter(location);
			return (index == -1) ? null : getTab(index);
		}

		@Override
		public int getTabIndexAfter(float location) {
			int current, min, max;

			min = 0;
			max = getTabCount();
			while (min != max) {
				current = (max - min) / 2 + min;
				if (location > getPosition(current)) {
					if (min == current) {
						min = max;
					} else {
						min = current;
					}
				} else {
					if (current == 0 || location > getPosition(current - 1)) {
						return current;
					}
					max = current;
				}
			}
			// no tabs after the passed in location.
			return -1;
		}

		private int getPosition(int index) {
			return index * 32 + 32;
		}

		@Override
		public int hashCode() {
			return System.identityHashCode(this);
		}
	}
}
