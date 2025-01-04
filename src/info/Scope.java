package info;

import java.util.ArrayList;
import java.util.List;

import annotated_tree.FunctionDefinition;

public class Scope {
	public int start;
	public int stop;

	public ArrayList<VariableInfo> variables = new ArrayList<VariableInfo>();
	public ArrayList<BlockInfo> blocks = new ArrayList<BlockInfo>();
	public ArrayList<StructInfo> structs = new ArrayList<StructInfo>();
	
	public Scope(int start, int stop) {
		this.start = start;
		this.stop = stop;
	}
	
	public void inherit(Scope parent) {
		variables.addAll(parent.variables);
		blocks.addAll(parent.blocks);
		structs.addAll(parent.structs);
	}
}
