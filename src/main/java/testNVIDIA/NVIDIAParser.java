// Generated from testNVIDIA\NVIDIAParser.g4 by ANTLR 4.9.3
package main.java.testNVIDIA;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NVIDIAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ATOMIC_UINT=1, ATTRIBUTE=2, BOOL=3, BREAK=4, BUFFER=5, BVEC2=6, BVEC3=7, 
		BVEC4=8, CASE=9, CENTROID=10, COHERENT=11, CONST=12, CONTINUE=13, DEFAULT=14, 
		DISCARD=15, DMAT2=16, DMAT2X2=17, DMAT2X3=18, DMAT2X4=19, DMAT3=20, DMAT3X2=21, 
		DMAT3X3=22, DMAT3X4=23, DMAT4=24, DMAT4X2=25, DMAT4X3=26, DMAT4X4=27, 
		DO=28, DOUBLE=29, DVEC2=30, DVEC3=31, DVEC4=32, ELSE=33, FALSE=34, FLAT=35, 
		FLOAT=36, FOR=37, HIGHP=38, IF=39, IIMAGE1D=40, IIMAGE1DARRAY=41, IIMAGE2D=42, 
		IIMAGE2DARRAY=43, IIMAGE2DMS=44, IIMAGE2DMSARRAY=45, IIMAGE2DRECT=46, 
		IIMAGE3D=47, IIMAGEBUFFER=48, IIMAGECUBE=49, IIMAGECUBEARRAY=50, IMAGE1D=51, 
		IMAGE1DARRAY=52, IMAGE2D=53, IMAGE2DARRAY=54, IMAGE2DMS=55, IMAGE2DMSARRAY=56, 
		IMAGE2DRECT=57, IMAGE3D=58, IMAGEBUFFER=59, IMAGECUBE=60, IMAGECUBEARRAY=61, 
		IN=62, INOUT=63, INT=64, INVARIANT=65, ISAMPLER1D=66, ISAMPLER1DARRAY=67, 
		ISAMPLER2D=68, ISAMPLER2DARRAY=69, ISAMPLER2DMS=70, ISAMPLER2DMSARRAY=71, 
		ISAMPLER2DRECT=72, ISAMPLER3D=73, ISAMPLERBUFFER=74, ISAMPLERCUBE=75, 
		ISAMPLERCUBEARRAY=76, IVEC2=77, IVEC3=78, IVEC4=79, LAYOUT=80, LOWP=81, 
		MAT2=82, MAT2X2=83, MAT2X3=84, MAT2X4=85, MAT3=86, MAT3X2=87, MAT3X3=88, 
		MAT3X4=89, MAT4=90, MAT4X2=91, MAT4X3=92, MAT4X4=93, MEDIUMP=94, NOPERSPECTIVE=95, 
		OUT=96, PATCH=97, PRECISE=98, PRECISION=99, READONLY=100, RESTRICT=101, 
		RETURN=102, SAMPLE=103, SAMPLER1D=104, SAMPLER1DARRAY=105, SAMPLER1DARRAYSHADOW=106, 
		SAMPLER1DSHADOW=107, SAMPLER2D=108, SAMPLER2DARRAY=109, SAMPLER2DARRAYSHADOW=110, 
		SAMPLER2DMS=111, SAMPLER2DMSARRAY=112, SAMPLER2DRECT=113, SAMPLER2DRECTSHADOW=114, 
		SAMPLER2DSHADOW=115, SAMPLER3D=116, SAMPLERBUFFER=117, SAMPLERCUBE=118, 
		SAMPLERCUBEARRAY=119, SAMPLERCUBEARRAYSHADOW=120, SAMPLERCUBESHADOW=121, 
		SAMPLERSHADOW=122, SHARED=123, SMOOTH=124, STRUCT=125, SUBROUTINE=126, 
		SWITCH=127, TRUE=128, UIMAGE1D=129, UIMAGE1DARRAY=130, UIMAGE2D=131, UIMAGE2DARRAY=132, 
		UIMAGE2DMS=133, UIMAGE2DMSARRAY=134, UIMAGE2DRECT=135, UIMAGE3D=136, UIMAGEBUFFER=137, 
		UIMAGECUBE=138, UIMAGECUBEARRAY=139, UINT=140, UNIFORM=141, USAMPLER1D=142, 
		USAMPLER1DARRAY=143, USAMPLER2D=144, USAMPLER2DARRAY=145, USAMPLER2DMS=146, 
		USAMPLER2DMSARRAY=147, USAMPLER2DRECT=148, USAMPLER3D=149, USAMPLERBUFFER=150, 
		USAMPLERCUBE=151, USAMPLERCUBEARRAY=152, UVEC2=153, UVEC3=154, UVEC4=155, 
		VARYING=156, VEC2=157, VEC3=158, VEC4=159, VOID=160, VOLATILE=161, WHILE=162, 
		WRITEONLY=163, INT8_T=164, I8VEC2=165, I8VEC3=166, I8VEC4=167, INT16_T=168, 
		I16VEC2=169, I16VEC3=170, I16VEC4=171, INT32_T=172, I32VEC2=173, I32VEC3=174, 
		I32VEC4=175, INT64_T=176, I64VEC2=177, I64VEC3=178, I64VEC4=179, UINT8_T=180, 
		U8VEC2=181, U8VEC3=182, U8VEC4=183, UINT16_T=184, U16VEC2=185, U16VEC3=186, 
		U16VEC4=187, UINT32_T=188, U32VEC2=189, U32VEC3=190, U32VEC4=191, UINT64_T=192, 
		U64VEC2=193, U64VEC3=194, U64VEC4=195, FLOAT16_T=196, F16VEC2=197, F16VEC3=198, 
		F16VEC4=199, FLOAT32_T=200, F32VEC2=201, F32VEC3=202, F32VEC4=203, FLOAT64_T=204, 
		F64VEC2=205, F64VEC3=206, F64VEC4=207, ADD_ASSIGN=208, AMPERSAND=209, 
		AND_ASSIGN=210, AND_OP=211, BANG=212, CARET=213, COLON=214, COMMA=215, 
		DASH=216, DEC_OP=217, DIV_ASSIGN=218, DOT=219, ARROW=220, EQ_OP=221, EQUAL=222, 
		GE_OP=223, INC_OP=224, LE_OP=225, LEFT_ANGLE=226, LEFT_ASSIGN=227, LEFT_BRACE=228, 
		LEFT_BRACKET=229, LEFT_OP=230, LEFT_PAREN=231, MOD_ASSIGN=232, MUL_ASSIGN=233, 
		NE_OP=234, NUMBER_SIGN=235, OR_ASSIGN=236, OR_OP=237, PERCENT=238, PLUS=239, 
		QUESTION=240, RIGHT_ANGLE=241, RIGHT_ASSIGN=242, RIGHT_BRACE=243, RIGHT_BRACKET=244, 
		RIGHT_OP=245, RIGHT_PAREN=246, SEMICOLON=247, SLASH=248, STAR=249, SUB_ASSIGN=250, 
		TILDE=251, VERTICAL_BAR=252, XOR_ASSIGN=253, XOR_OP=254, DOUBLECONSTANT=255, 
		FLOATCONSTANT=256, INTCONSTANT=257, UINTCONSTANT=258, BLOCK_COMMENT=259, 
		LINE_COMMENT=260, LINE_CONTINUATION=261, IDENTIFIER=262, WHITE_SPACE=263, 
		DEFINE_DIRECTIVE=264, ELIF_DIRECTIVE=265, ELSE_DIRECTIVE=266, ENDIF_DIRECTIVE=267, 
		ERROR_DIRECTIVE=268, EXTENSION_DIRECTIVE=269, IF_DIRECTIVE=270, IFDEF_DIRECTIVE=271, 
		IFNDEF_DIRECTIVE=272, LINE_DIRECTIVE=273, PRAGMA_DIRECTIVE=274, UNDEF_DIRECTIVE=275, 
		VERSION_DIRECTIVE=276, INCLUDE_DIRECTIVE=277, SPACE_TAB_0=278, NEWLINE_0=279, 
		MACRO_NAME=280, NEWLINE_1=281, SPACE_TAB_1=282, CONSTANT_EXPRESSION=283, 
		NEWLINE_2=284, ERROR_MESSAGE=285, NEWLINE_3=286, BEHAVIOR=287, EXTENSION_NAME=288, 
		NEWLINE_4=289, SPACE_TAB_2=290, NEWLINE_5=291, MACRO_IDENTIFIER=292, NEWLINE_6=293, 
		SPACE_TAB_3=294, LINE_EXPRESSION=295, NEWLINE_7=296, MACRO_ESC_NEWLINE=297, 
		MACRO_TEXT=298, NEWLINE_8=299, DEBUG=300, NEWLINE_9=301, OFF=302, ON=303, 
		OPTIMIZE=304, SPACE_TAB_5=305, STDGL=306, PROGRAM_TEXT=307, NEWLINE_10=308, 
		SPACE_TAB_6=309, NEWLINE_11=310, NUMBER=311, PROFILE=312, SPACE_TAB_7=313, 
		NEWLINE_12=314, GLSL_FILE_NAME=315, SPACE_TAB_8=316;
	public static final int
		RULE_translation_unit = 0, RULE_variable_identifier = 1, RULE_primary_expression = 2, 
		RULE_postfix_expression = 3, RULE_field_selection = 4, RULE_integer_expression = 5, 
		RULE_function_call = 6, RULE_function_identifier = 7, RULE_function_call_parameters = 8, 
		RULE_cast_expression = 9, RULE_unary_expression = 10, RULE_unary_operator = 11, 
		RULE_assignment_expression = 12, RULE_assignment_operator = 13, RULE_binary_expression = 14, 
		RULE_expression = 15, RULE_constant_expression = 16, RULE_declaration = 17, 
		RULE_identifier_list = 18, RULE_function_prototype = 19, RULE_function_parameters = 20, 
		RULE_parameter_declarator = 21, RULE_parameter_declaration = 22, RULE_parameter_type_specifier = 23, 
		RULE_init_declarator_list = 24, RULE_single_declaration = 25, RULE_typeless_declaration = 26, 
		RULE_fully_specified_type = 27, RULE_invariant_qualifier = 28, RULE_interpolation_qualifier = 29, 
		RULE_layout_qualifier = 30, RULE_layout_qualifier_id_list = 31, RULE_layout_qualifier_id = 32, 
		RULE_precise_qualifier = 33, RULE_pointer = 34, RULE_type_qualifier = 35, 
		RULE_single_type_qualifier = 36, RULE_storage_qualifier = 37, RULE_type_name_list = 38, 
		RULE_type_name = 39, RULE_type_specifier = 40, RULE_array_specifier = 41, 
		RULE_dimension = 42, RULE_type_specifier_nonarray = 43, RULE_precision_qualifier = 44, 
		RULE_struct_specifier = 45, RULE_struct_declaration_list = 46, RULE_struct_declaration = 47, 
		RULE_struct_declarator_list = 48, RULE_struct_declarator = 49, RULE_initializer = 50, 
		RULE_initializer_list = 51, RULE_declaration_statement = 52, RULE_statement = 53, 
		RULE_simple_statement = 54, RULE_compound_statement = 55, RULE_statement_no_new_scope = 56, 
		RULE_compound_statement_no_new_scope = 57, RULE_statement_list = 58, RULE_expression_statement = 59, 
		RULE_selection_statement = 60, RULE_selection_rest_statement = 61, RULE_condition = 62, 
		RULE_switch_statement = 63, RULE_case_label = 64, RULE_iteration_statement = 65, 
		RULE_for_init_statement = 66, RULE_for_rest_statement = 67, RULE_jump_statement = 68, 
		RULE_external_declaration = 69, RULE_function_definition = 70;
	private static String[] makeRuleNames() {
		return new String[] {
			"translation_unit", "variable_identifier", "primary_expression", "postfix_expression", 
			"field_selection", "integer_expression", "function_call", "function_identifier", 
			"function_call_parameters", "cast_expression", "unary_expression", "unary_operator", 
			"assignment_expression", "assignment_operator", "binary_expression", 
			"expression", "constant_expression", "declaration", "identifier_list", 
			"function_prototype", "function_parameters", "parameter_declarator", 
			"parameter_declaration", "parameter_type_specifier", "init_declarator_list", 
			"single_declaration", "typeless_declaration", "fully_specified_type", 
			"invariant_qualifier", "interpolation_qualifier", "layout_qualifier", 
			"layout_qualifier_id_list", "layout_qualifier_id", "precise_qualifier", 
			"pointer", "type_qualifier", "single_type_qualifier", "storage_qualifier", 
			"type_name_list", "type_name", "type_specifier", "array_specifier", "dimension", 
			"type_specifier_nonarray", "precision_qualifier", "struct_specifier", 
			"struct_declaration_list", "struct_declaration", "struct_declarator_list", 
			"struct_declarator", "initializer", "initializer_list", "declaration_statement", 
			"statement", "simple_statement", "compound_statement", "statement_no_new_scope", 
			"compound_statement_no_new_scope", "statement_list", "expression_statement", 
			"selection_statement", "selection_rest_statement", "condition", "switch_statement", 
			"case_label", "iteration_statement", "for_init_statement", "for_rest_statement", 
			"jump_statement", "external_declaration", "function_definition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'atomic_uint'", "'attribute'", "'bool'", "'break'", "'buffer'", 
			"'bvec2'", "'bvec3'", "'bvec4'", "'case'", "'centroid'", "'coherent'", 
			"'const'", "'continue'", "'default'", "'discard'", "'dmat2'", "'dmat2x2'", 
			"'dmat2x3'", "'dmat2x4'", "'dmat3'", "'dmat3x2'", "'dmat3x3'", "'dmat3x4'", 
			"'dmat4'", "'dmat4x2'", "'dmat4x3'", "'dmat4x4'", "'do'", "'double'", 
			"'dvec2'", "'dvec3'", "'dvec4'", "'else'", "'false'", "'flat'", "'float'", 
			"'for'", "'highp'", "'if'", "'iimage1D'", "'iimage1DArray'", "'iimage2D'", 
			"'iimage2DArray'", "'iimage2DMS'", "'iimage2DMSArray'", "'iimage2DRect'", 
			"'iimage3D'", "'iimageBuffer'", "'iimageCube'", "'iimageCubeArray'", 
			"'image1D'", "'image1DArray'", "'image2D'", "'image2DArray'", "'image2DMS'", 
			"'image2DMSArray'", "'image2DRect'", "'image3D'", "'imageBuffer'", "'imageCube'", 
			"'imageCubeArray'", "'in'", "'inout'", "'int'", "'invariant'", "'isampler1D'", 
			"'isampler1DArray'", "'isampler2D'", "'isampler2DArray'", "'isampler2DMS'", 
			"'isampler2DMSArray'", "'isampler2DRect'", "'isampler3D'", "'isamplerBuffer'", 
			"'isamplerCube'", "'isamplerCubeArray'", "'ivec2'", "'ivec3'", "'ivec4'", 
			"'layout'", "'lowp'", "'mat2'", "'mat2x2'", "'mat2x3'", "'mat2x4'", "'mat3'", 
			"'mat3x2'", "'mat3x3'", "'mat3x4'", "'mat4'", "'mat4x2'", "'mat4x3'", 
			"'mat4x4'", "'mediump'", "'noperspective'", "'out'", "'patch'", "'precise'", 
			"'precision'", "'readonly'", "'restrict'", "'return'", "'sample'", "'sampler1D'", 
			"'sampler1DArray'", "'sampler1DArrayShadow'", "'sampler1DShadow'", "'sampler2D'", 
			"'sampler2DArray'", "'sampler2DArrayShadow'", "'sampler2DMS'", "'sampler2DMSArray'", 
			"'sampler2DRect'", "'sampler2DRectShadow'", "'sampler2DShadow'", "'sampler3D'", 
			"'samplerBuffer'", "'samplerCube'", "'samplerCubeArray'", "'samplerCubeArrayShadow'", 
			"'samplerCubeShadow'", "'samplerShadow'", "'shared'", "'smooth'", "'struct'", 
			"'subroutine'", "'switch'", "'true'", "'uimage1D'", "'uimage1DArray'", 
			"'uimage2D'", "'uimage2DArray'", "'uimage2DMS'", "'uimage2DMSArray'", 
			"'uimage2DRect'", "'uimage3D'", "'uimageBuffer'", "'uimageCube'", "'uimageCubeArray'", 
			"'uint'", "'uniform'", "'usampler1D'", "'usampler1DArray'", "'usampler2D'", 
			"'usampler2DArray'", "'usampler2DMS'", "'usampler2DMSArray'", "'usampler2DRect'", 
			"'usampler3D'", "'usamplerBuffer'", "'usamplerCube'", "'usamplerCubeArray'", 
			"'uvec2'", "'uvec3'", "'uvec4'", "'varying'", "'vec2'", "'vec3'", "'vec4'", 
			"'void'", "'volatile'", "'while'", "'writeonly'", "'int8_t'", "'i8vec2'", 
			"'i8vec3'", "'i8vec4'", "'int16_t'", "'i16vec2'", "'i16vec3'", "'i16vec4'", 
			"'int32_t'", "'i32vec2'", "'i32vec3'", "'i32vec4'", "'int64_t'", "'i64vec2'", 
			"'i64vec3'", "'i64vec4'", "'uint8_t'", "'u8vec2'", "'u8vec3'", "'u8vec4'", 
			"'uint16_t'", "'u16vec2'", "'u16vec3'", "'u16vec4'", "'uint32_t'", "'u32vec2'", 
			"'u32vec3'", "'u32vec4'", "'uint64_t'", "'u64vec2'", "'u64vec3'", "'u64vec4'", 
			"'float16_t'", "'f16vec2'", "'f16vec3'", "'f16vec4'", "'float32_t'", 
			"'f32vec2'", "'f32vec3'", "'f32vec4'", "'float64_t'", "'f64vec2'", "'f64vec3'", 
			"'f64vec4'", "'+='", "'&'", "'&='", "'&&'", "'!'", "'^'", "':'", "','", 
			"'-'", "'--'", "'/='", "'.'", "'->'", "'=='", "'='", "'>='", "'++'", 
			"'<='", "'<'", "'<<='", "'{'", "'['", "'<<'", "'('", "'%='", "'*='", 
			"'!='", null, "'|='", "'||'", "'%'", "'+'", "'?'", "'>'", "'>>='", "'}'", 
			"']'", "'>>'", "')'", "';'", "'/'", "'*'", "'-='", "'~'", "'|'", "'^='", 
			"'^^'", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'debug'", 
			null, "'off'", "'on'", "'optimize'", null, "'STDGL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ATOMIC_UINT", "ATTRIBUTE", "BOOL", "BREAK", "BUFFER", "BVEC2", 
			"BVEC3", "BVEC4", "CASE", "CENTROID", "COHERENT", "CONST", "CONTINUE", 
			"DEFAULT", "DISCARD", "DMAT2", "DMAT2X2", "DMAT2X3", "DMAT2X4", "DMAT3", 
			"DMAT3X2", "DMAT3X3", "DMAT3X4", "DMAT4", "DMAT4X2", "DMAT4X3", "DMAT4X4", 
			"DO", "DOUBLE", "DVEC2", "DVEC3", "DVEC4", "ELSE", "FALSE", "FLAT", "FLOAT", 
			"FOR", "HIGHP", "IF", "IIMAGE1D", "IIMAGE1DARRAY", "IIMAGE2D", "IIMAGE2DARRAY", 
			"IIMAGE2DMS", "IIMAGE2DMSARRAY", "IIMAGE2DRECT", "IIMAGE3D", "IIMAGEBUFFER", 
			"IIMAGECUBE", "IIMAGECUBEARRAY", "IMAGE1D", "IMAGE1DARRAY", "IMAGE2D", 
			"IMAGE2DARRAY", "IMAGE2DMS", "IMAGE2DMSARRAY", "IMAGE2DRECT", "IMAGE3D", 
			"IMAGEBUFFER", "IMAGECUBE", "IMAGECUBEARRAY", "IN", "INOUT", "INT", "INVARIANT", 
			"ISAMPLER1D", "ISAMPLER1DARRAY", "ISAMPLER2D", "ISAMPLER2DARRAY", "ISAMPLER2DMS", 
			"ISAMPLER2DMSARRAY", "ISAMPLER2DRECT", "ISAMPLER3D", "ISAMPLERBUFFER", 
			"ISAMPLERCUBE", "ISAMPLERCUBEARRAY", "IVEC2", "IVEC3", "IVEC4", "LAYOUT", 
			"LOWP", "MAT2", "MAT2X2", "MAT2X3", "MAT2X4", "MAT3", "MAT3X2", "MAT3X3", 
			"MAT3X4", "MAT4", "MAT4X2", "MAT4X3", "MAT4X4", "MEDIUMP", "NOPERSPECTIVE", 
			"OUT", "PATCH", "PRECISE", "PRECISION", "READONLY", "RESTRICT", "RETURN", 
			"SAMPLE", "SAMPLER1D", "SAMPLER1DARRAY", "SAMPLER1DARRAYSHADOW", "SAMPLER1DSHADOW", 
			"SAMPLER2D", "SAMPLER2DARRAY", "SAMPLER2DARRAYSHADOW", "SAMPLER2DMS", 
			"SAMPLER2DMSARRAY", "SAMPLER2DRECT", "SAMPLER2DRECTSHADOW", "SAMPLER2DSHADOW", 
			"SAMPLER3D", "SAMPLERBUFFER", "SAMPLERCUBE", "SAMPLERCUBEARRAY", "SAMPLERCUBEARRAYSHADOW", 
			"SAMPLERCUBESHADOW", "SAMPLERSHADOW", "SHARED", "SMOOTH", "STRUCT", "SUBROUTINE", 
			"SWITCH", "TRUE", "UIMAGE1D", "UIMAGE1DARRAY", "UIMAGE2D", "UIMAGE2DARRAY", 
			"UIMAGE2DMS", "UIMAGE2DMSARRAY", "UIMAGE2DRECT", "UIMAGE3D", "UIMAGEBUFFER", 
			"UIMAGECUBE", "UIMAGECUBEARRAY", "UINT", "UNIFORM", "USAMPLER1D", "USAMPLER1DARRAY", 
			"USAMPLER2D", "USAMPLER2DARRAY", "USAMPLER2DMS", "USAMPLER2DMSARRAY", 
			"USAMPLER2DRECT", "USAMPLER3D", "USAMPLERBUFFER", "USAMPLERCUBE", "USAMPLERCUBEARRAY", 
			"UVEC2", "UVEC3", "UVEC4", "VARYING", "VEC2", "VEC3", "VEC4", "VOID", 
			"VOLATILE", "WHILE", "WRITEONLY", "INT8_T", "I8VEC2", "I8VEC3", "I8VEC4", 
			"INT16_T", "I16VEC2", "I16VEC3", "I16VEC4", "INT32_T", "I32VEC2", "I32VEC3", 
			"I32VEC4", "INT64_T", "I64VEC2", "I64VEC3", "I64VEC4", "UINT8_T", "U8VEC2", 
			"U8VEC3", "U8VEC4", "UINT16_T", "U16VEC2", "U16VEC3", "U16VEC4", "UINT32_T", 
			"U32VEC2", "U32VEC3", "U32VEC4", "UINT64_T", "U64VEC2", "U64VEC3", "U64VEC4", 
			"FLOAT16_T", "F16VEC2", "F16VEC3", "F16VEC4", "FLOAT32_T", "F32VEC2", 
			"F32VEC3", "F32VEC4", "FLOAT64_T", "F64VEC2", "F64VEC3", "F64VEC4", "ADD_ASSIGN", 
			"AMPERSAND", "AND_ASSIGN", "AND_OP", "BANG", "CARET", "COLON", "COMMA", 
			"DASH", "DEC_OP", "DIV_ASSIGN", "DOT", "ARROW", "EQ_OP", "EQUAL", "GE_OP", 
			"INC_OP", "LE_OP", "LEFT_ANGLE", "LEFT_ASSIGN", "LEFT_BRACE", "LEFT_BRACKET", 
			"LEFT_OP", "LEFT_PAREN", "MOD_ASSIGN", "MUL_ASSIGN", "NE_OP", "NUMBER_SIGN", 
			"OR_ASSIGN", "OR_OP", "PERCENT", "PLUS", "QUESTION", "RIGHT_ANGLE", "RIGHT_ASSIGN", 
			"RIGHT_BRACE", "RIGHT_BRACKET", "RIGHT_OP", "RIGHT_PAREN", "SEMICOLON", 
			"SLASH", "STAR", "SUB_ASSIGN", "TILDE", "VERTICAL_BAR", "XOR_ASSIGN", 
			"XOR_OP", "DOUBLECONSTANT", "FLOATCONSTANT", "INTCONSTANT", "UINTCONSTANT", 
			"BLOCK_COMMENT", "LINE_COMMENT", "LINE_CONTINUATION", "IDENTIFIER", "WHITE_SPACE", 
			"DEFINE_DIRECTIVE", "ELIF_DIRECTIVE", "ELSE_DIRECTIVE", "ENDIF_DIRECTIVE", 
			"ERROR_DIRECTIVE", "EXTENSION_DIRECTIVE", "IF_DIRECTIVE", "IFDEF_DIRECTIVE", 
			"IFNDEF_DIRECTIVE", "LINE_DIRECTIVE", "PRAGMA_DIRECTIVE", "UNDEF_DIRECTIVE", 
			"VERSION_DIRECTIVE", "INCLUDE_DIRECTIVE", "SPACE_TAB_0", "NEWLINE_0", 
			"MACRO_NAME", "NEWLINE_1", "SPACE_TAB_1", "CONSTANT_EXPRESSION", "NEWLINE_2", 
			"ERROR_MESSAGE", "NEWLINE_3", "BEHAVIOR", "EXTENSION_NAME", "NEWLINE_4", 
			"SPACE_TAB_2", "NEWLINE_5", "MACRO_IDENTIFIER", "NEWLINE_6", "SPACE_TAB_3", 
			"LINE_EXPRESSION", "NEWLINE_7", "MACRO_ESC_NEWLINE", "MACRO_TEXT", "NEWLINE_8", 
			"DEBUG", "NEWLINE_9", "OFF", "ON", "OPTIMIZE", "SPACE_TAB_5", "STDGL", 
			"PROGRAM_TEXT", "NEWLINE_10", "SPACE_TAB_6", "NEWLINE_11", "NUMBER", 
			"PROFILE", "SPACE_TAB_7", "NEWLINE_12", "GLSL_FILE_NAME", "SPACE_TAB_8"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "NVIDIAParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NVIDIAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Translation_unitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NVIDIAParser.EOF, 0); }
		public List<External_declarationContext> external_declaration() {
			return getRuleContexts(External_declarationContext.class);
		}
		public External_declarationContext external_declaration(int i) {
			return getRuleContext(External_declarationContext.class,i);
		}
		public Translation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterTranslation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitTranslation_unit(this);
		}
	}

	public final Translation_unitContext translation_unit() throws RecognitionException {
		Translation_unitContext _localctx = new Translation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << BOOL) | (1L << BUFFER) | (1L << BVEC2) | (1L << BVEC3) | (1L << BVEC4) | (1L << CENTROID) | (1L << COHERENT) | (1L << CONST) | (1L << DMAT2) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << DMAT3) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << DMAT4) | (1L << DMAT4X2) | (1L << DMAT4X3) | (1L << DMAT4X4) | (1L << DOUBLE) | (1L << DVEC2) | (1L << DVEC3) | (1L << DVEC4) | (1L << FLAT) | (1L << FLOAT) | (1L << HIGHP) | (1L << IIMAGE1D) | (1L << IIMAGE1DARRAY) | (1L << IIMAGE2D) | (1L << IIMAGE2DARRAY) | (1L << IIMAGE2DMS) | (1L << IIMAGE2DMSARRAY) | (1L << IIMAGE2DRECT) | (1L << IIMAGE3D) | (1L << IIMAGEBUFFER) | (1L << IIMAGECUBE) | (1L << IIMAGECUBEARRAY) | (1L << IMAGE1D) | (1L << IMAGE1DARRAY) | (1L << IMAGE2D) | (1L << IMAGE2DARRAY) | (1L << IMAGE2DMS) | (1L << IMAGE2DMSARRAY) | (1L << IMAGE2DRECT) | (1L << IMAGE3D) | (1L << IMAGEBUFFER) | (1L << IMAGECUBE) | (1L << IMAGECUBEARRAY) | (1L << IN) | (1L << INOUT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT - 64)) | (1L << (INVARIANT - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (LAYOUT - 64)) | (1L << (LOWP - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (MAT4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (MEDIUMP - 64)) | (1L << (NOPERSPECTIVE - 64)) | (1L << (OUT - 64)) | (1L << (PATCH - 64)) | (1L << (PRECISE - 64)) | (1L << (PRECISION - 64)) | (1L << (READONLY - 64)) | (1L << (RESTRICT - 64)) | (1L << (SAMPLE - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SHARED - 64)) | (1L << (SMOOTH - 64)) | (1L << (STRUCT - 64)) | (1L << (SUBROUTINE - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (UIMAGE1D - 129)) | (1L << (UIMAGE1DARRAY - 129)) | (1L << (UIMAGE2D - 129)) | (1L << (UIMAGE2DARRAY - 129)) | (1L << (UIMAGE2DMS - 129)) | (1L << (UIMAGE2DMSARRAY - 129)) | (1L << (UIMAGE2DRECT - 129)) | (1L << (UIMAGE3D - 129)) | (1L << (UIMAGEBUFFER - 129)) | (1L << (UIMAGECUBE - 129)) | (1L << (UIMAGECUBEARRAY - 129)) | (1L << (UINT - 129)) | (1L << (UNIFORM - 129)) | (1L << (USAMPLER1D - 129)) | (1L << (USAMPLER1DARRAY - 129)) | (1L << (USAMPLER2D - 129)) | (1L << (USAMPLER2DARRAY - 129)) | (1L << (USAMPLER2DMS - 129)) | (1L << (USAMPLER2DMSARRAY - 129)) | (1L << (USAMPLER2DRECT - 129)) | (1L << (USAMPLER3D - 129)) | (1L << (USAMPLERBUFFER - 129)) | (1L << (USAMPLERCUBE - 129)) | (1L << (USAMPLERCUBEARRAY - 129)) | (1L << (UVEC2 - 129)) | (1L << (UVEC3 - 129)) | (1L << (UVEC4 - 129)) | (1L << (VEC2 - 129)) | (1L << (VEC3 - 129)) | (1L << (VEC4 - 129)) | (1L << (VOID - 129)) | (1L << (VOLATILE - 129)) | (1L << (WRITEONLY - 129)) | (1L << (INT8_T - 129)) | (1L << (I8VEC2 - 129)) | (1L << (I8VEC3 - 129)) | (1L << (I8VEC4 - 129)) | (1L << (INT16_T - 129)) | (1L << (I16VEC2 - 129)) | (1L << (I16VEC3 - 129)) | (1L << (I16VEC4 - 129)) | (1L << (INT32_T - 129)) | (1L << (I32VEC2 - 129)) | (1L << (I32VEC3 - 129)) | (1L << (I32VEC4 - 129)) | (1L << (INT64_T - 129)) | (1L << (I64VEC2 - 129)) | (1L << (I64VEC3 - 129)) | (1L << (I64VEC4 - 129)) | (1L << (UINT8_T - 129)) | (1L << (U8VEC2 - 129)) | (1L << (U8VEC3 - 129)) | (1L << (U8VEC4 - 129)) | (1L << (UINT16_T - 129)) | (1L << (U16VEC2 - 129)) | (1L << (U16VEC3 - 129)) | (1L << (U16VEC4 - 129)) | (1L << (UINT32_T - 129)) | (1L << (U32VEC2 - 129)) | (1L << (U32VEC3 - 129)) | (1L << (U32VEC4 - 129)) | (1L << (UINT64_T - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (U64VEC2 - 193)) | (1L << (U64VEC3 - 193)) | (1L << (U64VEC4 - 193)) | (1L << (FLOAT16_T - 193)) | (1L << (F16VEC2 - 193)) | (1L << (F16VEC3 - 193)) | (1L << (F16VEC4 - 193)) | (1L << (FLOAT32_T - 193)) | (1L << (F32VEC2 - 193)) | (1L << (F32VEC3 - 193)) | (1L << (F32VEC4 - 193)) | (1L << (FLOAT64_T - 193)) | (1L << (F64VEC2 - 193)) | (1L << (F64VEC3 - 193)) | (1L << (F64VEC4 - 193)) | (1L << (SEMICOLON - 193)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(142);
				external_declaration();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_identifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NVIDIAParser.IDENTIFIER, 0); }
		public Variable_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterVariable_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitVariable_identifier(this);
		}
	}

	public final Variable_identifierContext variable_identifier() throws RecognitionException {
		Variable_identifierContext _localctx = new Variable_identifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variable_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(NVIDIAParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(NVIDIAParser.FALSE, 0); }
		public TerminalNode INTCONSTANT() { return getToken(NVIDIAParser.INTCONSTANT, 0); }
		public TerminalNode UINTCONSTANT() { return getToken(NVIDIAParser.UINTCONSTANT, 0); }
		public TerminalNode FLOATCONSTANT() { return getToken(NVIDIAParser.FLOATCONSTANT, 0); }
		public TerminalNode DOUBLECONSTANT() { return getToken(NVIDIAParser.DOUBLECONSTANT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(NVIDIAParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(NVIDIAParser.RIGHT_PAREN, 0); }
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primary_expression);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				variable_identifier();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(FALSE);
				}
				break;
			case INTCONSTANT:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				match(INTCONSTANT);
				}
				break;
			case UINTCONSTANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				match(UINTCONSTANT);
				}
				break;
			case FLOATCONSTANT:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				match(FLOATCONSTANT);
				}
				break;
			case DOUBLECONSTANT:
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				match(DOUBLECONSTANT);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 8);
				{
				setState(159);
				match(LEFT_PAREN);
				setState(160);
				expression(0);
				setState(161);
				match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(NVIDIAParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(NVIDIAParser.RIGHT_PAREN, 0); }
		public Layout_qualifierContext layout_qualifier() {
			return getRuleContext(Layout_qualifierContext.class,0);
		}
		public Function_call_parametersContext function_call_parameters() {
			return getRuleContext(Function_call_parametersContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(NVIDIAParser.LEFT_BRACKET, 0); }
		public Integer_expressionContext integer_expression() {
			return getRuleContext(Integer_expressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(NVIDIAParser.RIGHT_BRACKET, 0); }
		public Field_selectionContext field_selection() {
			return getRuleContext(Field_selectionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(NVIDIAParser.DOT, 0); }
		public TerminalNode ARROW() { return getToken(NVIDIAParser.ARROW, 0); }
		public TerminalNode INC_OP() { return getToken(NVIDIAParser.INC_OP, 0); }
		public TerminalNode DEC_OP() { return getToken(NVIDIAParser.DEC_OP, 0); }
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterPostfix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitPostfix_expression(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		return postfix_expression(0);
	}

	private Postfix_expressionContext postfix_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, _parentState);
		Postfix_expressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(166);
				primary_expression();
				}
				break;
			case 2:
				{
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAYOUT) {
					{
					setState(167);
					layout_qualifier();
					}
				}

				setState(170);
				type_specifier();
				setState(171);
				match(LEFT_PAREN);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << BOOL) | (1L << BVEC2) | (1L << BVEC3) | (1L << BVEC4) | (1L << DMAT2) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << DMAT3) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << DMAT4) | (1L << DMAT4X2) | (1L << DMAT4X3) | (1L << DMAT4X4) | (1L << DOUBLE) | (1L << DVEC2) | (1L << DVEC3) | (1L << DVEC4) | (1L << FALSE) | (1L << FLOAT) | (1L << IIMAGE1D) | (1L << IIMAGE1DARRAY) | (1L << IIMAGE2D) | (1L << IIMAGE2DARRAY) | (1L << IIMAGE2DMS) | (1L << IIMAGE2DMSARRAY) | (1L << IIMAGE2DRECT) | (1L << IIMAGE3D) | (1L << IIMAGEBUFFER) | (1L << IIMAGECUBE) | (1L << IIMAGECUBEARRAY) | (1L << IMAGE1D) | (1L << IMAGE1DARRAY) | (1L << IMAGE2D) | (1L << IMAGE2DARRAY) | (1L << IMAGE2DMS) | (1L << IMAGE2DMSARRAY) | (1L << IMAGE2DRECT) | (1L << IMAGE3D) | (1L << IMAGEBUFFER) | (1L << IMAGECUBE) | (1L << IMAGECUBEARRAY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (LAYOUT - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (MAT4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (STRUCT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (TRUE - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (UINT - 128)) | (1L << (USAMPLER1D - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (UVEC2 - 128)) | (1L << (UVEC3 - 128)) | (1L << (UVEC4 - 128)) | (1L << (VEC2 - 128)) | (1L << (VEC3 - 128)) | (1L << (VEC4 - 128)) | (1L << (VOID - 128)) | (1L << (INT8_T - 128)) | (1L << (I8VEC2 - 128)) | (1L << (I8VEC3 - 128)) | (1L << (I8VEC4 - 128)) | (1L << (INT16_T - 128)) | (1L << (I16VEC2 - 128)) | (1L << (I16VEC3 - 128)) | (1L << (I16VEC4 - 128)) | (1L << (INT32_T - 128)) | (1L << (I32VEC2 - 128)) | (1L << (I32VEC3 - 128)) | (1L << (I32VEC4 - 128)) | (1L << (INT64_T - 128)) | (1L << (I64VEC2 - 128)) | (1L << (I64VEC3 - 128)) | (1L << (I64VEC4 - 128)) | (1L << (UINT8_T - 128)) | (1L << (U8VEC2 - 128)) | (1L << (U8VEC3 - 128)) | (1L << (U8VEC4 - 128)) | (1L << (UINT16_T - 128)) | (1L << (U16VEC2 - 128)) | (1L << (U16VEC3 - 128)) | (1L << (U16VEC4 - 128)) | (1L << (UINT32_T - 128)) | (1L << (U32VEC2 - 128)) | (1L << (U32VEC3 - 128)) | (1L << (U32VEC4 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UINT64_T - 192)) | (1L << (U64VEC2 - 192)) | (1L << (U64VEC3 - 192)) | (1L << (U64VEC4 - 192)) | (1L << (FLOAT16_T - 192)) | (1L << (F16VEC2 - 192)) | (1L << (F16VEC3 - 192)) | (1L << (F16VEC4 - 192)) | (1L << (FLOAT32_T - 192)) | (1L << (F32VEC2 - 192)) | (1L << (F32VEC3 - 192)) | (1L << (F32VEC4 - 192)) | (1L << (FLOAT64_T - 192)) | (1L << (F64VEC2 - 192)) | (1L << (F64VEC3 - 192)) | (1L << (F64VEC4 - 192)) | (1L << (AMPERSAND - 192)) | (1L << (BANG - 192)) | (1L << (DASH - 192)) | (1L << (DEC_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (PLUS - 192)) | (1L << (STAR - 192)) | (1L << (TILDE - 192)) | (1L << (DOUBLECONSTANT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (FLOATCONSTANT - 256)) | (1L << (INTCONSTANT - 256)) | (1L << (UINTCONSTANT - 256)) | (1L << (IDENTIFIER - 256)))) != 0)) {
					{
					setState(172);
					function_call_parameters();
					}
				}

				setState(175);
				match(RIGHT_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(197);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(179);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(180);
						match(LEFT_BRACKET);
						setState(181);
						integer_expression();
						setState(182);
						match(RIGHT_BRACKET);
						}
						break;
					case 2:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(184);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(185);
						match(LEFT_PAREN);
						setState(187);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << BOOL) | (1L << BVEC2) | (1L << BVEC3) | (1L << BVEC4) | (1L << DMAT2) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << DMAT3) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << DMAT4) | (1L << DMAT4X2) | (1L << DMAT4X3) | (1L << DMAT4X4) | (1L << DOUBLE) | (1L << DVEC2) | (1L << DVEC3) | (1L << DVEC4) | (1L << FALSE) | (1L << FLOAT) | (1L << IIMAGE1D) | (1L << IIMAGE1DARRAY) | (1L << IIMAGE2D) | (1L << IIMAGE2DARRAY) | (1L << IIMAGE2DMS) | (1L << IIMAGE2DMSARRAY) | (1L << IIMAGE2DRECT) | (1L << IIMAGE3D) | (1L << IIMAGEBUFFER) | (1L << IIMAGECUBE) | (1L << IIMAGECUBEARRAY) | (1L << IMAGE1D) | (1L << IMAGE1DARRAY) | (1L << IMAGE2D) | (1L << IMAGE2DARRAY) | (1L << IMAGE2DMS) | (1L << IMAGE2DMSARRAY) | (1L << IMAGE2DRECT) | (1L << IMAGE3D) | (1L << IMAGEBUFFER) | (1L << IMAGECUBE) | (1L << IMAGECUBEARRAY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (LAYOUT - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (MAT4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (STRUCT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (TRUE - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (UINT - 128)) | (1L << (USAMPLER1D - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (UVEC2 - 128)) | (1L << (UVEC3 - 128)) | (1L << (UVEC4 - 128)) | (1L << (VEC2 - 128)) | (1L << (VEC3 - 128)) | (1L << (VEC4 - 128)) | (1L << (VOID - 128)) | (1L << (INT8_T - 128)) | (1L << (I8VEC2 - 128)) | (1L << (I8VEC3 - 128)) | (1L << (I8VEC4 - 128)) | (1L << (INT16_T - 128)) | (1L << (I16VEC2 - 128)) | (1L << (I16VEC3 - 128)) | (1L << (I16VEC4 - 128)) | (1L << (INT32_T - 128)) | (1L << (I32VEC2 - 128)) | (1L << (I32VEC3 - 128)) | (1L << (I32VEC4 - 128)) | (1L << (INT64_T - 128)) | (1L << (I64VEC2 - 128)) | (1L << (I64VEC3 - 128)) | (1L << (I64VEC4 - 128)) | (1L << (UINT8_T - 128)) | (1L << (U8VEC2 - 128)) | (1L << (U8VEC3 - 128)) | (1L << (U8VEC4 - 128)) | (1L << (UINT16_T - 128)) | (1L << (U16VEC2 - 128)) | (1L << (U16VEC3 - 128)) | (1L << (U16VEC4 - 128)) | (1L << (UINT32_T - 128)) | (1L << (U32VEC2 - 128)) | (1L << (U32VEC3 - 128)) | (1L << (U32VEC4 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UINT64_T - 192)) | (1L << (U64VEC2 - 192)) | (1L << (U64VEC3 - 192)) | (1L << (U64VEC4 - 192)) | (1L << (FLOAT16_T - 192)) | (1L << (F16VEC2 - 192)) | (1L << (F16VEC3 - 192)) | (1L << (F16VEC4 - 192)) | (1L << (FLOAT32_T - 192)) | (1L << (F32VEC2 - 192)) | (1L << (F32VEC3 - 192)) | (1L << (F32VEC4 - 192)) | (1L << (FLOAT64_T - 192)) | (1L << (F64VEC2 - 192)) | (1L << (F64VEC3 - 192)) | (1L << (F64VEC4 - 192)) | (1L << (AMPERSAND - 192)) | (1L << (BANG - 192)) | (1L << (DASH - 192)) | (1L << (DEC_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (PLUS - 192)) | (1L << (STAR - 192)) | (1L << (TILDE - 192)) | (1L << (DOUBLECONSTANT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (FLOATCONSTANT - 256)) | (1L << (INTCONSTANT - 256)) | (1L << (UINTCONSTANT - 256)) | (1L << (IDENTIFIER - 256)))) != 0)) {
							{
							setState(186);
							function_call_parameters();
							}
						}

						setState(189);
						match(RIGHT_PAREN);
						}
						break;
					case 3:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(190);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(191);
						_la = _input.LA(1);
						if ( !(_la==DOT || _la==ARROW) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						field_selection();
						}
						break;
					case 4:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(193);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(194);
						match(INC_OP);
						}
						break;
					case 5:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(195);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(196);
						match(DEC_OP);
						}
						break;
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Field_selectionContext extends ParserRuleContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Field_selectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterField_selection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitField_selection(this);
		}
	}

	public final Field_selectionContext field_selection() throws RecognitionException {
		Field_selectionContext _localctx = new Field_selectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field_selection);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				variable_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				function_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Integer_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterInteger_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitInteger_expression(this);
		}
	}

	public final Integer_expressionContext integer_expression() throws RecognitionException {
		Integer_expressionContext _localctx = new Integer_expressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_integer_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public Function_identifierContext function_identifier() {
			return getRuleContext(Function_identifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(NVIDIAParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(NVIDIAParser.RIGHT_PAREN, 0); }
		public Function_call_parametersContext function_call_parameters() {
			return getRuleContext(Function_call_parametersContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			function_identifier();
			setState(209);
			match(LEFT_PAREN);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << BOOL) | (1L << BVEC2) | (1L << BVEC3) | (1L << BVEC4) | (1L << DMAT2) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << DMAT3) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << DMAT4) | (1L << DMAT4X2) | (1L << DMAT4X3) | (1L << DMAT4X4) | (1L << DOUBLE) | (1L << DVEC2) | (1L << DVEC3) | (1L << DVEC4) | (1L << FALSE) | (1L << FLOAT) | (1L << IIMAGE1D) | (1L << IIMAGE1DARRAY) | (1L << IIMAGE2D) | (1L << IIMAGE2DARRAY) | (1L << IIMAGE2DMS) | (1L << IIMAGE2DMSARRAY) | (1L << IIMAGE2DRECT) | (1L << IIMAGE3D) | (1L << IIMAGEBUFFER) | (1L << IIMAGECUBE) | (1L << IIMAGECUBEARRAY) | (1L << IMAGE1D) | (1L << IMAGE1DARRAY) | (1L << IMAGE2D) | (1L << IMAGE2DARRAY) | (1L << IMAGE2DMS) | (1L << IMAGE2DMSARRAY) | (1L << IMAGE2DRECT) | (1L << IMAGE3D) | (1L << IMAGEBUFFER) | (1L << IMAGECUBE) | (1L << IMAGECUBEARRAY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (LAYOUT - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (MAT4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (STRUCT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (TRUE - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (UINT - 128)) | (1L << (USAMPLER1D - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (UVEC2 - 128)) | (1L << (UVEC3 - 128)) | (1L << (UVEC4 - 128)) | (1L << (VEC2 - 128)) | (1L << (VEC3 - 128)) | (1L << (VEC4 - 128)) | (1L << (VOID - 128)) | (1L << (INT8_T - 128)) | (1L << (I8VEC2 - 128)) | (1L << (I8VEC3 - 128)) | (1L << (I8VEC4 - 128)) | (1L << (INT16_T - 128)) | (1L << (I16VEC2 - 128)) | (1L << (I16VEC3 - 128)) | (1L << (I16VEC4 - 128)) | (1L << (INT32_T - 128)) | (1L << (I32VEC2 - 128)) | (1L << (I32VEC3 - 128)) | (1L << (I32VEC4 - 128)) | (1L << (INT64_T - 128)) | (1L << (I64VEC2 - 128)) | (1L << (I64VEC3 - 128)) | (1L << (I64VEC4 - 128)) | (1L << (UINT8_T - 128)) | (1L << (U8VEC2 - 128)) | (1L << (U8VEC3 - 128)) | (1L << (U8VEC4 - 128)) | (1L << (UINT16_T - 128)) | (1L << (U16VEC2 - 128)) | (1L << (U16VEC3 - 128)) | (1L << (U16VEC4 - 128)) | (1L << (UINT32_T - 128)) | (1L << (U32VEC2 - 128)) | (1L << (U32VEC3 - 128)) | (1L << (U32VEC4 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UINT64_T - 192)) | (1L << (U64VEC2 - 192)) | (1L << (U64VEC3 - 192)) | (1L << (U64VEC4 - 192)) | (1L << (FLOAT16_T - 192)) | (1L << (F16VEC2 - 192)) | (1L << (F16VEC3 - 192)) | (1L << (F16VEC4 - 192)) | (1L << (FLOAT32_T - 192)) | (1L << (F32VEC2 - 192)) | (1L << (F32VEC3 - 192)) | (1L << (F32VEC4 - 192)) | (1L << (FLOAT64_T - 192)) | (1L << (F64VEC2 - 192)) | (1L << (F64VEC3 - 192)) | (1L << (F64VEC4 - 192)) | (1L << (AMPERSAND - 192)) | (1L << (BANG - 192)) | (1L << (DASH - 192)) | (1L << (DEC_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (PLUS - 192)) | (1L << (STAR - 192)) | (1L << (TILDE - 192)) | (1L << (DOUBLECONSTANT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (FLOATCONSTANT - 256)) | (1L << (INTCONSTANT - 256)) | (1L << (UINTCONSTANT - 256)) | (1L << (IDENTIFIER - 256)))) != 0)) {
				{
				setState(210);
				function_call_parameters();
				}
			}

			setState(213);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_identifierContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Function_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterFunction_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitFunction_identifier(this);
		}
	}

	public final Function_identifierContext function_identifier() throws RecognitionException {
		Function_identifierContext _localctx = new Function_identifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_identifier);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				type_specifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				postfix_expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_parametersContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NVIDIAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NVIDIAParser.COMMA, i);
		}
		public TerminalNode VOID() { return getToken(NVIDIAParser.VOID, 0); }
		public Function_call_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterFunction_call_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitFunction_call_parameters(this);
		}
	}

	public final Function_call_parametersContext function_call_parameters() throws RecognitionException {
		Function_call_parametersContext _localctx = new Function_call_parametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_call_parameters);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				assignment_expression();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(220);
					match(COMMA);
					setState(221);
					assignment_expression();
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(VOID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_expressionContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(NVIDIAParser.LEFT_PAREN, 0); }
		public Type_specifier_nonarrayContext type_specifier_nonarray() {
			return getRuleContext(Type_specifier_nonarrayContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(NVIDIAParser.RIGHT_PAREN, 0); }
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitCast_expression(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cast_expression);
		int _la;
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(LEFT_PAREN);
				setState(231);
				type_specifier_nonarray();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR) {
					{
					setState(232);
					pointer();
					}
				}

				setState(235);
				match(RIGHT_PAREN);
				setState(236);
				cast_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				unary_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode INC_OP() { return getToken(NVIDIAParser.INC_OP, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode DEC_OP() { return getToken(NVIDIAParser.DEC_OP, 0); }
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unary_expression);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATOMIC_UINT:
			case BOOL:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case DMAT2:
			case DMAT2X2:
			case DMAT2X3:
			case DMAT2X4:
			case DMAT3:
			case DMAT3X2:
			case DMAT3X3:
			case DMAT3X4:
			case DMAT4:
			case DMAT4X2:
			case DMAT4X3:
			case DMAT4X4:
			case DOUBLE:
			case DVEC2:
			case DVEC3:
			case DVEC4:
			case FALSE:
			case FLOAT:
			case IIMAGE1D:
			case IIMAGE1DARRAY:
			case IIMAGE2D:
			case IIMAGE2DARRAY:
			case IIMAGE2DMS:
			case IIMAGE2DMSARRAY:
			case IIMAGE2DRECT:
			case IIMAGE3D:
			case IIMAGEBUFFER:
			case IIMAGECUBE:
			case IIMAGECUBEARRAY:
			case IMAGE1D:
			case IMAGE1DARRAY:
			case IMAGE2D:
			case IMAGE2DARRAY:
			case IMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IMAGE2DRECT:
			case IMAGE3D:
			case IMAGEBUFFER:
			case IMAGECUBE:
			case IMAGECUBEARRAY:
			case INT:
			case ISAMPLER1D:
			case ISAMPLER1DARRAY:
			case ISAMPLER2D:
			case ISAMPLER2DARRAY:
			case ISAMPLER2DMS:
			case ISAMPLER2DMSARRAY:
			case ISAMPLER2DRECT:
			case ISAMPLER3D:
			case ISAMPLERBUFFER:
			case ISAMPLERCUBE:
			case ISAMPLERCUBEARRAY:
			case IVEC2:
			case IVEC3:
			case IVEC4:
			case LAYOUT:
			case MAT2:
			case MAT2X2:
			case MAT2X3:
			case MAT2X4:
			case MAT3:
			case MAT3X2:
			case MAT3X3:
			case MAT3X4:
			case MAT4:
			case MAT4X2:
			case MAT4X3:
			case MAT4X4:
			case SAMPLER1D:
			case SAMPLER1DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER1DSHADOW:
			case SAMPLER2D:
			case SAMPLER2DARRAY:
			case SAMPLER2DARRAYSHADOW:
			case SAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case SAMPLER2DRECT:
			case SAMPLER2DRECTSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLER3D:
			case SAMPLERBUFFER:
			case SAMPLERCUBE:
			case SAMPLERCUBEARRAY:
			case SAMPLERCUBEARRAYSHADOW:
			case SAMPLERCUBESHADOW:
			case STRUCT:
			case TRUE:
			case UIMAGE1D:
			case UIMAGE1DARRAY:
			case UIMAGE2D:
			case UIMAGE2DARRAY:
			case UIMAGE2DMS:
			case UIMAGE2DMSARRAY:
			case UIMAGE2DRECT:
			case UIMAGE3D:
			case UIMAGEBUFFER:
			case UIMAGECUBE:
			case UIMAGECUBEARRAY:
			case UINT:
			case USAMPLER1D:
			case USAMPLER1DARRAY:
			case USAMPLER2D:
			case USAMPLER2DARRAY:
			case USAMPLER2DMS:
			case USAMPLER2DMSARRAY:
			case USAMPLER2DRECT:
			case USAMPLER3D:
			case USAMPLERBUFFER:
			case USAMPLERCUBE:
			case USAMPLERCUBEARRAY:
			case UVEC2:
			case UVEC3:
			case UVEC4:
			case VEC2:
			case VEC3:
			case VEC4:
			case VOID:
			case INT8_T:
			case I8VEC2:
			case I8VEC3:
			case I8VEC4:
			case INT16_T:
			case I16VEC2:
			case I16VEC3:
			case I16VEC4:
			case INT32_T:
			case I32VEC2:
			case I32VEC3:
			case I32VEC4:
			case INT64_T:
			case I64VEC2:
			case I64VEC3:
			case I64VEC4:
			case UINT8_T:
			case U8VEC2:
			case U8VEC3:
			case U8VEC4:
			case UINT16_T:
			case U16VEC2:
			case U16VEC3:
			case U16VEC4:
			case UINT32_T:
			case U32VEC2:
			case U32VEC3:
			case U32VEC4:
			case UINT64_T:
			case U64VEC2:
			case U64VEC3:
			case U64VEC4:
			case FLOAT16_T:
			case F16VEC2:
			case F16VEC3:
			case F16VEC4:
			case FLOAT32_T:
			case F32VEC2:
			case F32VEC3:
			case F32VEC4:
			case FLOAT64_T:
			case F64VEC2:
			case F64VEC3:
			case F64VEC4:
			case LEFT_PAREN:
			case DOUBLECONSTANT:
			case FLOATCONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				postfix_expression(0);
				}
				break;
			case INC_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(INC_OP);
				setState(243);
				unary_expression();
				}
				break;
			case DEC_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(DEC_OP);
				setState(245);
				unary_expression();
				}
				break;
			case AMPERSAND:
			case BANG:
			case DASH:
			case PLUS:
			case STAR:
			case TILDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				unary_operator();
				setState(247);
				cast_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(NVIDIAParser.STAR, 0); }
		public TerminalNode AMPERSAND() { return getToken(NVIDIAParser.AMPERSAND, 0); }
		public TerminalNode PLUS() { return getToken(NVIDIAParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(NVIDIAParser.DASH, 0); }
		public TerminalNode BANG() { return getToken(NVIDIAParser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(NVIDIAParser.TILDE, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !(((((_la - 209)) & ~0x3f) == 0 && ((1L << (_la - 209)) & ((1L << (AMPERSAND - 209)) | (1L << (BANG - 209)) | (1L << (DASH - 209)) | (1L << (PLUS - 209)) | (1L << (STAR - 209)) | (1L << (TILDE - 209)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_expressionContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitAssignment_expression(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment_expression);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				constant_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				unary_expression();
				setState(255);
				assignment_operator();
				setState(256);
				assignment_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(NVIDIAParser.EQUAL, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(NVIDIAParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(NVIDIAParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(NVIDIAParser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(NVIDIAParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(NVIDIAParser.SUB_ASSIGN, 0); }
		public TerminalNode LEFT_ASSIGN() { return getToken(NVIDIAParser.LEFT_ASSIGN, 0); }
		public TerminalNode RIGHT_ASSIGN() { return getToken(NVIDIAParser.RIGHT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(NVIDIAParser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(NVIDIAParser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(NVIDIAParser.OR_ASSIGN, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if ( !(((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (ADD_ASSIGN - 208)) | (1L << (AND_ASSIGN - 208)) | (1L << (DIV_ASSIGN - 208)) | (1L << (EQUAL - 208)) | (1L << (LEFT_ASSIGN - 208)) | (1L << (MOD_ASSIGN - 208)) | (1L << (MUL_ASSIGN - 208)) | (1L << (OR_ASSIGN - 208)) | (1L << (RIGHT_ASSIGN - 208)) | (1L << (SUB_ASSIGN - 208)) | (1L << (XOR_ASSIGN - 208)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_expressionContext extends ParserRuleContext {
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public List<Binary_expressionContext> binary_expression() {
			return getRuleContexts(Binary_expressionContext.class);
		}
		public Binary_expressionContext binary_expression(int i) {
			return getRuleContext(Binary_expressionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(NVIDIAParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(NVIDIAParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(NVIDIAParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(NVIDIAParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(NVIDIAParser.DASH, 0); }
		public TerminalNode LEFT_OP() { return getToken(NVIDIAParser.LEFT_OP, 0); }
		public TerminalNode RIGHT_OP() { return getToken(NVIDIAParser.RIGHT_OP, 0); }
		public TerminalNode LEFT_ANGLE() { return getToken(NVIDIAParser.LEFT_ANGLE, 0); }
		public TerminalNode RIGHT_ANGLE() { return getToken(NVIDIAParser.RIGHT_ANGLE, 0); }
		public TerminalNode LE_OP() { return getToken(NVIDIAParser.LE_OP, 0); }
		public TerminalNode GE_OP() { return getToken(NVIDIAParser.GE_OP, 0); }
		public TerminalNode EQ_OP() { return getToken(NVIDIAParser.EQ_OP, 0); }
		public TerminalNode NE_OP() { return getToken(NVIDIAParser.NE_OP, 0); }
		public TerminalNode AMPERSAND() { return getToken(NVIDIAParser.AMPERSAND, 0); }
		public TerminalNode CARET() { return getToken(NVIDIAParser.CARET, 0); }
		public TerminalNode VERTICAL_BAR() { return getToken(NVIDIAParser.VERTICAL_BAR, 0); }
		public TerminalNode AND_OP() { return getToken(NVIDIAParser.AND_OP, 0); }
		public TerminalNode XOR_OP() { return getToken(NVIDIAParser.XOR_OP, 0); }
		public TerminalNode OR_OP() { return getToken(NVIDIAParser.OR_OP, 0); }
		public Binary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterBinary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitBinary_expression(this);
		}
	}

	public final Binary_expressionContext binary_expression() throws RecognitionException {
		return binary_expression(0);
	}

	private Binary_expressionContext binary_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Binary_expressionContext _localctx = new Binary_expressionContext(_ctx, _parentState);
		Binary_expressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_binary_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(263);
			cast_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(298);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Binary_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binary_expression);
						setState(265);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(266);
						_la = _input.LA(1);
						if ( !(((((_la - 238)) & ~0x3f) == 0 && ((1L << (_la - 238)) & ((1L << (PERCENT - 238)) | (1L << (SLASH - 238)) | (1L << (STAR - 238)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(267);
						binary_expression(12);
						}
						break;
					case 2:
						{
						_localctx = new Binary_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binary_expression);
						setState(268);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(269);
						_la = _input.LA(1);
						if ( !(_la==DASH || _la==PLUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(270);
						binary_expression(11);
						}
						break;
					case 3:
						{
						_localctx = new Binary_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binary_expression);
						setState(271);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(272);
						_la = _input.LA(1);
						if ( !(_la==LEFT_OP || _la==RIGHT_OP) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(273);
						binary_expression(10);
						}
						break;
					case 4:
						{
						_localctx = new Binary_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binary_expression);
						setState(274);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(275);
						_la = _input.LA(1);
						if ( !(((((_la - 223)) & ~0x3f) == 0 && ((1L << (_la - 223)) & ((1L << (GE_OP - 223)) | (1L << (LE_OP - 223)) | (1L << (LEFT_ANGLE - 223)) | (1L << (RIGHT_ANGLE - 223)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(276);
						binary_expression(9);
						}
						break;
					case 5:
						{
						_localctx = new Binary_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binary_expression);
						setState(277);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(278);
						_la = _input.LA(1);
						if ( !(_la==EQ_OP || _la==NE_OP) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(279);
						binary_expression(8);
						}
						break;
					case 6:
						{
						_localctx = new Binary_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binary_expression);
						setState(280);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(281);
						match(AMPERSAND);
						setState(282);
						binary_expression(7);
						}
						break;
					case 7:
						{
						_localctx = new Binary_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binary_expression);
						setState(283);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(284);
						match(CARET);
						setState(285);
						binary_expression(6);
						}
						break;
					case 8:
						{
						_localctx = new Binary_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binary_expression);
						setState(286);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(287);
						match(VERTICAL_BAR);
						setState(288);
						binary_expression(5);
						}
						break;
					case 9:
						{
						_localctx = new Binary_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binary_expression);
						setState(289);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(290);
						match(AND_OP);
						setState(291);
						binary_expression(4);
						}
						break;
					case 10:
						{
						_localctx = new Binary_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binary_expression);
						setState(292);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(293);
						match(XOR_OP);
						setState(294);
						binary_expression(3);
						}
						break;
					case 11:
						{
						_localctx = new Binary_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binary_expression);
						setState(295);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(296);
						match(OR_OP);
						setState(297);
						binary_expression(2);
						}
						break;
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(NVIDIAParser.COMMA, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(304);
			assignment_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(306);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(307);
					match(COMMA);
					setState(308);
					assignment_expression();
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Constant_expressionContext extends ParserRuleContext {
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(NVIDIAParser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(NVIDIAParser.COLON, 0); }
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitConstant_expression(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constant_expression);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				binary_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				binary_expression(0);
				setState(316);
				match(QUESTION);
				setState(317);
				expression(0);
				setState(318);
				match(COLON);
				setState(319);
				assignment_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Function_prototypeContext function_prototype() {
			return getRuleContext(Function_prototypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NVIDIAParser.SEMICOLON, 0); }
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public TerminalNode PRECISION() { return getToken(NVIDIAParser.PRECISION, 0); }
		public Precision_qualifierContext precision_qualifier() {
			return getRuleContext(Precision_qualifierContext.class,0);
		}
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(NVIDIAParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NVIDIAParser.IDENTIFIER, i);
		}
		public TerminalNode LEFT_BRACE() { return getToken(NVIDIAParser.LEFT_BRACE, 0); }
		public Struct_declaration_listContext struct_declaration_list() {
			return getRuleContext(Struct_declaration_listContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(NVIDIAParser.RIGHT_BRACE, 0); }
		public Array_specifierContext array_specifier() {
			return getRuleContext(Array_specifierContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declaration);
		int _la;
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				function_prototype();
				setState(324);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				init_declarator_list();
				setState(327);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(PRECISION);
				setState(330);
				precision_qualifier();
				setState(331);
				type_specifier();
				setState(332);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				type_qualifier();
				setState(335);
				match(IDENTIFIER);
				setState(336);
				match(LEFT_BRACE);
				setState(337);
				struct_declaration_list();
				setState(338);
				match(RIGHT_BRACE);
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(339);
					match(IDENTIFIER);
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEFT_BRACKET) {
						{
						setState(340);
						array_specifier();
						}
					}

					}
				}

				setState(345);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(347);
				type_qualifier();
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(348);
					identifier_list();
					}
				}

				setState(351);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_listContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(NVIDIAParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NVIDIAParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NVIDIAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NVIDIAParser.COMMA, i);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitIdentifier_list(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(IDENTIFIER);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(356);
				match(COMMA);
				setState(357);
				match(IDENTIFIER);
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_prototypeContext extends ParserRuleContext {
		public Fully_specified_typeContext fully_specified_type() {
			return getRuleContext(Fully_specified_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NVIDIAParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(NVIDIAParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(NVIDIAParser.RIGHT_PAREN, 0); }
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public Function_prototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_prototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterFunction_prototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitFunction_prototype(this);
		}
	}

	public final Function_prototypeContext function_prototype() throws RecognitionException {
		Function_prototypeContext _localctx = new Function_prototypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_prototype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			fully_specified_type();
			setState(364);
			match(IDENTIFIER);
			setState(365);
			match(LEFT_PAREN);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << BOOL) | (1L << BUFFER) | (1L << BVEC2) | (1L << BVEC3) | (1L << BVEC4) | (1L << CENTROID) | (1L << COHERENT) | (1L << CONST) | (1L << DMAT2) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << DMAT3) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << DMAT4) | (1L << DMAT4X2) | (1L << DMAT4X3) | (1L << DMAT4X4) | (1L << DOUBLE) | (1L << DVEC2) | (1L << DVEC3) | (1L << DVEC4) | (1L << FLAT) | (1L << FLOAT) | (1L << HIGHP) | (1L << IIMAGE1D) | (1L << IIMAGE1DARRAY) | (1L << IIMAGE2D) | (1L << IIMAGE2DARRAY) | (1L << IIMAGE2DMS) | (1L << IIMAGE2DMSARRAY) | (1L << IIMAGE2DRECT) | (1L << IIMAGE3D) | (1L << IIMAGEBUFFER) | (1L << IIMAGECUBE) | (1L << IIMAGECUBEARRAY) | (1L << IMAGE1D) | (1L << IMAGE1DARRAY) | (1L << IMAGE2D) | (1L << IMAGE2DARRAY) | (1L << IMAGE2DMS) | (1L << IMAGE2DMSARRAY) | (1L << IMAGE2DRECT) | (1L << IMAGE3D) | (1L << IMAGEBUFFER) | (1L << IMAGECUBE) | (1L << IMAGECUBEARRAY) | (1L << IN) | (1L << INOUT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT - 64)) | (1L << (INVARIANT - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (LAYOUT - 64)) | (1L << (LOWP - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (MAT4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (MEDIUMP - 64)) | (1L << (NOPERSPECTIVE - 64)) | (1L << (OUT - 64)) | (1L << (PATCH - 64)) | (1L << (PRECISE - 64)) | (1L << (READONLY - 64)) | (1L << (RESTRICT - 64)) | (1L << (SAMPLE - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SHARED - 64)) | (1L << (SMOOTH - 64)) | (1L << (STRUCT - 64)) | (1L << (SUBROUTINE - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (UIMAGE1D - 129)) | (1L << (UIMAGE1DARRAY - 129)) | (1L << (UIMAGE2D - 129)) | (1L << (UIMAGE2DARRAY - 129)) | (1L << (UIMAGE2DMS - 129)) | (1L << (UIMAGE2DMSARRAY - 129)) | (1L << (UIMAGE2DRECT - 129)) | (1L << (UIMAGE3D - 129)) | (1L << (UIMAGEBUFFER - 129)) | (1L << (UIMAGECUBE - 129)) | (1L << (UIMAGECUBEARRAY - 129)) | (1L << (UINT - 129)) | (1L << (UNIFORM - 129)) | (1L << (USAMPLER1D - 129)) | (1L << (USAMPLER1DARRAY - 129)) | (1L << (USAMPLER2D - 129)) | (1L << (USAMPLER2DARRAY - 129)) | (1L << (USAMPLER2DMS - 129)) | (1L << (USAMPLER2DMSARRAY - 129)) | (1L << (USAMPLER2DRECT - 129)) | (1L << (USAMPLER3D - 129)) | (1L << (USAMPLERBUFFER - 129)) | (1L << (USAMPLERCUBE - 129)) | (1L << (USAMPLERCUBEARRAY - 129)) | (1L << (UVEC2 - 129)) | (1L << (UVEC3 - 129)) | (1L << (UVEC4 - 129)) | (1L << (VEC2 - 129)) | (1L << (VEC3 - 129)) | (1L << (VEC4 - 129)) | (1L << (VOID - 129)) | (1L << (VOLATILE - 129)) | (1L << (WRITEONLY - 129)) | (1L << (INT8_T - 129)) | (1L << (I8VEC2 - 129)) | (1L << (I8VEC3 - 129)) | (1L << (I8VEC4 - 129)) | (1L << (INT16_T - 129)) | (1L << (I16VEC2 - 129)) | (1L << (I16VEC3 - 129)) | (1L << (I16VEC4 - 129)) | (1L << (INT32_T - 129)) | (1L << (I32VEC2 - 129)) | (1L << (I32VEC3 - 129)) | (1L << (I32VEC4 - 129)) | (1L << (INT64_T - 129)) | (1L << (I64VEC2 - 129)) | (1L << (I64VEC3 - 129)) | (1L << (I64VEC4 - 129)) | (1L << (UINT8_T - 129)) | (1L << (U8VEC2 - 129)) | (1L << (U8VEC3 - 129)) | (1L << (U8VEC4 - 129)) | (1L << (UINT16_T - 129)) | (1L << (U16VEC2 - 129)) | (1L << (U16VEC3 - 129)) | (1L << (U16VEC4 - 129)) | (1L << (UINT32_T - 129)) | (1L << (U32VEC2 - 129)) | (1L << (U32VEC3 - 129)) | (1L << (U32VEC4 - 129)) | (1L << (UINT64_T - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (U64VEC2 - 193)) | (1L << (U64VEC3 - 193)) | (1L << (U64VEC4 - 193)) | (1L << (FLOAT16_T - 193)) | (1L << (F16VEC2 - 193)) | (1L << (F16VEC3 - 193)) | (1L << (F16VEC4 - 193)) | (1L << (FLOAT32_T - 193)) | (1L << (F32VEC2 - 193)) | (1L << (F32VEC3 - 193)) | (1L << (F32VEC4 - 193)) | (1L << (FLOAT64_T - 193)) | (1L << (F64VEC2 - 193)) | (1L << (F64VEC3 - 193)) | (1L << (F64VEC4 - 193)))) != 0) || _la==IDENTIFIER) {
				{
				setState(366);
				function_parameters();
				}
			}

			setState(369);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_parametersContext extends ParserRuleContext {
		public List<Parameter_declarationContext> parameter_declaration() {
			return getRuleContexts(Parameter_declarationContext.class);
		}
		public Parameter_declarationContext parameter_declaration(int i) {
			return getRuleContext(Parameter_declarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NVIDIAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NVIDIAParser.COMMA, i);
		}
		public Function_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterFunction_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitFunction_parameters(this);
		}
	}

	public final Function_parametersContext function_parameters() throws RecognitionException {
		Function_parametersContext _localctx = new Function_parametersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			parameter_declaration();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(372);
				match(COMMA);
				setState(373);
				parameter_declaration();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_declaratorContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NVIDIAParser.IDENTIFIER, 0); }
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Array_specifierContext array_specifier() {
			return getRuleContext(Array_specifierContext.class,0);
		}
		public Parameter_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterParameter_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitParameter_declarator(this);
		}
	}

	public final Parameter_declaratorContext parameter_declarator() throws RecognitionException {
		Parameter_declaratorContext _localctx = new Parameter_declaratorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameter_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			type_specifier();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(380);
				pointer();
				}
			}

			setState(383);
			match(IDENTIFIER);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET) {
				{
				setState(384);
				array_specifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_declarationContext extends ParserRuleContext {
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public Parameter_declaratorContext parameter_declarator() {
			return getRuleContext(Parameter_declaratorContext.class,0);
		}
		public Parameter_type_specifierContext parameter_type_specifier() {
			return getRuleContext(Parameter_type_specifierContext.class,0);
		}
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterParameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitParameter_declaration(this);
		}
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameter_declaration);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				type_qualifier();
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(388);
					parameter_declarator();
					}
					break;
				case 2:
					{
					setState(389);
					parameter_type_specifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				parameter_declarator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				parameter_type_specifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_type_specifierContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Parameter_type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterParameter_type_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitParameter_type_specifier(this);
		}
	}

	public final Parameter_type_specifierContext parameter_type_specifier() throws RecognitionException {
		Parameter_type_specifierContext _localctx = new Parameter_type_specifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parameter_type_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			type_specifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_declarator_listContext extends ParserRuleContext {
		public Single_declarationContext single_declaration() {
			return getRuleContext(Single_declarationContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(NVIDIAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NVIDIAParser.COMMA, i);
		}
		public List<Typeless_declarationContext> typeless_declaration() {
			return getRuleContexts(Typeless_declarationContext.class);
		}
		public Typeless_declarationContext typeless_declaration(int i) {
			return getRuleContext(Typeless_declarationContext.class,i);
		}
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterInit_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitInit_declarator_list(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			single_declaration();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(399);
				match(COMMA);
				setState(400);
				typeless_declaration();
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_declarationContext extends ParserRuleContext {
		public Fully_specified_typeContext fully_specified_type() {
			return getRuleContext(Fully_specified_typeContext.class,0);
		}
		public Typeless_declarationContext typeless_declaration() {
			return getRuleContext(Typeless_declarationContext.class,0);
		}
		public Single_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterSingle_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitSingle_declaration(this);
		}
	}

	public final Single_declarationContext single_declaration() throws RecognitionException {
		Single_declarationContext _localctx = new Single_declarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_single_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			fully_specified_type();
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(407);
				typeless_declaration();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typeless_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NVIDIAParser.IDENTIFIER, 0); }
		public Array_specifierContext array_specifier() {
			return getRuleContext(Array_specifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(NVIDIAParser.EQUAL, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Typeless_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeless_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterTypeless_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitTypeless_declaration(this);
		}
	}

	public final Typeless_declarationContext typeless_declaration() throws RecognitionException {
		Typeless_declarationContext _localctx = new Typeless_declarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeless_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(IDENTIFIER);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET) {
				{
				setState(411);
				array_specifier();
				}
			}

			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(414);
				match(EQUAL);
				setState(415);
				initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fully_specified_typeContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public Fully_specified_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fully_specified_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterFully_specified_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitFully_specified_type(this);
		}
	}

	public final Fully_specified_typeContext fully_specified_type() throws RecognitionException {
		Fully_specified_typeContext _localctx = new Fully_specified_typeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fully_specified_type);
		int _la;
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATOMIC_UINT:
			case BOOL:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case DMAT2:
			case DMAT2X2:
			case DMAT2X3:
			case DMAT2X4:
			case DMAT3:
			case DMAT3X2:
			case DMAT3X3:
			case DMAT3X4:
			case DMAT4:
			case DMAT4X2:
			case DMAT4X3:
			case DMAT4X4:
			case DOUBLE:
			case DVEC2:
			case DVEC3:
			case DVEC4:
			case FLOAT:
			case IIMAGE1D:
			case IIMAGE1DARRAY:
			case IIMAGE2D:
			case IIMAGE2DARRAY:
			case IIMAGE2DMS:
			case IIMAGE2DMSARRAY:
			case IIMAGE2DRECT:
			case IIMAGE3D:
			case IIMAGEBUFFER:
			case IIMAGECUBE:
			case IIMAGECUBEARRAY:
			case IMAGE1D:
			case IMAGE1DARRAY:
			case IMAGE2D:
			case IMAGE2DARRAY:
			case IMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IMAGE2DRECT:
			case IMAGE3D:
			case IMAGEBUFFER:
			case IMAGECUBE:
			case IMAGECUBEARRAY:
			case INT:
			case ISAMPLER1D:
			case ISAMPLER1DARRAY:
			case ISAMPLER2D:
			case ISAMPLER2DARRAY:
			case ISAMPLER2DMS:
			case ISAMPLER2DMSARRAY:
			case ISAMPLER2DRECT:
			case ISAMPLER3D:
			case ISAMPLERBUFFER:
			case ISAMPLERCUBE:
			case ISAMPLERCUBEARRAY:
			case IVEC2:
			case IVEC3:
			case IVEC4:
			case MAT2:
			case MAT2X2:
			case MAT2X3:
			case MAT2X4:
			case MAT3:
			case MAT3X2:
			case MAT3X3:
			case MAT3X4:
			case MAT4:
			case MAT4X2:
			case MAT4X3:
			case MAT4X4:
			case SAMPLER1D:
			case SAMPLER1DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER1DSHADOW:
			case SAMPLER2D:
			case SAMPLER2DARRAY:
			case SAMPLER2DARRAYSHADOW:
			case SAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case SAMPLER2DRECT:
			case SAMPLER2DRECTSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLER3D:
			case SAMPLERBUFFER:
			case SAMPLERCUBE:
			case SAMPLERCUBEARRAY:
			case SAMPLERCUBEARRAYSHADOW:
			case SAMPLERCUBESHADOW:
			case STRUCT:
			case UIMAGE1D:
			case UIMAGE1DARRAY:
			case UIMAGE2D:
			case UIMAGE2DARRAY:
			case UIMAGE2DMS:
			case UIMAGE2DMSARRAY:
			case UIMAGE2DRECT:
			case UIMAGE3D:
			case UIMAGEBUFFER:
			case UIMAGECUBE:
			case UIMAGECUBEARRAY:
			case UINT:
			case USAMPLER1D:
			case USAMPLER1DARRAY:
			case USAMPLER2D:
			case USAMPLER2DARRAY:
			case USAMPLER2DMS:
			case USAMPLER2DMSARRAY:
			case USAMPLER2DRECT:
			case USAMPLER3D:
			case USAMPLERBUFFER:
			case USAMPLERCUBE:
			case USAMPLERCUBEARRAY:
			case UVEC2:
			case UVEC3:
			case UVEC4:
			case VEC2:
			case VEC3:
			case VEC4:
			case VOID:
			case INT8_T:
			case I8VEC2:
			case I8VEC3:
			case I8VEC4:
			case INT16_T:
			case I16VEC2:
			case I16VEC3:
			case I16VEC4:
			case INT32_T:
			case I32VEC2:
			case I32VEC3:
			case I32VEC4:
			case INT64_T:
			case I64VEC2:
			case I64VEC3:
			case I64VEC4:
			case UINT8_T:
			case U8VEC2:
			case U8VEC3:
			case U8VEC4:
			case UINT16_T:
			case U16VEC2:
			case U16VEC3:
			case U16VEC4:
			case UINT32_T:
			case U32VEC2:
			case U32VEC3:
			case U32VEC4:
			case UINT64_T:
			case U64VEC2:
			case U64VEC3:
			case U64VEC4:
			case FLOAT16_T:
			case F16VEC2:
			case F16VEC3:
			case F16VEC4:
			case FLOAT32_T:
			case F32VEC2:
			case F32VEC3:
			case F32VEC4:
			case FLOAT64_T:
			case F64VEC2:
			case F64VEC3:
			case F64VEC4:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				type_specifier();
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR) {
					{
					setState(419);
					pointer();
					}
				}

				}
				break;
			case BUFFER:
			case CENTROID:
			case COHERENT:
			case CONST:
			case FLAT:
			case HIGHP:
			case IN:
			case INOUT:
			case INVARIANT:
			case LAYOUT:
			case LOWP:
			case MEDIUMP:
			case NOPERSPECTIVE:
			case OUT:
			case PATCH:
			case PRECISE:
			case READONLY:
			case RESTRICT:
			case SAMPLE:
			case SHARED:
			case SMOOTH:
			case SUBROUTINE:
			case UNIFORM:
			case VOLATILE:
			case WRITEONLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				type_qualifier();
				setState(423);
				type_specifier();
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR) {
					{
					setState(424);
					pointer();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Invariant_qualifierContext extends ParserRuleContext {
		public TerminalNode INVARIANT() { return getToken(NVIDIAParser.INVARIANT, 0); }
		public Invariant_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariant_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterInvariant_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitInvariant_qualifier(this);
		}
	}

	public final Invariant_qualifierContext invariant_qualifier() throws RecognitionException {
		Invariant_qualifierContext _localctx = new Invariant_qualifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_invariant_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(INVARIANT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolation_qualifierContext extends ParserRuleContext {
		public TerminalNode SMOOTH() { return getToken(NVIDIAParser.SMOOTH, 0); }
		public TerminalNode FLAT() { return getToken(NVIDIAParser.FLAT, 0); }
		public TerminalNode NOPERSPECTIVE() { return getToken(NVIDIAParser.NOPERSPECTIVE, 0); }
		public Interpolation_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterInterpolation_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitInterpolation_qualifier(this);
		}
	}

	public final Interpolation_qualifierContext interpolation_qualifier() throws RecognitionException {
		Interpolation_qualifierContext _localctx = new Interpolation_qualifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_interpolation_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_la = _input.LA(1);
			if ( !(_la==FLAT || _la==NOPERSPECTIVE || _la==SMOOTH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Layout_qualifierContext extends ParserRuleContext {
		public TerminalNode LAYOUT() { return getToken(NVIDIAParser.LAYOUT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(NVIDIAParser.LEFT_PAREN, 0); }
		public Layout_qualifier_id_listContext layout_qualifier_id_list() {
			return getRuleContext(Layout_qualifier_id_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(NVIDIAParser.RIGHT_PAREN, 0); }
		public Layout_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterLayout_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitLayout_qualifier(this);
		}
	}

	public final Layout_qualifierContext layout_qualifier() throws RecognitionException {
		Layout_qualifierContext _localctx = new Layout_qualifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_layout_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(LAYOUT);
			setState(434);
			match(LEFT_PAREN);
			setState(435);
			layout_qualifier_id_list();
			setState(436);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Layout_qualifier_id_listContext extends ParserRuleContext {
		public List<Layout_qualifier_idContext> layout_qualifier_id() {
			return getRuleContexts(Layout_qualifier_idContext.class);
		}
		public Layout_qualifier_idContext layout_qualifier_id(int i) {
			return getRuleContext(Layout_qualifier_idContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NVIDIAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NVIDIAParser.COMMA, i);
		}
		public Layout_qualifier_id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout_qualifier_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterLayout_qualifier_id_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitLayout_qualifier_id_list(this);
		}
	}

	public final Layout_qualifier_id_listContext layout_qualifier_id_list() throws RecognitionException {
		Layout_qualifier_id_listContext _localctx = new Layout_qualifier_id_listContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_layout_qualifier_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			layout_qualifier_id();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(439);
				match(COMMA);
				setState(440);
				layout_qualifier_id();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Layout_qualifier_idContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NVIDIAParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(NVIDIAParser.EQUAL, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public TerminalNode SHARED() { return getToken(NVIDIAParser.SHARED, 0); }
		public Layout_qualifier_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout_qualifier_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterLayout_qualifier_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitLayout_qualifier_id(this);
		}
	}

	public final Layout_qualifier_idContext layout_qualifier_id() throws RecognitionException {
		Layout_qualifier_idContext _localctx = new Layout_qualifier_idContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_layout_qualifier_id);
		int _la;
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(IDENTIFIER);
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(447);
					match(EQUAL);
					setState(448);
					constant_expression();
					}
				}

				}
				break;
			case SHARED:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(SHARED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precise_qualifierContext extends ParserRuleContext {
		public TerminalNode PRECISE() { return getToken(NVIDIAParser.PRECISE, 0); }
		public Precise_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precise_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterPrecise_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitPrecise_qualifier(this);
		}
	}

	public final Precise_qualifierContext precise_qualifier() throws RecognitionException {
		Precise_qualifierContext _localctx = new Precise_qualifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_precise_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(PRECISE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public List<TerminalNode> STAR() { return getTokens(NVIDIAParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(NVIDIAParser.STAR, i);
		}
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitPointer(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_pointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(456);
				match(STAR);
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BUFFER) | (1L << CENTROID) | (1L << COHERENT) | (1L << CONST) | (1L << FLAT) | (1L << HIGHP) | (1L << IN) | (1L << INOUT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INVARIANT - 65)) | (1L << (LAYOUT - 65)) | (1L << (LOWP - 65)) | (1L << (MEDIUMP - 65)) | (1L << (NOPERSPECTIVE - 65)) | (1L << (OUT - 65)) | (1L << (PATCH - 65)) | (1L << (PRECISE - 65)) | (1L << (READONLY - 65)) | (1L << (RESTRICT - 65)) | (1L << (SAMPLE - 65)) | (1L << (SHARED - 65)) | (1L << (SMOOTH - 65)) | (1L << (SUBROUTINE - 65)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (UNIFORM - 141)) | (1L << (VOLATILE - 141)) | (1L << (WRITEONLY - 141)))) != 0)) {
					{
					setState(457);
					type_qualifier();
					}
				}

				}
				}
				setState(462); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STAR );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_qualifierContext extends ParserRuleContext {
		public List<Single_type_qualifierContext> single_type_qualifier() {
			return getRuleContexts(Single_type_qualifierContext.class);
		}
		public Single_type_qualifierContext single_type_qualifier(int i) {
			return getRuleContext(Single_type_qualifierContext.class,i);
		}
		public Type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterType_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitType_qualifier(this);
		}
	}

	public final Type_qualifierContext type_qualifier() throws RecognitionException {
		Type_qualifierContext _localctx = new Type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_type_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(464);
				single_type_qualifier();
				}
				}
				setState(467); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BUFFER) | (1L << CENTROID) | (1L << COHERENT) | (1L << CONST) | (1L << FLAT) | (1L << HIGHP) | (1L << IN) | (1L << INOUT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INVARIANT - 65)) | (1L << (LAYOUT - 65)) | (1L << (LOWP - 65)) | (1L << (MEDIUMP - 65)) | (1L << (NOPERSPECTIVE - 65)) | (1L << (OUT - 65)) | (1L << (PATCH - 65)) | (1L << (PRECISE - 65)) | (1L << (READONLY - 65)) | (1L << (RESTRICT - 65)) | (1L << (SAMPLE - 65)) | (1L << (SHARED - 65)) | (1L << (SMOOTH - 65)) | (1L << (SUBROUTINE - 65)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (UNIFORM - 141)) | (1L << (VOLATILE - 141)) | (1L << (WRITEONLY - 141)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_type_qualifierContext extends ParserRuleContext {
		public Storage_qualifierContext storage_qualifier() {
			return getRuleContext(Storage_qualifierContext.class,0);
		}
		public Layout_qualifierContext layout_qualifier() {
			return getRuleContext(Layout_qualifierContext.class,0);
		}
		public Precision_qualifierContext precision_qualifier() {
			return getRuleContext(Precision_qualifierContext.class,0);
		}
		public Interpolation_qualifierContext interpolation_qualifier() {
			return getRuleContext(Interpolation_qualifierContext.class,0);
		}
		public Invariant_qualifierContext invariant_qualifier() {
			return getRuleContext(Invariant_qualifierContext.class,0);
		}
		public Precise_qualifierContext precise_qualifier() {
			return getRuleContext(Precise_qualifierContext.class,0);
		}
		public Single_type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_type_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterSingle_type_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitSingle_type_qualifier(this);
		}
	}

	public final Single_type_qualifierContext single_type_qualifier() throws RecognitionException {
		Single_type_qualifierContext _localctx = new Single_type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_single_type_qualifier);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BUFFER:
			case CENTROID:
			case COHERENT:
			case CONST:
			case IN:
			case INOUT:
			case OUT:
			case PATCH:
			case READONLY:
			case RESTRICT:
			case SAMPLE:
			case SHARED:
			case SUBROUTINE:
			case UNIFORM:
			case VOLATILE:
			case WRITEONLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				storage_qualifier();
				}
				break;
			case LAYOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				layout_qualifier();
				}
				break;
			case HIGHP:
			case LOWP:
			case MEDIUMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				precision_qualifier();
				}
				break;
			case FLAT:
			case NOPERSPECTIVE:
			case SMOOTH:
				enterOuterAlt(_localctx, 4);
				{
				setState(472);
				interpolation_qualifier();
				}
				break;
			case INVARIANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(473);
				invariant_qualifier();
				}
				break;
			case PRECISE:
				enterOuterAlt(_localctx, 6);
				{
				setState(474);
				precise_qualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Storage_qualifierContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(NVIDIAParser.CONST, 0); }
		public TerminalNode IN() { return getToken(NVIDIAParser.IN, 0); }
		public TerminalNode OUT() { return getToken(NVIDIAParser.OUT, 0); }
		public TerminalNode INOUT() { return getToken(NVIDIAParser.INOUT, 0); }
		public TerminalNode CENTROID() { return getToken(NVIDIAParser.CENTROID, 0); }
		public TerminalNode PATCH() { return getToken(NVIDIAParser.PATCH, 0); }
		public TerminalNode SAMPLE() { return getToken(NVIDIAParser.SAMPLE, 0); }
		public TerminalNode UNIFORM() { return getToken(NVIDIAParser.UNIFORM, 0); }
		public TerminalNode BUFFER() { return getToken(NVIDIAParser.BUFFER, 0); }
		public TerminalNode SHARED() { return getToken(NVIDIAParser.SHARED, 0); }
		public TerminalNode COHERENT() { return getToken(NVIDIAParser.COHERENT, 0); }
		public TerminalNode VOLATILE() { return getToken(NVIDIAParser.VOLATILE, 0); }
		public TerminalNode RESTRICT() { return getToken(NVIDIAParser.RESTRICT, 0); }
		public TerminalNode READONLY() { return getToken(NVIDIAParser.READONLY, 0); }
		public TerminalNode WRITEONLY() { return getToken(NVIDIAParser.WRITEONLY, 0); }
		public TerminalNode SUBROUTINE() { return getToken(NVIDIAParser.SUBROUTINE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(NVIDIAParser.LEFT_PAREN, 0); }
		public Type_name_listContext type_name_list() {
			return getRuleContext(Type_name_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(NVIDIAParser.RIGHT_PAREN, 0); }
		public Storage_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterStorage_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitStorage_qualifier(this);
		}
	}

	public final Storage_qualifierContext storage_qualifier() throws RecognitionException {
		Storage_qualifierContext _localctx = new Storage_qualifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_storage_qualifier);
		int _la;
		try {
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				match(CONST);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				match(IN);
				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(479);
				match(OUT);
				}
				break;
			case INOUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(480);
				match(INOUT);
				}
				break;
			case CENTROID:
				enterOuterAlt(_localctx, 5);
				{
				setState(481);
				match(CENTROID);
				}
				break;
			case PATCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(482);
				match(PATCH);
				}
				break;
			case SAMPLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(483);
				match(SAMPLE);
				}
				break;
			case UNIFORM:
				enterOuterAlt(_localctx, 8);
				{
				setState(484);
				match(UNIFORM);
				}
				break;
			case BUFFER:
				enterOuterAlt(_localctx, 9);
				{
				setState(485);
				match(BUFFER);
				}
				break;
			case SHARED:
				enterOuterAlt(_localctx, 10);
				{
				setState(486);
				match(SHARED);
				}
				break;
			case COHERENT:
				enterOuterAlt(_localctx, 11);
				{
				setState(487);
				match(COHERENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 12);
				{
				setState(488);
				match(VOLATILE);
				}
				break;
			case RESTRICT:
				enterOuterAlt(_localctx, 13);
				{
				setState(489);
				match(RESTRICT);
				}
				break;
			case READONLY:
				enterOuterAlt(_localctx, 14);
				{
				setState(490);
				match(READONLY);
				}
				break;
			case WRITEONLY:
				enterOuterAlt(_localctx, 15);
				{
				setState(491);
				match(WRITEONLY);
				}
				break;
			case SUBROUTINE:
				enterOuterAlt(_localctx, 16);
				{
				setState(492);
				match(SUBROUTINE);
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(493);
					match(LEFT_PAREN);
					setState(494);
					type_name_list();
					setState(495);
					match(RIGHT_PAREN);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_name_listContext extends ParserRuleContext {
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NVIDIAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NVIDIAParser.COMMA, i);
		}
		public Type_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterType_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitType_name_list(this);
		}
	}

	public final Type_name_listContext type_name_list() throws RecognitionException {
		Type_name_listContext _localctx = new Type_name_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_type_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			type_name();
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(502);
				match(COMMA);
				setState(503);
				type_name();
				}
				}
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NVIDIAParser.IDENTIFIER, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_specifierContext extends ParserRuleContext {
		public Type_specifier_nonarrayContext type_specifier_nonarray() {
			return getRuleContext(Type_specifier_nonarrayContext.class,0);
		}
		public Array_specifierContext array_specifier() {
			return getRuleContext(Array_specifierContext.class,0);
		}
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterType_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitType_specifier(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_type_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			type_specifier_nonarray();
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET) {
				{
				setState(512);
				array_specifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_specifierContext extends ParserRuleContext {
		public List<DimensionContext> dimension() {
			return getRuleContexts(DimensionContext.class);
		}
		public DimensionContext dimension(int i) {
			return getRuleContext(DimensionContext.class,i);
		}
		public Array_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterArray_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitArray_specifier(this);
		}
	}

	public final Array_specifierContext array_specifier() throws RecognitionException {
		Array_specifierContext _localctx = new Array_specifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_array_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(515);
				dimension();
				}
				}
				setState(518); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LEFT_BRACKET );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(NVIDIAParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(NVIDIAParser.RIGHT_BRACKET, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitDimension(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(LEFT_BRACKET);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << BOOL) | (1L << BVEC2) | (1L << BVEC3) | (1L << BVEC4) | (1L << DMAT2) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << DMAT3) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << DMAT4) | (1L << DMAT4X2) | (1L << DMAT4X3) | (1L << DMAT4X4) | (1L << DOUBLE) | (1L << DVEC2) | (1L << DVEC3) | (1L << DVEC4) | (1L << FALSE) | (1L << FLOAT) | (1L << IIMAGE1D) | (1L << IIMAGE1DARRAY) | (1L << IIMAGE2D) | (1L << IIMAGE2DARRAY) | (1L << IIMAGE2DMS) | (1L << IIMAGE2DMSARRAY) | (1L << IIMAGE2DRECT) | (1L << IIMAGE3D) | (1L << IIMAGEBUFFER) | (1L << IIMAGECUBE) | (1L << IIMAGECUBEARRAY) | (1L << IMAGE1D) | (1L << IMAGE1DARRAY) | (1L << IMAGE2D) | (1L << IMAGE2DARRAY) | (1L << IMAGE2DMS) | (1L << IMAGE2DMSARRAY) | (1L << IMAGE2DRECT) | (1L << IMAGE3D) | (1L << IMAGEBUFFER) | (1L << IMAGECUBE) | (1L << IMAGECUBEARRAY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (LAYOUT - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (MAT4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (STRUCT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (TRUE - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (UINT - 128)) | (1L << (USAMPLER1D - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (UVEC2 - 128)) | (1L << (UVEC3 - 128)) | (1L << (UVEC4 - 128)) | (1L << (VEC2 - 128)) | (1L << (VEC3 - 128)) | (1L << (VEC4 - 128)) | (1L << (VOID - 128)) | (1L << (INT8_T - 128)) | (1L << (I8VEC2 - 128)) | (1L << (I8VEC3 - 128)) | (1L << (I8VEC4 - 128)) | (1L << (INT16_T - 128)) | (1L << (I16VEC2 - 128)) | (1L << (I16VEC3 - 128)) | (1L << (I16VEC4 - 128)) | (1L << (INT32_T - 128)) | (1L << (I32VEC2 - 128)) | (1L << (I32VEC3 - 128)) | (1L << (I32VEC4 - 128)) | (1L << (INT64_T - 128)) | (1L << (I64VEC2 - 128)) | (1L << (I64VEC3 - 128)) | (1L << (I64VEC4 - 128)) | (1L << (UINT8_T - 128)) | (1L << (U8VEC2 - 128)) | (1L << (U8VEC3 - 128)) | (1L << (U8VEC4 - 128)) | (1L << (UINT16_T - 128)) | (1L << (U16VEC2 - 128)) | (1L << (U16VEC3 - 128)) | (1L << (U16VEC4 - 128)) | (1L << (UINT32_T - 128)) | (1L << (U32VEC2 - 128)) | (1L << (U32VEC3 - 128)) | (1L << (U32VEC4 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UINT64_T - 192)) | (1L << (U64VEC2 - 192)) | (1L << (U64VEC3 - 192)) | (1L << (U64VEC4 - 192)) | (1L << (FLOAT16_T - 192)) | (1L << (F16VEC2 - 192)) | (1L << (F16VEC3 - 192)) | (1L << (F16VEC4 - 192)) | (1L << (FLOAT32_T - 192)) | (1L << (F32VEC2 - 192)) | (1L << (F32VEC3 - 192)) | (1L << (F32VEC4 - 192)) | (1L << (FLOAT64_T - 192)) | (1L << (F64VEC2 - 192)) | (1L << (F64VEC3 - 192)) | (1L << (F64VEC4 - 192)) | (1L << (AMPERSAND - 192)) | (1L << (BANG - 192)) | (1L << (DASH - 192)) | (1L << (DEC_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (PLUS - 192)) | (1L << (STAR - 192)) | (1L << (TILDE - 192)) | (1L << (DOUBLECONSTANT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (FLOATCONSTANT - 256)) | (1L << (INTCONSTANT - 256)) | (1L << (UINTCONSTANT - 256)) | (1L << (IDENTIFIER - 256)))) != 0)) {
				{
				setState(521);
				constant_expression();
				}
			}

			setState(524);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_specifier_nonarrayContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(NVIDIAParser.VOID, 0); }
		public TerminalNode FLOAT() { return getToken(NVIDIAParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(NVIDIAParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(NVIDIAParser.INT, 0); }
		public TerminalNode UINT() { return getToken(NVIDIAParser.UINT, 0); }
		public TerminalNode BOOL() { return getToken(NVIDIAParser.BOOL, 0); }
		public TerminalNode VEC2() { return getToken(NVIDIAParser.VEC2, 0); }
		public TerminalNode VEC3() { return getToken(NVIDIAParser.VEC3, 0); }
		public TerminalNode VEC4() { return getToken(NVIDIAParser.VEC4, 0); }
		public TerminalNode DVEC2() { return getToken(NVIDIAParser.DVEC2, 0); }
		public TerminalNode DVEC3() { return getToken(NVIDIAParser.DVEC3, 0); }
		public TerminalNode DVEC4() { return getToken(NVIDIAParser.DVEC4, 0); }
		public TerminalNode BVEC2() { return getToken(NVIDIAParser.BVEC2, 0); }
		public TerminalNode BVEC3() { return getToken(NVIDIAParser.BVEC3, 0); }
		public TerminalNode BVEC4() { return getToken(NVIDIAParser.BVEC4, 0); }
		public TerminalNode IVEC2() { return getToken(NVIDIAParser.IVEC2, 0); }
		public TerminalNode IVEC3() { return getToken(NVIDIAParser.IVEC3, 0); }
		public TerminalNode IVEC4() { return getToken(NVIDIAParser.IVEC4, 0); }
		public TerminalNode UVEC2() { return getToken(NVIDIAParser.UVEC2, 0); }
		public TerminalNode UVEC3() { return getToken(NVIDIAParser.UVEC3, 0); }
		public TerminalNode UVEC4() { return getToken(NVIDIAParser.UVEC4, 0); }
		public TerminalNode MAT2() { return getToken(NVIDIAParser.MAT2, 0); }
		public TerminalNode MAT3() { return getToken(NVIDIAParser.MAT3, 0); }
		public TerminalNode MAT4() { return getToken(NVIDIAParser.MAT4, 0); }
		public TerminalNode MAT2X2() { return getToken(NVIDIAParser.MAT2X2, 0); }
		public TerminalNode MAT2X3() { return getToken(NVIDIAParser.MAT2X3, 0); }
		public TerminalNode MAT2X4() { return getToken(NVIDIAParser.MAT2X4, 0); }
		public TerminalNode MAT3X2() { return getToken(NVIDIAParser.MAT3X2, 0); }
		public TerminalNode MAT3X3() { return getToken(NVIDIAParser.MAT3X3, 0); }
		public TerminalNode MAT3X4() { return getToken(NVIDIAParser.MAT3X4, 0); }
		public TerminalNode MAT4X2() { return getToken(NVIDIAParser.MAT4X2, 0); }
		public TerminalNode MAT4X3() { return getToken(NVIDIAParser.MAT4X3, 0); }
		public TerminalNode MAT4X4() { return getToken(NVIDIAParser.MAT4X4, 0); }
		public TerminalNode DMAT2() { return getToken(NVIDIAParser.DMAT2, 0); }
		public TerminalNode DMAT3() { return getToken(NVIDIAParser.DMAT3, 0); }
		public TerminalNode DMAT4() { return getToken(NVIDIAParser.DMAT4, 0); }
		public TerminalNode DMAT2X2() { return getToken(NVIDIAParser.DMAT2X2, 0); }
		public TerminalNode DMAT2X3() { return getToken(NVIDIAParser.DMAT2X3, 0); }
		public TerminalNode DMAT2X4() { return getToken(NVIDIAParser.DMAT2X4, 0); }
		public TerminalNode DMAT3X2() { return getToken(NVIDIAParser.DMAT3X2, 0); }
		public TerminalNode DMAT3X3() { return getToken(NVIDIAParser.DMAT3X3, 0); }
		public TerminalNode DMAT3X4() { return getToken(NVIDIAParser.DMAT3X4, 0); }
		public TerminalNode DMAT4X2() { return getToken(NVIDIAParser.DMAT4X2, 0); }
		public TerminalNode DMAT4X3() { return getToken(NVIDIAParser.DMAT4X3, 0); }
		public TerminalNode DMAT4X4() { return getToken(NVIDIAParser.DMAT4X4, 0); }
		public TerminalNode ATOMIC_UINT() { return getToken(NVIDIAParser.ATOMIC_UINT, 0); }
		public TerminalNode SAMPLER2D() { return getToken(NVIDIAParser.SAMPLER2D, 0); }
		public TerminalNode SAMPLER3D() { return getToken(NVIDIAParser.SAMPLER3D, 0); }
		public TerminalNode SAMPLERCUBE() { return getToken(NVIDIAParser.SAMPLERCUBE, 0); }
		public TerminalNode SAMPLER2DSHADOW() { return getToken(NVIDIAParser.SAMPLER2DSHADOW, 0); }
		public TerminalNode SAMPLERCUBESHADOW() { return getToken(NVIDIAParser.SAMPLERCUBESHADOW, 0); }
		public TerminalNode SAMPLER2DARRAY() { return getToken(NVIDIAParser.SAMPLER2DARRAY, 0); }
		public TerminalNode SAMPLER2DARRAYSHADOW() { return getToken(NVIDIAParser.SAMPLER2DARRAYSHADOW, 0); }
		public TerminalNode SAMPLERCUBEARRAY() { return getToken(NVIDIAParser.SAMPLERCUBEARRAY, 0); }
		public TerminalNode SAMPLERCUBEARRAYSHADOW() { return getToken(NVIDIAParser.SAMPLERCUBEARRAYSHADOW, 0); }
		public TerminalNode ISAMPLER2D() { return getToken(NVIDIAParser.ISAMPLER2D, 0); }
		public TerminalNode ISAMPLER3D() { return getToken(NVIDIAParser.ISAMPLER3D, 0); }
		public TerminalNode ISAMPLERCUBE() { return getToken(NVIDIAParser.ISAMPLERCUBE, 0); }
		public TerminalNode ISAMPLER2DARRAY() { return getToken(NVIDIAParser.ISAMPLER2DARRAY, 0); }
		public TerminalNode ISAMPLERCUBEARRAY() { return getToken(NVIDIAParser.ISAMPLERCUBEARRAY, 0); }
		public TerminalNode USAMPLER2D() { return getToken(NVIDIAParser.USAMPLER2D, 0); }
		public TerminalNode USAMPLER3D() { return getToken(NVIDIAParser.USAMPLER3D, 0); }
		public TerminalNode USAMPLERCUBE() { return getToken(NVIDIAParser.USAMPLERCUBE, 0); }
		public TerminalNode USAMPLER2DARRAY() { return getToken(NVIDIAParser.USAMPLER2DARRAY, 0); }
		public TerminalNode USAMPLERCUBEARRAY() { return getToken(NVIDIAParser.USAMPLERCUBEARRAY, 0); }
		public TerminalNode SAMPLER1D() { return getToken(NVIDIAParser.SAMPLER1D, 0); }
		public TerminalNode SAMPLER1DSHADOW() { return getToken(NVIDIAParser.SAMPLER1DSHADOW, 0); }
		public TerminalNode SAMPLER1DARRAY() { return getToken(NVIDIAParser.SAMPLER1DARRAY, 0); }
		public TerminalNode SAMPLER1DARRAYSHADOW() { return getToken(NVIDIAParser.SAMPLER1DARRAYSHADOW, 0); }
		public TerminalNode ISAMPLER1D() { return getToken(NVIDIAParser.ISAMPLER1D, 0); }
		public TerminalNode ISAMPLER1DARRAY() { return getToken(NVIDIAParser.ISAMPLER1DARRAY, 0); }
		public TerminalNode USAMPLER1D() { return getToken(NVIDIAParser.USAMPLER1D, 0); }
		public TerminalNode USAMPLER1DARRAY() { return getToken(NVIDIAParser.USAMPLER1DARRAY, 0); }
		public TerminalNode SAMPLER2DRECT() { return getToken(NVIDIAParser.SAMPLER2DRECT, 0); }
		public TerminalNode SAMPLER2DRECTSHADOW() { return getToken(NVIDIAParser.SAMPLER2DRECTSHADOW, 0); }
		public TerminalNode ISAMPLER2DRECT() { return getToken(NVIDIAParser.ISAMPLER2DRECT, 0); }
		public TerminalNode USAMPLER2DRECT() { return getToken(NVIDIAParser.USAMPLER2DRECT, 0); }
		public TerminalNode SAMPLERBUFFER() { return getToken(NVIDIAParser.SAMPLERBUFFER, 0); }
		public TerminalNode ISAMPLERBUFFER() { return getToken(NVIDIAParser.ISAMPLERBUFFER, 0); }
		public TerminalNode USAMPLERBUFFER() { return getToken(NVIDIAParser.USAMPLERBUFFER, 0); }
		public TerminalNode SAMPLER2DMS() { return getToken(NVIDIAParser.SAMPLER2DMS, 0); }
		public TerminalNode ISAMPLER2DMS() { return getToken(NVIDIAParser.ISAMPLER2DMS, 0); }
		public TerminalNode USAMPLER2DMS() { return getToken(NVIDIAParser.USAMPLER2DMS, 0); }
		public TerminalNode SAMPLER2DMSARRAY() { return getToken(NVIDIAParser.SAMPLER2DMSARRAY, 0); }
		public TerminalNode ISAMPLER2DMSARRAY() { return getToken(NVIDIAParser.ISAMPLER2DMSARRAY, 0); }
		public TerminalNode USAMPLER2DMSARRAY() { return getToken(NVIDIAParser.USAMPLER2DMSARRAY, 0); }
		public TerminalNode IMAGE2D() { return getToken(NVIDIAParser.IMAGE2D, 0); }
		public TerminalNode IIMAGE2D() { return getToken(NVIDIAParser.IIMAGE2D, 0); }
		public TerminalNode UIMAGE2D() { return getToken(NVIDIAParser.UIMAGE2D, 0); }
		public TerminalNode IMAGE3D() { return getToken(NVIDIAParser.IMAGE3D, 0); }
		public TerminalNode IIMAGE3D() { return getToken(NVIDIAParser.IIMAGE3D, 0); }
		public TerminalNode UIMAGE3D() { return getToken(NVIDIAParser.UIMAGE3D, 0); }
		public TerminalNode IMAGECUBE() { return getToken(NVIDIAParser.IMAGECUBE, 0); }
		public TerminalNode IIMAGECUBE() { return getToken(NVIDIAParser.IIMAGECUBE, 0); }
		public TerminalNode UIMAGECUBE() { return getToken(NVIDIAParser.UIMAGECUBE, 0); }
		public TerminalNode IMAGEBUFFER() { return getToken(NVIDIAParser.IMAGEBUFFER, 0); }
		public TerminalNode IIMAGEBUFFER() { return getToken(NVIDIAParser.IIMAGEBUFFER, 0); }
		public TerminalNode UIMAGEBUFFER() { return getToken(NVIDIAParser.UIMAGEBUFFER, 0); }
		public TerminalNode IMAGE1D() { return getToken(NVIDIAParser.IMAGE1D, 0); }
		public TerminalNode IIMAGE1D() { return getToken(NVIDIAParser.IIMAGE1D, 0); }
		public TerminalNode UIMAGE1D() { return getToken(NVIDIAParser.UIMAGE1D, 0); }
		public TerminalNode IMAGE1DARRAY() { return getToken(NVIDIAParser.IMAGE1DARRAY, 0); }
		public TerminalNode IIMAGE1DARRAY() { return getToken(NVIDIAParser.IIMAGE1DARRAY, 0); }
		public TerminalNode UIMAGE1DARRAY() { return getToken(NVIDIAParser.UIMAGE1DARRAY, 0); }
		public TerminalNode IMAGE2DRECT() { return getToken(NVIDIAParser.IMAGE2DRECT, 0); }
		public TerminalNode IIMAGE2DRECT() { return getToken(NVIDIAParser.IIMAGE2DRECT, 0); }
		public TerminalNode UIMAGE2DRECT() { return getToken(NVIDIAParser.UIMAGE2DRECT, 0); }
		public TerminalNode IMAGE2DARRAY() { return getToken(NVIDIAParser.IMAGE2DARRAY, 0); }
		public TerminalNode IIMAGE2DARRAY() { return getToken(NVIDIAParser.IIMAGE2DARRAY, 0); }
		public TerminalNode UIMAGE2DARRAY() { return getToken(NVIDIAParser.UIMAGE2DARRAY, 0); }
		public TerminalNode IMAGECUBEARRAY() { return getToken(NVIDIAParser.IMAGECUBEARRAY, 0); }
		public TerminalNode IIMAGECUBEARRAY() { return getToken(NVIDIAParser.IIMAGECUBEARRAY, 0); }
		public TerminalNode UIMAGECUBEARRAY() { return getToken(NVIDIAParser.UIMAGECUBEARRAY, 0); }
		public TerminalNode IMAGE2DMS() { return getToken(NVIDIAParser.IMAGE2DMS, 0); }
		public TerminalNode IIMAGE2DMS() { return getToken(NVIDIAParser.IIMAGE2DMS, 0); }
		public TerminalNode UIMAGE2DMS() { return getToken(NVIDIAParser.UIMAGE2DMS, 0); }
		public TerminalNode IMAGE2DMSARRAY() { return getToken(NVIDIAParser.IMAGE2DMSARRAY, 0); }
		public TerminalNode IIMAGE2DMSARRAY() { return getToken(NVIDIAParser.IIMAGE2DMSARRAY, 0); }
		public TerminalNode UIMAGE2DMSARRAY() { return getToken(NVIDIAParser.UIMAGE2DMSARRAY, 0); }
		public TerminalNode INT8_T() { return getToken(NVIDIAParser.INT8_T, 0); }
		public TerminalNode I8VEC2() { return getToken(NVIDIAParser.I8VEC2, 0); }
		public TerminalNode I8VEC3() { return getToken(NVIDIAParser.I8VEC3, 0); }
		public TerminalNode I8VEC4() { return getToken(NVIDIAParser.I8VEC4, 0); }
		public TerminalNode INT16_T() { return getToken(NVIDIAParser.INT16_T, 0); }
		public TerminalNode I16VEC2() { return getToken(NVIDIAParser.I16VEC2, 0); }
		public TerminalNode I16VEC3() { return getToken(NVIDIAParser.I16VEC3, 0); }
		public TerminalNode I16VEC4() { return getToken(NVIDIAParser.I16VEC4, 0); }
		public TerminalNode INT32_T() { return getToken(NVIDIAParser.INT32_T, 0); }
		public TerminalNode I32VEC2() { return getToken(NVIDIAParser.I32VEC2, 0); }
		public TerminalNode I32VEC3() { return getToken(NVIDIAParser.I32VEC3, 0); }
		public TerminalNode I32VEC4() { return getToken(NVIDIAParser.I32VEC4, 0); }
		public TerminalNode INT64_T() { return getToken(NVIDIAParser.INT64_T, 0); }
		public TerminalNode I64VEC2() { return getToken(NVIDIAParser.I64VEC2, 0); }
		public TerminalNode I64VEC3() { return getToken(NVIDIAParser.I64VEC3, 0); }
		public TerminalNode I64VEC4() { return getToken(NVIDIAParser.I64VEC4, 0); }
		public TerminalNode UINT8_T() { return getToken(NVIDIAParser.UINT8_T, 0); }
		public TerminalNode U8VEC2() { return getToken(NVIDIAParser.U8VEC2, 0); }
		public TerminalNode U8VEC3() { return getToken(NVIDIAParser.U8VEC3, 0); }
		public TerminalNode U8VEC4() { return getToken(NVIDIAParser.U8VEC4, 0); }
		public TerminalNode UINT16_T() { return getToken(NVIDIAParser.UINT16_T, 0); }
		public TerminalNode U16VEC2() { return getToken(NVIDIAParser.U16VEC2, 0); }
		public TerminalNode U16VEC3() { return getToken(NVIDIAParser.U16VEC3, 0); }
		public TerminalNode U16VEC4() { return getToken(NVIDIAParser.U16VEC4, 0); }
		public TerminalNode UINT32_T() { return getToken(NVIDIAParser.UINT32_T, 0); }
		public TerminalNode U32VEC2() { return getToken(NVIDIAParser.U32VEC2, 0); }
		public TerminalNode U32VEC3() { return getToken(NVIDIAParser.U32VEC3, 0); }
		public TerminalNode U32VEC4() { return getToken(NVIDIAParser.U32VEC4, 0); }
		public TerminalNode UINT64_T() { return getToken(NVIDIAParser.UINT64_T, 0); }
		public TerminalNode U64VEC2() { return getToken(NVIDIAParser.U64VEC2, 0); }
		public TerminalNode U64VEC3() { return getToken(NVIDIAParser.U64VEC3, 0); }
		public TerminalNode U64VEC4() { return getToken(NVIDIAParser.U64VEC4, 0); }
		public TerminalNode FLOAT16_T() { return getToken(NVIDIAParser.FLOAT16_T, 0); }
		public TerminalNode F16VEC2() { return getToken(NVIDIAParser.F16VEC2, 0); }
		public TerminalNode F16VEC3() { return getToken(NVIDIAParser.F16VEC3, 0); }
		public TerminalNode F16VEC4() { return getToken(NVIDIAParser.F16VEC4, 0); }
		public TerminalNode FLOAT32_T() { return getToken(NVIDIAParser.FLOAT32_T, 0); }
		public TerminalNode F32VEC2() { return getToken(NVIDIAParser.F32VEC2, 0); }
		public TerminalNode F32VEC3() { return getToken(NVIDIAParser.F32VEC3, 0); }
		public TerminalNode F32VEC4() { return getToken(NVIDIAParser.F32VEC4, 0); }
		public TerminalNode FLOAT64_T() { return getToken(NVIDIAParser.FLOAT64_T, 0); }
		public TerminalNode F64VEC2() { return getToken(NVIDIAParser.F64VEC2, 0); }
		public TerminalNode F64VEC3() { return getToken(NVIDIAParser.F64VEC3, 0); }
		public TerminalNode F64VEC4() { return getToken(NVIDIAParser.F64VEC4, 0); }
		public Struct_specifierContext struct_specifier() {
			return getRuleContext(Struct_specifierContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Type_specifier_nonarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier_nonarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterType_specifier_nonarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitType_specifier_nonarray(this);
		}
	}

	public final Type_specifier_nonarrayContext type_specifier_nonarray() throws RecognitionException {
		Type_specifier_nonarrayContext _localctx = new Type_specifier_nonarrayContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_type_specifier_nonarray);
		try {
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				match(VOID);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				match(DOUBLE);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(529);
				match(INT);
				}
				break;
			case UINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(530);
				match(UINT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(531);
				match(BOOL);
				}
				break;
			case VEC2:
				enterOuterAlt(_localctx, 7);
				{
				setState(532);
				match(VEC2);
				}
				break;
			case VEC3:
				enterOuterAlt(_localctx, 8);
				{
				setState(533);
				match(VEC3);
				}
				break;
			case VEC4:
				enterOuterAlt(_localctx, 9);
				{
				setState(534);
				match(VEC4);
				}
				break;
			case DVEC2:
				enterOuterAlt(_localctx, 10);
				{
				setState(535);
				match(DVEC2);
				}
				break;
			case DVEC3:
				enterOuterAlt(_localctx, 11);
				{
				setState(536);
				match(DVEC3);
				}
				break;
			case DVEC4:
				enterOuterAlt(_localctx, 12);
				{
				setState(537);
				match(DVEC4);
				}
				break;
			case BVEC2:
				enterOuterAlt(_localctx, 13);
				{
				setState(538);
				match(BVEC2);
				}
				break;
			case BVEC3:
				enterOuterAlt(_localctx, 14);
				{
				setState(539);
				match(BVEC3);
				}
				break;
			case BVEC4:
				enterOuterAlt(_localctx, 15);
				{
				setState(540);
				match(BVEC4);
				}
				break;
			case IVEC2:
				enterOuterAlt(_localctx, 16);
				{
				setState(541);
				match(IVEC2);
				}
				break;
			case IVEC3:
				enterOuterAlt(_localctx, 17);
				{
				setState(542);
				match(IVEC3);
				}
				break;
			case IVEC4:
				enterOuterAlt(_localctx, 18);
				{
				setState(543);
				match(IVEC4);
				}
				break;
			case UVEC2:
				enterOuterAlt(_localctx, 19);
				{
				setState(544);
				match(UVEC2);
				}
				break;
			case UVEC3:
				enterOuterAlt(_localctx, 20);
				{
				setState(545);
				match(UVEC3);
				}
				break;
			case UVEC4:
				enterOuterAlt(_localctx, 21);
				{
				setState(546);
				match(UVEC4);
				}
				break;
			case MAT2:
				enterOuterAlt(_localctx, 22);
				{
				setState(547);
				match(MAT2);
				}
				break;
			case MAT3:
				enterOuterAlt(_localctx, 23);
				{
				setState(548);
				match(MAT3);
				}
				break;
			case MAT4:
				enterOuterAlt(_localctx, 24);
				{
				setState(549);
				match(MAT4);
				}
				break;
			case MAT2X2:
				enterOuterAlt(_localctx, 25);
				{
				setState(550);
				match(MAT2X2);
				}
				break;
			case MAT2X3:
				enterOuterAlt(_localctx, 26);
				{
				setState(551);
				match(MAT2X3);
				}
				break;
			case MAT2X4:
				enterOuterAlt(_localctx, 27);
				{
				setState(552);
				match(MAT2X4);
				}
				break;
			case MAT3X2:
				enterOuterAlt(_localctx, 28);
				{
				setState(553);
				match(MAT3X2);
				}
				break;
			case MAT3X3:
				enterOuterAlt(_localctx, 29);
				{
				setState(554);
				match(MAT3X3);
				}
				break;
			case MAT3X4:
				enterOuterAlt(_localctx, 30);
				{
				setState(555);
				match(MAT3X4);
				}
				break;
			case MAT4X2:
				enterOuterAlt(_localctx, 31);
				{
				setState(556);
				match(MAT4X2);
				}
				break;
			case MAT4X3:
				enterOuterAlt(_localctx, 32);
				{
				setState(557);
				match(MAT4X3);
				}
				break;
			case MAT4X4:
				enterOuterAlt(_localctx, 33);
				{
				setState(558);
				match(MAT4X4);
				}
				break;
			case DMAT2:
				enterOuterAlt(_localctx, 34);
				{
				setState(559);
				match(DMAT2);
				}
				break;
			case DMAT3:
				enterOuterAlt(_localctx, 35);
				{
				setState(560);
				match(DMAT3);
				}
				break;
			case DMAT4:
				enterOuterAlt(_localctx, 36);
				{
				setState(561);
				match(DMAT4);
				}
				break;
			case DMAT2X2:
				enterOuterAlt(_localctx, 37);
				{
				setState(562);
				match(DMAT2X2);
				}
				break;
			case DMAT2X3:
				enterOuterAlt(_localctx, 38);
				{
				setState(563);
				match(DMAT2X3);
				}
				break;
			case DMAT2X4:
				enterOuterAlt(_localctx, 39);
				{
				setState(564);
				match(DMAT2X4);
				}
				break;
			case DMAT3X2:
				enterOuterAlt(_localctx, 40);
				{
				setState(565);
				match(DMAT3X2);
				}
				break;
			case DMAT3X3:
				enterOuterAlt(_localctx, 41);
				{
				setState(566);
				match(DMAT3X3);
				}
				break;
			case DMAT3X4:
				enterOuterAlt(_localctx, 42);
				{
				setState(567);
				match(DMAT3X4);
				}
				break;
			case DMAT4X2:
				enterOuterAlt(_localctx, 43);
				{
				setState(568);
				match(DMAT4X2);
				}
				break;
			case DMAT4X3:
				enterOuterAlt(_localctx, 44);
				{
				setState(569);
				match(DMAT4X3);
				}
				break;
			case DMAT4X4:
				enterOuterAlt(_localctx, 45);
				{
				setState(570);
				match(DMAT4X4);
				}
				break;
			case ATOMIC_UINT:
				enterOuterAlt(_localctx, 46);
				{
				setState(571);
				match(ATOMIC_UINT);
				}
				break;
			case SAMPLER2D:
				enterOuterAlt(_localctx, 47);
				{
				setState(572);
				match(SAMPLER2D);
				}
				break;
			case SAMPLER3D:
				enterOuterAlt(_localctx, 48);
				{
				setState(573);
				match(SAMPLER3D);
				}
				break;
			case SAMPLERCUBE:
				enterOuterAlt(_localctx, 49);
				{
				setState(574);
				match(SAMPLERCUBE);
				}
				break;
			case SAMPLER2DSHADOW:
				enterOuterAlt(_localctx, 50);
				{
				setState(575);
				match(SAMPLER2DSHADOW);
				}
				break;
			case SAMPLERCUBESHADOW:
				enterOuterAlt(_localctx, 51);
				{
				setState(576);
				match(SAMPLERCUBESHADOW);
				}
				break;
			case SAMPLER2DARRAY:
				enterOuterAlt(_localctx, 52);
				{
				setState(577);
				match(SAMPLER2DARRAY);
				}
				break;
			case SAMPLER2DARRAYSHADOW:
				enterOuterAlt(_localctx, 53);
				{
				setState(578);
				match(SAMPLER2DARRAYSHADOW);
				}
				break;
			case SAMPLERCUBEARRAY:
				enterOuterAlt(_localctx, 54);
				{
				setState(579);
				match(SAMPLERCUBEARRAY);
				}
				break;
			case SAMPLERCUBEARRAYSHADOW:
				enterOuterAlt(_localctx, 55);
				{
				setState(580);
				match(SAMPLERCUBEARRAYSHADOW);
				}
				break;
			case ISAMPLER2D:
				enterOuterAlt(_localctx, 56);
				{
				setState(581);
				match(ISAMPLER2D);
				}
				break;
			case ISAMPLER3D:
				enterOuterAlt(_localctx, 57);
				{
				setState(582);
				match(ISAMPLER3D);
				}
				break;
			case ISAMPLERCUBE:
				enterOuterAlt(_localctx, 58);
				{
				setState(583);
				match(ISAMPLERCUBE);
				}
				break;
			case ISAMPLER2DARRAY:
				enterOuterAlt(_localctx, 59);
				{
				setState(584);
				match(ISAMPLER2DARRAY);
				}
				break;
			case ISAMPLERCUBEARRAY:
				enterOuterAlt(_localctx, 60);
				{
				setState(585);
				match(ISAMPLERCUBEARRAY);
				}
				break;
			case USAMPLER2D:
				enterOuterAlt(_localctx, 61);
				{
				setState(586);
				match(USAMPLER2D);
				}
				break;
			case USAMPLER3D:
				enterOuterAlt(_localctx, 62);
				{
				setState(587);
				match(USAMPLER3D);
				}
				break;
			case USAMPLERCUBE:
				enterOuterAlt(_localctx, 63);
				{
				setState(588);
				match(USAMPLERCUBE);
				}
				break;
			case USAMPLER2DARRAY:
				enterOuterAlt(_localctx, 64);
				{
				setState(589);
				match(USAMPLER2DARRAY);
				}
				break;
			case USAMPLERCUBEARRAY:
				enterOuterAlt(_localctx, 65);
				{
				setState(590);
				match(USAMPLERCUBEARRAY);
				}
				break;
			case SAMPLER1D:
				enterOuterAlt(_localctx, 66);
				{
				setState(591);
				match(SAMPLER1D);
				}
				break;
			case SAMPLER1DSHADOW:
				enterOuterAlt(_localctx, 67);
				{
				setState(592);
				match(SAMPLER1DSHADOW);
				}
				break;
			case SAMPLER1DARRAY:
				enterOuterAlt(_localctx, 68);
				{
				setState(593);
				match(SAMPLER1DARRAY);
				}
				break;
			case SAMPLER1DARRAYSHADOW:
				enterOuterAlt(_localctx, 69);
				{
				setState(594);
				match(SAMPLER1DARRAYSHADOW);
				}
				break;
			case ISAMPLER1D:
				enterOuterAlt(_localctx, 70);
				{
				setState(595);
				match(ISAMPLER1D);
				}
				break;
			case ISAMPLER1DARRAY:
				enterOuterAlt(_localctx, 71);
				{
				setState(596);
				match(ISAMPLER1DARRAY);
				}
				break;
			case USAMPLER1D:
				enterOuterAlt(_localctx, 72);
				{
				setState(597);
				match(USAMPLER1D);
				}
				break;
			case USAMPLER1DARRAY:
				enterOuterAlt(_localctx, 73);
				{
				setState(598);
				match(USAMPLER1DARRAY);
				}
				break;
			case SAMPLER2DRECT:
				enterOuterAlt(_localctx, 74);
				{
				setState(599);
				match(SAMPLER2DRECT);
				}
				break;
			case SAMPLER2DRECTSHADOW:
				enterOuterAlt(_localctx, 75);
				{
				setState(600);
				match(SAMPLER2DRECTSHADOW);
				}
				break;
			case ISAMPLER2DRECT:
				enterOuterAlt(_localctx, 76);
				{
				setState(601);
				match(ISAMPLER2DRECT);
				}
				break;
			case USAMPLER2DRECT:
				enterOuterAlt(_localctx, 77);
				{
				setState(602);
				match(USAMPLER2DRECT);
				}
				break;
			case SAMPLERBUFFER:
				enterOuterAlt(_localctx, 78);
				{
				setState(603);
				match(SAMPLERBUFFER);
				}
				break;
			case ISAMPLERBUFFER:
				enterOuterAlt(_localctx, 79);
				{
				setState(604);
				match(ISAMPLERBUFFER);
				}
				break;
			case USAMPLERBUFFER:
				enterOuterAlt(_localctx, 80);
				{
				setState(605);
				match(USAMPLERBUFFER);
				}
				break;
			case SAMPLER2DMS:
				enterOuterAlt(_localctx, 81);
				{
				setState(606);
				match(SAMPLER2DMS);
				}
				break;
			case ISAMPLER2DMS:
				enterOuterAlt(_localctx, 82);
				{
				setState(607);
				match(ISAMPLER2DMS);
				}
				break;
			case USAMPLER2DMS:
				enterOuterAlt(_localctx, 83);
				{
				setState(608);
				match(USAMPLER2DMS);
				}
				break;
			case SAMPLER2DMSARRAY:
				enterOuterAlt(_localctx, 84);
				{
				setState(609);
				match(SAMPLER2DMSARRAY);
				}
				break;
			case ISAMPLER2DMSARRAY:
				enterOuterAlt(_localctx, 85);
				{
				setState(610);
				match(ISAMPLER2DMSARRAY);
				}
				break;
			case USAMPLER2DMSARRAY:
				enterOuterAlt(_localctx, 86);
				{
				setState(611);
				match(USAMPLER2DMSARRAY);
				}
				break;
			case IMAGE2D:
				enterOuterAlt(_localctx, 87);
				{
				setState(612);
				match(IMAGE2D);
				}
				break;
			case IIMAGE2D:
				enterOuterAlt(_localctx, 88);
				{
				setState(613);
				match(IIMAGE2D);
				}
				break;
			case UIMAGE2D:
				enterOuterAlt(_localctx, 89);
				{
				setState(614);
				match(UIMAGE2D);
				}
				break;
			case IMAGE3D:
				enterOuterAlt(_localctx, 90);
				{
				setState(615);
				match(IMAGE3D);
				}
				break;
			case IIMAGE3D:
				enterOuterAlt(_localctx, 91);
				{
				setState(616);
				match(IIMAGE3D);
				}
				break;
			case UIMAGE3D:
				enterOuterAlt(_localctx, 92);
				{
				setState(617);
				match(UIMAGE3D);
				}
				break;
			case IMAGECUBE:
				enterOuterAlt(_localctx, 93);
				{
				setState(618);
				match(IMAGECUBE);
				}
				break;
			case IIMAGECUBE:
				enterOuterAlt(_localctx, 94);
				{
				setState(619);
				match(IIMAGECUBE);
				}
				break;
			case UIMAGECUBE:
				enterOuterAlt(_localctx, 95);
				{
				setState(620);
				match(UIMAGECUBE);
				}
				break;
			case IMAGEBUFFER:
				enterOuterAlt(_localctx, 96);
				{
				setState(621);
				match(IMAGEBUFFER);
				}
				break;
			case IIMAGEBUFFER:
				enterOuterAlt(_localctx, 97);
				{
				setState(622);
				match(IIMAGEBUFFER);
				}
				break;
			case UIMAGEBUFFER:
				enterOuterAlt(_localctx, 98);
				{
				setState(623);
				match(UIMAGEBUFFER);
				}
				break;
			case IMAGE1D:
				enterOuterAlt(_localctx, 99);
				{
				setState(624);
				match(IMAGE1D);
				}
				break;
			case IIMAGE1D:
				enterOuterAlt(_localctx, 100);
				{
				setState(625);
				match(IIMAGE1D);
				}
				break;
			case UIMAGE1D:
				enterOuterAlt(_localctx, 101);
				{
				setState(626);
				match(UIMAGE1D);
				}
				break;
			case IMAGE1DARRAY:
				enterOuterAlt(_localctx, 102);
				{
				setState(627);
				match(IMAGE1DARRAY);
				}
				break;
			case IIMAGE1DARRAY:
				enterOuterAlt(_localctx, 103);
				{
				setState(628);
				match(IIMAGE1DARRAY);
				}
				break;
			case UIMAGE1DARRAY:
				enterOuterAlt(_localctx, 104);
				{
				setState(629);
				match(UIMAGE1DARRAY);
				}
				break;
			case IMAGE2DRECT:
				enterOuterAlt(_localctx, 105);
				{
				setState(630);
				match(IMAGE2DRECT);
				}
				break;
			case IIMAGE2DRECT:
				enterOuterAlt(_localctx, 106);
				{
				setState(631);
				match(IIMAGE2DRECT);
				}
				break;
			case UIMAGE2DRECT:
				enterOuterAlt(_localctx, 107);
				{
				setState(632);
				match(UIMAGE2DRECT);
				}
				break;
			case IMAGE2DARRAY:
				enterOuterAlt(_localctx, 108);
				{
				setState(633);
				match(IMAGE2DARRAY);
				}
				break;
			case IIMAGE2DARRAY:
				enterOuterAlt(_localctx, 109);
				{
				setState(634);
				match(IIMAGE2DARRAY);
				}
				break;
			case UIMAGE2DARRAY:
				enterOuterAlt(_localctx, 110);
				{
				setState(635);
				match(UIMAGE2DARRAY);
				}
				break;
			case IMAGECUBEARRAY:
				enterOuterAlt(_localctx, 111);
				{
				setState(636);
				match(IMAGECUBEARRAY);
				}
				break;
			case IIMAGECUBEARRAY:
				enterOuterAlt(_localctx, 112);
				{
				setState(637);
				match(IIMAGECUBEARRAY);
				}
				break;
			case UIMAGECUBEARRAY:
				enterOuterAlt(_localctx, 113);
				{
				setState(638);
				match(UIMAGECUBEARRAY);
				}
				break;
			case IMAGE2DMS:
				enterOuterAlt(_localctx, 114);
				{
				setState(639);
				match(IMAGE2DMS);
				}
				break;
			case IIMAGE2DMS:
				enterOuterAlt(_localctx, 115);
				{
				setState(640);
				match(IIMAGE2DMS);
				}
				break;
			case UIMAGE2DMS:
				enterOuterAlt(_localctx, 116);
				{
				setState(641);
				match(UIMAGE2DMS);
				}
				break;
			case IMAGE2DMSARRAY:
				enterOuterAlt(_localctx, 117);
				{
				setState(642);
				match(IMAGE2DMSARRAY);
				}
				break;
			case IIMAGE2DMSARRAY:
				enterOuterAlt(_localctx, 118);
				{
				setState(643);
				match(IIMAGE2DMSARRAY);
				}
				break;
			case UIMAGE2DMSARRAY:
				enterOuterAlt(_localctx, 119);
				{
				setState(644);
				match(UIMAGE2DMSARRAY);
				}
				break;
			case INT8_T:
				enterOuterAlt(_localctx, 120);
				{
				setState(645);
				match(INT8_T);
				}
				break;
			case I8VEC2:
				enterOuterAlt(_localctx, 121);
				{
				setState(646);
				match(I8VEC2);
				}
				break;
			case I8VEC3:
				enterOuterAlt(_localctx, 122);
				{
				setState(647);
				match(I8VEC3);
				}
				break;
			case I8VEC4:
				enterOuterAlt(_localctx, 123);
				{
				setState(648);
				match(I8VEC4);
				}
				break;
			case INT16_T:
				enterOuterAlt(_localctx, 124);
				{
				setState(649);
				match(INT16_T);
				}
				break;
			case I16VEC2:
				enterOuterAlt(_localctx, 125);
				{
				setState(650);
				match(I16VEC2);
				}
				break;
			case I16VEC3:
				enterOuterAlt(_localctx, 126);
				{
				setState(651);
				match(I16VEC3);
				}
				break;
			case I16VEC4:
				enterOuterAlt(_localctx, 127);
				{
				setState(652);
				match(I16VEC4);
				}
				break;
			case INT32_T:
				enterOuterAlt(_localctx, 128);
				{
				setState(653);
				match(INT32_T);
				}
				break;
			case I32VEC2:
				enterOuterAlt(_localctx, 129);
				{
				setState(654);
				match(I32VEC2);
				}
				break;
			case I32VEC3:
				enterOuterAlt(_localctx, 130);
				{
				setState(655);
				match(I32VEC3);
				}
				break;
			case I32VEC4:
				enterOuterAlt(_localctx, 131);
				{
				setState(656);
				match(I32VEC4);
				}
				break;
			case INT64_T:
				enterOuterAlt(_localctx, 132);
				{
				setState(657);
				match(INT64_T);
				}
				break;
			case I64VEC2:
				enterOuterAlt(_localctx, 133);
				{
				setState(658);
				match(I64VEC2);
				}
				break;
			case I64VEC3:
				enterOuterAlt(_localctx, 134);
				{
				setState(659);
				match(I64VEC3);
				}
				break;
			case I64VEC4:
				enterOuterAlt(_localctx, 135);
				{
				setState(660);
				match(I64VEC4);
				}
				break;
			case UINT8_T:
				enterOuterAlt(_localctx, 136);
				{
				setState(661);
				match(UINT8_T);
				}
				break;
			case U8VEC2:
				enterOuterAlt(_localctx, 137);
				{
				setState(662);
				match(U8VEC2);
				}
				break;
			case U8VEC3:
				enterOuterAlt(_localctx, 138);
				{
				setState(663);
				match(U8VEC3);
				}
				break;
			case U8VEC4:
				enterOuterAlt(_localctx, 139);
				{
				setState(664);
				match(U8VEC4);
				}
				break;
			case UINT16_T:
				enterOuterAlt(_localctx, 140);
				{
				setState(665);
				match(UINT16_T);
				}
				break;
			case U16VEC2:
				enterOuterAlt(_localctx, 141);
				{
				setState(666);
				match(U16VEC2);
				}
				break;
			case U16VEC3:
				enterOuterAlt(_localctx, 142);
				{
				setState(667);
				match(U16VEC3);
				}
				break;
			case U16VEC4:
				enterOuterAlt(_localctx, 143);
				{
				setState(668);
				match(U16VEC4);
				}
				break;
			case UINT32_T:
				enterOuterAlt(_localctx, 144);
				{
				setState(669);
				match(UINT32_T);
				}
				break;
			case U32VEC2:
				enterOuterAlt(_localctx, 145);
				{
				setState(670);
				match(U32VEC2);
				}
				break;
			case U32VEC3:
				enterOuterAlt(_localctx, 146);
				{
				setState(671);
				match(U32VEC3);
				}
				break;
			case U32VEC4:
				enterOuterAlt(_localctx, 147);
				{
				setState(672);
				match(U32VEC4);
				}
				break;
			case UINT64_T:
				enterOuterAlt(_localctx, 148);
				{
				setState(673);
				match(UINT64_T);
				}
				break;
			case U64VEC2:
				enterOuterAlt(_localctx, 149);
				{
				setState(674);
				match(U64VEC2);
				}
				break;
			case U64VEC3:
				enterOuterAlt(_localctx, 150);
				{
				setState(675);
				match(U64VEC3);
				}
				break;
			case U64VEC4:
				enterOuterAlt(_localctx, 151);
				{
				setState(676);
				match(U64VEC4);
				}
				break;
			case FLOAT16_T:
				enterOuterAlt(_localctx, 152);
				{
				setState(677);
				match(FLOAT16_T);
				}
				break;
			case F16VEC2:
				enterOuterAlt(_localctx, 153);
				{
				setState(678);
				match(F16VEC2);
				}
				break;
			case F16VEC3:
				enterOuterAlt(_localctx, 154);
				{
				setState(679);
				match(F16VEC3);
				}
				break;
			case F16VEC4:
				enterOuterAlt(_localctx, 155);
				{
				setState(680);
				match(F16VEC4);
				}
				break;
			case FLOAT32_T:
				enterOuterAlt(_localctx, 156);
				{
				setState(681);
				match(FLOAT32_T);
				}
				break;
			case F32VEC2:
				enterOuterAlt(_localctx, 157);
				{
				setState(682);
				match(F32VEC2);
				}
				break;
			case F32VEC3:
				enterOuterAlt(_localctx, 158);
				{
				setState(683);
				match(F32VEC3);
				}
				break;
			case F32VEC4:
				enterOuterAlt(_localctx, 159);
				{
				setState(684);
				match(F32VEC4);
				}
				break;
			case FLOAT64_T:
				enterOuterAlt(_localctx, 160);
				{
				setState(685);
				match(FLOAT64_T);
				}
				break;
			case F64VEC2:
				enterOuterAlt(_localctx, 161);
				{
				setState(686);
				match(F64VEC2);
				}
				break;
			case F64VEC3:
				enterOuterAlt(_localctx, 162);
				{
				setState(687);
				match(F64VEC3);
				}
				break;
			case F64VEC4:
				enterOuterAlt(_localctx, 163);
				{
				setState(688);
				match(F64VEC4);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 164);
				{
				setState(689);
				struct_specifier();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 165);
				{
				setState(690);
				type_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precision_qualifierContext extends ParserRuleContext {
		public TerminalNode HIGHP() { return getToken(NVIDIAParser.HIGHP, 0); }
		public TerminalNode MEDIUMP() { return getToken(NVIDIAParser.MEDIUMP, 0); }
		public TerminalNode LOWP() { return getToken(NVIDIAParser.LOWP, 0); }
		public Precision_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precision_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterPrecision_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitPrecision_qualifier(this);
		}
	}

	public final Precision_qualifierContext precision_qualifier() throws RecognitionException {
		Precision_qualifierContext _localctx = new Precision_qualifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_precision_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			_la = _input.LA(1);
			if ( !(((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (HIGHP - 38)) | (1L << (LOWP - 38)) | (1L << (MEDIUMP - 38)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_specifierContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(NVIDIAParser.STRUCT, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(NVIDIAParser.LEFT_BRACE, 0); }
		public Struct_declaration_listContext struct_declaration_list() {
			return getRuleContext(Struct_declaration_listContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(NVIDIAParser.RIGHT_BRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NVIDIAParser.IDENTIFIER, 0); }
		public Struct_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterStruct_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitStruct_specifier(this);
		}
	}

	public final Struct_specifierContext struct_specifier() throws RecognitionException {
		Struct_specifierContext _localctx = new Struct_specifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_struct_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(STRUCT);
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(696);
				match(IDENTIFIER);
				}
			}

			setState(699);
			match(LEFT_BRACE);
			setState(700);
			struct_declaration_list();
			setState(701);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_declaration_listContext extends ParserRuleContext {
		public List<Struct_declarationContext> struct_declaration() {
			return getRuleContexts(Struct_declarationContext.class);
		}
		public Struct_declarationContext struct_declaration(int i) {
			return getRuleContext(Struct_declarationContext.class,i);
		}
		public Struct_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterStruct_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitStruct_declaration_list(this);
		}
	}

	public final Struct_declaration_listContext struct_declaration_list() throws RecognitionException {
		Struct_declaration_listContext _localctx = new Struct_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_struct_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(703);
				struct_declaration();
				}
				}
				setState(706); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << BOOL) | (1L << BUFFER) | (1L << BVEC2) | (1L << BVEC3) | (1L << BVEC4) | (1L << CENTROID) | (1L << COHERENT) | (1L << CONST) | (1L << DMAT2) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << DMAT3) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << DMAT4) | (1L << DMAT4X2) | (1L << DMAT4X3) | (1L << DMAT4X4) | (1L << DOUBLE) | (1L << DVEC2) | (1L << DVEC3) | (1L << DVEC4) | (1L << FLAT) | (1L << FLOAT) | (1L << HIGHP) | (1L << IIMAGE1D) | (1L << IIMAGE1DARRAY) | (1L << IIMAGE2D) | (1L << IIMAGE2DARRAY) | (1L << IIMAGE2DMS) | (1L << IIMAGE2DMSARRAY) | (1L << IIMAGE2DRECT) | (1L << IIMAGE3D) | (1L << IIMAGEBUFFER) | (1L << IIMAGECUBE) | (1L << IIMAGECUBEARRAY) | (1L << IMAGE1D) | (1L << IMAGE1DARRAY) | (1L << IMAGE2D) | (1L << IMAGE2DARRAY) | (1L << IMAGE2DMS) | (1L << IMAGE2DMSARRAY) | (1L << IMAGE2DRECT) | (1L << IMAGE3D) | (1L << IMAGEBUFFER) | (1L << IMAGECUBE) | (1L << IMAGECUBEARRAY) | (1L << IN) | (1L << INOUT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT - 64)) | (1L << (INVARIANT - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (LAYOUT - 64)) | (1L << (LOWP - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (MAT4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (MEDIUMP - 64)) | (1L << (NOPERSPECTIVE - 64)) | (1L << (OUT - 64)) | (1L << (PATCH - 64)) | (1L << (PRECISE - 64)) | (1L << (READONLY - 64)) | (1L << (RESTRICT - 64)) | (1L << (SAMPLE - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SHARED - 64)) | (1L << (SMOOTH - 64)) | (1L << (STRUCT - 64)) | (1L << (SUBROUTINE - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (UIMAGE1D - 129)) | (1L << (UIMAGE1DARRAY - 129)) | (1L << (UIMAGE2D - 129)) | (1L << (UIMAGE2DARRAY - 129)) | (1L << (UIMAGE2DMS - 129)) | (1L << (UIMAGE2DMSARRAY - 129)) | (1L << (UIMAGE2DRECT - 129)) | (1L << (UIMAGE3D - 129)) | (1L << (UIMAGEBUFFER - 129)) | (1L << (UIMAGECUBE - 129)) | (1L << (UIMAGECUBEARRAY - 129)) | (1L << (UINT - 129)) | (1L << (UNIFORM - 129)) | (1L << (USAMPLER1D - 129)) | (1L << (USAMPLER1DARRAY - 129)) | (1L << (USAMPLER2D - 129)) | (1L << (USAMPLER2DARRAY - 129)) | (1L << (USAMPLER2DMS - 129)) | (1L << (USAMPLER2DMSARRAY - 129)) | (1L << (USAMPLER2DRECT - 129)) | (1L << (USAMPLER3D - 129)) | (1L << (USAMPLERBUFFER - 129)) | (1L << (USAMPLERCUBE - 129)) | (1L << (USAMPLERCUBEARRAY - 129)) | (1L << (UVEC2 - 129)) | (1L << (UVEC3 - 129)) | (1L << (UVEC4 - 129)) | (1L << (VEC2 - 129)) | (1L << (VEC3 - 129)) | (1L << (VEC4 - 129)) | (1L << (VOID - 129)) | (1L << (VOLATILE - 129)) | (1L << (WRITEONLY - 129)) | (1L << (INT8_T - 129)) | (1L << (I8VEC2 - 129)) | (1L << (I8VEC3 - 129)) | (1L << (I8VEC4 - 129)) | (1L << (INT16_T - 129)) | (1L << (I16VEC2 - 129)) | (1L << (I16VEC3 - 129)) | (1L << (I16VEC4 - 129)) | (1L << (INT32_T - 129)) | (1L << (I32VEC2 - 129)) | (1L << (I32VEC3 - 129)) | (1L << (I32VEC4 - 129)) | (1L << (INT64_T - 129)) | (1L << (I64VEC2 - 129)) | (1L << (I64VEC3 - 129)) | (1L << (I64VEC4 - 129)) | (1L << (UINT8_T - 129)) | (1L << (U8VEC2 - 129)) | (1L << (U8VEC3 - 129)) | (1L << (U8VEC4 - 129)) | (1L << (UINT16_T - 129)) | (1L << (U16VEC2 - 129)) | (1L << (U16VEC3 - 129)) | (1L << (U16VEC4 - 129)) | (1L << (UINT32_T - 129)) | (1L << (U32VEC2 - 129)) | (1L << (U32VEC3 - 129)) | (1L << (U32VEC4 - 129)) | (1L << (UINT64_T - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (U64VEC2 - 193)) | (1L << (U64VEC3 - 193)) | (1L << (U64VEC4 - 193)) | (1L << (FLOAT16_T - 193)) | (1L << (F16VEC2 - 193)) | (1L << (F16VEC3 - 193)) | (1L << (F16VEC4 - 193)) | (1L << (FLOAT32_T - 193)) | (1L << (F32VEC2 - 193)) | (1L << (F32VEC3 - 193)) | (1L << (F32VEC4 - 193)) | (1L << (FLOAT64_T - 193)) | (1L << (F64VEC2 - 193)) | (1L << (F64VEC3 - 193)) | (1L << (F64VEC4 - 193)))) != 0) || _la==IDENTIFIER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_declarationContext extends ParserRuleContext {
		public Fully_specified_typeContext fully_specified_type() {
			return getRuleContext(Fully_specified_typeContext.class,0);
		}
		public Struct_declarator_listContext struct_declarator_list() {
			return getRuleContext(Struct_declarator_listContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NVIDIAParser.SEMICOLON, 0); }
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitStruct_declaration(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_struct_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			fully_specified_type();
			setState(709);
			struct_declarator_list();
			setState(710);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_declarator_listContext extends ParserRuleContext {
		public List<Struct_declaratorContext> struct_declarator() {
			return getRuleContexts(Struct_declaratorContext.class);
		}
		public Struct_declaratorContext struct_declarator(int i) {
			return getRuleContext(Struct_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NVIDIAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NVIDIAParser.COMMA, i);
		}
		public Struct_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterStruct_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitStruct_declarator_list(this);
		}
	}

	public final Struct_declarator_listContext struct_declarator_list() throws RecognitionException {
		Struct_declarator_listContext _localctx = new Struct_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_struct_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			struct_declarator();
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(713);
				match(COMMA);
				setState(714);
				struct_declarator();
				}
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_declaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NVIDIAParser.IDENTIFIER, 0); }
		public Array_specifierContext array_specifier() {
			return getRuleContext(Array_specifierContext.class,0);
		}
		public Struct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterStruct_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitStruct_declarator(this);
		}
	}

	public final Struct_declaratorContext struct_declarator() throws RecognitionException {
		Struct_declaratorContext _localctx = new Struct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_struct_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(IDENTIFIER);
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET) {
				{
				setState(721);
				array_specifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(NVIDIAParser.LEFT_BRACE, 0); }
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(NVIDIAParser.RIGHT_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(NVIDIAParser.COMMA, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_initializer);
		int _la;
		try {
			setState(732);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATOMIC_UINT:
			case BOOL:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case DMAT2:
			case DMAT2X2:
			case DMAT2X3:
			case DMAT2X4:
			case DMAT3:
			case DMAT3X2:
			case DMAT3X3:
			case DMAT3X4:
			case DMAT4:
			case DMAT4X2:
			case DMAT4X3:
			case DMAT4X4:
			case DOUBLE:
			case DVEC2:
			case DVEC3:
			case DVEC4:
			case FALSE:
			case FLOAT:
			case IIMAGE1D:
			case IIMAGE1DARRAY:
			case IIMAGE2D:
			case IIMAGE2DARRAY:
			case IIMAGE2DMS:
			case IIMAGE2DMSARRAY:
			case IIMAGE2DRECT:
			case IIMAGE3D:
			case IIMAGEBUFFER:
			case IIMAGECUBE:
			case IIMAGECUBEARRAY:
			case IMAGE1D:
			case IMAGE1DARRAY:
			case IMAGE2D:
			case IMAGE2DARRAY:
			case IMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IMAGE2DRECT:
			case IMAGE3D:
			case IMAGEBUFFER:
			case IMAGECUBE:
			case IMAGECUBEARRAY:
			case INT:
			case ISAMPLER1D:
			case ISAMPLER1DARRAY:
			case ISAMPLER2D:
			case ISAMPLER2DARRAY:
			case ISAMPLER2DMS:
			case ISAMPLER2DMSARRAY:
			case ISAMPLER2DRECT:
			case ISAMPLER3D:
			case ISAMPLERBUFFER:
			case ISAMPLERCUBE:
			case ISAMPLERCUBEARRAY:
			case IVEC2:
			case IVEC3:
			case IVEC4:
			case LAYOUT:
			case MAT2:
			case MAT2X2:
			case MAT2X3:
			case MAT2X4:
			case MAT3:
			case MAT3X2:
			case MAT3X3:
			case MAT3X4:
			case MAT4:
			case MAT4X2:
			case MAT4X3:
			case MAT4X4:
			case SAMPLER1D:
			case SAMPLER1DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER1DSHADOW:
			case SAMPLER2D:
			case SAMPLER2DARRAY:
			case SAMPLER2DARRAYSHADOW:
			case SAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case SAMPLER2DRECT:
			case SAMPLER2DRECTSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLER3D:
			case SAMPLERBUFFER:
			case SAMPLERCUBE:
			case SAMPLERCUBEARRAY:
			case SAMPLERCUBEARRAYSHADOW:
			case SAMPLERCUBESHADOW:
			case STRUCT:
			case TRUE:
			case UIMAGE1D:
			case UIMAGE1DARRAY:
			case UIMAGE2D:
			case UIMAGE2DARRAY:
			case UIMAGE2DMS:
			case UIMAGE2DMSARRAY:
			case UIMAGE2DRECT:
			case UIMAGE3D:
			case UIMAGEBUFFER:
			case UIMAGECUBE:
			case UIMAGECUBEARRAY:
			case UINT:
			case USAMPLER1D:
			case USAMPLER1DARRAY:
			case USAMPLER2D:
			case USAMPLER2DARRAY:
			case USAMPLER2DMS:
			case USAMPLER2DMSARRAY:
			case USAMPLER2DRECT:
			case USAMPLER3D:
			case USAMPLERBUFFER:
			case USAMPLERCUBE:
			case USAMPLERCUBEARRAY:
			case UVEC2:
			case UVEC3:
			case UVEC4:
			case VEC2:
			case VEC3:
			case VEC4:
			case VOID:
			case INT8_T:
			case I8VEC2:
			case I8VEC3:
			case I8VEC4:
			case INT16_T:
			case I16VEC2:
			case I16VEC3:
			case I16VEC4:
			case INT32_T:
			case I32VEC2:
			case I32VEC3:
			case I32VEC4:
			case INT64_T:
			case I64VEC2:
			case I64VEC3:
			case I64VEC4:
			case UINT8_T:
			case U8VEC2:
			case U8VEC3:
			case U8VEC4:
			case UINT16_T:
			case U16VEC2:
			case U16VEC3:
			case U16VEC4:
			case UINT32_T:
			case U32VEC2:
			case U32VEC3:
			case U32VEC4:
			case UINT64_T:
			case U64VEC2:
			case U64VEC3:
			case U64VEC4:
			case FLOAT16_T:
			case F16VEC2:
			case F16VEC3:
			case F16VEC4:
			case FLOAT32_T:
			case F32VEC2:
			case F32VEC3:
			case F32VEC4:
			case FLOAT64_T:
			case F64VEC2:
			case F64VEC3:
			case F64VEC4:
			case AMPERSAND:
			case BANG:
			case DASH:
			case DEC_OP:
			case INC_OP:
			case LEFT_PAREN:
			case PLUS:
			case STAR:
			case TILDE:
			case DOUBLECONSTANT:
			case FLOATCONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				assignment_expression();
				}
				break;
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				match(LEFT_BRACE);
				setState(726);
				initializer_list();
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(727);
					match(COMMA);
					}
				}

				setState(730);
				match(RIGHT_BRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_listContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NVIDIAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NVIDIAParser.COMMA, i);
		}
		public Initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterInitializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitInitializer_list(this);
		}
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			initializer();
			setState(739);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(735);
					match(COMMA);
					setState(736);
					initializer();
					}
					} 
				}
				setState(741);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_statementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Declaration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterDeclaration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitDeclaration_statement(this);
		}
	}

	public final Declaration_statementContext declaration_statement() throws RecognitionException {
		Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_declaration_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Simple_statementContext simple_statement() {
			return getRuleContext(Simple_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_statement);
		try {
			setState(746);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				compound_statement();
				}
				break;
			case ATOMIC_UINT:
			case BOOL:
			case BREAK:
			case BUFFER:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case CASE:
			case CENTROID:
			case COHERENT:
			case CONST:
			case CONTINUE:
			case DEFAULT:
			case DISCARD:
			case DMAT2:
			case DMAT2X2:
			case DMAT2X3:
			case DMAT2X4:
			case DMAT3:
			case DMAT3X2:
			case DMAT3X3:
			case DMAT3X4:
			case DMAT4:
			case DMAT4X2:
			case DMAT4X3:
			case DMAT4X4:
			case DO:
			case DOUBLE:
			case DVEC2:
			case DVEC3:
			case DVEC4:
			case FALSE:
			case FLAT:
			case FLOAT:
			case FOR:
			case HIGHP:
			case IF:
			case IIMAGE1D:
			case IIMAGE1DARRAY:
			case IIMAGE2D:
			case IIMAGE2DARRAY:
			case IIMAGE2DMS:
			case IIMAGE2DMSARRAY:
			case IIMAGE2DRECT:
			case IIMAGE3D:
			case IIMAGEBUFFER:
			case IIMAGECUBE:
			case IIMAGECUBEARRAY:
			case IMAGE1D:
			case IMAGE1DARRAY:
			case IMAGE2D:
			case IMAGE2DARRAY:
			case IMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IMAGE2DRECT:
			case IMAGE3D:
			case IMAGEBUFFER:
			case IMAGECUBE:
			case IMAGECUBEARRAY:
			case IN:
			case INOUT:
			case INT:
			case INVARIANT:
			case ISAMPLER1D:
			case ISAMPLER1DARRAY:
			case ISAMPLER2D:
			case ISAMPLER2DARRAY:
			case ISAMPLER2DMS:
			case ISAMPLER2DMSARRAY:
			case ISAMPLER2DRECT:
			case ISAMPLER3D:
			case ISAMPLERBUFFER:
			case ISAMPLERCUBE:
			case ISAMPLERCUBEARRAY:
			case IVEC2:
			case IVEC3:
			case IVEC4:
			case LAYOUT:
			case LOWP:
			case MAT2:
			case MAT2X2:
			case MAT2X3:
			case MAT2X4:
			case MAT3:
			case MAT3X2:
			case MAT3X3:
			case MAT3X4:
			case MAT4:
			case MAT4X2:
			case MAT4X3:
			case MAT4X4:
			case MEDIUMP:
			case NOPERSPECTIVE:
			case OUT:
			case PATCH:
			case PRECISE:
			case PRECISION:
			case READONLY:
			case RESTRICT:
			case RETURN:
			case SAMPLE:
			case SAMPLER1D:
			case SAMPLER1DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER1DSHADOW:
			case SAMPLER2D:
			case SAMPLER2DARRAY:
			case SAMPLER2DARRAYSHADOW:
			case SAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case SAMPLER2DRECT:
			case SAMPLER2DRECTSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLER3D:
			case SAMPLERBUFFER:
			case SAMPLERCUBE:
			case SAMPLERCUBEARRAY:
			case SAMPLERCUBEARRAYSHADOW:
			case SAMPLERCUBESHADOW:
			case SHARED:
			case SMOOTH:
			case STRUCT:
			case SUBROUTINE:
			case SWITCH:
			case TRUE:
			case UIMAGE1D:
			case UIMAGE1DARRAY:
			case UIMAGE2D:
			case UIMAGE2DARRAY:
			case UIMAGE2DMS:
			case UIMAGE2DMSARRAY:
			case UIMAGE2DRECT:
			case UIMAGE3D:
			case UIMAGEBUFFER:
			case UIMAGECUBE:
			case UIMAGECUBEARRAY:
			case UINT:
			case UNIFORM:
			case USAMPLER1D:
			case USAMPLER1DARRAY:
			case USAMPLER2D:
			case USAMPLER2DARRAY:
			case USAMPLER2DMS:
			case USAMPLER2DMSARRAY:
			case USAMPLER2DRECT:
			case USAMPLER3D:
			case USAMPLERBUFFER:
			case USAMPLERCUBE:
			case USAMPLERCUBEARRAY:
			case UVEC2:
			case UVEC3:
			case UVEC4:
			case VEC2:
			case VEC3:
			case VEC4:
			case VOID:
			case VOLATILE:
			case WHILE:
			case WRITEONLY:
			case INT8_T:
			case I8VEC2:
			case I8VEC3:
			case I8VEC4:
			case INT16_T:
			case I16VEC2:
			case I16VEC3:
			case I16VEC4:
			case INT32_T:
			case I32VEC2:
			case I32VEC3:
			case I32VEC4:
			case INT64_T:
			case I64VEC2:
			case I64VEC3:
			case I64VEC4:
			case UINT8_T:
			case U8VEC2:
			case U8VEC3:
			case U8VEC4:
			case UINT16_T:
			case U16VEC2:
			case U16VEC3:
			case U16VEC4:
			case UINT32_T:
			case U32VEC2:
			case U32VEC3:
			case U32VEC4:
			case UINT64_T:
			case U64VEC2:
			case U64VEC3:
			case U64VEC4:
			case FLOAT16_T:
			case F16VEC2:
			case F16VEC3:
			case F16VEC4:
			case FLOAT32_T:
			case F32VEC2:
			case F32VEC3:
			case F32VEC4:
			case FLOAT64_T:
			case F64VEC2:
			case F64VEC3:
			case F64VEC4:
			case AMPERSAND:
			case BANG:
			case DASH:
			case DEC_OP:
			case INC_OP:
			case LEFT_PAREN:
			case PLUS:
			case SEMICOLON:
			case STAR:
			case TILDE:
			case DOUBLECONSTANT:
			case FLOATCONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
				simple_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_statementContext extends ParserRuleContext {
		public Declaration_statementContext declaration_statement() {
			return getRuleContext(Declaration_statementContext.class,0);
		}
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Case_labelContext case_label() {
			return getRuleContext(Case_labelContext.class,0);
		}
		public Iteration_statementContext iteration_statement() {
			return getRuleContext(Iteration_statementContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public Simple_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterSimple_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitSimple_statement(this);
		}
	}

	public final Simple_statementContext simple_statement() throws RecognitionException {
		Simple_statementContext _localctx = new Simple_statementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_simple_statement);
		try {
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				declaration_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				expression_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(750);
				selection_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(751);
				switch_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(752);
				case_label();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(753);
				iteration_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(754);
				jump_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_statementContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(NVIDIAParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(NVIDIAParser.RIGHT_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitCompound_statement(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(LEFT_BRACE);
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << BOOL) | (1L << BREAK) | (1L << BUFFER) | (1L << BVEC2) | (1L << BVEC3) | (1L << BVEC4) | (1L << CASE) | (1L << CENTROID) | (1L << COHERENT) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DISCARD) | (1L << DMAT2) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << DMAT3) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << DMAT4) | (1L << DMAT4X2) | (1L << DMAT4X3) | (1L << DMAT4X4) | (1L << DO) | (1L << DOUBLE) | (1L << DVEC2) | (1L << DVEC3) | (1L << DVEC4) | (1L << FALSE) | (1L << FLAT) | (1L << FLOAT) | (1L << FOR) | (1L << HIGHP) | (1L << IF) | (1L << IIMAGE1D) | (1L << IIMAGE1DARRAY) | (1L << IIMAGE2D) | (1L << IIMAGE2DARRAY) | (1L << IIMAGE2DMS) | (1L << IIMAGE2DMSARRAY) | (1L << IIMAGE2DRECT) | (1L << IIMAGE3D) | (1L << IIMAGEBUFFER) | (1L << IIMAGECUBE) | (1L << IIMAGECUBEARRAY) | (1L << IMAGE1D) | (1L << IMAGE1DARRAY) | (1L << IMAGE2D) | (1L << IMAGE2DARRAY) | (1L << IMAGE2DMS) | (1L << IMAGE2DMSARRAY) | (1L << IMAGE2DRECT) | (1L << IMAGE3D) | (1L << IMAGEBUFFER) | (1L << IMAGECUBE) | (1L << IMAGECUBEARRAY) | (1L << IN) | (1L << INOUT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT - 64)) | (1L << (INVARIANT - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (LAYOUT - 64)) | (1L << (LOWP - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (MAT4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (MEDIUMP - 64)) | (1L << (NOPERSPECTIVE - 64)) | (1L << (OUT - 64)) | (1L << (PATCH - 64)) | (1L << (PRECISE - 64)) | (1L << (PRECISION - 64)) | (1L << (READONLY - 64)) | (1L << (RESTRICT - 64)) | (1L << (RETURN - 64)) | (1L << (SAMPLE - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SHARED - 64)) | (1L << (SMOOTH - 64)) | (1L << (STRUCT - 64)) | (1L << (SUBROUTINE - 64)) | (1L << (SWITCH - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (TRUE - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (UINT - 128)) | (1L << (UNIFORM - 128)) | (1L << (USAMPLER1D - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (UVEC2 - 128)) | (1L << (UVEC3 - 128)) | (1L << (UVEC4 - 128)) | (1L << (VEC2 - 128)) | (1L << (VEC3 - 128)) | (1L << (VEC4 - 128)) | (1L << (VOID - 128)) | (1L << (VOLATILE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITEONLY - 128)) | (1L << (INT8_T - 128)) | (1L << (I8VEC2 - 128)) | (1L << (I8VEC3 - 128)) | (1L << (I8VEC4 - 128)) | (1L << (INT16_T - 128)) | (1L << (I16VEC2 - 128)) | (1L << (I16VEC3 - 128)) | (1L << (I16VEC4 - 128)) | (1L << (INT32_T - 128)) | (1L << (I32VEC2 - 128)) | (1L << (I32VEC3 - 128)) | (1L << (I32VEC4 - 128)) | (1L << (INT64_T - 128)) | (1L << (I64VEC2 - 128)) | (1L << (I64VEC3 - 128)) | (1L << (I64VEC4 - 128)) | (1L << (UINT8_T - 128)) | (1L << (U8VEC2 - 128)) | (1L << (U8VEC3 - 128)) | (1L << (U8VEC4 - 128)) | (1L << (UINT16_T - 128)) | (1L << (U16VEC2 - 128)) | (1L << (U16VEC3 - 128)) | (1L << (U16VEC4 - 128)) | (1L << (UINT32_T - 128)) | (1L << (U32VEC2 - 128)) | (1L << (U32VEC3 - 128)) | (1L << (U32VEC4 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UINT64_T - 192)) | (1L << (U64VEC2 - 192)) | (1L << (U64VEC3 - 192)) | (1L << (U64VEC4 - 192)) | (1L << (FLOAT16_T - 192)) | (1L << (F16VEC2 - 192)) | (1L << (F16VEC3 - 192)) | (1L << (F16VEC4 - 192)) | (1L << (FLOAT32_T - 192)) | (1L << (F32VEC2 - 192)) | (1L << (F32VEC3 - 192)) | (1L << (F32VEC4 - 192)) | (1L << (FLOAT64_T - 192)) | (1L << (F64VEC2 - 192)) | (1L << (F64VEC3 - 192)) | (1L << (F64VEC4 - 192)) | (1L << (AMPERSAND - 192)) | (1L << (BANG - 192)) | (1L << (DASH - 192)) | (1L << (DEC_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (LEFT_BRACE - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (PLUS - 192)) | (1L << (SEMICOLON - 192)) | (1L << (STAR - 192)) | (1L << (TILDE - 192)) | (1L << (DOUBLECONSTANT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (FLOATCONSTANT - 256)) | (1L << (INTCONSTANT - 256)) | (1L << (UINTCONSTANT - 256)) | (1L << (IDENTIFIER - 256)))) != 0)) {
				{
				setState(758);
				statement_list();
				}
			}

			setState(761);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_no_new_scopeContext extends ParserRuleContext {
		public Compound_statement_no_new_scopeContext compound_statement_no_new_scope() {
			return getRuleContext(Compound_statement_no_new_scopeContext.class,0);
		}
		public Simple_statementContext simple_statement() {
			return getRuleContext(Simple_statementContext.class,0);
		}
		public Statement_no_new_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_no_new_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterStatement_no_new_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitStatement_no_new_scope(this);
		}
	}

	public final Statement_no_new_scopeContext statement_no_new_scope() throws RecognitionException {
		Statement_no_new_scopeContext _localctx = new Statement_no_new_scopeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_statement_no_new_scope);
		try {
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				compound_statement_no_new_scope();
				}
				break;
			case ATOMIC_UINT:
			case BOOL:
			case BREAK:
			case BUFFER:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case CASE:
			case CENTROID:
			case COHERENT:
			case CONST:
			case CONTINUE:
			case DEFAULT:
			case DISCARD:
			case DMAT2:
			case DMAT2X2:
			case DMAT2X3:
			case DMAT2X4:
			case DMAT3:
			case DMAT3X2:
			case DMAT3X3:
			case DMAT3X4:
			case DMAT4:
			case DMAT4X2:
			case DMAT4X3:
			case DMAT4X4:
			case DO:
			case DOUBLE:
			case DVEC2:
			case DVEC3:
			case DVEC4:
			case FALSE:
			case FLAT:
			case FLOAT:
			case FOR:
			case HIGHP:
			case IF:
			case IIMAGE1D:
			case IIMAGE1DARRAY:
			case IIMAGE2D:
			case IIMAGE2DARRAY:
			case IIMAGE2DMS:
			case IIMAGE2DMSARRAY:
			case IIMAGE2DRECT:
			case IIMAGE3D:
			case IIMAGEBUFFER:
			case IIMAGECUBE:
			case IIMAGECUBEARRAY:
			case IMAGE1D:
			case IMAGE1DARRAY:
			case IMAGE2D:
			case IMAGE2DARRAY:
			case IMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IMAGE2DRECT:
			case IMAGE3D:
			case IMAGEBUFFER:
			case IMAGECUBE:
			case IMAGECUBEARRAY:
			case IN:
			case INOUT:
			case INT:
			case INVARIANT:
			case ISAMPLER1D:
			case ISAMPLER1DARRAY:
			case ISAMPLER2D:
			case ISAMPLER2DARRAY:
			case ISAMPLER2DMS:
			case ISAMPLER2DMSARRAY:
			case ISAMPLER2DRECT:
			case ISAMPLER3D:
			case ISAMPLERBUFFER:
			case ISAMPLERCUBE:
			case ISAMPLERCUBEARRAY:
			case IVEC2:
			case IVEC3:
			case IVEC4:
			case LAYOUT:
			case LOWP:
			case MAT2:
			case MAT2X2:
			case MAT2X3:
			case MAT2X4:
			case MAT3:
			case MAT3X2:
			case MAT3X3:
			case MAT3X4:
			case MAT4:
			case MAT4X2:
			case MAT4X3:
			case MAT4X4:
			case MEDIUMP:
			case NOPERSPECTIVE:
			case OUT:
			case PATCH:
			case PRECISE:
			case PRECISION:
			case READONLY:
			case RESTRICT:
			case RETURN:
			case SAMPLE:
			case SAMPLER1D:
			case SAMPLER1DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER1DSHADOW:
			case SAMPLER2D:
			case SAMPLER2DARRAY:
			case SAMPLER2DARRAYSHADOW:
			case SAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case SAMPLER2DRECT:
			case SAMPLER2DRECTSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLER3D:
			case SAMPLERBUFFER:
			case SAMPLERCUBE:
			case SAMPLERCUBEARRAY:
			case SAMPLERCUBEARRAYSHADOW:
			case SAMPLERCUBESHADOW:
			case SHARED:
			case SMOOTH:
			case STRUCT:
			case SUBROUTINE:
			case SWITCH:
			case TRUE:
			case UIMAGE1D:
			case UIMAGE1DARRAY:
			case UIMAGE2D:
			case UIMAGE2DARRAY:
			case UIMAGE2DMS:
			case UIMAGE2DMSARRAY:
			case UIMAGE2DRECT:
			case UIMAGE3D:
			case UIMAGEBUFFER:
			case UIMAGECUBE:
			case UIMAGECUBEARRAY:
			case UINT:
			case UNIFORM:
			case USAMPLER1D:
			case USAMPLER1DARRAY:
			case USAMPLER2D:
			case USAMPLER2DARRAY:
			case USAMPLER2DMS:
			case USAMPLER2DMSARRAY:
			case USAMPLER2DRECT:
			case USAMPLER3D:
			case USAMPLERBUFFER:
			case USAMPLERCUBE:
			case USAMPLERCUBEARRAY:
			case UVEC2:
			case UVEC3:
			case UVEC4:
			case VEC2:
			case VEC3:
			case VEC4:
			case VOID:
			case VOLATILE:
			case WHILE:
			case WRITEONLY:
			case INT8_T:
			case I8VEC2:
			case I8VEC3:
			case I8VEC4:
			case INT16_T:
			case I16VEC2:
			case I16VEC3:
			case I16VEC4:
			case INT32_T:
			case I32VEC2:
			case I32VEC3:
			case I32VEC4:
			case INT64_T:
			case I64VEC2:
			case I64VEC3:
			case I64VEC4:
			case UINT8_T:
			case U8VEC2:
			case U8VEC3:
			case U8VEC4:
			case UINT16_T:
			case U16VEC2:
			case U16VEC3:
			case U16VEC4:
			case UINT32_T:
			case U32VEC2:
			case U32VEC3:
			case U32VEC4:
			case UINT64_T:
			case U64VEC2:
			case U64VEC3:
			case U64VEC4:
			case FLOAT16_T:
			case F16VEC2:
			case F16VEC3:
			case F16VEC4:
			case FLOAT32_T:
			case F32VEC2:
			case F32VEC3:
			case F32VEC4:
			case FLOAT64_T:
			case F64VEC2:
			case F64VEC3:
			case F64VEC4:
			case AMPERSAND:
			case BANG:
			case DASH:
			case DEC_OP:
			case INC_OP:
			case LEFT_PAREN:
			case PLUS:
			case SEMICOLON:
			case STAR:
			case TILDE:
			case DOUBLECONSTANT:
			case FLOATCONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				simple_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_statement_no_new_scopeContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(NVIDIAParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(NVIDIAParser.RIGHT_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Compound_statement_no_new_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement_no_new_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterCompound_statement_no_new_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitCompound_statement_no_new_scope(this);
		}
	}

	public final Compound_statement_no_new_scopeContext compound_statement_no_new_scope() throws RecognitionException {
		Compound_statement_no_new_scopeContext _localctx = new Compound_statement_no_new_scopeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_compound_statement_no_new_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(LEFT_BRACE);
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << BOOL) | (1L << BREAK) | (1L << BUFFER) | (1L << BVEC2) | (1L << BVEC3) | (1L << BVEC4) | (1L << CASE) | (1L << CENTROID) | (1L << COHERENT) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DISCARD) | (1L << DMAT2) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << DMAT3) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << DMAT4) | (1L << DMAT4X2) | (1L << DMAT4X3) | (1L << DMAT4X4) | (1L << DO) | (1L << DOUBLE) | (1L << DVEC2) | (1L << DVEC3) | (1L << DVEC4) | (1L << FALSE) | (1L << FLAT) | (1L << FLOAT) | (1L << FOR) | (1L << HIGHP) | (1L << IF) | (1L << IIMAGE1D) | (1L << IIMAGE1DARRAY) | (1L << IIMAGE2D) | (1L << IIMAGE2DARRAY) | (1L << IIMAGE2DMS) | (1L << IIMAGE2DMSARRAY) | (1L << IIMAGE2DRECT) | (1L << IIMAGE3D) | (1L << IIMAGEBUFFER) | (1L << IIMAGECUBE) | (1L << IIMAGECUBEARRAY) | (1L << IMAGE1D) | (1L << IMAGE1DARRAY) | (1L << IMAGE2D) | (1L << IMAGE2DARRAY) | (1L << IMAGE2DMS) | (1L << IMAGE2DMSARRAY) | (1L << IMAGE2DRECT) | (1L << IMAGE3D) | (1L << IMAGEBUFFER) | (1L << IMAGECUBE) | (1L << IMAGECUBEARRAY) | (1L << IN) | (1L << INOUT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT - 64)) | (1L << (INVARIANT - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (LAYOUT - 64)) | (1L << (LOWP - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (MAT4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (MEDIUMP - 64)) | (1L << (NOPERSPECTIVE - 64)) | (1L << (OUT - 64)) | (1L << (PATCH - 64)) | (1L << (PRECISE - 64)) | (1L << (PRECISION - 64)) | (1L << (READONLY - 64)) | (1L << (RESTRICT - 64)) | (1L << (RETURN - 64)) | (1L << (SAMPLE - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SHARED - 64)) | (1L << (SMOOTH - 64)) | (1L << (STRUCT - 64)) | (1L << (SUBROUTINE - 64)) | (1L << (SWITCH - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (TRUE - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (UINT - 128)) | (1L << (UNIFORM - 128)) | (1L << (USAMPLER1D - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (UVEC2 - 128)) | (1L << (UVEC3 - 128)) | (1L << (UVEC4 - 128)) | (1L << (VEC2 - 128)) | (1L << (VEC3 - 128)) | (1L << (VEC4 - 128)) | (1L << (VOID - 128)) | (1L << (VOLATILE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITEONLY - 128)) | (1L << (INT8_T - 128)) | (1L << (I8VEC2 - 128)) | (1L << (I8VEC3 - 128)) | (1L << (I8VEC4 - 128)) | (1L << (INT16_T - 128)) | (1L << (I16VEC2 - 128)) | (1L << (I16VEC3 - 128)) | (1L << (I16VEC4 - 128)) | (1L << (INT32_T - 128)) | (1L << (I32VEC2 - 128)) | (1L << (I32VEC3 - 128)) | (1L << (I32VEC4 - 128)) | (1L << (INT64_T - 128)) | (1L << (I64VEC2 - 128)) | (1L << (I64VEC3 - 128)) | (1L << (I64VEC4 - 128)) | (1L << (UINT8_T - 128)) | (1L << (U8VEC2 - 128)) | (1L << (U8VEC3 - 128)) | (1L << (U8VEC4 - 128)) | (1L << (UINT16_T - 128)) | (1L << (U16VEC2 - 128)) | (1L << (U16VEC3 - 128)) | (1L << (U16VEC4 - 128)) | (1L << (UINT32_T - 128)) | (1L << (U32VEC2 - 128)) | (1L << (U32VEC3 - 128)) | (1L << (U32VEC4 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UINT64_T - 192)) | (1L << (U64VEC2 - 192)) | (1L << (U64VEC3 - 192)) | (1L << (U64VEC4 - 192)) | (1L << (FLOAT16_T - 192)) | (1L << (F16VEC2 - 192)) | (1L << (F16VEC3 - 192)) | (1L << (F16VEC4 - 192)) | (1L << (FLOAT32_T - 192)) | (1L << (F32VEC2 - 192)) | (1L << (F32VEC3 - 192)) | (1L << (F32VEC4 - 192)) | (1L << (FLOAT64_T - 192)) | (1L << (F64VEC2 - 192)) | (1L << (F64VEC3 - 192)) | (1L << (F64VEC4 - 192)) | (1L << (AMPERSAND - 192)) | (1L << (BANG - 192)) | (1L << (DASH - 192)) | (1L << (DEC_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (LEFT_BRACE - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (PLUS - 192)) | (1L << (SEMICOLON - 192)) | (1L << (STAR - 192)) | (1L << (TILDE - 192)) | (1L << (DOUBLECONSTANT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (FLOATCONSTANT - 256)) | (1L << (INTCONSTANT - 256)) | (1L << (UINTCONSTANT - 256)) | (1L << (IDENTIFIER - 256)))) != 0)) {
				{
				setState(768);
				statement_list();
				}
			}

			setState(771);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(773);
				statement();
				}
				}
				setState(776); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << BOOL) | (1L << BREAK) | (1L << BUFFER) | (1L << BVEC2) | (1L << BVEC3) | (1L << BVEC4) | (1L << CASE) | (1L << CENTROID) | (1L << COHERENT) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DISCARD) | (1L << DMAT2) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << DMAT3) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << DMAT4) | (1L << DMAT4X2) | (1L << DMAT4X3) | (1L << DMAT4X4) | (1L << DO) | (1L << DOUBLE) | (1L << DVEC2) | (1L << DVEC3) | (1L << DVEC4) | (1L << FALSE) | (1L << FLAT) | (1L << FLOAT) | (1L << FOR) | (1L << HIGHP) | (1L << IF) | (1L << IIMAGE1D) | (1L << IIMAGE1DARRAY) | (1L << IIMAGE2D) | (1L << IIMAGE2DARRAY) | (1L << IIMAGE2DMS) | (1L << IIMAGE2DMSARRAY) | (1L << IIMAGE2DRECT) | (1L << IIMAGE3D) | (1L << IIMAGEBUFFER) | (1L << IIMAGECUBE) | (1L << IIMAGECUBEARRAY) | (1L << IMAGE1D) | (1L << IMAGE1DARRAY) | (1L << IMAGE2D) | (1L << IMAGE2DARRAY) | (1L << IMAGE2DMS) | (1L << IMAGE2DMSARRAY) | (1L << IMAGE2DRECT) | (1L << IMAGE3D) | (1L << IMAGEBUFFER) | (1L << IMAGECUBE) | (1L << IMAGECUBEARRAY) | (1L << IN) | (1L << INOUT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT - 64)) | (1L << (INVARIANT - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (LAYOUT - 64)) | (1L << (LOWP - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (MAT4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (MEDIUMP - 64)) | (1L << (NOPERSPECTIVE - 64)) | (1L << (OUT - 64)) | (1L << (PATCH - 64)) | (1L << (PRECISE - 64)) | (1L << (PRECISION - 64)) | (1L << (READONLY - 64)) | (1L << (RESTRICT - 64)) | (1L << (RETURN - 64)) | (1L << (SAMPLE - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SHARED - 64)) | (1L << (SMOOTH - 64)) | (1L << (STRUCT - 64)) | (1L << (SUBROUTINE - 64)) | (1L << (SWITCH - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (TRUE - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (UINT - 128)) | (1L << (UNIFORM - 128)) | (1L << (USAMPLER1D - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (UVEC2 - 128)) | (1L << (UVEC3 - 128)) | (1L << (UVEC4 - 128)) | (1L << (VEC2 - 128)) | (1L << (VEC3 - 128)) | (1L << (VEC4 - 128)) | (1L << (VOID - 128)) | (1L << (VOLATILE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITEONLY - 128)) | (1L << (INT8_T - 128)) | (1L << (I8VEC2 - 128)) | (1L << (I8VEC3 - 128)) | (1L << (I8VEC4 - 128)) | (1L << (INT16_T - 128)) | (1L << (I16VEC2 - 128)) | (1L << (I16VEC3 - 128)) | (1L << (I16VEC4 - 128)) | (1L << (INT32_T - 128)) | (1L << (I32VEC2 - 128)) | (1L << (I32VEC3 - 128)) | (1L << (I32VEC4 - 128)) | (1L << (INT64_T - 128)) | (1L << (I64VEC2 - 128)) | (1L << (I64VEC3 - 128)) | (1L << (I64VEC4 - 128)) | (1L << (UINT8_T - 128)) | (1L << (U8VEC2 - 128)) | (1L << (U8VEC3 - 128)) | (1L << (U8VEC4 - 128)) | (1L << (UINT16_T - 128)) | (1L << (U16VEC2 - 128)) | (1L << (U16VEC3 - 128)) | (1L << (U16VEC4 - 128)) | (1L << (UINT32_T - 128)) | (1L << (U32VEC2 - 128)) | (1L << (U32VEC3 - 128)) | (1L << (U32VEC4 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UINT64_T - 192)) | (1L << (U64VEC2 - 192)) | (1L << (U64VEC3 - 192)) | (1L << (U64VEC4 - 192)) | (1L << (FLOAT16_T - 192)) | (1L << (F16VEC2 - 192)) | (1L << (F16VEC3 - 192)) | (1L << (F16VEC4 - 192)) | (1L << (FLOAT32_T - 192)) | (1L << (F32VEC2 - 192)) | (1L << (F32VEC3 - 192)) | (1L << (F32VEC4 - 192)) | (1L << (FLOAT64_T - 192)) | (1L << (F64VEC2 - 192)) | (1L << (F64VEC3 - 192)) | (1L << (F64VEC4 - 192)) | (1L << (AMPERSAND - 192)) | (1L << (BANG - 192)) | (1L << (DASH - 192)) | (1L << (DEC_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (LEFT_BRACE - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (PLUS - 192)) | (1L << (SEMICOLON - 192)) | (1L << (STAR - 192)) | (1L << (TILDE - 192)) | (1L << (DOUBLECONSTANT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (FLOATCONSTANT - 256)) | (1L << (INTCONSTANT - 256)) | (1L << (UINTCONSTANT - 256)) | (1L << (IDENTIFIER - 256)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_statementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(NVIDIAParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitExpression_statement(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_expression_statement);
		try {
			setState(782);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				match(SEMICOLON);
				}
				break;
			case ATOMIC_UINT:
			case BOOL:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case DMAT2:
			case DMAT2X2:
			case DMAT2X3:
			case DMAT2X4:
			case DMAT3:
			case DMAT3X2:
			case DMAT3X3:
			case DMAT3X4:
			case DMAT4:
			case DMAT4X2:
			case DMAT4X3:
			case DMAT4X4:
			case DOUBLE:
			case DVEC2:
			case DVEC3:
			case DVEC4:
			case FALSE:
			case FLOAT:
			case IIMAGE1D:
			case IIMAGE1DARRAY:
			case IIMAGE2D:
			case IIMAGE2DARRAY:
			case IIMAGE2DMS:
			case IIMAGE2DMSARRAY:
			case IIMAGE2DRECT:
			case IIMAGE3D:
			case IIMAGEBUFFER:
			case IIMAGECUBE:
			case IIMAGECUBEARRAY:
			case IMAGE1D:
			case IMAGE1DARRAY:
			case IMAGE2D:
			case IMAGE2DARRAY:
			case IMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IMAGE2DRECT:
			case IMAGE3D:
			case IMAGEBUFFER:
			case IMAGECUBE:
			case IMAGECUBEARRAY:
			case INT:
			case ISAMPLER1D:
			case ISAMPLER1DARRAY:
			case ISAMPLER2D:
			case ISAMPLER2DARRAY:
			case ISAMPLER2DMS:
			case ISAMPLER2DMSARRAY:
			case ISAMPLER2DRECT:
			case ISAMPLER3D:
			case ISAMPLERBUFFER:
			case ISAMPLERCUBE:
			case ISAMPLERCUBEARRAY:
			case IVEC2:
			case IVEC3:
			case IVEC4:
			case LAYOUT:
			case MAT2:
			case MAT2X2:
			case MAT2X3:
			case MAT2X4:
			case MAT3:
			case MAT3X2:
			case MAT3X3:
			case MAT3X4:
			case MAT4:
			case MAT4X2:
			case MAT4X3:
			case MAT4X4:
			case SAMPLER1D:
			case SAMPLER1DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER1DSHADOW:
			case SAMPLER2D:
			case SAMPLER2DARRAY:
			case SAMPLER2DARRAYSHADOW:
			case SAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case SAMPLER2DRECT:
			case SAMPLER2DRECTSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLER3D:
			case SAMPLERBUFFER:
			case SAMPLERCUBE:
			case SAMPLERCUBEARRAY:
			case SAMPLERCUBEARRAYSHADOW:
			case SAMPLERCUBESHADOW:
			case STRUCT:
			case TRUE:
			case UIMAGE1D:
			case UIMAGE1DARRAY:
			case UIMAGE2D:
			case UIMAGE2DARRAY:
			case UIMAGE2DMS:
			case UIMAGE2DMSARRAY:
			case UIMAGE2DRECT:
			case UIMAGE3D:
			case UIMAGEBUFFER:
			case UIMAGECUBE:
			case UIMAGECUBEARRAY:
			case UINT:
			case USAMPLER1D:
			case USAMPLER1DARRAY:
			case USAMPLER2D:
			case USAMPLER2DARRAY:
			case USAMPLER2DMS:
			case USAMPLER2DMSARRAY:
			case USAMPLER2DRECT:
			case USAMPLER3D:
			case USAMPLERBUFFER:
			case USAMPLERCUBE:
			case USAMPLERCUBEARRAY:
			case UVEC2:
			case UVEC3:
			case UVEC4:
			case VEC2:
			case VEC3:
			case VEC4:
			case VOID:
			case INT8_T:
			case I8VEC2:
			case I8VEC3:
			case I8VEC4:
			case INT16_T:
			case I16VEC2:
			case I16VEC3:
			case I16VEC4:
			case INT32_T:
			case I32VEC2:
			case I32VEC3:
			case I32VEC4:
			case INT64_T:
			case I64VEC2:
			case I64VEC3:
			case I64VEC4:
			case UINT8_T:
			case U8VEC2:
			case U8VEC3:
			case U8VEC4:
			case UINT16_T:
			case U16VEC2:
			case U16VEC3:
			case U16VEC4:
			case UINT32_T:
			case U32VEC2:
			case U32VEC3:
			case U32VEC4:
			case UINT64_T:
			case U64VEC2:
			case U64VEC3:
			case U64VEC4:
			case FLOAT16_T:
			case F16VEC2:
			case F16VEC3:
			case F16VEC4:
			case FLOAT32_T:
			case F32VEC2:
			case F32VEC3:
			case F32VEC4:
			case FLOAT64_T:
			case F64VEC2:
			case F64VEC3:
			case F64VEC4:
			case AMPERSAND:
			case BANG:
			case DASH:
			case DEC_OP:
			case INC_OP:
			case LEFT_PAREN:
			case PLUS:
			case STAR:
			case TILDE:
			case DOUBLECONSTANT:
			case FLOATCONSTANT:
			case INTCONSTANT:
			case UINTCONSTANT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				expression(0);
				setState(780);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selection_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(NVIDIAParser.IF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(NVIDIAParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(NVIDIAParser.RIGHT_PAREN, 0); }
		public Selection_rest_statementContext selection_rest_statement() {
			return getRuleContext(Selection_rest_statementContext.class,0);
		}
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterSelection_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitSelection_statement(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_selection_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(IF);
			setState(785);
			match(LEFT_PAREN);
			setState(786);
			expression(0);
			setState(787);
			match(RIGHT_PAREN);
			setState(788);
			selection_rest_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selection_rest_statementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(NVIDIAParser.ELSE, 0); }
		public Selection_rest_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_rest_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterSelection_rest_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitSelection_rest_statement(this);
		}
	}

	public final Selection_rest_statementContext selection_rest_statement() throws RecognitionException {
		Selection_rest_statementContext _localctx = new Selection_rest_statementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_selection_rest_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			statement();
			setState(793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(791);
				match(ELSE);
				setState(792);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Fully_specified_typeContext fully_specified_type() {
			return getRuleContext(Fully_specified_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NVIDIAParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(NVIDIAParser.EQUAL, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_condition);
		try {
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(795);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(796);
				fully_specified_type();
				setState(797);
				match(IDENTIFIER);
				setState(798);
				match(EQUAL);
				setState(799);
				initializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_statementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(NVIDIAParser.SWITCH, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(NVIDIAParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(NVIDIAParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(NVIDIAParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(NVIDIAParser.RIGHT_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitSwitch_statement(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(SWITCH);
			setState(804);
			match(LEFT_PAREN);
			setState(805);
			expression(0);
			setState(806);
			match(RIGHT_PAREN);
			setState(807);
			match(LEFT_BRACE);
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << BOOL) | (1L << BREAK) | (1L << BUFFER) | (1L << BVEC2) | (1L << BVEC3) | (1L << BVEC4) | (1L << CASE) | (1L << CENTROID) | (1L << COHERENT) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DISCARD) | (1L << DMAT2) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << DMAT3) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << DMAT4) | (1L << DMAT4X2) | (1L << DMAT4X3) | (1L << DMAT4X4) | (1L << DO) | (1L << DOUBLE) | (1L << DVEC2) | (1L << DVEC3) | (1L << DVEC4) | (1L << FALSE) | (1L << FLAT) | (1L << FLOAT) | (1L << FOR) | (1L << HIGHP) | (1L << IF) | (1L << IIMAGE1D) | (1L << IIMAGE1DARRAY) | (1L << IIMAGE2D) | (1L << IIMAGE2DARRAY) | (1L << IIMAGE2DMS) | (1L << IIMAGE2DMSARRAY) | (1L << IIMAGE2DRECT) | (1L << IIMAGE3D) | (1L << IIMAGEBUFFER) | (1L << IIMAGECUBE) | (1L << IIMAGECUBEARRAY) | (1L << IMAGE1D) | (1L << IMAGE1DARRAY) | (1L << IMAGE2D) | (1L << IMAGE2DARRAY) | (1L << IMAGE2DMS) | (1L << IMAGE2DMSARRAY) | (1L << IMAGE2DRECT) | (1L << IMAGE3D) | (1L << IMAGEBUFFER) | (1L << IMAGECUBE) | (1L << IMAGECUBEARRAY) | (1L << IN) | (1L << INOUT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT - 64)) | (1L << (INVARIANT - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (LAYOUT - 64)) | (1L << (LOWP - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (MAT4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (MEDIUMP - 64)) | (1L << (NOPERSPECTIVE - 64)) | (1L << (OUT - 64)) | (1L << (PATCH - 64)) | (1L << (PRECISE - 64)) | (1L << (PRECISION - 64)) | (1L << (READONLY - 64)) | (1L << (RESTRICT - 64)) | (1L << (RETURN - 64)) | (1L << (SAMPLE - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SHARED - 64)) | (1L << (SMOOTH - 64)) | (1L << (STRUCT - 64)) | (1L << (SUBROUTINE - 64)) | (1L << (SWITCH - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (TRUE - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (UINT - 128)) | (1L << (UNIFORM - 128)) | (1L << (USAMPLER1D - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (UVEC2 - 128)) | (1L << (UVEC3 - 128)) | (1L << (UVEC4 - 128)) | (1L << (VEC2 - 128)) | (1L << (VEC3 - 128)) | (1L << (VEC4 - 128)) | (1L << (VOID - 128)) | (1L << (VOLATILE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITEONLY - 128)) | (1L << (INT8_T - 128)) | (1L << (I8VEC2 - 128)) | (1L << (I8VEC3 - 128)) | (1L << (I8VEC4 - 128)) | (1L << (INT16_T - 128)) | (1L << (I16VEC2 - 128)) | (1L << (I16VEC3 - 128)) | (1L << (I16VEC4 - 128)) | (1L << (INT32_T - 128)) | (1L << (I32VEC2 - 128)) | (1L << (I32VEC3 - 128)) | (1L << (I32VEC4 - 128)) | (1L << (INT64_T - 128)) | (1L << (I64VEC2 - 128)) | (1L << (I64VEC3 - 128)) | (1L << (I64VEC4 - 128)) | (1L << (UINT8_T - 128)) | (1L << (U8VEC2 - 128)) | (1L << (U8VEC3 - 128)) | (1L << (U8VEC4 - 128)) | (1L << (UINT16_T - 128)) | (1L << (U16VEC2 - 128)) | (1L << (U16VEC3 - 128)) | (1L << (U16VEC4 - 128)) | (1L << (UINT32_T - 128)) | (1L << (U32VEC2 - 128)) | (1L << (U32VEC3 - 128)) | (1L << (U32VEC4 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UINT64_T - 192)) | (1L << (U64VEC2 - 192)) | (1L << (U64VEC3 - 192)) | (1L << (U64VEC4 - 192)) | (1L << (FLOAT16_T - 192)) | (1L << (F16VEC2 - 192)) | (1L << (F16VEC3 - 192)) | (1L << (F16VEC4 - 192)) | (1L << (FLOAT32_T - 192)) | (1L << (F32VEC2 - 192)) | (1L << (F32VEC3 - 192)) | (1L << (F32VEC4 - 192)) | (1L << (FLOAT64_T - 192)) | (1L << (F64VEC2 - 192)) | (1L << (F64VEC3 - 192)) | (1L << (F64VEC4 - 192)) | (1L << (AMPERSAND - 192)) | (1L << (BANG - 192)) | (1L << (DASH - 192)) | (1L << (DEC_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (LEFT_BRACE - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (PLUS - 192)) | (1L << (SEMICOLON - 192)) | (1L << (STAR - 192)) | (1L << (TILDE - 192)) | (1L << (DOUBLECONSTANT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (FLOATCONSTANT - 256)) | (1L << (INTCONSTANT - 256)) | (1L << (UINTCONSTANT - 256)) | (1L << (IDENTIFIER - 256)))) != 0)) {
				{
				setState(808);
				statement_list();
				}
			}

			setState(811);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_labelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(NVIDIAParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(NVIDIAParser.COLON, 0); }
		public TerminalNode DEFAULT() { return getToken(NVIDIAParser.DEFAULT, 0); }
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterCase_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitCase_label(this);
		}
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_case_label);
		try {
			setState(819);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				match(CASE);
				setState(814);
				expression(0);
				setState(815);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				match(DEFAULT);
				setState(818);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Iteration_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(NVIDIAParser.WHILE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(NVIDIAParser.LEFT_PAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(NVIDIAParser.RIGHT_PAREN, 0); }
		public Statement_no_new_scopeContext statement_no_new_scope() {
			return getRuleContext(Statement_no_new_scopeContext.class,0);
		}
		public TerminalNode DO() { return getToken(NVIDIAParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NVIDIAParser.SEMICOLON, 0); }
		public TerminalNode FOR() { return getToken(NVIDIAParser.FOR, 0); }
		public For_init_statementContext for_init_statement() {
			return getRuleContext(For_init_statementContext.class,0);
		}
		public For_rest_statementContext for_rest_statement() {
			return getRuleContext(For_rest_statementContext.class,0);
		}
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterIteration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitIteration_statement(this);
		}
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_iteration_statement);
		try {
			setState(842);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(821);
				match(WHILE);
				setState(822);
				match(LEFT_PAREN);
				setState(823);
				condition();
				setState(824);
				match(RIGHT_PAREN);
				setState(825);
				statement_no_new_scope();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				match(DO);
				setState(828);
				statement();
				setState(829);
				match(WHILE);
				setState(830);
				match(LEFT_PAREN);
				setState(831);
				expression(0);
				setState(832);
				match(RIGHT_PAREN);
				setState(833);
				match(SEMICOLON);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(835);
				match(FOR);
				setState(836);
				match(LEFT_PAREN);
				setState(837);
				for_init_statement();
				setState(838);
				for_rest_statement();
				setState(839);
				match(RIGHT_PAREN);
				setState(840);
				statement_no_new_scope();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_init_statementContext extends ParserRuleContext {
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Declaration_statementContext declaration_statement() {
			return getRuleContext(Declaration_statementContext.class,0);
		}
		public For_init_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterFor_init_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitFor_init_statement(this);
		}
	}

	public final For_init_statementContext for_init_statement() throws RecognitionException {
		For_init_statementContext _localctx = new For_init_statementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_for_init_statement);
		try {
			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				expression_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				declaration_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_rest_statementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(NVIDIAParser.SEMICOLON, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_rest_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_rest_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterFor_rest_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitFor_rest_statement(this);
		}
	}

	public final For_rest_statementContext for_rest_statement() throws RecognitionException {
		For_rest_statementContext _localctx = new For_rest_statementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_for_rest_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << BOOL) | (1L << BUFFER) | (1L << BVEC2) | (1L << BVEC3) | (1L << BVEC4) | (1L << CENTROID) | (1L << COHERENT) | (1L << CONST) | (1L << DMAT2) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << DMAT3) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << DMAT4) | (1L << DMAT4X2) | (1L << DMAT4X3) | (1L << DMAT4X4) | (1L << DOUBLE) | (1L << DVEC2) | (1L << DVEC3) | (1L << DVEC4) | (1L << FALSE) | (1L << FLAT) | (1L << FLOAT) | (1L << HIGHP) | (1L << IIMAGE1D) | (1L << IIMAGE1DARRAY) | (1L << IIMAGE2D) | (1L << IIMAGE2DARRAY) | (1L << IIMAGE2DMS) | (1L << IIMAGE2DMSARRAY) | (1L << IIMAGE2DRECT) | (1L << IIMAGE3D) | (1L << IIMAGEBUFFER) | (1L << IIMAGECUBE) | (1L << IIMAGECUBEARRAY) | (1L << IMAGE1D) | (1L << IMAGE1DARRAY) | (1L << IMAGE2D) | (1L << IMAGE2DARRAY) | (1L << IMAGE2DMS) | (1L << IMAGE2DMSARRAY) | (1L << IMAGE2DRECT) | (1L << IMAGE3D) | (1L << IMAGEBUFFER) | (1L << IMAGECUBE) | (1L << IMAGECUBEARRAY) | (1L << IN) | (1L << INOUT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT - 64)) | (1L << (INVARIANT - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (LAYOUT - 64)) | (1L << (LOWP - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (MAT4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (MEDIUMP - 64)) | (1L << (NOPERSPECTIVE - 64)) | (1L << (OUT - 64)) | (1L << (PATCH - 64)) | (1L << (PRECISE - 64)) | (1L << (READONLY - 64)) | (1L << (RESTRICT - 64)) | (1L << (SAMPLE - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (SHARED - 64)) | (1L << (SMOOTH - 64)) | (1L << (STRUCT - 64)) | (1L << (SUBROUTINE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (TRUE - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (UINT - 128)) | (1L << (UNIFORM - 128)) | (1L << (USAMPLER1D - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (UVEC2 - 128)) | (1L << (UVEC3 - 128)) | (1L << (UVEC4 - 128)) | (1L << (VEC2 - 128)) | (1L << (VEC3 - 128)) | (1L << (VEC4 - 128)) | (1L << (VOID - 128)) | (1L << (VOLATILE - 128)) | (1L << (WRITEONLY - 128)) | (1L << (INT8_T - 128)) | (1L << (I8VEC2 - 128)) | (1L << (I8VEC3 - 128)) | (1L << (I8VEC4 - 128)) | (1L << (INT16_T - 128)) | (1L << (I16VEC2 - 128)) | (1L << (I16VEC3 - 128)) | (1L << (I16VEC4 - 128)) | (1L << (INT32_T - 128)) | (1L << (I32VEC2 - 128)) | (1L << (I32VEC3 - 128)) | (1L << (I32VEC4 - 128)) | (1L << (INT64_T - 128)) | (1L << (I64VEC2 - 128)) | (1L << (I64VEC3 - 128)) | (1L << (I64VEC4 - 128)) | (1L << (UINT8_T - 128)) | (1L << (U8VEC2 - 128)) | (1L << (U8VEC3 - 128)) | (1L << (U8VEC4 - 128)) | (1L << (UINT16_T - 128)) | (1L << (U16VEC2 - 128)) | (1L << (U16VEC3 - 128)) | (1L << (U16VEC4 - 128)) | (1L << (UINT32_T - 128)) | (1L << (U32VEC2 - 128)) | (1L << (U32VEC3 - 128)) | (1L << (U32VEC4 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UINT64_T - 192)) | (1L << (U64VEC2 - 192)) | (1L << (U64VEC3 - 192)) | (1L << (U64VEC4 - 192)) | (1L << (FLOAT16_T - 192)) | (1L << (F16VEC2 - 192)) | (1L << (F16VEC3 - 192)) | (1L << (F16VEC4 - 192)) | (1L << (FLOAT32_T - 192)) | (1L << (F32VEC2 - 192)) | (1L << (F32VEC3 - 192)) | (1L << (F32VEC4 - 192)) | (1L << (FLOAT64_T - 192)) | (1L << (F64VEC2 - 192)) | (1L << (F64VEC3 - 192)) | (1L << (F64VEC4 - 192)) | (1L << (AMPERSAND - 192)) | (1L << (BANG - 192)) | (1L << (DASH - 192)) | (1L << (DEC_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (PLUS - 192)) | (1L << (STAR - 192)) | (1L << (TILDE - 192)) | (1L << (DOUBLECONSTANT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (FLOATCONSTANT - 256)) | (1L << (INTCONSTANT - 256)) | (1L << (UINTCONSTANT - 256)) | (1L << (IDENTIFIER - 256)))) != 0)) {
				{
				setState(848);
				condition();
				}
			}

			setState(851);
			match(SEMICOLON);
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << BOOL) | (1L << BVEC2) | (1L << BVEC3) | (1L << BVEC4) | (1L << DMAT2) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << DMAT3) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << DMAT4) | (1L << DMAT4X2) | (1L << DMAT4X3) | (1L << DMAT4X4) | (1L << DOUBLE) | (1L << DVEC2) | (1L << DVEC3) | (1L << DVEC4) | (1L << FALSE) | (1L << FLOAT) | (1L << IIMAGE1D) | (1L << IIMAGE1DARRAY) | (1L << IIMAGE2D) | (1L << IIMAGE2DARRAY) | (1L << IIMAGE2DMS) | (1L << IIMAGE2DMSARRAY) | (1L << IIMAGE2DRECT) | (1L << IIMAGE3D) | (1L << IIMAGEBUFFER) | (1L << IIMAGECUBE) | (1L << IIMAGECUBEARRAY) | (1L << IMAGE1D) | (1L << IMAGE1DARRAY) | (1L << IMAGE2D) | (1L << IMAGE2DARRAY) | (1L << IMAGE2DMS) | (1L << IMAGE2DMSARRAY) | (1L << IMAGE2DRECT) | (1L << IMAGE3D) | (1L << IMAGEBUFFER) | (1L << IMAGECUBE) | (1L << IMAGECUBEARRAY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (LAYOUT - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (MAT4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (STRUCT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (TRUE - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (UINT - 128)) | (1L << (USAMPLER1D - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (UVEC2 - 128)) | (1L << (UVEC3 - 128)) | (1L << (UVEC4 - 128)) | (1L << (VEC2 - 128)) | (1L << (VEC3 - 128)) | (1L << (VEC4 - 128)) | (1L << (VOID - 128)) | (1L << (INT8_T - 128)) | (1L << (I8VEC2 - 128)) | (1L << (I8VEC3 - 128)) | (1L << (I8VEC4 - 128)) | (1L << (INT16_T - 128)) | (1L << (I16VEC2 - 128)) | (1L << (I16VEC3 - 128)) | (1L << (I16VEC4 - 128)) | (1L << (INT32_T - 128)) | (1L << (I32VEC2 - 128)) | (1L << (I32VEC3 - 128)) | (1L << (I32VEC4 - 128)) | (1L << (INT64_T - 128)) | (1L << (I64VEC2 - 128)) | (1L << (I64VEC3 - 128)) | (1L << (I64VEC4 - 128)) | (1L << (UINT8_T - 128)) | (1L << (U8VEC2 - 128)) | (1L << (U8VEC3 - 128)) | (1L << (U8VEC4 - 128)) | (1L << (UINT16_T - 128)) | (1L << (U16VEC2 - 128)) | (1L << (U16VEC3 - 128)) | (1L << (U16VEC4 - 128)) | (1L << (UINT32_T - 128)) | (1L << (U32VEC2 - 128)) | (1L << (U32VEC3 - 128)) | (1L << (U32VEC4 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UINT64_T - 192)) | (1L << (U64VEC2 - 192)) | (1L << (U64VEC3 - 192)) | (1L << (U64VEC4 - 192)) | (1L << (FLOAT16_T - 192)) | (1L << (F16VEC2 - 192)) | (1L << (F16VEC3 - 192)) | (1L << (F16VEC4 - 192)) | (1L << (FLOAT32_T - 192)) | (1L << (F32VEC2 - 192)) | (1L << (F32VEC3 - 192)) | (1L << (F32VEC4 - 192)) | (1L << (FLOAT64_T - 192)) | (1L << (F64VEC2 - 192)) | (1L << (F64VEC3 - 192)) | (1L << (F64VEC4 - 192)) | (1L << (AMPERSAND - 192)) | (1L << (BANG - 192)) | (1L << (DASH - 192)) | (1L << (DEC_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (PLUS - 192)) | (1L << (STAR - 192)) | (1L << (TILDE - 192)) | (1L << (DOUBLECONSTANT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (FLOATCONSTANT - 256)) | (1L << (INTCONSTANT - 256)) | (1L << (UINTCONSTANT - 256)) | (1L << (IDENTIFIER - 256)))) != 0)) {
				{
				setState(852);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jump_statementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(NVIDIAParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(NVIDIAParser.SEMICOLON, 0); }
		public TerminalNode BREAK() { return getToken(NVIDIAParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(NVIDIAParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DISCARD() { return getToken(NVIDIAParser.DISCARD, 0); }
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterJump_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitJump_statement(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_jump_statement);
		int _la;
		try {
			setState(866);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(855);
				match(CONTINUE);
				setState(856);
				match(SEMICOLON);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(857);
				match(BREAK);
				setState(858);
				match(SEMICOLON);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(859);
				match(RETURN);
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATOMIC_UINT) | (1L << BOOL) | (1L << BVEC2) | (1L << BVEC3) | (1L << BVEC4) | (1L << DMAT2) | (1L << DMAT2X2) | (1L << DMAT2X3) | (1L << DMAT2X4) | (1L << DMAT3) | (1L << DMAT3X2) | (1L << DMAT3X3) | (1L << DMAT3X4) | (1L << DMAT4) | (1L << DMAT4X2) | (1L << DMAT4X3) | (1L << DMAT4X4) | (1L << DOUBLE) | (1L << DVEC2) | (1L << DVEC3) | (1L << DVEC4) | (1L << FALSE) | (1L << FLOAT) | (1L << IIMAGE1D) | (1L << IIMAGE1DARRAY) | (1L << IIMAGE2D) | (1L << IIMAGE2DARRAY) | (1L << IIMAGE2DMS) | (1L << IIMAGE2DMSARRAY) | (1L << IIMAGE2DRECT) | (1L << IIMAGE3D) | (1L << IIMAGEBUFFER) | (1L << IIMAGECUBE) | (1L << IIMAGECUBEARRAY) | (1L << IMAGE1D) | (1L << IMAGE1DARRAY) | (1L << IMAGE2D) | (1L << IMAGE2DARRAY) | (1L << IMAGE2DMS) | (1L << IMAGE2DMSARRAY) | (1L << IMAGE2DRECT) | (1L << IMAGE3D) | (1L << IMAGEBUFFER) | (1L << IMAGECUBE) | (1L << IMAGECUBEARRAY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT - 64)) | (1L << (ISAMPLER1D - 64)) | (1L << (ISAMPLER1DARRAY - 64)) | (1L << (ISAMPLER2D - 64)) | (1L << (ISAMPLER2DARRAY - 64)) | (1L << (ISAMPLER2DMS - 64)) | (1L << (ISAMPLER2DMSARRAY - 64)) | (1L << (ISAMPLER2DRECT - 64)) | (1L << (ISAMPLER3D - 64)) | (1L << (ISAMPLERBUFFER - 64)) | (1L << (ISAMPLERCUBE - 64)) | (1L << (ISAMPLERCUBEARRAY - 64)) | (1L << (IVEC2 - 64)) | (1L << (IVEC3 - 64)) | (1L << (IVEC4 - 64)) | (1L << (LAYOUT - 64)) | (1L << (MAT2 - 64)) | (1L << (MAT2X2 - 64)) | (1L << (MAT2X3 - 64)) | (1L << (MAT2X4 - 64)) | (1L << (MAT3 - 64)) | (1L << (MAT3X2 - 64)) | (1L << (MAT3X3 - 64)) | (1L << (MAT3X4 - 64)) | (1L << (MAT4 - 64)) | (1L << (MAT4X2 - 64)) | (1L << (MAT4X3 - 64)) | (1L << (MAT4X4 - 64)) | (1L << (SAMPLER1D - 64)) | (1L << (SAMPLER1DARRAY - 64)) | (1L << (SAMPLER1DARRAYSHADOW - 64)) | (1L << (SAMPLER1DSHADOW - 64)) | (1L << (SAMPLER2D - 64)) | (1L << (SAMPLER2DARRAY - 64)) | (1L << (SAMPLER2DARRAYSHADOW - 64)) | (1L << (SAMPLER2DMS - 64)) | (1L << (SAMPLER2DMSARRAY - 64)) | (1L << (SAMPLER2DRECT - 64)) | (1L << (SAMPLER2DRECTSHADOW - 64)) | (1L << (SAMPLER2DSHADOW - 64)) | (1L << (SAMPLER3D - 64)) | (1L << (SAMPLERBUFFER - 64)) | (1L << (SAMPLERCUBE - 64)) | (1L << (SAMPLERCUBEARRAY - 64)) | (1L << (SAMPLERCUBEARRAYSHADOW - 64)) | (1L << (SAMPLERCUBESHADOW - 64)) | (1L << (STRUCT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (TRUE - 128)) | (1L << (UIMAGE1D - 128)) | (1L << (UIMAGE1DARRAY - 128)) | (1L << (UIMAGE2D - 128)) | (1L << (UIMAGE2DARRAY - 128)) | (1L << (UIMAGE2DMS - 128)) | (1L << (UIMAGE2DMSARRAY - 128)) | (1L << (UIMAGE2DRECT - 128)) | (1L << (UIMAGE3D - 128)) | (1L << (UIMAGEBUFFER - 128)) | (1L << (UIMAGECUBE - 128)) | (1L << (UIMAGECUBEARRAY - 128)) | (1L << (UINT - 128)) | (1L << (USAMPLER1D - 128)) | (1L << (USAMPLER1DARRAY - 128)) | (1L << (USAMPLER2D - 128)) | (1L << (USAMPLER2DARRAY - 128)) | (1L << (USAMPLER2DMS - 128)) | (1L << (USAMPLER2DMSARRAY - 128)) | (1L << (USAMPLER2DRECT - 128)) | (1L << (USAMPLER3D - 128)) | (1L << (USAMPLERBUFFER - 128)) | (1L << (USAMPLERCUBE - 128)) | (1L << (USAMPLERCUBEARRAY - 128)) | (1L << (UVEC2 - 128)) | (1L << (UVEC3 - 128)) | (1L << (UVEC4 - 128)) | (1L << (VEC2 - 128)) | (1L << (VEC3 - 128)) | (1L << (VEC4 - 128)) | (1L << (VOID - 128)) | (1L << (INT8_T - 128)) | (1L << (I8VEC2 - 128)) | (1L << (I8VEC3 - 128)) | (1L << (I8VEC4 - 128)) | (1L << (INT16_T - 128)) | (1L << (I16VEC2 - 128)) | (1L << (I16VEC3 - 128)) | (1L << (I16VEC4 - 128)) | (1L << (INT32_T - 128)) | (1L << (I32VEC2 - 128)) | (1L << (I32VEC3 - 128)) | (1L << (I32VEC4 - 128)) | (1L << (INT64_T - 128)) | (1L << (I64VEC2 - 128)) | (1L << (I64VEC3 - 128)) | (1L << (I64VEC4 - 128)) | (1L << (UINT8_T - 128)) | (1L << (U8VEC2 - 128)) | (1L << (U8VEC3 - 128)) | (1L << (U8VEC4 - 128)) | (1L << (UINT16_T - 128)) | (1L << (U16VEC2 - 128)) | (1L << (U16VEC3 - 128)) | (1L << (U16VEC4 - 128)) | (1L << (UINT32_T - 128)) | (1L << (U32VEC2 - 128)) | (1L << (U32VEC3 - 128)) | (1L << (U32VEC4 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UINT64_T - 192)) | (1L << (U64VEC2 - 192)) | (1L << (U64VEC3 - 192)) | (1L << (U64VEC4 - 192)) | (1L << (FLOAT16_T - 192)) | (1L << (F16VEC2 - 192)) | (1L << (F16VEC3 - 192)) | (1L << (F16VEC4 - 192)) | (1L << (FLOAT32_T - 192)) | (1L << (F32VEC2 - 192)) | (1L << (F32VEC3 - 192)) | (1L << (F32VEC4 - 192)) | (1L << (FLOAT64_T - 192)) | (1L << (F64VEC2 - 192)) | (1L << (F64VEC3 - 192)) | (1L << (F64VEC4 - 192)) | (1L << (AMPERSAND - 192)) | (1L << (BANG - 192)) | (1L << (DASH - 192)) | (1L << (DEC_OP - 192)) | (1L << (INC_OP - 192)) | (1L << (LEFT_PAREN - 192)) | (1L << (PLUS - 192)) | (1L << (STAR - 192)) | (1L << (TILDE - 192)) | (1L << (DOUBLECONSTANT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (FLOATCONSTANT - 256)) | (1L << (INTCONSTANT - 256)) | (1L << (UINTCONSTANT - 256)) | (1L << (IDENTIFIER - 256)))) != 0)) {
					{
					setState(860);
					expression(0);
					}
				}

				setState(863);
				match(SEMICOLON);
				}
				break;
			case DISCARD:
				enterOuterAlt(_localctx, 4);
				{
				setState(864);
				match(DISCARD);
				setState(865);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class External_declarationContext extends ParserRuleContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NVIDIAParser.SEMICOLON, 0); }
		public External_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterExternal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitExternal_declaration(this);
		}
	}

	public final External_declarationContext external_declaration() throws RecognitionException {
		External_declarationContext _localctx = new External_declarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_external_declaration);
		try {
			setState(871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				function_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(870);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definitionContext extends ParserRuleContext {
		public Function_prototypeContext function_prototype() {
			return getRuleContext(Function_prototypeContext.class,0);
		}
		public Compound_statement_no_new_scopeContext compound_statement_no_new_scope() {
			return getRuleContext(Compound_statement_no_new_scopeContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAParserListener ) ((NVIDIAParserListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			function_prototype();
			setState(874);
			compound_statement_no_new_scope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		case 14:
			return binary_expression_sempred((Binary_expressionContext)_localctx, predIndex);
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean binary_expression_sempred(Binary_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u013e\u036f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\7\2\u0092\n\2\f\2\16\2\u0095\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a6\n\4\3\5\3\5\3\5\5\5\u00ab\n\5\3\5\3"+
		"\5\3\5\5\5\u00b0\n\5\3\5\3\5\5\5\u00b4\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u00be\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00c8\n\5\f\5\16"+
		"\5\u00cb\13\5\3\6\3\6\5\6\u00cf\n\6\3\7\3\7\3\b\3\b\3\b\5\b\u00d6\n\b"+
		"\3\b\3\b\3\t\3\t\5\t\u00dc\n\t\3\n\3\n\3\n\7\n\u00e1\n\n\f\n\16\n\u00e4"+
		"\13\n\3\n\5\n\u00e7\n\n\3\13\3\13\3\13\5\13\u00ec\n\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00f2\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00fc\n\f\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u0105\n\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\7\20\u012d\n\20\f\20\16\20\u0130\13\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\7\21\u0138\n\21\f\21\16\21\u013b\13\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0144\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0158\n\23\5\23\u015a\n\23\3\23\3\23\3\23\3\23\5\23\u0160\n\23\3"+
		"\23\3\23\5\23\u0164\n\23\3\24\3\24\3\24\7\24\u0169\n\24\f\24\16\24\u016c"+
		"\13\24\3\25\3\25\3\25\3\25\5\25\u0172\n\25\3\25\3\25\3\26\3\26\3\26\7"+
		"\26\u0179\n\26\f\26\16\26\u017c\13\26\3\27\3\27\5\27\u0180\n\27\3\27\3"+
		"\27\5\27\u0184\n\27\3\30\3\30\3\30\5\30\u0189\n\30\3\30\3\30\5\30\u018d"+
		"\n\30\3\31\3\31\3\32\3\32\3\32\7\32\u0194\n\32\f\32\16\32\u0197\13\32"+
		"\3\33\3\33\5\33\u019b\n\33\3\34\3\34\5\34\u019f\n\34\3\34\3\34\5\34\u01a3"+
		"\n\34\3\35\3\35\5\35\u01a7\n\35\3\35\3\35\3\35\5\35\u01ac\n\35\5\35\u01ae"+
		"\n\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\7!\u01bc\n!\f!\16!\u01bf"+
		"\13!\3\"\3\"\3\"\5\"\u01c4\n\"\3\"\5\"\u01c7\n\"\3#\3#\3$\3$\5$\u01cd"+
		"\n$\6$\u01cf\n$\r$\16$\u01d0\3%\6%\u01d4\n%\r%\16%\u01d5\3&\3&\3&\3&\3"+
		"&\3&\5&\u01de\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01f4\n\'\5\'\u01f6\n\'\3(\3(\3(\7(\u01fb"+
		"\n(\f(\16(\u01fe\13(\3)\3)\3*\3*\5*\u0204\n*\3+\6+\u0207\n+\r+\16+\u0208"+
		"\3,\3,\5,\u020d\n,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u02b6\n-\3.\3.\3/\3/\5/\u02bc"+
		"\n/\3/\3/\3/\3/\3\60\6\60\u02c3\n\60\r\60\16\60\u02c4\3\61\3\61\3\61\3"+
		"\61\3\62\3\62\3\62\7\62\u02ce\n\62\f\62\16\62\u02d1\13\62\3\63\3\63\5"+
		"\63\u02d5\n\63\3\64\3\64\3\64\3\64\5\64\u02db\n\64\3\64\3\64\5\64\u02df"+
		"\n\64\3\65\3\65\3\65\7\65\u02e4\n\65\f\65\16\65\u02e7\13\65\3\66\3\66"+
		"\3\67\3\67\5\67\u02ed\n\67\38\38\38\38\38\38\38\58\u02f6\n8\39\39\59\u02fa"+
		"\n9\39\39\3:\3:\5:\u0300\n:\3;\3;\5;\u0304\n;\3;\3;\3<\6<\u0309\n<\r<"+
		"\16<\u030a\3=\3=\3=\3=\5=\u0311\n=\3>\3>\3>\3>\3>\3>\3?\3?\3?\5?\u031c"+
		"\n?\3@\3@\3@\3@\3@\3@\5@\u0324\n@\3A\3A\3A\3A\3A\3A\5A\u032c\nA\3A\3A"+
		"\3B\3B\3B\3B\3B\3B\5B\u0336\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\3C\3C\3C\3C\3C\3C\5C\u034d\nC\3D\3D\5D\u0351\nD\3E\5E\u0354\nE"+
		"\3E\3E\5E\u0358\nE\3F\3F\3F\3F\3F\3F\5F\u0360\nF\3F\3F\3F\5F\u0365\nF"+
		"\3G\3G\3G\5G\u036a\nG\3H\3H\3H\3H\2\5\b\36 I\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\2\f\3\2\u00dd\u00de"+
		"\b\2\u00d3\u00d3\u00d6\u00d6\u00da\u00da\u00f1\u00f1\u00fb\u00fb\u00fd"+
		"\u00fd\f\2\u00d2\u00d2\u00d4\u00d4\u00dc\u00dc\u00e0\u00e0\u00e5\u00e5"+
		"\u00ea\u00eb\u00ee\u00ee\u00f4\u00f4\u00fc\u00fc\u00ff\u00ff\4\2\u00f0"+
		"\u00f0\u00fa\u00fb\4\2\u00da\u00da\u00f1\u00f1\4\2\u00e8\u00e8\u00f7\u00f7"+
		"\5\2\u00e1\u00e1\u00e3\u00e4\u00f3\u00f3\4\2\u00df\u00df\u00ec\u00ec\5"+
		"\2%%aa~~\5\2((SS``\2\u044b\2\u0093\3\2\2\2\4\u0098\3\2\2\2\6\u00a5\3\2"+
		"\2\2\b\u00b3\3\2\2\2\n\u00ce\3\2\2\2\f\u00d0\3\2\2\2\16\u00d2\3\2\2\2"+
		"\20\u00db\3\2\2\2\22\u00e6\3\2\2\2\24\u00f1\3\2\2\2\26\u00fb\3\2\2\2\30"+
		"\u00fd\3\2\2\2\32\u0104\3\2\2\2\34\u0106\3\2\2\2\36\u0108\3\2\2\2 \u0131"+
		"\3\2\2\2\"\u0143\3\2\2\2$\u0163\3\2\2\2&\u0165\3\2\2\2(\u016d\3\2\2\2"+
		"*\u0175\3\2\2\2,\u017d\3\2\2\2.\u018c\3\2\2\2\60\u018e\3\2\2\2\62\u0190"+
		"\3\2\2\2\64\u0198\3\2\2\2\66\u019c\3\2\2\28\u01ad\3\2\2\2:\u01af\3\2\2"+
		"\2<\u01b1\3\2\2\2>\u01b3\3\2\2\2@\u01b8\3\2\2\2B\u01c6\3\2\2\2D\u01c8"+
		"\3\2\2\2F\u01ce\3\2\2\2H\u01d3\3\2\2\2J\u01dd\3\2\2\2L\u01f5\3\2\2\2N"+
		"\u01f7\3\2\2\2P\u01ff\3\2\2\2R\u0201\3\2\2\2T\u0206\3\2\2\2V\u020a\3\2"+
		"\2\2X\u02b5\3\2\2\2Z\u02b7\3\2\2\2\\\u02b9\3\2\2\2^\u02c2\3\2\2\2`\u02c6"+
		"\3\2\2\2b\u02ca\3\2\2\2d\u02d2\3\2\2\2f\u02de\3\2\2\2h\u02e0\3\2\2\2j"+
		"\u02e8\3\2\2\2l\u02ec\3\2\2\2n\u02f5\3\2\2\2p\u02f7\3\2\2\2r\u02ff\3\2"+
		"\2\2t\u0301\3\2\2\2v\u0308\3\2\2\2x\u0310\3\2\2\2z\u0312\3\2\2\2|\u0318"+
		"\3\2\2\2~\u0323\3\2\2\2\u0080\u0325\3\2\2\2\u0082\u0335\3\2\2\2\u0084"+
		"\u034c\3\2\2\2\u0086\u0350\3\2\2\2\u0088\u0353\3\2\2\2\u008a\u0364\3\2"+
		"\2\2\u008c\u0369\3\2\2\2\u008e\u036b\3\2\2\2\u0090\u0092\5\u008cG\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\2\2\3\u0097"+
		"\3\3\2\2\2\u0098\u0099\7\u0108\2\2\u0099\5\3\2\2\2\u009a\u00a6\5\4\3\2"+
		"\u009b\u00a6\7\u0082\2\2\u009c\u00a6\7$\2\2\u009d\u00a6\7\u0103\2\2\u009e"+
		"\u00a6\7\u0104\2\2\u009f\u00a6\7\u0102\2\2\u00a0\u00a6\7\u0101\2\2\u00a1"+
		"\u00a2\7\u00e9\2\2\u00a2\u00a3\5 \21\2\u00a3\u00a4\7\u00f8\2\2\u00a4\u00a6"+
		"\3\2\2\2\u00a5\u009a\3\2\2\2\u00a5\u009b\3\2\2\2\u00a5\u009c\3\2\2\2\u00a5"+
		"\u009d\3\2\2\2\u00a5\u009e\3\2\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a0\3\2"+
		"\2\2\u00a5\u00a1\3\2\2\2\u00a6\7\3\2\2\2\u00a7\u00a8\b\5\1\2\u00a8\u00b4"+
		"\5\6\4\2\u00a9\u00ab\5> \2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\5R*\2\u00ad\u00af\7\u00e9\2\2\u00ae\u00b0\5"+
		"\22\n\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\7\u00f8\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00a7\3\2\2\2\u00b3\u00aa"+
		"\3\2\2\2\u00b4\u00c9\3\2\2\2\u00b5\u00b6\f\b\2\2\u00b6\u00b7\7\u00e7\2"+
		"\2\u00b7\u00b8\5\f\7\2\u00b8\u00b9\7\u00f6\2\2\u00b9\u00c8\3\2\2\2\u00ba"+
		"\u00bb\f\7\2\2\u00bb\u00bd\7\u00e9\2\2\u00bc\u00be\5\22\n\2\u00bd\u00bc"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c8\7\u00f8\2"+
		"\2\u00c0\u00c1\f\5\2\2\u00c1\u00c2\t\2\2\2\u00c2\u00c8\5\n\6\2\u00c3\u00c4"+
		"\f\4\2\2\u00c4\u00c8\7\u00e2\2\2\u00c5\u00c6\f\3\2\2\u00c6\u00c8\7\u00db"+
		"\2\2\u00c7\u00b5\3\2\2\2\u00c7\u00ba\3\2\2\2\u00c7\u00c0\3\2\2\2\u00c7"+
		"\u00c3\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\t\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf"+
		"\5\4\3\2\u00cd\u00cf\5\16\b\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2"+
		"\u00cf\13\3\2\2\2\u00d0\u00d1\5 \21\2\u00d1\r\3\2\2\2\u00d2\u00d3\5\20"+
		"\t\2\u00d3\u00d5\7\u00e9\2\2\u00d4\u00d6\5\22\n\2\u00d5\u00d4\3\2\2\2"+
		"\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\u00f8\2\2\u00d8"+
		"\17\3\2\2\2\u00d9\u00dc\5R*\2\u00da\u00dc\5\b\5\2\u00db\u00d9\3\2\2\2"+
		"\u00db\u00da\3\2\2\2\u00dc\21\3\2\2\2\u00dd\u00e2\5\32\16\2\u00de\u00df"+
		"\7\u00d9\2\2\u00df\u00e1\5\32\16\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e7\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e7\7\u00a2\2\2\u00e6\u00dd\3\2\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e7\23\3\2\2\2\u00e8\u00e9\7\u00e9\2\2\u00e9\u00eb\5X-\2\u00ea"+
		"\u00ec\5F$\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2"+
		"\2\u00ed\u00ee\7\u00f8\2\2\u00ee\u00ef\5\24\13\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00f2\5\26\f\2\u00f1\u00e8\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\25\3\2\2"+
		"\2\u00f3\u00fc\5\b\5\2\u00f4\u00f5\7\u00e2\2\2\u00f5\u00fc\5\26\f\2\u00f6"+
		"\u00f7\7\u00db\2\2\u00f7\u00fc\5\26\f\2\u00f8\u00f9\5\30\r\2\u00f9\u00fa"+
		"\5\24\13\2\u00fa\u00fc\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fb\u00f4\3\2\2\2"+
		"\u00fb\u00f6\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fc\27\3\2\2\2\u00fd\u00fe"+
		"\t\3\2\2\u00fe\31\3\2\2\2\u00ff\u0105\5\"\22\2\u0100\u0101\5\26\f\2\u0101"+
		"\u0102\5\34\17\2\u0102\u0103\5\32\16\2\u0103\u0105\3\2\2\2\u0104\u00ff"+
		"\3\2\2\2\u0104\u0100\3\2\2\2\u0105\33\3\2\2\2\u0106\u0107\t\4\2\2\u0107"+
		"\35\3\2\2\2\u0108\u0109\b\20\1\2\u0109\u010a\5\24\13\2\u010a\u012e\3\2"+
		"\2\2\u010b\u010c\f\r\2\2\u010c\u010d\t\5\2\2\u010d\u012d\5\36\20\16\u010e"+
		"\u010f\f\f\2\2\u010f\u0110\t\6\2\2\u0110\u012d\5\36\20\r\u0111\u0112\f"+
		"\13\2\2\u0112\u0113\t\7\2\2\u0113\u012d\5\36\20\f\u0114\u0115\f\n\2\2"+
		"\u0115\u0116\t\b\2\2\u0116\u012d\5\36\20\13\u0117\u0118\f\t\2\2\u0118"+
		"\u0119\t\t\2\2\u0119\u012d\5\36\20\n\u011a\u011b\f\b\2\2\u011b\u011c\7"+
		"\u00d3\2\2\u011c\u012d\5\36\20\t\u011d\u011e\f\7\2\2\u011e\u011f\7\u00d7"+
		"\2\2\u011f\u012d\5\36\20\b\u0120\u0121\f\6\2\2\u0121\u0122\7\u00fe\2\2"+
		"\u0122\u012d\5\36\20\7\u0123\u0124\f\5\2\2\u0124\u0125\7\u00d5\2\2\u0125"+
		"\u012d\5\36\20\6\u0126\u0127\f\4\2\2\u0127\u0128\7\u0100\2\2\u0128\u012d"+
		"\5\36\20\5\u0129\u012a\f\3\2\2\u012a\u012b\7\u00ef\2\2\u012b\u012d\5\36"+
		"\20\4\u012c\u010b\3\2\2\2\u012c\u010e\3\2\2\2\u012c\u0111\3\2\2\2\u012c"+
		"\u0114\3\2\2\2\u012c\u0117\3\2\2\2\u012c\u011a\3\2\2\2\u012c\u011d\3\2"+
		"\2\2\u012c\u0120\3\2\2\2\u012c\u0123\3\2\2\2\u012c\u0126\3\2\2\2\u012c"+
		"\u0129\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\37\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\b\21\1\2\u0132\u0133"+
		"\5\32\16\2\u0133\u0139\3\2\2\2\u0134\u0135\f\3\2\2\u0135\u0136\7\u00d9"+
		"\2\2\u0136\u0138\5\32\16\2\u0137\u0134\3\2\2\2\u0138\u013b\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a!\3\2\2\2\u013b\u0139\3\2\2\2"+
		"\u013c\u0144\5\36\20\2\u013d\u013e\5\36\20\2\u013e\u013f\7\u00f2\2\2\u013f"+
		"\u0140\5 \21\2\u0140\u0141\7\u00d8\2\2\u0141\u0142\5\32\16\2\u0142\u0144"+
		"\3\2\2\2\u0143\u013c\3\2\2\2\u0143\u013d\3\2\2\2\u0144#\3\2\2\2\u0145"+
		"\u0146\5(\25\2\u0146\u0147\7\u00f9\2\2\u0147\u0164\3\2\2\2\u0148\u0149"+
		"\5\62\32\2\u0149\u014a\7\u00f9\2\2\u014a\u0164\3\2\2\2\u014b\u014c\7e"+
		"\2\2\u014c\u014d\5Z.\2\u014d\u014e\5R*\2\u014e\u014f\7\u00f9\2\2\u014f"+
		"\u0164\3\2\2\2\u0150\u0151\5H%\2\u0151\u0152\7\u0108\2\2\u0152\u0153\7"+
		"\u00e6\2\2\u0153\u0154\5^\60\2\u0154\u0159\7\u00f5\2\2\u0155\u0157\7\u0108"+
		"\2\2\u0156\u0158\5T+\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a"+
		"\3\2\2\2\u0159\u0155\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015c\7\u00f9\2\2\u015c\u0164\3\2\2\2\u015d\u015f\5H%\2\u015e\u0160\5"+
		"&\24\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\7\u00f9\2\2\u0162\u0164\3\2\2\2\u0163\u0145\3\2\2\2\u0163\u0148"+
		"\3\2\2\2\u0163\u014b\3\2\2\2\u0163\u0150\3\2\2\2\u0163\u015d\3\2\2\2\u0164"+
		"%\3\2\2\2\u0165\u016a\7\u0108\2\2\u0166\u0167\7\u00d9\2\2\u0167\u0169"+
		"\7\u0108\2\2\u0168\u0166\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2"+
		"\2\u016a\u016b\3\2\2\2\u016b\'\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e"+
		"\58\35\2\u016e\u016f\7\u0108\2\2\u016f\u0171\7\u00e9\2\2\u0170\u0172\5"+
		"*\26\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\7\u00f8\2\2\u0174)\3\2\2\2\u0175\u017a\5.\30\2\u0176\u0177\7\u00d9"+
		"\2\2\u0177\u0179\5.\30\2\u0178\u0176\3\2\2\2\u0179\u017c\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b+\3\2\2\2\u017c\u017a\3\2\2\2"+
		"\u017d\u017f\5R*\2\u017e\u0180\5F$\2\u017f\u017e\3\2\2\2\u017f\u0180\3"+
		"\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\7\u0108\2\2\u0182\u0184\5T+\2\u0183"+
		"\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184-\3\2\2\2\u0185\u0188\5H%\2\u0186"+
		"\u0189\5,\27\2\u0187\u0189\5\60\31\2\u0188\u0186\3\2\2\2\u0188\u0187\3"+
		"\2\2\2\u0189\u018d\3\2\2\2\u018a\u018d\5,\27\2\u018b\u018d\5\60\31\2\u018c"+
		"\u0185\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018b\3\2\2\2\u018d/\3\2\2\2"+
		"\u018e\u018f\5R*\2\u018f\61\3\2\2\2\u0190\u0195\5\64\33\2\u0191\u0192"+
		"\7\u00d9\2\2\u0192\u0194\5\66\34\2\u0193\u0191\3\2\2\2\u0194\u0197\3\2"+
		"\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\63\3\2\2\2\u0197\u0195"+
		"\3\2\2\2\u0198\u019a\58\35\2\u0199\u019b\5\66\34\2\u019a\u0199\3\2\2\2"+
		"\u019a\u019b\3\2\2\2\u019b\65\3\2\2\2\u019c\u019e\7\u0108\2\2\u019d\u019f"+
		"\5T+\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0"+
		"\u01a1\7\u00e0\2\2\u01a1\u01a3\5f\64\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3"+
		"\3\2\2\2\u01a3\67\3\2\2\2\u01a4\u01a6\5R*\2\u01a5\u01a7\5F$\2\u01a6\u01a5"+
		"\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01ae\3\2\2\2\u01a8\u01a9\5H%\2\u01a9"+
		"\u01ab\5R*\2\u01aa\u01ac\5F$\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2"+
		"\u01ac\u01ae\3\2\2\2\u01ad\u01a4\3\2\2\2\u01ad\u01a8\3\2\2\2\u01ae9\3"+
		"\2\2\2\u01af\u01b0\7C\2\2\u01b0;\3\2\2\2\u01b1\u01b2\t\n\2\2\u01b2=\3"+
		"\2\2\2\u01b3\u01b4\7R\2\2\u01b4\u01b5\7\u00e9\2\2\u01b5\u01b6\5@!\2\u01b6"+
		"\u01b7\7\u00f8\2\2\u01b7?\3\2\2\2\u01b8\u01bd\5B\"\2\u01b9\u01ba\7\u00d9"+
		"\2\2\u01ba\u01bc\5B\"\2\u01bb\u01b9\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd"+
		"\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01beA\3\2\2\2\u01bf\u01bd\3\2\2\2"+
		"\u01c0\u01c3\7\u0108\2\2\u01c1\u01c2\7\u00e0\2\2\u01c2\u01c4\5\"\22\2"+
		"\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c7"+
		"\7}\2\2\u01c6\u01c0\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7C\3\2\2\2\u01c8\u01c9"+
		"\7d\2\2\u01c9E\3\2\2\2\u01ca\u01cc\7\u00fb\2\2\u01cb\u01cd\5H%\2\u01cc"+
		"\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01ca\3\2"+
		"\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"G\3\2\2\2\u01d2\u01d4\5J&\2\u01d3\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6I\3\2\2\2\u01d7\u01de\5L\'\2\u01d8"+
		"\u01de\5> \2\u01d9\u01de\5Z.\2\u01da\u01de\5<\37\2\u01db\u01de\5:\36\2"+
		"\u01dc\u01de\5D#\2\u01dd\u01d7\3\2\2\2\u01dd\u01d8\3\2\2\2\u01dd\u01d9"+
		"\3\2\2\2\u01dd\u01da\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01de"+
		"K\3\2\2\2\u01df\u01f6\7\16\2\2\u01e0\u01f6\7@\2\2\u01e1\u01f6\7b\2\2\u01e2"+
		"\u01f6\7A\2\2\u01e3\u01f6\7\f\2\2\u01e4\u01f6\7c\2\2\u01e5\u01f6\7i\2"+
		"\2\u01e6\u01f6\7\u008f\2\2\u01e7\u01f6\7\7\2\2\u01e8\u01f6\7}\2\2\u01e9"+
		"\u01f6\7\r\2\2\u01ea\u01f6\7\u00a3\2\2\u01eb\u01f6\7g\2\2\u01ec\u01f6"+
		"\7f\2\2\u01ed\u01f6\7\u00a5\2\2\u01ee\u01f3\7\u0080\2\2\u01ef\u01f0\7"+
		"\u00e9\2\2\u01f0\u01f1\5N(\2\u01f1\u01f2\7\u00f8\2\2\u01f2\u01f4\3\2\2"+
		"\2\u01f3\u01ef\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01df"+
		"\3\2\2\2\u01f5\u01e0\3\2\2\2\u01f5\u01e1\3\2\2\2\u01f5\u01e2\3\2\2\2\u01f5"+
		"\u01e3\3\2\2\2\u01f5\u01e4\3\2\2\2\u01f5\u01e5\3\2\2\2\u01f5\u01e6\3\2"+
		"\2\2\u01f5\u01e7\3\2\2\2\u01f5\u01e8\3\2\2\2\u01f5\u01e9\3\2\2\2\u01f5"+
		"\u01ea\3\2\2\2\u01f5\u01eb\3\2\2\2\u01f5\u01ec\3\2\2\2\u01f5\u01ed\3\2"+
		"\2\2\u01f5\u01ee\3\2\2\2\u01f6M\3\2\2\2\u01f7\u01fc\5P)\2\u01f8\u01f9"+
		"\7\u00d9\2\2\u01f9\u01fb\5P)\2\u01fa\u01f8\3\2\2\2\u01fb\u01fe\3\2\2\2"+
		"\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fdO\3\2\2\2\u01fe\u01fc\3"+
		"\2\2\2\u01ff\u0200\7\u0108\2\2\u0200Q\3\2\2\2\u0201\u0203\5X-\2\u0202"+
		"\u0204\5T+\2\u0203\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204S\3\2\2\2\u0205"+
		"\u0207\5V,\2\u0206\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0206\3\2\2"+
		"\2\u0208\u0209\3\2\2\2\u0209U\3\2\2\2\u020a\u020c\7\u00e7\2\2\u020b\u020d"+
		"\5\"\22\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2"+
		"\u020e\u020f\7\u00f6\2\2\u020fW\3\2\2\2\u0210\u02b6\7\u00a2\2\2\u0211"+
		"\u02b6\7&\2\2\u0212\u02b6\7\37\2\2\u0213\u02b6\7B\2\2\u0214\u02b6\7\u008e"+
		"\2\2\u0215\u02b6\7\5\2\2\u0216\u02b6\7\u009f\2\2\u0217\u02b6\7\u00a0\2"+
		"\2\u0218\u02b6\7\u00a1\2\2\u0219\u02b6\7 \2\2\u021a\u02b6\7!\2\2\u021b"+
		"\u02b6\7\"\2\2\u021c\u02b6\7\b\2\2\u021d\u02b6\7\t\2\2\u021e\u02b6\7\n"+
		"\2\2\u021f\u02b6\7O\2\2\u0220\u02b6\7P\2\2\u0221\u02b6\7Q\2\2\u0222\u02b6"+
		"\7\u009b\2\2\u0223\u02b6\7\u009c\2\2\u0224\u02b6\7\u009d\2\2\u0225\u02b6"+
		"\7T\2\2\u0226\u02b6\7X\2\2\u0227\u02b6\7\\\2\2\u0228\u02b6\7U\2\2\u0229"+
		"\u02b6\7V\2\2\u022a\u02b6\7W\2\2\u022b\u02b6\7Y\2\2\u022c\u02b6\7Z\2\2"+
		"\u022d\u02b6\7[\2\2\u022e\u02b6\7]\2\2\u022f\u02b6\7^\2\2\u0230\u02b6"+
		"\7_\2\2\u0231\u02b6\7\22\2\2\u0232\u02b6\7\26\2\2\u0233\u02b6\7\32\2\2"+
		"\u0234\u02b6\7\23\2\2\u0235\u02b6\7\24\2\2\u0236\u02b6\7\25\2\2\u0237"+
		"\u02b6\7\27\2\2\u0238\u02b6\7\30\2\2\u0239\u02b6\7\31\2\2\u023a\u02b6"+
		"\7\33\2\2\u023b\u02b6\7\34\2\2\u023c\u02b6\7\35\2\2\u023d\u02b6\7\3\2"+
		"\2\u023e\u02b6\7n\2\2\u023f\u02b6\7v\2\2\u0240\u02b6\7x\2\2\u0241\u02b6"+
		"\7u\2\2\u0242\u02b6\7{\2\2\u0243\u02b6\7o\2\2\u0244\u02b6\7p\2\2\u0245"+
		"\u02b6\7y\2\2\u0246\u02b6\7z\2\2\u0247\u02b6\7F\2\2\u0248\u02b6\7K\2\2"+
		"\u0249\u02b6\7M\2\2\u024a\u02b6\7G\2\2\u024b\u02b6\7N\2\2\u024c\u02b6"+
		"\7\u0092\2\2\u024d\u02b6\7\u0097\2\2\u024e\u02b6\7\u0099\2\2\u024f\u02b6"+
		"\7\u0093\2\2\u0250\u02b6\7\u009a\2\2\u0251\u02b6\7j\2\2\u0252\u02b6\7"+
		"m\2\2\u0253\u02b6\7k\2\2\u0254\u02b6\7l\2\2\u0255\u02b6\7D\2\2\u0256\u02b6"+
		"\7E\2\2\u0257\u02b6\7\u0090\2\2\u0258\u02b6\7\u0091\2\2\u0259\u02b6\7"+
		"s\2\2\u025a\u02b6\7t\2\2\u025b\u02b6\7J\2\2\u025c\u02b6\7\u0096\2\2\u025d"+
		"\u02b6\7w\2\2\u025e\u02b6\7L\2\2\u025f\u02b6\7\u0098\2\2\u0260\u02b6\7"+
		"q\2\2\u0261\u02b6\7H\2\2\u0262\u02b6\7\u0094\2\2\u0263\u02b6\7r\2\2\u0264"+
		"\u02b6\7I\2\2\u0265\u02b6\7\u0095\2\2\u0266\u02b6\7\67\2\2\u0267\u02b6"+
		"\7,\2\2\u0268\u02b6\7\u0085\2\2\u0269\u02b6\7<\2\2\u026a\u02b6\7\61\2"+
		"\2\u026b\u02b6\7\u008a\2\2\u026c\u02b6\7>\2\2\u026d\u02b6\7\63\2\2\u026e"+
		"\u02b6\7\u008c\2\2\u026f\u02b6\7=\2\2\u0270\u02b6\7\62\2\2\u0271\u02b6"+
		"\7\u008b\2\2\u0272\u02b6\7\65\2\2\u0273\u02b6\7*\2\2\u0274\u02b6\7\u0083"+
		"\2\2\u0275\u02b6\7\66\2\2\u0276\u02b6\7+\2\2\u0277\u02b6\7\u0084\2\2\u0278"+
		"\u02b6\7;\2\2\u0279\u02b6\7\60\2\2\u027a\u02b6\7\u0089\2\2\u027b\u02b6"+
		"\78\2\2\u027c\u02b6\7-\2\2\u027d\u02b6\7\u0086\2\2\u027e\u02b6\7?\2\2"+
		"\u027f\u02b6\7\64\2\2\u0280\u02b6\7\u008d\2\2\u0281\u02b6\79\2\2\u0282"+
		"\u02b6\7.\2\2\u0283\u02b6\7\u0087\2\2\u0284\u02b6\7:\2\2\u0285\u02b6\7"+
		"/\2\2\u0286\u02b6\7\u0088\2\2\u0287\u02b6\7\u00a6\2\2\u0288\u02b6\7\u00a7"+
		"\2\2\u0289\u02b6\7\u00a8\2\2\u028a\u02b6\7\u00a9\2\2\u028b\u02b6\7\u00aa"+
		"\2\2\u028c\u02b6\7\u00ab\2\2\u028d\u02b6\7\u00ac\2\2\u028e\u02b6\7\u00ad"+
		"\2\2\u028f\u02b6\7\u00ae\2\2\u0290\u02b6\7\u00af\2\2\u0291\u02b6\7\u00b0"+
		"\2\2\u0292\u02b6\7\u00b1\2\2\u0293\u02b6\7\u00b2\2\2\u0294\u02b6\7\u00b3"+
		"\2\2\u0295\u02b6\7\u00b4\2\2\u0296\u02b6\7\u00b5\2\2\u0297\u02b6\7\u00b6"+
		"\2\2\u0298\u02b6\7\u00b7\2\2\u0299\u02b6\7\u00b8\2\2\u029a\u02b6\7\u00b9"+
		"\2\2\u029b\u02b6\7\u00ba\2\2\u029c\u02b6\7\u00bb\2\2\u029d\u02b6\7\u00bc"+
		"\2\2\u029e\u02b6\7\u00bd\2\2\u029f\u02b6\7\u00be\2\2\u02a0\u02b6\7\u00bf"+
		"\2\2\u02a1\u02b6\7\u00c0\2\2\u02a2\u02b6\7\u00c1\2\2\u02a3\u02b6\7\u00c2"+
		"\2\2\u02a4\u02b6\7\u00c3\2\2\u02a5\u02b6\7\u00c4\2\2\u02a6\u02b6\7\u00c5"+
		"\2\2\u02a7\u02b6\7\u00c6\2\2\u02a8\u02b6\7\u00c7\2\2\u02a9\u02b6\7\u00c8"+
		"\2\2\u02aa\u02b6\7\u00c9\2\2\u02ab\u02b6\7\u00ca\2\2\u02ac\u02b6\7\u00cb"+
		"\2\2\u02ad\u02b6\7\u00cc\2\2\u02ae\u02b6\7\u00cd\2\2\u02af\u02b6\7\u00ce"+
		"\2\2\u02b0\u02b6\7\u00cf\2\2\u02b1\u02b6\7\u00d0\2\2\u02b2\u02b6\7\u00d1"+
		"\2\2\u02b3\u02b6\5\\/\2\u02b4\u02b6\5P)\2\u02b5\u0210\3\2\2\2\u02b5\u0211"+
		"\3\2\2\2\u02b5\u0212\3\2\2\2\u02b5\u0213\3\2\2\2\u02b5\u0214\3\2\2\2\u02b5"+
		"\u0215\3\2\2\2\u02b5\u0216\3\2\2\2\u02b5\u0217\3\2\2\2\u02b5\u0218\3\2"+
		"\2\2\u02b5\u0219\3\2\2\2\u02b5\u021a\3\2\2\2\u02b5\u021b\3\2\2\2\u02b5"+
		"\u021c\3\2\2\2\u02b5\u021d\3\2\2\2\u02b5\u021e\3\2\2\2\u02b5\u021f\3\2"+
		"\2\2\u02b5\u0220\3\2\2\2\u02b5\u0221\3\2\2\2\u02b5\u0222\3\2\2\2\u02b5"+
		"\u0223\3\2\2\2\u02b5\u0224\3\2\2\2\u02b5\u0225\3\2\2\2\u02b5\u0226\3\2"+
		"\2\2\u02b5\u0227\3\2\2\2\u02b5\u0228\3\2\2\2\u02b5\u0229\3\2\2\2\u02b5"+
		"\u022a\3\2\2\2\u02b5\u022b\3\2\2\2\u02b5\u022c\3\2\2\2\u02b5\u022d\3\2"+
		"\2\2\u02b5\u022e\3\2\2\2\u02b5\u022f\3\2\2\2\u02b5\u0230\3\2\2\2\u02b5"+
		"\u0231\3\2\2\2\u02b5\u0232\3\2\2\2\u02b5\u0233\3\2\2\2\u02b5\u0234\3\2"+
		"\2\2\u02b5\u0235\3\2\2\2\u02b5\u0236\3\2\2\2\u02b5\u0237\3\2\2\2\u02b5"+
		"\u0238\3\2\2\2\u02b5\u0239\3\2\2\2\u02b5\u023a\3\2\2\2\u02b5\u023b\3\2"+
		"\2\2\u02b5\u023c\3\2\2\2\u02b5\u023d\3\2\2\2\u02b5\u023e\3\2\2\2\u02b5"+
		"\u023f\3\2\2\2\u02b5\u0240\3\2\2\2\u02b5\u0241\3\2\2\2\u02b5\u0242\3\2"+
		"\2\2\u02b5\u0243\3\2\2\2\u02b5\u0244\3\2\2\2\u02b5\u0245\3\2\2\2\u02b5"+
		"\u0246\3\2\2\2\u02b5\u0247\3\2\2\2\u02b5\u0248\3\2\2\2\u02b5\u0249\3\2"+
		"\2\2\u02b5\u024a\3\2\2\2\u02b5\u024b\3\2\2\2\u02b5\u024c\3\2\2\2\u02b5"+
		"\u024d\3\2\2\2\u02b5\u024e\3\2\2\2\u02b5\u024f\3\2\2\2\u02b5\u0250\3\2"+
		"\2\2\u02b5\u0251\3\2\2\2\u02b5\u0252\3\2\2\2\u02b5\u0253\3\2\2\2\u02b5"+
		"\u0254\3\2\2\2\u02b5\u0255\3\2\2\2\u02b5\u0256\3\2\2\2\u02b5\u0257\3\2"+
		"\2\2\u02b5\u0258\3\2\2\2\u02b5\u0259\3\2\2\2\u02b5\u025a\3\2\2\2\u02b5"+
		"\u025b\3\2\2\2\u02b5\u025c\3\2\2\2\u02b5\u025d\3\2\2\2\u02b5\u025e\3\2"+
		"\2\2\u02b5\u025f\3\2\2\2\u02b5\u0260\3\2\2\2\u02b5\u0261\3\2\2\2\u02b5"+
		"\u0262\3\2\2\2\u02b5\u0263\3\2\2\2\u02b5\u0264\3\2\2\2\u02b5\u0265\3\2"+
		"\2\2\u02b5\u0266\3\2\2\2\u02b5\u0267\3\2\2\2\u02b5\u0268\3\2\2\2\u02b5"+
		"\u0269\3\2\2\2\u02b5\u026a\3\2\2\2\u02b5\u026b\3\2\2\2\u02b5\u026c\3\2"+
		"\2\2\u02b5\u026d\3\2\2\2\u02b5\u026e\3\2\2\2\u02b5\u026f\3\2\2\2\u02b5"+
		"\u0270\3\2\2\2\u02b5\u0271\3\2\2\2\u02b5\u0272\3\2\2\2\u02b5\u0273\3\2"+
		"\2\2\u02b5\u0274\3\2\2\2\u02b5\u0275\3\2\2\2\u02b5\u0276\3\2\2\2\u02b5"+
		"\u0277\3\2\2\2\u02b5\u0278\3\2\2\2\u02b5\u0279\3\2\2\2\u02b5\u027a\3\2"+
		"\2\2\u02b5\u027b\3\2\2\2\u02b5\u027c\3\2\2\2\u02b5\u027d\3\2\2\2\u02b5"+
		"\u027e\3\2\2\2\u02b5\u027f\3\2\2\2\u02b5\u0280\3\2\2\2\u02b5\u0281\3\2"+
		"\2\2\u02b5\u0282\3\2\2\2\u02b5\u0283\3\2\2\2\u02b5\u0284\3\2\2\2\u02b5"+
		"\u0285\3\2\2\2\u02b5\u0286\3\2\2\2\u02b5\u0287\3\2\2\2\u02b5\u0288\3\2"+
		"\2\2\u02b5\u0289\3\2\2\2\u02b5\u028a\3\2\2\2\u02b5\u028b\3\2\2\2\u02b5"+
		"\u028c\3\2\2\2\u02b5\u028d\3\2\2\2\u02b5\u028e\3\2\2\2\u02b5\u028f\3\2"+
		"\2\2\u02b5\u0290\3\2\2\2\u02b5\u0291\3\2\2\2\u02b5\u0292\3\2\2\2\u02b5"+
		"\u0293\3\2\2\2\u02b5\u0294\3\2\2\2\u02b5\u0295\3\2\2\2\u02b5\u0296\3\2"+
		"\2\2\u02b5\u0297\3\2\2\2\u02b5\u0298\3\2\2\2\u02b5\u0299\3\2\2\2\u02b5"+
		"\u029a\3\2\2\2\u02b5\u029b\3\2\2\2\u02b5\u029c\3\2\2\2\u02b5\u029d\3\2"+
		"\2\2\u02b5\u029e\3\2\2\2\u02b5\u029f\3\2\2\2\u02b5\u02a0\3\2\2\2\u02b5"+
		"\u02a1\3\2\2\2\u02b5\u02a2\3\2\2\2\u02b5\u02a3\3\2\2\2\u02b5\u02a4\3\2"+
		"\2\2\u02b5\u02a5\3\2\2\2\u02b5\u02a6\3\2\2\2\u02b5\u02a7\3\2\2\2\u02b5"+
		"\u02a8\3\2\2\2\u02b5\u02a9\3\2\2\2\u02b5\u02aa\3\2\2\2\u02b5\u02ab\3\2"+
		"\2\2\u02b5\u02ac\3\2\2\2\u02b5\u02ad\3\2\2\2\u02b5\u02ae\3\2\2\2\u02b5"+
		"\u02af\3\2\2\2\u02b5\u02b0\3\2\2\2\u02b5\u02b1\3\2\2\2\u02b5\u02b2\3\2"+
		"\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b4\3\2\2\2\u02b6Y\3\2\2\2\u02b7\u02b8"+
		"\t\13\2\2\u02b8[\3\2\2\2\u02b9\u02bb\7\177\2\2\u02ba\u02bc\7\u0108\2\2"+
		"\u02bb\u02ba\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be"+
		"\7\u00e6\2\2\u02be\u02bf\5^\60\2\u02bf\u02c0\7\u00f5\2\2\u02c0]\3\2\2"+
		"\2\u02c1\u02c3\5`\61\2\u02c2\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c2"+
		"\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5_\3\2\2\2\u02c6\u02c7\58\35\2\u02c7"+
		"\u02c8\5b\62\2\u02c8\u02c9\7\u00f9\2\2\u02c9a\3\2\2\2\u02ca\u02cf\5d\63"+
		"\2\u02cb\u02cc\7\u00d9\2\2\u02cc\u02ce\5d\63\2\u02cd\u02cb\3\2\2\2\u02ce"+
		"\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0c\3\2\2\2"+
		"\u02d1\u02cf\3\2\2\2\u02d2\u02d4\7\u0108\2\2\u02d3\u02d5\5T+\2\u02d4\u02d3"+
		"\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5e\3\2\2\2\u02d6\u02df\5\32\16\2\u02d7"+
		"\u02d8\7\u00e6\2\2\u02d8\u02da\5h\65\2\u02d9\u02db\7\u00d9\2\2\u02da\u02d9"+
		"\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\7\u00f5\2"+
		"\2\u02dd\u02df\3\2\2\2\u02de\u02d6\3\2\2\2\u02de\u02d7\3\2\2\2\u02dfg"+
		"\3\2\2\2\u02e0\u02e5\5f\64\2\u02e1\u02e2\7\u00d9\2\2\u02e2\u02e4\5f\64"+
		"\2\u02e3\u02e1\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5\u02e6"+
		"\3\2\2\2\u02e6i\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02e9\5$\23\2\u02e9"+
		"k\3\2\2\2\u02ea\u02ed\5p9\2\u02eb\u02ed\5n8\2\u02ec\u02ea\3\2\2\2\u02ec"+
		"\u02eb\3\2\2\2\u02edm\3\2\2\2\u02ee\u02f6\5j\66\2\u02ef\u02f6\5x=\2\u02f0"+
		"\u02f6\5z>\2\u02f1\u02f6\5\u0080A\2\u02f2\u02f6\5\u0082B\2\u02f3\u02f6"+
		"\5\u0084C\2\u02f4\u02f6\5\u008aF\2\u02f5\u02ee\3\2\2\2\u02f5\u02ef\3\2"+
		"\2\2\u02f5\u02f0\3\2\2\2\u02f5\u02f1\3\2\2\2\u02f5\u02f2\3\2\2\2\u02f5"+
		"\u02f3\3\2\2\2\u02f5\u02f4\3\2\2\2\u02f6o\3\2\2\2\u02f7\u02f9\7\u00e6"+
		"\2\2\u02f8\u02fa\5v<\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb"+
		"\3\2\2\2\u02fb\u02fc\7\u00f5\2\2\u02fcq\3\2\2\2\u02fd\u0300\5t;\2\u02fe"+
		"\u0300\5n8\2\u02ff\u02fd\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300s\3\2\2\2\u0301"+
		"\u0303\7\u00e6\2\2\u0302\u0304\5v<\2\u0303\u0302\3\2\2\2\u0303\u0304\3"+
		"\2\2\2\u0304\u0305\3\2\2\2\u0305\u0306\7\u00f5\2\2\u0306u\3\2\2\2\u0307"+
		"\u0309\5l\67\2\u0308\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u0308\3\2"+
		"\2\2\u030a\u030b\3\2\2\2\u030bw\3\2\2\2\u030c\u0311\7\u00f9\2\2\u030d"+
		"\u030e\5 \21\2\u030e\u030f\7\u00f9\2\2\u030f\u0311\3\2\2\2\u0310\u030c"+
		"\3\2\2\2\u0310\u030d\3\2\2\2\u0311y\3\2\2\2\u0312\u0313\7)\2\2\u0313\u0314"+
		"\7\u00e9\2\2\u0314\u0315\5 \21\2\u0315\u0316\7\u00f8\2\2\u0316\u0317\5"+
		"|?\2\u0317{\3\2\2\2\u0318\u031b\5l\67\2\u0319\u031a\7#\2\2\u031a\u031c"+
		"\5l\67\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c}\3\2\2\2\u031d"+
		"\u0324\5 \21\2\u031e\u031f\58\35\2\u031f\u0320\7\u0108\2\2\u0320\u0321"+
		"\7\u00e0\2\2\u0321\u0322\5f\64\2\u0322\u0324\3\2\2\2\u0323\u031d\3\2\2"+
		"\2\u0323\u031e\3\2\2\2\u0324\177\3\2\2\2\u0325\u0326\7\u0081\2\2\u0326"+
		"\u0327\7\u00e9\2\2\u0327\u0328\5 \21\2\u0328\u0329\7\u00f8\2\2\u0329\u032b"+
		"\7\u00e6\2\2\u032a\u032c\5v<\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2"+
		"\u032c\u032d\3\2\2\2\u032d\u032e\7\u00f5\2\2\u032e\u0081\3\2\2\2\u032f"+
		"\u0330\7\13\2\2\u0330\u0331\5 \21\2\u0331\u0332\7\u00d8\2\2\u0332\u0336"+
		"\3\2\2\2\u0333\u0334\7\20\2\2\u0334\u0336\7\u00d8\2\2\u0335\u032f\3\2"+
		"\2\2\u0335\u0333\3\2\2\2\u0336\u0083\3\2\2\2\u0337\u0338\7\u00a4\2\2\u0338"+
		"\u0339\7\u00e9\2\2\u0339\u033a\5~@\2\u033a\u033b\7\u00f8\2\2\u033b\u033c"+
		"\5r:\2\u033c\u034d\3\2\2\2\u033d\u033e\7\36\2\2\u033e\u033f\5l\67\2\u033f"+
		"\u0340\7\u00a4\2\2\u0340\u0341\7\u00e9\2\2\u0341\u0342\5 \21\2\u0342\u0343"+
		"\7\u00f8\2\2\u0343\u0344\7\u00f9\2\2\u0344\u034d\3\2\2\2\u0345\u0346\7"+
		"\'\2\2\u0346\u0347\7\u00e9\2\2\u0347\u0348\5\u0086D\2\u0348\u0349\5\u0088"+
		"E\2\u0349\u034a\7\u00f8\2\2\u034a\u034b\5r:\2\u034b\u034d\3\2\2\2\u034c"+
		"\u0337\3\2\2\2\u034c\u033d\3\2\2\2\u034c\u0345\3\2\2\2\u034d\u0085\3\2"+
		"\2\2\u034e\u0351\5x=\2\u034f\u0351\5j\66\2\u0350\u034e\3\2\2\2\u0350\u034f"+
		"\3\2\2\2\u0351\u0087\3\2\2\2\u0352\u0354\5~@\2\u0353\u0352\3\2\2\2\u0353"+
		"\u0354\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0357\7\u00f9\2\2\u0356\u0358"+
		"\5 \21\2\u0357\u0356\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0089\3\2\2\2\u0359"+
		"\u035a\7\17\2\2\u035a\u0365\7\u00f9\2\2\u035b\u035c\7\6\2\2\u035c\u0365"+
		"\7\u00f9\2\2\u035d\u035f\7h\2\2\u035e\u0360\5 \21\2\u035f\u035e\3\2\2"+
		"\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0365\7\u00f9\2\2\u0362"+
		"\u0363\7\21\2\2\u0363\u0365\7\u00f9\2\2\u0364\u0359\3\2\2\2\u0364\u035b"+
		"\3\2\2\2\u0364\u035d\3\2\2\2\u0364\u0362\3\2\2\2\u0365\u008b\3\2\2\2\u0366"+
		"\u036a\5\u008eH\2\u0367\u036a\5$\23\2\u0368\u036a\7\u00f9\2\2\u0369\u0366"+
		"\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u0368\3\2\2\2\u036a\u008d\3\2\2\2\u036b"+
		"\u036c\5(\25\2\u036c\u036d\5t;\2\u036d\u008f\3\2\2\2P\u0093\u00a5\u00aa"+
		"\u00af\u00b3\u00bd\u00c7\u00c9\u00ce\u00d5\u00db\u00e2\u00e6\u00eb\u00f1"+
		"\u00fb\u0104\u012c\u012e\u0139\u0143\u0157\u0159\u015f\u0163\u016a\u0171"+
		"\u017a\u017f\u0183\u0188\u018c\u0195\u019a\u019e\u01a2\u01a6\u01ab\u01ad"+
		"\u01bd\u01c3\u01c6\u01cc\u01d0\u01d5\u01dd\u01f3\u01f5\u01fc\u0203\u0208"+
		"\u020c\u02b5\u02bb\u02c4\u02cf\u02d4\u02da\u02de\u02e5\u02ec\u02f5\u02f9"+
		"\u02ff\u0303\u030a\u0310\u031b\u0323\u032b\u0335\u034c\u0350\u0353\u0357"+
		"\u035f\u0364\u0369";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}