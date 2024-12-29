package annotated_tree;

import java.util.List;

import editor.MyDocument;
import info.ParsingInfo;
import info.Scope;
import main.java.testNVIDIA.NVIDIAParser.Translation_unitContext;

public class TranslationUnit extends AnnotatedTree {
	private Translation_unitContext ruleContext;

	public TranslationUnit(Translation_unitContext ruleContext) {
		this.ruleContext = ruleContext;
	}

	private List<FunctionDefinition> functions;
	private List<FunctionPrototype> prototypes;
	private List<InitDeclaratorList> declarations;
	private List<BlockStructure> blockStructures;
	private List<SimpleDeclaration> simpleDeclarations;

	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		
	}

	@Override
	public void build() {
		functions = children.stream().filter(e -> FunctionDefinition.class.isInstance(e))
				.map(e -> FunctionDefinition.class.cast(e)).toList();
		prototypes = children.stream().filter(e -> FunctionPrototype.class.isInstance(e))
				.map(e -> FunctionPrototype.class.cast(e)).toList();
		declarations = children.stream().filter(e -> InitDeclaratorList.class.isInstance(e))
				.map(e -> InitDeclaratorList.class.cast(e)).toList();
		blockStructures = children.stream().filter(e -> BlockStructure.class.isInstance(e))
				.map(e -> BlockStructure.class.cast(e)).toList();
		simpleDeclarations = children.stream().filter(e -> SimpleDeclaration.class.isInstance(e))
				.map(e -> SimpleDeclaration.class.cast(e)).toList();

	}

}