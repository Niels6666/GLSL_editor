package annotated_tree;

import org.antlr.v4.runtime.ParserRuleContext;

import editor.MyDocument;
import info.ParsingInfo;
import info.Scope;

public class CompoundStatement extends AnnotatedTree{
	ParserRuleContext rule;
	
	public CompoundStatement(ParserRuleContext rule) {
		this.rule = rule;
	}
	
	@Override
	public void analyse(MyDocument document, ParsingInfo info) {
		int start = rule.getStart().getStartIndex();
		int stop = rule.getStop().getStopIndex();
		Scope scope = new Scope(start, stop);
		info.scopes.add(scope);
	}

	@Override
	public void build() {
		
	}
}
