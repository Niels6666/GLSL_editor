// Generated from testNVIDIA\NVIDIAPreParser.g4 by ANTLR 4.9.3
package main.java.testNVIDIA;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NVIDIAPreParser}.
 */
public interface NVIDIAPreParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_unit(NVIDIAPreParser.Translation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_unit(NVIDIAPreParser.Translation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#compiler_directive}.
	 * @param ctx the parse tree
	 */
	void enterCompiler_directive(NVIDIAPreParser.Compiler_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#compiler_directive}.
	 * @param ctx the parse tree
	 */
	void exitCompiler_directive(NVIDIAPreParser.Compiler_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#behavior}.
	 * @param ctx the parse tree
	 */
	void enterBehavior(NVIDIAPreParser.BehaviorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#behavior}.
	 * @param ctx the parse tree
	 */
	void exitBehavior(NVIDIAPreParser.BehaviorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(NVIDIAPreParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(NVIDIAPreParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#define_directive}.
	 * @param ctx the parse tree
	 */
	void enterDefine_directive(NVIDIAPreParser.Define_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#define_directive}.
	 * @param ctx the parse tree
	 */
	void exitDefine_directive(NVIDIAPreParser.Define_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#elif_directive}.
	 * @param ctx the parse tree
	 */
	void enterElif_directive(NVIDIAPreParser.Elif_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#elif_directive}.
	 * @param ctx the parse tree
	 */
	void exitElif_directive(NVIDIAPreParser.Elif_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#else_directive}.
	 * @param ctx the parse tree
	 */
	void enterElse_directive(NVIDIAPreParser.Else_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#else_directive}.
	 * @param ctx the parse tree
	 */
	void exitElse_directive(NVIDIAPreParser.Else_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#endif_directive}.
	 * @param ctx the parse tree
	 */
	void enterEndif_directive(NVIDIAPreParser.Endif_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#endif_directive}.
	 * @param ctx the parse tree
	 */
	void exitEndif_directive(NVIDIAPreParser.Endif_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#error_directive}.
	 * @param ctx the parse tree
	 */
	void enterError_directive(NVIDIAPreParser.Error_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#error_directive}.
	 * @param ctx the parse tree
	 */
	void exitError_directive(NVIDIAPreParser.Error_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(NVIDIAPreParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(NVIDIAPreParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#extension_directive}.
	 * @param ctx the parse tree
	 */
	void enterExtension_directive(NVIDIAPreParser.Extension_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#extension_directive}.
	 * @param ctx the parse tree
	 */
	void exitExtension_directive(NVIDIAPreParser.Extension_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#extension_name}.
	 * @param ctx the parse tree
	 */
	void enterExtension_name(NVIDIAPreParser.Extension_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#extension_name}.
	 * @param ctx the parse tree
	 */
	void exitExtension_name(NVIDIAPreParser.Extension_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#group_of_lines}.
	 * @param ctx the parse tree
	 */
	void enterGroup_of_lines(NVIDIAPreParser.Group_of_linesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#group_of_lines}.
	 * @param ctx the parse tree
	 */
	void exitGroup_of_lines(NVIDIAPreParser.Group_of_linesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#if_directive}.
	 * @param ctx the parse tree
	 */
	void enterIf_directive(NVIDIAPreParser.If_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#if_directive}.
	 * @param ctx the parse tree
	 */
	void exitIf_directive(NVIDIAPreParser.If_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#ifdef_directive}.
	 * @param ctx the parse tree
	 */
	void enterIfdef_directive(NVIDIAPreParser.Ifdef_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#ifdef_directive}.
	 * @param ctx the parse tree
	 */
	void exitIfdef_directive(NVIDIAPreParser.Ifdef_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#ifndef_directive}.
	 * @param ctx the parse tree
	 */
	void enterIfndef_directive(NVIDIAPreParser.Ifndef_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#ifndef_directive}.
	 * @param ctx the parse tree
	 */
	void exitIfndef_directive(NVIDIAPreParser.Ifndef_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#line_directive}.
	 * @param ctx the parse tree
	 */
	void enterLine_directive(NVIDIAPreParser.Line_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#line_directive}.
	 * @param ctx the parse tree
	 */
	void exitLine_directive(NVIDIAPreParser.Line_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#line_expression}.
	 * @param ctx the parse tree
	 */
	void enterLine_expression(NVIDIAPreParser.Line_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#line_expression}.
	 * @param ctx the parse tree
	 */
	void exitLine_expression(NVIDIAPreParser.Line_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#macro_esc_newline}.
	 * @param ctx the parse tree
	 */
	void enterMacro_esc_newline(NVIDIAPreParser.Macro_esc_newlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#macro_esc_newline}.
	 * @param ctx the parse tree
	 */
	void exitMacro_esc_newline(NVIDIAPreParser.Macro_esc_newlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#macro_identifier}.
	 * @param ctx the parse tree
	 */
	void enterMacro_identifier(NVIDIAPreParser.Macro_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#macro_identifier}.
	 * @param ctx the parse tree
	 */
	void exitMacro_identifier(NVIDIAPreParser.Macro_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#macro_name}.
	 * @param ctx the parse tree
	 */
	void enterMacro_name(NVIDIAPreParser.Macro_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#macro_name}.
	 * @param ctx the parse tree
	 */
	void exitMacro_name(NVIDIAPreParser.Macro_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#macro_text}.
	 * @param ctx the parse tree
	 */
	void enterMacro_text(NVIDIAPreParser.Macro_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#macro_text}.
	 * @param ctx the parse tree
	 */
	void exitMacro_text(NVIDIAPreParser.Macro_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#macro_text_}.
	 * @param ctx the parse tree
	 */
	void enterMacro_text_(NVIDIAPreParser.Macro_text_Context ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#macro_text_}.
	 * @param ctx the parse tree
	 */
	void exitMacro_text_(NVIDIAPreParser.Macro_text_Context ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(NVIDIAPreParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(NVIDIAPreParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#off}.
	 * @param ctx the parse tree
	 */
	void enterOff(NVIDIAPreParser.OffContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#off}.
	 * @param ctx the parse tree
	 */
	void exitOff(NVIDIAPreParser.OffContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#on}.
	 * @param ctx the parse tree
	 */
	void enterOn(NVIDIAPreParser.OnContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#on}.
	 * @param ctx the parse tree
	 */
	void exitOn(NVIDIAPreParser.OnContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#pragma_debug}.
	 * @param ctx the parse tree
	 */
	void enterPragma_debug(NVIDIAPreParser.Pragma_debugContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#pragma_debug}.
	 * @param ctx the parse tree
	 */
	void exitPragma_debug(NVIDIAPreParser.Pragma_debugContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#pragma_directive}.
	 * @param ctx the parse tree
	 */
	void enterPragma_directive(NVIDIAPreParser.Pragma_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#pragma_directive}.
	 * @param ctx the parse tree
	 */
	void exitPragma_directive(NVIDIAPreParser.Pragma_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#pragma_optimize}.
	 * @param ctx the parse tree
	 */
	void enterPragma_optimize(NVIDIAPreParser.Pragma_optimizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#pragma_optimize}.
	 * @param ctx the parse tree
	 */
	void exitPragma_optimize(NVIDIAPreParser.Pragma_optimizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#profile}.
	 * @param ctx the parse tree
	 */
	void enterProfile(NVIDIAPreParser.ProfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#profile}.
	 * @param ctx the parse tree
	 */
	void exitProfile(NVIDIAPreParser.ProfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#program_text}.
	 * @param ctx the parse tree
	 */
	void enterProgram_text(NVIDIAPreParser.Program_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#program_text}.
	 * @param ctx the parse tree
	 */
	void exitProgram_text(NVIDIAPreParser.Program_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#stdgl}.
	 * @param ctx the parse tree
	 */
	void enterStdgl(NVIDIAPreParser.StdglContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#stdgl}.
	 * @param ctx the parse tree
	 */
	void exitStdgl(NVIDIAPreParser.StdglContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#undef_directive}.
	 * @param ctx the parse tree
	 */
	void enterUndef_directive(NVIDIAPreParser.Undef_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#undef_directive}.
	 * @param ctx the parse tree
	 */
	void exitUndef_directive(NVIDIAPreParser.Undef_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#version_directive}.
	 * @param ctx the parse tree
	 */
	void enterVersion_directive(NVIDIAPreParser.Version_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#version_directive}.
	 * @param ctx the parse tree
	 */
	void exitVersion_directive(NVIDIAPreParser.Version_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#include_directive}.
	 * @param ctx the parse tree
	 */
	void enterInclude_directive(NVIDIAPreParser.Include_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#include_directive}.
	 * @param ctx the parse tree
	 */
	void exitInclude_directive(NVIDIAPreParser.Include_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NVIDIAPreParser#glsl_file_name}.
	 * @param ctx the parse tree
	 */
	void enterGlsl_file_name(NVIDIAPreParser.Glsl_file_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NVIDIAPreParser#glsl_file_name}.
	 * @param ctx the parse tree
	 */
	void exitGlsl_file_name(NVIDIAPreParser.Glsl_file_nameContext ctx);
}