package annotated_tree;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import editor.MyDocument;
import info.ParsingInfo;
import main.java.testNVIDIA.NVIDIAParser.Translation_unitContext;

public class TranslationUnit extends AnnotatedTree {

	private Translation_unitContext ruleContext;

	public TranslationUnit(Translation_unitContext ruleContext) {
		this.ruleContext = ruleContext;
	}

	private ArrayList<FunctionDefinition> functions;
	private ArrayList<FunctionPrototype> prototypes;
	private ArrayList<InitDeclaratorList> declarations;
	private ArrayList<BlockStructure> blockStructures;
	private ArrayList<SimpleDeclaration> simpleDeclarations;

	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		declarations.forEach(e->e.global = true);
		blockStructures.forEach(e->e.global = true);
		simpleDeclarations.forEach(e->e.global = true);

		for(AnnotatedTree child: children) {
			child.analyse(document, info);
		}
	}

	@Override
	protected void buildTree() {
		functions.addAll(children.stream().filter(e -> FunctionDefinition.class.isInstance(e))
				.map(e -> FunctionDefinition.class.cast(e)).toList());
		prototypes.addAll(children.stream().filter(e -> FunctionPrototype.class.isInstance(e))
				.map(e -> FunctionPrototype.class.cast(e)).toList());
		declarations.addAll(children.stream().filter(e -> InitDeclaratorList.class.isInstance(e))
				.map(e -> InitDeclaratorList.class.cast(e)).toList());
		blockStructures.addAll(children.stream().filter(e -> BlockStructure.class.isInstance(e))
				.map(e -> BlockStructure.class.cast(e)).toList());
		simpleDeclarations.addAll(children.stream().filter(e -> SimpleDeclaration.class.isInstance(e))
				.map(e -> SimpleDeclaration.class.cast(e)).toList());
		
		for(AnnotatedTree child: children) {
			child.buildTree();
		}
		
	}

}