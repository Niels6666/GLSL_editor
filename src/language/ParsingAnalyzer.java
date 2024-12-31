package language;

import java.util.Stack;

import javax.swing.text.AttributeSet;
import javax.swing.text.Element;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import annotated_tree.AnnotatedToken;
import annotated_tree.AnnotatedTree;
import annotated_tree.ArrayAccess;
import annotated_tree.ArraySpecifier;
import annotated_tree.AssignmentExpression;
import annotated_tree.BinaryExpression;
import annotated_tree.BlockStructure;
import annotated_tree.CaseLabel;
import annotated_tree.CastExpression;
import annotated_tree.CompoundStatement;
import annotated_tree.Condition;
import annotated_tree.ConstructorCall;
import annotated_tree.DeclarationStatement;
import annotated_tree.ExpressionStatement;
import annotated_tree.FieldSelection;
import annotated_tree.FullySpecifiedType;
import annotated_tree.FunctionCall;
import annotated_tree.FunctionDefinition;
import annotated_tree.FunctionParameter;
import annotated_tree.FunctionPrototype;
import annotated_tree.Identifier;
import annotated_tree.InitDeclaratorList;
import annotated_tree.Initializer;
import annotated_tree.IterationStatement;
import annotated_tree.JumpStatement;
import annotated_tree.LayoutQualifier;
import annotated_tree.Pointer;
import annotated_tree.PrimaryExpression;
import annotated_tree.SelectionStatement;
import annotated_tree.SimpleDeclaration;
import annotated_tree.StorageQualifier;
import annotated_tree.StructDeclaration;
import annotated_tree.StructDeclarator;
import annotated_tree.StructSpecifier;
import annotated_tree.SwitchStatement;
import annotated_tree.TernaryOperation;
import annotated_tree.TranslationUnit;
import annotated_tree.TypeQualifier;
import annotated_tree.TypeSpecifier;
import annotated_tree.TypelessDeclaration;
import annotated_tree.UnaryExpression;
import editor.MyDocument;
import info.ParsingInfo;
import info.PreParsingInfo;
import main.java.testNVIDIA.NVIDIAParser.Array_specifierContext;
import main.java.testNVIDIA.NVIDIAParser.Assignment_expressionContext;
import main.java.testNVIDIA.NVIDIAParser.Assignment_operatorContext;
import main.java.testNVIDIA.NVIDIAParser.Binary_expressionContext;
import main.java.testNVIDIA.NVIDIAParser.Case_labelContext;
import main.java.testNVIDIA.NVIDIAParser.Cast_expressionContext;
import main.java.testNVIDIA.NVIDIAParser.Compound_statementContext;
import main.java.testNVIDIA.NVIDIAParser.Compound_statement_no_new_scopeContext;
import main.java.testNVIDIA.NVIDIAParser.ConditionContext;
import main.java.testNVIDIA.NVIDIAParser.Constant_expressionContext;
import main.java.testNVIDIA.NVIDIAParser.DeclarationContext;
import main.java.testNVIDIA.NVIDIAParser.Declaration_statementContext;
import main.java.testNVIDIA.NVIDIAParser.DimensionContext;
import main.java.testNVIDIA.NVIDIAParser.ExpressionContext;
import main.java.testNVIDIA.NVIDIAParser.Expression_statementContext;
import main.java.testNVIDIA.NVIDIAParser.External_declarationContext;
import main.java.testNVIDIA.NVIDIAParser.For_init_statementContext;
import main.java.testNVIDIA.NVIDIAParser.For_rest_statementContext;
import main.java.testNVIDIA.NVIDIAParser.Fully_specified_typeContext;
import main.java.testNVIDIA.NVIDIAParser.Function_call_parametersContext;
import main.java.testNVIDIA.NVIDIAParser.Function_definitionContext;
import main.java.testNVIDIA.NVIDIAParser.Function_parametersContext;
import main.java.testNVIDIA.NVIDIAParser.Function_prototypeContext;
import main.java.testNVIDIA.NVIDIAParser.Identifier_listContext;
import main.java.testNVIDIA.NVIDIAParser.Init_declarator_listContext;
import main.java.testNVIDIA.NVIDIAParser.InitializerContext;
import main.java.testNVIDIA.NVIDIAParser.Initializer_listContext;
import main.java.testNVIDIA.NVIDIAParser.Integer_expressionContext;
import main.java.testNVIDIA.NVIDIAParser.Interpolation_qualifierContext;
import main.java.testNVIDIA.NVIDIAParser.Invariant_qualifierContext;
import main.java.testNVIDIA.NVIDIAParser.Iteration_statementContext;
import main.java.testNVIDIA.NVIDIAParser.Jump_statementContext;
import main.java.testNVIDIA.NVIDIAParser.Layout_qualifierContext;
import main.java.testNVIDIA.NVIDIAParser.Layout_qualifier_idContext;
import main.java.testNVIDIA.NVIDIAParser.Layout_qualifier_id_listContext;
import main.java.testNVIDIA.NVIDIAParser.Parameter_declarationContext;
import main.java.testNVIDIA.NVIDIAParser.Parameter_declaratorContext;
import main.java.testNVIDIA.NVIDIAParser.Parameter_type_specifierContext;
import main.java.testNVIDIA.NVIDIAParser.PointerContext;
import main.java.testNVIDIA.NVIDIAParser.Postfix_expressionContext;
import main.java.testNVIDIA.NVIDIAParser.Precise_qualifierContext;
import main.java.testNVIDIA.NVIDIAParser.Precision_qualifierContext;
import main.java.testNVIDIA.NVIDIAParser.Primary_expressionContext;
import main.java.testNVIDIA.NVIDIAParser.Selection_rest_statementContext;
import main.java.testNVIDIA.NVIDIAParser.Selection_statementContext;
import main.java.testNVIDIA.NVIDIAParser.Simple_statementContext;
import main.java.testNVIDIA.NVIDIAParser.Single_declarationContext;
import main.java.testNVIDIA.NVIDIAParser.Single_type_qualifierContext;
import main.java.testNVIDIA.NVIDIAParser.StatementContext;
import main.java.testNVIDIA.NVIDIAParser.Statement_listContext;
import main.java.testNVIDIA.NVIDIAParser.Statement_no_new_scopeContext;
import main.java.testNVIDIA.NVIDIAParser.Storage_qualifierContext;
import main.java.testNVIDIA.NVIDIAParser.Struct_declarationContext;
import main.java.testNVIDIA.NVIDIAParser.Struct_declaration_listContext;
import main.java.testNVIDIA.NVIDIAParser.Struct_declaratorContext;
import main.java.testNVIDIA.NVIDIAParser.Struct_declarator_listContext;
import main.java.testNVIDIA.NVIDIAParser.Struct_specifierContext;
import main.java.testNVIDIA.NVIDIAParser.Switch_statementContext;
import main.java.testNVIDIA.NVIDIAParser.Translation_unitContext;
import main.java.testNVIDIA.NVIDIAParser.Type_nameContext;
import main.java.testNVIDIA.NVIDIAParser.Type_name_listContext;
import main.java.testNVIDIA.NVIDIAParser.Type_qualifierContext;
import main.java.testNVIDIA.NVIDIAParser.Type_specifierContext;
import main.java.testNVIDIA.NVIDIAParser.Type_specifier_nonarrayContext;
import main.java.testNVIDIA.NVIDIAParser.Typeless_declarationContext;
import main.java.testNVIDIA.NVIDIAParser.Unary_expressionContext;
import main.java.testNVIDIA.NVIDIAParser.Unary_operatorContext;
import main.java.testNVIDIA.NVIDIALexer;
import main.java.testNVIDIA.NVIDIAParserListener;

