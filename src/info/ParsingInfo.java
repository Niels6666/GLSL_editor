package info;

import java.util.ArrayList;

import annotated_tree.AnnotatedTree;

public class ParsingInfo {
	public AnnotatedTree tree;
	
	public ArrayList<FunctionInfo> functions;
	public ArrayList<VariableInfo> variables;
	public ArrayList<BlockInfo> blocks;
	public ArrayList<StructInfo> structs;
	
	public ArrayList<Scope> scopes;
}
