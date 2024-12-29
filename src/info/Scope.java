package info;

import java.util.ArrayList;
import java.util.List;

import annotated_tree.FunctionDefinition;

public class Scope {
	public int start;
	public int stop;
	public Scope parent;
	public ArrayList<Scope> children;
	
	public ArrayList<VariableInfo> variables;
	public ArrayList<BlockInfo> blocks;
	public ArrayList<StructInfo> structs;
	
	public Scope(int start, int stop) {
		this.start = start;
		this.stop = stop;
	}
}
