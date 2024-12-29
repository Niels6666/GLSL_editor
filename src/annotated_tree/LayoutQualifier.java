package annotated_tree;

import java.util.ArrayList;
import java.util.Iterator;

import editor.MyDocument;
import info.ParsingInfo;
import language.SyntaxHighlighting;
import main.java.testNVIDIA.NVIDIALexer;

public class LayoutQualifier extends AnnotatedTree {
	AnnotatedToken[] identifiers;

	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		for (AnnotatedToken id : identifiers) {
			id.type = SyntaxHighlighting.LAYOUT_IDENTIFIER_TYPE;
		}
	}

	@Override
	public void build() {
		Iterator<AnnotatedTree> iterator = children.iterator();
		iterator.next(); // LAYOUT
		iterator.next(); // LEFT_PAREN

		ArrayList<AnnotatedToken> result = new ArrayList<>();
		while (iterator.hasNext()) {
			AnnotatedToken token = (AnnotatedToken) iterator.next();
			if (token.symbol.getType() == NVIDIALexer.SHARED) {
				continue;
			}

			result.add(token);

			token = (AnnotatedToken) iterator.next();
			if (token.symbol.getType() == NVIDIALexer.EQUAL) {
				iterator.next(); // constant_expression
				iterator.next(); // COMMA
			}
		}

		identifiers = result.toArray(AnnotatedToken[]::new);
	}
}