public class ParsingAnalyzer implements NVIDIAParserListener {
	private MyDocument document;
	private Stack<AnnotatedTree> stack;
	private boolean ignoreRule = false;
	private boolean skipBranch = false;

	public ParsingAnalyzer(MyDocument document) {
		this.document = document;
	}

	public ParsingInfo analyze(ParseTree tree, PreParsingInfo preParsingInfo) {
		ParsingInfo info = new ParsingInfo();
		stack = new Stack<>();
	
		walk(tree);
		AnnotatedTree result = stack.pop();
		assert stack.isEmpty();
		info.tree = result;
		analyse(result, info);
		return info;
	}

	private void analyse(AnnotatedTree node, ParsingInfo info) {
		int n = node.getChildCount();
		node.analyse(document, info);
		for (int i = 0; i < n; i++) {
			analyse(node.getChild(i), info);
		}
	}

	private void walk(ParseTree tree) {
		if (tree instanceof ErrorNode) {
			visitErrorNode((ErrorNode) tree);
			return;
		} else if (tree instanceof TerminalNode) {
			visitTerminal((TerminalNode) tree);
			return;
		}
		RuleNode r = (RuleNode) tree;
		ParserRuleContext ctx = (ParserRuleContext) r.getRuleContext();

		ctx.enterRule(this);

		if (skipBranch) {
			skipBranch = false;
			basicHighlighting(tree);
			return;
		}

		enterEveryRule(ctx);
		int n = r.getChildCount();
		for (int i = 0; i < n; i++) {
			walk(r.getChild(i));
		}
		ctx.exitRule(this);
		exitEveryRule(ctx);
	}

