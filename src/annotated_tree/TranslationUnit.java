package annotated_tree;

import java.util.List;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import editor.MyDocument;
import info.ParsingInfo;
import main.java.testNVIDIA.NVIDIAParser.Translation_unitContext;

public class TranslationUnit extends AnnotatedTree{
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
		for(AnnotatedTree child : children) {
			child.analyse(document, info);
			if(child instanceof FunctionDefinition) {
				
			}
		}
	}
	
	
}