package info;

import java.util.ArrayList;

import annotated_tree.AnnotatedTree;

public class ParsingInfo {
	public AnnotatedTree tree;
	
	public ArrayList<FunctionInfo> functions = new ArrayList<FunctionInfo>();
	public ArrayList<VariableInfo> variables = new ArrayList<VariableInfo>();
	public ArrayList<BlockInfo> blocks = new ArrayList<BlockInfo>();
	public ArrayList<StructInfo> structs = new ArrayList<StructInfo>();
	
	public ArrayList<Scope> scopes = new ArrayList<Scope>();
	
	public FunctionInfo getFunction(int offset) {
		for(FunctionInfo func : functions) {
			if(func.start <= offset && offset <= func.stop) {
				return func;
			}
		}
		return null;
	}
	
	public Scope getScope(int offset){
		Scope result = null;
		for(Scope scope : scopes) {
			if(scope.start <= offset && offset <= scope.stop) {
				if(result != null) {
					if((result.stop - result.start) > (scope.stop - scope.start)) {
						result = scope;
					}
				}else {
					result = scope;
				}
			}
		}
		return result;
	}
}