	private void skipBranch() {
		skipBranch = true;
	}

	private void ignoreRule() {
		ignoreRule = true;
	}

	@Override
	public void enterTranslation_unit(Translation_unitContext ctx) {
		stack.push(new TranslationUnit(ctx));
	}

	@Override
	public void exitTranslation_unit(Translation_unitContext ctx) {
	}

	@Override
	public void enterExternal_declaration(External_declarationContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitExternal_declaration(External_declarationContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterFunction_definition(Function_definitionContext ctx) {
		stack.push(new FunctionDefinition());
	}

	@Override
	public void exitFunction_definition(Function_definitionContext ctx) {
	}

	@Override
	public void enterDeclaration(DeclarationContext ctx) {
		ParseTree child = ctx.getChild(0);
		if (child instanceof Function_prototypeContext) {
			stack.push(new FunctionPrototype());
		} else if (child instanceof Init_declarator_listContext) {
			stack.push(new InitDeclaratorList());
		} else if (child instanceof Type_qualifierContext) {
			if (ctx.getChildCount() > 3) {
				stack.push(new BlockStructure());
			} else {
				stack.push(new SimpleDeclaration());
			}
		} else {
			// ignore precision declarations (e.g. precision highp float;)
			skipBranch();
		}
	}

	@Override
	public void exitDeclaration(DeclarationContext ctx) {
	}

	@Override
	public void enterFunction_prototype(Function_prototypeContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitFunction_prototype(Function_prototypeContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterFunction_parameters(Function_parametersContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitFunction_parameters(Function_parametersContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterParameter_declaration(Parameter_declarationContext ctx) {
		stack.push(new FunctionParameter());
	}

	@Override
	public void exitParameter_declaration(Parameter_declarationContext ctx) {
	}

	@Override
	public void enterParameter_declarator(Parameter_declaratorContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitParameter_declarator(Parameter_declaratorContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterParameter_type_specifier(Parameter_type_specifierContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitParameter_type_specifier(Parameter_type_specifierContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterInit_declarator_list(Init_declarator_listContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitInit_declarator_list(Init_declarator_listContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterSingle_declaration(Single_declarationContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitSingle_declaration(Single_declarationContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterTypeless_declaration(Typeless_declarationContext ctx) {
		stack.push(new TypelessDeclaration());
	}

	@Override
	public void exitTypeless_declaration(Typeless_declarationContext ctx) {
	}

	@Override
	public void enterFully_specified_type(Fully_specified_typeContext ctx) {
		stack.push(new FullySpecifiedType());
	}

	@Override
	public void exitFully_specified_type(Fully_specified_typeContext ctx) {
	}

	@Override
	public void enterStruct_declaration_list(Struct_declaration_listContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitStruct_declaration_list(Struct_declaration_listContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterStruct_declaration(Struct_declarationContext ctx) {
		stack.push(new StructDeclaration());
	}

	@Override
	public void exitStruct_declaration(Struct_declarationContext ctx) {
	}

	@Override
	public void enterStruct_declarator_list(Struct_declarator_listContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitStruct_declarator_list(Struct_declarator_listContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterStruct_declarator(Struct_declaratorContext ctx) {
		stack.push(new StructDeclarator());
	}

	@Override
	public void exitStruct_declarator(Struct_declaratorContext ctx) {
	}

	@Override
	public void enterCompound_statement_no_new_scope(Compound_statement_no_new_scopeContext ctx) {
		stack.push(new CompoundStatement(ctx));
	}

	@Override
	public void exitCompound_statement_no_new_scope(Compound_statement_no_new_scopeContext ctx) {
	}

	@Override
	public void enterStatement_list(Statement_listContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitStatement_list(Statement_listContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterStatement(StatementContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitStatement(StatementContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterCompound_statement(Compound_statementContext ctx) {
		stack.push(new CompoundStatement(ctx));
	}

	@Override
	public void exitCompound_statement(Compound_statementContext ctx) {
	}

	@Override
	public void enterSimple_statement(Simple_statementContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitSimple_statement(Simple_statementContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterDeclaration_statement(Declaration_statementContext ctx) {
		stack.push(new DeclarationStatement());
	}

	@Override
	public void exitDeclaration_statement(Declaration_statementContext ctx) {
	}

	@Override
	public void enterExpression_statement(Expression_statementContext ctx) {
		stack.push(new ExpressionStatement());
	}

	@Override
	public void exitExpression_statement(Expression_statementContext ctx) {
	}

	@Override
	public void enterSelection_statement(Selection_statementContext ctx) {
		stack.push(new SelectionStatement());
	}

	@Override
	public void exitSelection_statement(Selection_statementContext ctx) {
	}

	@Override
	public void enterSelection_rest_statement(Selection_rest_statementContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitSelection_rest_statement(Selection_rest_statementContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterSwitch_statement(Switch_statementContext ctx) {
		stack.push(new SwitchStatement());
	}

	@Override
	public void exitSwitch_statement(Switch_statementContext ctx) {
	}

	@Override
	public void enterCase_label(Case_labelContext ctx) {
		stack.push(new CaseLabel());
	}

	@Override
	public void exitCase_label(Case_labelContext ctx) {
	}

	@Override
	public void enterIteration_statement(Iteration_statementContext ctx) {
		stack.push(new IterationStatement());
	}

	@Override
	public void exitIteration_statement(Iteration_statementContext ctx) {
	}

	@Override
	public void enterFor_init_statement(For_init_statementContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitFor_init_statement(For_init_statementContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterFor_rest_statement(For_rest_statementContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitFor_rest_statement(For_rest_statementContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterCondition(ConditionContext ctx) {
		if (ctx.getChild(0) instanceof ExpressionContext) {
			ignoreRule();
		} else {
			stack.push(new Condition());
		}
	}

	@Override
	public void exitCondition(ConditionContext ctx) {
		if (ctx.getChild(0) instanceof ExpressionContext) {
			ignoreRule();
		}
	}

	@Override
	public void enterStatement_no_new_scope(Statement_no_new_scopeContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitStatement_no_new_scope(Statement_no_new_scopeContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterJump_statement(Jump_statementContext ctx) {
		stack.push(new JumpStatement());
	}

	@Override
	public void exitJump_statement(Jump_statementContext ctx) {
	}

	@Override
	public void enterExpression(ExpressionContext ctx) {
		ParseTree child = ctx.getChild(0);
		if (child instanceof Assignment_expressionContext) {
			ignoreRule();
		} else {
			skipBranch();
		}
	}

	@Override
	public void exitExpression(ExpressionContext ctx) {
		ParseTree child = ctx.getChild(0);
		if (child instanceof Assignment_expressionContext) {
			ignoreRule();
		}
	}

	@Override
	public void enterAssignment_expression(Assignment_expressionContext ctx) {
		ParseTree child = ctx.getChild(0);
		if (child instanceof Constant_expressionContext) {
			ignoreRule();
		} else {
			stack.push(new AssignmentExpression());
		}
	}

	@Override
	public void exitAssignment_expression(Assignment_expressionContext ctx) {
		ParseTree child = ctx.getChild(0);
		if (child instanceof Constant_expressionContext) {
			ignoreRule();
		}
	}

	@Override
	public void enterAssignment_operator(Assignment_operatorContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitAssignment_operator(Assignment_operatorContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterConstant_expression(Constant_expressionContext ctx) {
		if (ctx.getChildCount() > 1) {
			stack.push(new TernaryOperation());
		} else {
			ignoreRule();
		}
	}

	@Override
	public void exitConstant_expression(Constant_expressionContext ctx) {
		if (ctx.getChildCount() == 1) {
			ignoreRule();
		}
	}

	@Override
	public void enterBinary_expression(Binary_expressionContext ctx) {
		if (ctx.getChildCount() > 1) {
			stack.push(new BinaryExpression());
		} else {
			ignoreRule();
		}
	}

	@Override
	public void exitBinary_expression(Binary_expressionContext ctx) {
		if (ctx.getChildCount() == 1) {
			ignoreRule();
		}
	}

	@Override
	public void enterCast_expression(Cast_expressionContext ctx) {
		if (ctx.getChildCount() > 1) {
			stack.push(new CastExpression());
		} else {
			ignoreRule();
		}
	}

	@Override
	public void exitCast_expression(Cast_expressionContext ctx) {
		if (ctx.getChildCount() == 1) {
			ignoreRule();
		}
	}

	@Override
	public void enterUnary_expression(Unary_expressionContext ctx) {
		if (ctx.getChildCount() > 1) {
			stack.push(new UnaryExpression());
		} else {
			ignoreRule();
		}
	}

	@Override
	public void exitUnary_expression(Unary_expressionContext ctx) {
		if (ctx.getChildCount() == 1) {
			ignoreRule();
		}
	}

	@Override
	public void enterUnary_operator(Unary_operatorContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitUnary_operator(Unary_operatorContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterPostfix_expression(Postfix_expressionContext ctx) {
		if (ctx.getChildCount() == 1) {
			ignoreRule();
		} else if (ctx.getChildCount() == 2) {
			stack.push(new UnaryExpression());
		} else if (!(ctx.getChild(0) instanceof Postfix_expressionContext)) {
			stack.push(new ConstructorCall());
		} else if (ctx.getChild(2) instanceof Integer_expressionContext) {
			stack.push(new ArrayAccess());
		} else if (ctx.LEFT_PAREN() != null) {
			stack.push(new FunctionCall());
		} else {
			stack.push(new FieldSelection());
		}
	}

	@Override
	public void exitPostfix_expression(Postfix_expressionContext ctx) {
		if (ctx.getChildCount() == 1) {
			ignoreRule();
		}
	}

	@Override
	public void enterPrimary_expression(Primary_expressionContext ctx) {
		stack.push(new PrimaryExpression());
	}

	@Override
	public void exitPrimary_expression(Primary_expressionContext ctx) {
	}

	@Override
	public void enterInteger_expression(Integer_expressionContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitInteger_expression(Integer_expressionContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterFunction_call_parameters(Function_call_parametersContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitFunction_call_parameters(Function_call_parametersContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterIdentifier_list(Identifier_listContext ctx) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void exitIdentifier_list(Identifier_listContext ctx) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void enterPointer(PointerContext ctx) {
		stack.push(new Pointer());
	}

	@Override
	public void exitPointer(PointerContext ctx) {
	}

	@Override
	public void enterType_qualifier(Type_qualifierContext ctx) {
		stack.push(new TypeQualifier());
	}

	@Override
	public void exitType_qualifier(Type_qualifierContext ctx) {
	}

	@Override
	public void enterSingle_type_qualifier(Single_type_qualifierContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitSingle_type_qualifier(Single_type_qualifierContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterStorage_qualifier(Storage_qualifierContext ctx) {
		stack.push(new StorageQualifier());
	}

	@Override
	public void exitStorage_qualifier(Storage_qualifierContext ctx) {
	}

	@Override
	public void enterLayout_qualifier(Layout_qualifierContext ctx) {
		stack.push(new LayoutQualifier());
	}

	@Override
	public void exitLayout_qualifier(Layout_qualifierContext ctx) {
	}

	@Override
	public void enterLayout_qualifier_id_list(Layout_qualifier_id_listContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitLayout_qualifier_id_list(Layout_qualifier_id_listContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterLayout_qualifier_id(Layout_qualifier_idContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitLayout_qualifier_id(Layout_qualifier_idContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterPrecision_qualifier(Precision_qualifierContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitPrecision_qualifier(Precision_qualifierContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterInterpolation_qualifier(Interpolation_qualifierContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitInterpolation_qualifier(Interpolation_qualifierContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterInvariant_qualifier(Invariant_qualifierContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitInvariant_qualifier(Invariant_qualifierContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterPrecise_qualifier(Precise_qualifierContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitPrecise_qualifier(Precise_qualifierContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterType_name_list(Type_name_listContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitType_name_list(Type_name_listContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterType_name(Type_nameContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitType_name(Type_nameContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterType_specifier(Type_specifierContext ctx) {
		stack.push(new TypeSpecifier());
	}

	@Override
	public void exitType_specifier(Type_specifierContext ctx) {
	}

	@Override
	public void enterArray_specifier(Array_specifierContext ctx) {
		stack.push(new ArraySpecifier());
	}

	@Override
	public void exitArray_specifier(Array_specifierContext ctx) {
	}

	@Override
	public void enterDimension(DimensionContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitDimension(DimensionContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterType_specifier_nonarray(Type_specifier_nonarrayContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitType_specifier_nonarray(Type_specifier_nonarrayContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterStruct_specifier(Struct_specifierContext ctx) {
		stack.push(new StructSpecifier());
	}

	@Override
	public void exitStruct_specifier(Struct_specifierContext ctx) {
	}

	@Override
	public void enterInitializer(InitializerContext ctx) {
		if (ctx.getChildCount() > 1) {
			stack.push(new Initializer());
		} else {
			ignoreRule();
		}
	}

	@Override
	public void exitInitializer(InitializerContext ctx) {
		if (ctx.getChildCount() == 1) {
			ignoreRule();
		}
	}

	@Override
	public void enterInitializer_list(Initializer_listContext ctx) {
		ignoreRule();
	}

	@Override
	public void exitInitializer_list(Initializer_listContext ctx) {
		ignoreRule();
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		if (ignoreRule) {
			ignoreRule = false;
			return;
		}
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		if (ignoreRule) {
			ignoreRule = false;
			return;
		}
		if (stack.size() == 1) {
			return;
		}
		AnnotatedTree child = stack.pop();
		try {
			child.build();
		} catch (Exception e) {
			e.printStackTrace();
		}
		stack.peek().addChild(child);
	}

	@Override
	public void visitTerminal(TerminalNode node) {
		if(node.getSymbol().getType() == NVIDIALexer.IDENTIFIER) {
			stack.peek().addChild(new Identifier(node));
		}else {
			stack.peek().addChild(new AnnotatedToken(node));
		}
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		throw new IllegalStateException();
	}

	public void basicHighlighting(ParseTree tree) {
		if (tree instanceof ErrorNode) {
			basicHighlighting((ErrorNode) tree);
			return;
		} else if (tree instanceof TerminalNode) {
			basicHighlighting((TerminalNode) tree);
			return;
		}

		RuleNode r = (RuleNode) tree;
		int n = r.getChildCount();
		for (int i = 0; i < n; i++) {
			basicHighlighting(r.getChild(i));
		}
	}

	private void basicHighlighting(TerminalNode node) {
		Token token = node.getSymbol();
		int offset = token.getStartIndex();
		int length = token.getText().length();

		AttributeSet highlight = SyntaxHighlighting.getColor(token.getType());
		if (highlight == null) {
			highlight = SyntaxHighlighting.UNKNOWN;
		}
		document.setCharacterAttributes(offset, length, highlight, false);
	}

	private void basicHighlighting(ErrorNode node) {
		Token token = node.getSymbol();
		int line = token.getLine();
		int pos = token.getCharPositionInLine();
		Element root = document.getDefaultRootElement();
		Element row = root.getElement(line - 1);
		int offs0 = row.getStartOffset() + pos;
		int offs1 = row.getEndOffset();
		document.setCharacterAttributes(offs0, offs1 - offs0, SyntaxHighlighting.ERROR_HIGHLIGHT, false);
	}
}
