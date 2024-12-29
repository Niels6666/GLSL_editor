// Generated from testNVIDIA\NVIDIAParser.g4 by ANTLR 4.9.3
package main.java.testNVIDIA;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NVIDIAParser}.
 */
public interface NVIDIAParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_unit(NVIDIAParser.Translation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_unit(NVIDIAParser.Translation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(NVIDIAParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(NVIDIAParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expression(NVIDIAParser.Postfix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expression(NVIDIAParser.Postfix_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#integer_expression}.
	 * @param ctx the parse tree
	 */
	void enterInteger_expression(NVIDIAParser.Integer_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#integer_expression}.
	 * @param ctx the parse tree
	 */
	void exitInteger_expression(NVIDIAParser.Integer_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#function_call_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_parameters(NVIDIAParser.Function_call_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#function_call_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_parameters(NVIDIAParser.Function_call_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(NVIDIAParser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(NVIDIAParser.Cast_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(NVIDIAParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(NVIDIAParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(NVIDIAParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(NVIDIAParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(NVIDIAParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(NVIDIAParser.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(NVIDIAParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(NVIDIAParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void enterBinary_expression(NVIDIAParser.Binary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void exitBinary_expression(NVIDIAParser.Binary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(NVIDIAParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(NVIDIAParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(NVIDIAParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(NVIDIAParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(NVIDIAParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(NVIDIAParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(NVIDIAParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(NVIDIAParser.Identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#function_prototype}.
	 * @param ctx the parse tree
	 */
	void enterFunction_prototype(NVIDIAParser.Function_prototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#function_prototype}.
	 * @param ctx the parse tree
	 */
	void exitFunction_prototype(NVIDIAParser.Function_prototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters(NVIDIAParser.Function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters(NVIDIAParser.Function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#parameter_declarator}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declarator(NVIDIAParser.Parameter_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#parameter_declarator}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declarator(NVIDIAParser.Parameter_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(NVIDIAParser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(NVIDIAParser.Parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#parameter_type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterParameter_type_specifier(NVIDIAParser.Parameter_type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#parameter_type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitParameter_type_specifier(NVIDIAParser.Parameter_type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator_list(NVIDIAParser.Init_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator_list(NVIDIAParser.Init_declarator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#single_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingle_declaration(NVIDIAParser.Single_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#single_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingle_declaration(NVIDIAParser.Single_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#typeless_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeless_declaration(NVIDIAParser.Typeless_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#typeless_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeless_declaration(NVIDIAParser.Typeless_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#fully_specified_type}.
	 * @param ctx the parse tree
	 */
	void enterFully_specified_type(NVIDIAParser.Fully_specified_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#fully_specified_type}.
	 * @param ctx the parse tree
	 */
	void exitFully_specified_type(NVIDIAParser.Fully_specified_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#invariant_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterInvariant_qualifier(NVIDIAParser.Invariant_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#invariant_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitInvariant_qualifier(NVIDIAParser.Invariant_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#interpolation_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation_qualifier(NVIDIAParser.Interpolation_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#interpolation_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation_qualifier(NVIDIAParser.Interpolation_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#layout_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterLayout_qualifier(NVIDIAParser.Layout_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#layout_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitLayout_qualifier(NVIDIAParser.Layout_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#layout_qualifier_id_list}.
	 * @param ctx the parse tree
	 */
	void enterLayout_qualifier_id_list(NVIDIAParser.Layout_qualifier_id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#layout_qualifier_id_list}.
	 * @param ctx the parse tree
	 */
	void exitLayout_qualifier_id_list(NVIDIAParser.Layout_qualifier_id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#layout_qualifier_id}.
	 * @param ctx the parse tree
	 */
	void enterLayout_qualifier_id(NVIDIAParser.Layout_qualifier_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#layout_qualifier_id}.
	 * @param ctx the parse tree
	 */
	void exitLayout_qualifier_id(NVIDIAParser.Layout_qualifier_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#precise_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterPrecise_qualifier(NVIDIAParser.Precise_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#precise_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitPrecise_qualifier(NVIDIAParser.Precise_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(NVIDIAParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(NVIDIAParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterType_qualifier(NVIDIAParser.Type_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitType_qualifier(NVIDIAParser.Type_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#single_type_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterSingle_type_qualifier(NVIDIAParser.Single_type_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#single_type_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitSingle_type_qualifier(NVIDIAParser.Single_type_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#storage_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterStorage_qualifier(NVIDIAParser.Storage_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#storage_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitStorage_qualifier(NVIDIAParser.Storage_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#type_name_list}.
	 * @param ctx the parse tree
	 */
	void enterType_name_list(NVIDIAParser.Type_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#type_name_list}.
	 * @param ctx the parse tree
	 */
	void exitType_name_list(NVIDIAParser.Type_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(NVIDIAParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(NVIDIAParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(NVIDIAParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(NVIDIAParser.Type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#array_specifier}.
	 * @param ctx the parse tree
	 */
	void enterArray_specifier(NVIDIAParser.Array_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#array_specifier}.
	 * @param ctx the parse tree
	 */
	void exitArray_specifier(NVIDIAParser.Array_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(NVIDIAParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(NVIDIAParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#type_specifier_nonarray}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier_nonarray(NVIDIAParser.Type_specifier_nonarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#type_specifier_nonarray}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier_nonarray(NVIDIAParser.Type_specifier_nonarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#precision_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterPrecision_qualifier(NVIDIAParser.Precision_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#precision_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitPrecision_qualifier(NVIDIAParser.Precision_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#struct_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStruct_specifier(NVIDIAParser.Struct_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#struct_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStruct_specifier(NVIDIAParser.Struct_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#struct_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration_list(NVIDIAParser.Struct_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#struct_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration_list(NVIDIAParser.Struct_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(NVIDIAParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(NVIDIAParser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declarator_list(NVIDIAParser.Struct_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declarator_list(NVIDIAParser.Struct_declarator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#struct_declarator}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declarator(NVIDIAParser.Struct_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#struct_declarator}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declarator(NVIDIAParser.Struct_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(NVIDIAParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(NVIDIAParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_list(NVIDIAParser.Initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_list(NVIDIAParser.Initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(NVIDIAParser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(NVIDIAParser.Declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NVIDIAParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NVIDIAParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(NVIDIAParser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(NVIDIAParser.Simple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(NVIDIAParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(NVIDIAParser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#statement_no_new_scope}.
	 * @param ctx the parse tree
	 */
	void enterStatement_no_new_scope(NVIDIAParser.Statement_no_new_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#statement_no_new_scope}.
	 * @param ctx the parse tree
	 */
	void exitStatement_no_new_scope(NVIDIAParser.Statement_no_new_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#compound_statement_no_new_scope}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement_no_new_scope(NVIDIAParser.Compound_statement_no_new_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#compound_statement_no_new_scope}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement_no_new_scope(NVIDIAParser.Compound_statement_no_new_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(NVIDIAParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(NVIDIAParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(NVIDIAParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(NVIDIAParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(NVIDIAParser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(NVIDIAParser.Selection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#selection_rest_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_rest_statement(NVIDIAParser.Selection_rest_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#selection_rest_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_rest_statement(NVIDIAParser.Selection_rest_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(NVIDIAParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(NVIDIAParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(NVIDIAParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(NVIDIAParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#case_label}.
	 * @param ctx the parse tree
	 */
	void enterCase_label(NVIDIAParser.Case_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#case_label}.
	 * @param ctx the parse tree
	 */
	void exitCase_label(NVIDIAParser.Case_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(NVIDIAParser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(NVIDIAParser.Iteration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#for_init_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_init_statement(NVIDIAParser.For_init_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#for_init_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_init_statement(NVIDIAParser.For_init_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#for_rest_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_rest_statement(NVIDIAParser.For_rest_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#for_rest_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_rest_statement(NVIDIAParser.For_rest_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(NVIDIAParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(NVIDIAParser.Jump_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExternal_declaration(NVIDIAParser.External_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExternal_declaration(NVIDIAParser.External_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(NVIDIAParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(NVIDIAParser.Function_definitionContext ctx);
}