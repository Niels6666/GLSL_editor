package annotated_tree;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import editor.MyDocument;
import info.ParsingInfo;
import language.SyntaxHighlighting;

public class BlockStructure extends AnnotatedTree {
	boolean global = false;
	TypeQualifier qualifier;
	AnnotatedToken structureName;
	StructDeclaration[] declarations;

	AnnotatedToken instanceName;
	ArraySpecifier instanceArraySpec;

	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		for (AnnotatedTree child : children) {
			child.analyse(document, info);
		}

		structureName.type = SyntaxHighlighting.TYPE_NAME_TYPE;

		if (instanceName != null) {
			instanceName.type = SyntaxHighlighting.GLOBAL_IDENTIFIER_TYPE;
		}
	}

	@Override
	protected void buildTree() {
		qualifier = (TypeQualifier) children.get(0);
		structureName = (AnnotatedToken) children.get(1);

		declarations = children.stream().filter(e -> StructDeclaration.class.isInstance(e))
				.map(e -> StructDeclaration.class.cast(e)).toArray(StructDeclaration[]::new);

		if (children.size() > 5 + declarations.length) {
			instanceName = (AnnotatedToken) children.get(4 + declarations.length);
			AnnotatedTree child5pn = children.get(5 + declarations.length);
			if (child5pn instanceof ArraySpecifier) {
				instanceArraySpec = (ArraySpecifier) child5pn;
			}
		}

		for (AnnotatedTree child : children) {
			child.buildTree();
		}
	}
}
