// Generated from testNVIDIA\NVIDIAPreParser.g4 by ANTLR 4.9.3
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
public class NVIDIAPreParser extends Parser {
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
		RULE_translation_unit = 0, RULE_compiler_directive = 1, RULE_behavior = 2, 
		RULE_constant_expression = 3, RULE_define_directive = 4, RULE_elif_directive = 5, 
		RULE_else_directive = 6, RULE_endif_directive = 7, RULE_error_directive = 8, 
		RULE_error_message = 9, RULE_extension_directive = 10, RULE_extension_name = 11, 
		RULE_group_of_lines = 12, RULE_if_directive = 13, RULE_ifdef_directive = 14, 
		RULE_ifndef_directive = 15, RULE_line_directive = 16, RULE_line_expression = 17, 
		RULE_macro_esc_newline = 18, RULE_macro_identifier = 19, RULE_macro_name = 20, 
		RULE_macro_text = 21, RULE_macro_text_ = 22, RULE_number = 23, RULE_off = 24, 
		RULE_on = 25, RULE_pragma_debug = 26, RULE_pragma_directive = 27, RULE_pragma_optimize = 28, 
		RULE_profile = 29, RULE_program_text = 30, RULE_stdgl = 31, RULE_undef_directive = 32, 
		RULE_version_directive = 33, RULE_include_directive = 34, RULE_glsl_file_name = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"translation_unit", "compiler_directive", "behavior", "constant_expression", 
			"define_directive", "elif_directive", "else_directive", "endif_directive", 
			"error_directive", "error_message", "extension_directive", "extension_name", 
			"group_of_lines", "if_directive", "ifdef_directive", "ifndef_directive", 
			"line_directive", "line_expression", "macro_esc_newline", "macro_identifier", 
			"macro_name", "macro_text", "macro_text_", "number", "off", "on", "pragma_debug", 
			"pragma_directive", "pragma_optimize", "profile", "program_text", "stdgl", 
			"undef_directive", "version_directive", "include_directive", "glsl_file_name"
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
	public String getGrammarFileName() { return "NVIDIAPreParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NVIDIAPreParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Translation_unitContext extends ParserRuleContext {
		public List<Compiler_directiveContext> compiler_directive() {
			return getRuleContexts(Compiler_directiveContext.class);
		}
		public Compiler_directiveContext compiler_directive(int i) {
			return getRuleContext(Compiler_directiveContext.class,i);
		}
		public Translation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterTranslation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitTranslation_unit(this);
		}
	}

	public final Translation_unitContext translation_unit() throws RecognitionException {
		Translation_unitContext _localctx = new Translation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER_SIGN) {
				{
				{
				setState(72);
				compiler_directive();
				}
				}
				setState(77);
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

	public static class Compiler_directiveContext extends ParserRuleContext {
		public Define_directiveContext define_directive() {
			return getRuleContext(Define_directiveContext.class,0);
		}
		public Elif_directiveContext elif_directive() {
			return getRuleContext(Elif_directiveContext.class,0);
		}
		public Else_directiveContext else_directive() {
			return getRuleContext(Else_directiveContext.class,0);
		}
		public Endif_directiveContext endif_directive() {
			return getRuleContext(Endif_directiveContext.class,0);
		}
		public Error_directiveContext error_directive() {
			return getRuleContext(Error_directiveContext.class,0);
		}
		public Extension_directiveContext extension_directive() {
			return getRuleContext(Extension_directiveContext.class,0);
		}
		public If_directiveContext if_directive() {
			return getRuleContext(If_directiveContext.class,0);
		}
		public Ifdef_directiveContext ifdef_directive() {
			return getRuleContext(Ifdef_directiveContext.class,0);
		}
		public Ifndef_directiveContext ifndef_directive() {
			return getRuleContext(Ifndef_directiveContext.class,0);
		}
		public Line_directiveContext line_directive() {
			return getRuleContext(Line_directiveContext.class,0);
		}
		public Pragma_directiveContext pragma_directive() {
			return getRuleContext(Pragma_directiveContext.class,0);
		}
		public Undef_directiveContext undef_directive() {
			return getRuleContext(Undef_directiveContext.class,0);
		}
		public Version_directiveContext version_directive() {
			return getRuleContext(Version_directiveContext.class,0);
		}
		public Include_directiveContext include_directive() {
			return getRuleContext(Include_directiveContext.class,0);
		}
		public Compiler_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compiler_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterCompiler_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitCompiler_directive(this);
		}
	}

	public final Compiler_directiveContext compiler_directive() throws RecognitionException {
		Compiler_directiveContext _localctx = new Compiler_directiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_compiler_directive);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				define_directive();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				elif_directive();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				else_directive();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				endif_directive();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				error_directive();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				extension_directive();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				if_directive();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				ifdef_directive();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(86);
				ifndef_directive();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(87);
				line_directive();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(88);
				pragma_directive();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(89);
				undef_directive();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(90);
				version_directive();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(91);
				include_directive();
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

	public static class BehaviorContext extends ParserRuleContext {
		public TerminalNode BEHAVIOR() { return getToken(NVIDIAPreParser.BEHAVIOR, 0); }
		public BehaviorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behavior; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterBehavior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitBehavior(this);
		}
	}

	public final BehaviorContext behavior() throws RecognitionException {
		BehaviorContext _localctx = new BehaviorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_behavior);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(BEHAVIOR);
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

	public static class Constant_expressionContext extends ParserRuleContext {
		public TerminalNode CONSTANT_EXPRESSION() { return getToken(NVIDIAPreParser.CONSTANT_EXPRESSION, 0); }
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitConstant_expression(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constant_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(CONSTANT_EXPRESSION);
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

	public static class Define_directiveContext extends ParserRuleContext {
		public TerminalNode NUMBER_SIGN() { return getToken(NVIDIAPreParser.NUMBER_SIGN, 0); }
		public TerminalNode DEFINE_DIRECTIVE() { return getToken(NVIDIAPreParser.DEFINE_DIRECTIVE, 0); }
		public Macro_nameContext macro_name() {
			return getRuleContext(Macro_nameContext.class,0);
		}
		public Macro_textContext macro_text() {
			return getRuleContext(Macro_textContext.class,0);
		}
		public Define_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterDefine_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitDefine_directive(this);
		}
	}

	public final Define_directiveContext define_directive() throws RecognitionException {
		Define_directiveContext _localctx = new Define_directiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_define_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(NUMBER_SIGN);
			setState(99);
			match(DEFINE_DIRECTIVE);
			setState(100);
			macro_name();
			setState(101);
			macro_text();
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

	public static class Elif_directiveContext extends ParserRuleContext {
		public TerminalNode NUMBER_SIGN() { return getToken(NVIDIAPreParser.NUMBER_SIGN, 0); }
		public TerminalNode ELIF_DIRECTIVE() { return getToken(NVIDIAPreParser.ELIF_DIRECTIVE, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Group_of_linesContext group_of_lines() {
			return getRuleContext(Group_of_linesContext.class,0);
		}
		public Elif_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterElif_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitElif_directive(this);
		}
	}

	public final Elif_directiveContext elif_directive() throws RecognitionException {
		Elif_directiveContext _localctx = new Elif_directiveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elif_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(NUMBER_SIGN);
			setState(104);
			match(ELIF_DIRECTIVE);
			setState(105);
			constant_expression();
			setState(106);
			group_of_lines();
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

	public static class Else_directiveContext extends ParserRuleContext {
		public TerminalNode NUMBER_SIGN() { return getToken(NVIDIAPreParser.NUMBER_SIGN, 0); }
		public TerminalNode ELSE_DIRECTIVE() { return getToken(NVIDIAPreParser.ELSE_DIRECTIVE, 0); }
		public Group_of_linesContext group_of_lines() {
			return getRuleContext(Group_of_linesContext.class,0);
		}
		public Else_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterElse_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitElse_directive(this);
		}
	}

	public final Else_directiveContext else_directive() throws RecognitionException {
		Else_directiveContext _localctx = new Else_directiveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_else_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(NUMBER_SIGN);
			setState(109);
			match(ELSE_DIRECTIVE);
			setState(110);
			group_of_lines();
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

	public static class Endif_directiveContext extends ParserRuleContext {
		public TerminalNode NUMBER_SIGN() { return getToken(NVIDIAPreParser.NUMBER_SIGN, 0); }
		public TerminalNode ENDIF_DIRECTIVE() { return getToken(NVIDIAPreParser.ENDIF_DIRECTIVE, 0); }
		public Endif_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endif_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterEndif_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitEndif_directive(this);
		}
	}

	public final Endif_directiveContext endif_directive() throws RecognitionException {
		Endif_directiveContext _localctx = new Endif_directiveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_endif_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(NUMBER_SIGN);
			setState(113);
			match(ENDIF_DIRECTIVE);
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

	public static class Error_directiveContext extends ParserRuleContext {
		public TerminalNode NUMBER_SIGN() { return getToken(NVIDIAPreParser.NUMBER_SIGN, 0); }
		public TerminalNode ERROR_DIRECTIVE() { return getToken(NVIDIAPreParser.ERROR_DIRECTIVE, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public Error_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterError_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitError_directive(this);
		}
	}

	public final Error_directiveContext error_directive() throws RecognitionException {
		Error_directiveContext _localctx = new Error_directiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_error_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(NUMBER_SIGN);
			setState(116);
			match(ERROR_DIRECTIVE);
			setState(117);
			error_message();
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

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode ERROR_MESSAGE() { return getToken(NVIDIAPreParser.ERROR_MESSAGE, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitError_message(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ERROR_MESSAGE);
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

	public static class Extension_directiveContext extends ParserRuleContext {
		public TerminalNode NUMBER_SIGN() { return getToken(NVIDIAPreParser.NUMBER_SIGN, 0); }
		public TerminalNode EXTENSION_DIRECTIVE() { return getToken(NVIDIAPreParser.EXTENSION_DIRECTIVE, 0); }
		public Extension_nameContext extension_name() {
			return getRuleContext(Extension_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(NVIDIAPreParser.COLON, 0); }
		public BehaviorContext behavior() {
			return getRuleContext(BehaviorContext.class,0);
		}
		public Extension_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterExtension_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitExtension_directive(this);
		}
	}

	public final Extension_directiveContext extension_directive() throws RecognitionException {
		Extension_directiveContext _localctx = new Extension_directiveContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_extension_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(NUMBER_SIGN);
			setState(122);
			match(EXTENSION_DIRECTIVE);
			setState(123);
			extension_name();
			setState(124);
			match(COLON);
			setState(125);
			behavior();
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

	public static class Extension_nameContext extends ParserRuleContext {
		public TerminalNode EXTENSION_NAME() { return getToken(NVIDIAPreParser.EXTENSION_NAME, 0); }
		public Extension_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterExtension_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitExtension_name(this);
		}
	}

	public final Extension_nameContext extension_name() throws RecognitionException {
		Extension_nameContext _localctx = new Extension_nameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_extension_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(EXTENSION_NAME);
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

	public static class Group_of_linesContext extends ParserRuleContext {
		public List<Program_textContext> program_text() {
			return getRuleContexts(Program_textContext.class);
		}
		public Program_textContext program_text(int i) {
			return getRuleContext(Program_textContext.class,i);
		}
		public List<Compiler_directiveContext> compiler_directive() {
			return getRuleContexts(Compiler_directiveContext.class);
		}
		public Compiler_directiveContext compiler_directive(int i) {
			return getRuleContext(Compiler_directiveContext.class,i);
		}
		public Group_of_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_of_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterGroup_of_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitGroup_of_lines(this);
		}
	}

	public final Group_of_linesContext group_of_lines() throws RecognitionException {
		Group_of_linesContext _localctx = new Group_of_linesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_group_of_lines);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(131);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PROGRAM_TEXT:
						{
						setState(129);
						program_text();
						}
						break;
					case NUMBER_SIGN:
						{
						setState(130);
						compiler_directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class If_directiveContext extends ParserRuleContext {
		public TerminalNode NUMBER_SIGN() { return getToken(NVIDIAPreParser.NUMBER_SIGN, 0); }
		public TerminalNode IF_DIRECTIVE() { return getToken(NVIDIAPreParser.IF_DIRECTIVE, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Group_of_linesContext group_of_lines() {
			return getRuleContext(Group_of_linesContext.class,0);
		}
		public Endif_directiveContext endif_directive() {
			return getRuleContext(Endif_directiveContext.class,0);
		}
		public List<Elif_directiveContext> elif_directive() {
			return getRuleContexts(Elif_directiveContext.class);
		}
		public Elif_directiveContext elif_directive(int i) {
			return getRuleContext(Elif_directiveContext.class,i);
		}
		public Else_directiveContext else_directive() {
			return getRuleContext(Else_directiveContext.class,0);
		}
		public If_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterIf_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitIf_directive(this);
		}
	}

	public final If_directiveContext if_directive() throws RecognitionException {
		If_directiveContext _localctx = new If_directiveContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(NUMBER_SIGN);
			setState(137);
			match(IF_DIRECTIVE);
			setState(138);
			constant_expression();
			setState(139);
			group_of_lines();
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
					elif_directive();
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(146);
				else_directive();
				}
				break;
			}
			setState(149);
			endif_directive();
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

	public static class Ifdef_directiveContext extends ParserRuleContext {
		public TerminalNode NUMBER_SIGN() { return getToken(NVIDIAPreParser.NUMBER_SIGN, 0); }
		public TerminalNode IFDEF_DIRECTIVE() { return getToken(NVIDIAPreParser.IFDEF_DIRECTIVE, 0); }
		public Macro_identifierContext macro_identifier() {
			return getRuleContext(Macro_identifierContext.class,0);
		}
		public Group_of_linesContext group_of_lines() {
			return getRuleContext(Group_of_linesContext.class,0);
		}
		public Endif_directiveContext endif_directive() {
			return getRuleContext(Endif_directiveContext.class,0);
		}
		public List<Elif_directiveContext> elif_directive() {
			return getRuleContexts(Elif_directiveContext.class);
		}
		public Elif_directiveContext elif_directive(int i) {
			return getRuleContext(Elif_directiveContext.class,i);
		}
		public Else_directiveContext else_directive() {
			return getRuleContext(Else_directiveContext.class,0);
		}
		public Ifdef_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdef_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterIfdef_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitIfdef_directive(this);
		}
	}

	public final Ifdef_directiveContext ifdef_directive() throws RecognitionException {
		Ifdef_directiveContext _localctx = new Ifdef_directiveContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifdef_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(NUMBER_SIGN);
			setState(152);
			match(IFDEF_DIRECTIVE);
			setState(153);
			macro_identifier();
			setState(154);
			group_of_lines();
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(155);
					elif_directive();
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(161);
				else_directive();
				}
				break;
			}
			setState(164);
			endif_directive();
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

	public static class Ifndef_directiveContext extends ParserRuleContext {
		public TerminalNode NUMBER_SIGN() { return getToken(NVIDIAPreParser.NUMBER_SIGN, 0); }
		public TerminalNode IFNDEF_DIRECTIVE() { return getToken(NVIDIAPreParser.IFNDEF_DIRECTIVE, 0); }
		public Macro_identifierContext macro_identifier() {
			return getRuleContext(Macro_identifierContext.class,0);
		}
		public Group_of_linesContext group_of_lines() {
			return getRuleContext(Group_of_linesContext.class,0);
		}
		public Endif_directiveContext endif_directive() {
			return getRuleContext(Endif_directiveContext.class,0);
		}
		public List<Elif_directiveContext> elif_directive() {
			return getRuleContexts(Elif_directiveContext.class);
		}
		public Elif_directiveContext elif_directive(int i) {
			return getRuleContext(Elif_directiveContext.class,i);
		}
		public Else_directiveContext else_directive() {
			return getRuleContext(Else_directiveContext.class,0);
		}
		public Ifndef_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifndef_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterIfndef_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitIfndef_directive(this);
		}
	}

	public final Ifndef_directiveContext ifndef_directive() throws RecognitionException {
		Ifndef_directiveContext _localctx = new Ifndef_directiveContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifndef_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(NUMBER_SIGN);
			setState(167);
			match(IFNDEF_DIRECTIVE);
			setState(168);
			macro_identifier();
			setState(169);
			group_of_lines();
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(170);
					elif_directive();
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(176);
				else_directive();
				}
				break;
			}
			setState(179);
			endif_directive();
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

	public static class Line_directiveContext extends ParserRuleContext {
		public TerminalNode NUMBER_SIGN() { return getToken(NVIDIAPreParser.NUMBER_SIGN, 0); }
		public TerminalNode LINE_DIRECTIVE() { return getToken(NVIDIAPreParser.LINE_DIRECTIVE, 0); }
		public Line_expressionContext line_expression() {
			return getRuleContext(Line_expressionContext.class,0);
		}
		public Line_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterLine_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitLine_directive(this);
		}
	}

	public final Line_directiveContext line_directive() throws RecognitionException {
		Line_directiveContext _localctx = new Line_directiveContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_line_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(NUMBER_SIGN);
			setState(182);
			match(LINE_DIRECTIVE);
			setState(183);
			line_expression();
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

	public static class Line_expressionContext extends ParserRuleContext {
		public TerminalNode LINE_EXPRESSION() { return getToken(NVIDIAPreParser.LINE_EXPRESSION, 0); }
		public Line_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterLine_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitLine_expression(this);
		}
	}

	public final Line_expressionContext line_expression() throws RecognitionException {
		Line_expressionContext _localctx = new Line_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_line_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(LINE_EXPRESSION);
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

	public static class Macro_esc_newlineContext extends ParserRuleContext {
		public TerminalNode MACRO_ESC_NEWLINE() { return getToken(NVIDIAPreParser.MACRO_ESC_NEWLINE, 0); }
		public Macro_esc_newlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_esc_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterMacro_esc_newline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitMacro_esc_newline(this);
		}
	}

	public final Macro_esc_newlineContext macro_esc_newline() throws RecognitionException {
		Macro_esc_newlineContext _localctx = new Macro_esc_newlineContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_macro_esc_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(MACRO_ESC_NEWLINE);
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

	public static class Macro_identifierContext extends ParserRuleContext {
		public TerminalNode MACRO_IDENTIFIER() { return getToken(NVIDIAPreParser.MACRO_IDENTIFIER, 0); }
		public Macro_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterMacro_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitMacro_identifier(this);
		}
	}

	public final Macro_identifierContext macro_identifier() throws RecognitionException {
		Macro_identifierContext _localctx = new Macro_identifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_macro_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(MACRO_IDENTIFIER);
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

	public static class Macro_nameContext extends ParserRuleContext {
		public TerminalNode MACRO_NAME() { return getToken(NVIDIAPreParser.MACRO_NAME, 0); }
		public Macro_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterMacro_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitMacro_name(this);
		}
	}

	public final Macro_nameContext macro_name() throws RecognitionException {
		Macro_nameContext _localctx = new Macro_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_macro_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(MACRO_NAME);
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

	public static class Macro_textContext extends ParserRuleContext {
		public List<Macro_text_Context> macro_text_() {
			return getRuleContexts(Macro_text_Context.class);
		}
		public Macro_text_Context macro_text_(int i) {
			return getRuleContext(Macro_text_Context.class,i);
		}
		public List<Macro_esc_newlineContext> macro_esc_newline() {
			return getRuleContexts(Macro_esc_newlineContext.class);
		}
		public Macro_esc_newlineContext macro_esc_newline(int i) {
			return getRuleContext(Macro_esc_newlineContext.class,i);
		}
		public Macro_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterMacro_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitMacro_text(this);
		}
	}

	public final Macro_textContext macro_text() throws RecognitionException {
		Macro_textContext _localctx = new Macro_textContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_macro_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MACRO_ESC_NEWLINE || _la==MACRO_TEXT) {
				{
				setState(195);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MACRO_TEXT:
					{
					setState(193);
					macro_text_();
					}
					break;
				case MACRO_ESC_NEWLINE:
					{
					setState(194);
					macro_esc_newline();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(199);
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

	public static class Macro_text_Context extends ParserRuleContext {
		public TerminalNode MACRO_TEXT() { return getToken(NVIDIAPreParser.MACRO_TEXT, 0); }
		public Macro_text_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_text_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterMacro_text_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitMacro_text_(this);
		}
	}

	public final Macro_text_Context macro_text_() throws RecognitionException {
		Macro_text_Context _localctx = new Macro_text_Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_macro_text_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(MACRO_TEXT);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NVIDIAPreParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(NUMBER);
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

	public static class OffContext extends ParserRuleContext {
		public TerminalNode OFF() { return getToken(NVIDIAPreParser.OFF, 0); }
		public OffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_off; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterOff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitOff(this);
		}
	}

	public final OffContext off() throws RecognitionException {
		OffContext _localctx = new OffContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_off);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(OFF);
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

	public static class OnContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(NVIDIAPreParser.ON, 0); }
		public OnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_on; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterOn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitOn(this);
		}
	}

	public final OnContext on() throws RecognitionException {
		OnContext _localctx = new OnContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_on);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(ON);
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

	public static class Pragma_debugContext extends ParserRuleContext {
		public TerminalNode DEBUG() { return getToken(NVIDIAPreParser.DEBUG, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(NVIDIAPreParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(NVIDIAPreParser.RIGHT_PAREN, 0); }
		public OnContext on() {
			return getRuleContext(OnContext.class,0);
		}
		public OffContext off() {
			return getRuleContext(OffContext.class,0);
		}
		public Pragma_debugContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_debug; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterPragma_debug(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitPragma_debug(this);
		}
	}

	public final Pragma_debugContext pragma_debug() throws RecognitionException {
		Pragma_debugContext _localctx = new Pragma_debugContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pragma_debug);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(DEBUG);
			setState(209);
			match(LEFT_PAREN);
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(210);
				on();
				}
				break;
			case OFF:
				{
				setState(211);
				off();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(214);
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

	public static class Pragma_directiveContext extends ParserRuleContext {
		public TerminalNode NUMBER_SIGN() { return getToken(NVIDIAPreParser.NUMBER_SIGN, 0); }
		public TerminalNode PRAGMA_DIRECTIVE() { return getToken(NVIDIAPreParser.PRAGMA_DIRECTIVE, 0); }
		public StdglContext stdgl() {
			return getRuleContext(StdglContext.class,0);
		}
		public Pragma_debugContext pragma_debug() {
			return getRuleContext(Pragma_debugContext.class,0);
		}
		public Pragma_optimizeContext pragma_optimize() {
			return getRuleContext(Pragma_optimizeContext.class,0);
		}
		public Pragma_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterPragma_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitPragma_directive(this);
		}
	}

	public final Pragma_directiveContext pragma_directive() throws RecognitionException {
		Pragma_directiveContext _localctx = new Pragma_directiveContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_pragma_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(NUMBER_SIGN);
			setState(217);
			match(PRAGMA_DIRECTIVE);
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STDGL:
				{
				setState(218);
				stdgl();
				}
				break;
			case DEBUG:
				{
				setState(219);
				pragma_debug();
				}
				break;
			case OPTIMIZE:
				{
				setState(220);
				pragma_optimize();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Pragma_optimizeContext extends ParserRuleContext {
		public TerminalNode OPTIMIZE() { return getToken(NVIDIAPreParser.OPTIMIZE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(NVIDIAPreParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(NVIDIAPreParser.RIGHT_PAREN, 0); }
		public OnContext on() {
			return getRuleContext(OnContext.class,0);
		}
		public OffContext off() {
			return getRuleContext(OffContext.class,0);
		}
		public Pragma_optimizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_optimize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterPragma_optimize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitPragma_optimize(this);
		}
	}

	public final Pragma_optimizeContext pragma_optimize() throws RecognitionException {
		Pragma_optimizeContext _localctx = new Pragma_optimizeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pragma_optimize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(OPTIMIZE);
			setState(224);
			match(LEFT_PAREN);
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(225);
				on();
				}
				break;
			case OFF:
				{
				setState(226);
				off();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(229);
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

	public static class ProfileContext extends ParserRuleContext {
		public TerminalNode PROFILE() { return getToken(NVIDIAPreParser.PROFILE, 0); }
		public ProfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_profile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterProfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitProfile(this);
		}
	}

	public final ProfileContext profile() throws RecognitionException {
		ProfileContext _localctx = new ProfileContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_profile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(PROFILE);
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

	public static class Program_textContext extends ParserRuleContext {
		public TerminalNode PROGRAM_TEXT() { return getToken(NVIDIAPreParser.PROGRAM_TEXT, 0); }
		public Program_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterProgram_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitProgram_text(this);
		}
	}

	public final Program_textContext program_text() throws RecognitionException {
		Program_textContext _localctx = new Program_textContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_program_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(PROGRAM_TEXT);
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

	public static class StdglContext extends ParserRuleContext {
		public TerminalNode STDGL() { return getToken(NVIDIAPreParser.STDGL, 0); }
		public StdglContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stdgl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterStdgl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitStdgl(this);
		}
	}

	public final StdglContext stdgl() throws RecognitionException {
		StdglContext _localctx = new StdglContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_stdgl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(STDGL);
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

	public static class Undef_directiveContext extends ParserRuleContext {
		public TerminalNode NUMBER_SIGN() { return getToken(NVIDIAPreParser.NUMBER_SIGN, 0); }
		public TerminalNode UNDEF_DIRECTIVE() { return getToken(NVIDIAPreParser.UNDEF_DIRECTIVE, 0); }
		public Macro_identifierContext macro_identifier() {
			return getRuleContext(Macro_identifierContext.class,0);
		}
		public Undef_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undef_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterUndef_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitUndef_directive(this);
		}
	}

	public final Undef_directiveContext undef_directive() throws RecognitionException {
		Undef_directiveContext _localctx = new Undef_directiveContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_undef_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(NUMBER_SIGN);
			setState(238);
			match(UNDEF_DIRECTIVE);
			setState(239);
			macro_identifier();
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

	public static class Version_directiveContext extends ParserRuleContext {
		public TerminalNode NUMBER_SIGN() { return getToken(NVIDIAPreParser.NUMBER_SIGN, 0); }
		public TerminalNode VERSION_DIRECTIVE() { return getToken(NVIDIAPreParser.VERSION_DIRECTIVE, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ProfileContext profile() {
			return getRuleContext(ProfileContext.class,0);
		}
		public Version_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterVersion_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitVersion_directive(this);
		}
	}

	public final Version_directiveContext version_directive() throws RecognitionException {
		Version_directiveContext _localctx = new Version_directiveContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_version_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(NUMBER_SIGN);
			setState(242);
			match(VERSION_DIRECTIVE);
			setState(243);
			number();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROFILE) {
				{
				setState(244);
				profile();
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

	public static class Include_directiveContext extends ParserRuleContext {
		public TerminalNode NUMBER_SIGN() { return getToken(NVIDIAPreParser.NUMBER_SIGN, 0); }
		public TerminalNode INCLUDE_DIRECTIVE() { return getToken(NVIDIAPreParser.INCLUDE_DIRECTIVE, 0); }
		public Glsl_file_nameContext glsl_file_name() {
			return getRuleContext(Glsl_file_nameContext.class,0);
		}
		public Include_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterInclude_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitInclude_directive(this);
		}
	}

	public final Include_directiveContext include_directive() throws RecognitionException {
		Include_directiveContext _localctx = new Include_directiveContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_include_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(NUMBER_SIGN);
			setState(248);
			match(INCLUDE_DIRECTIVE);
			setState(249);
			glsl_file_name();
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

	public static class Glsl_file_nameContext extends ParserRuleContext {
		public TerminalNode GLSL_FILE_NAME() { return getToken(NVIDIAPreParser.GLSL_FILE_NAME, 0); }
		public Glsl_file_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glsl_file_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).enterGlsl_file_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NVIDIAPreParserListener ) ((NVIDIAPreParserListener)listener).exitGlsl_file_name(this);
		}
	}

	public final Glsl_file_nameContext glsl_file_name() throws RecognitionException {
		Glsl_file_nameContext _localctx = new Glsl_file_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_glsl_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(GLSL_FILE_NAME);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u013e\u0100\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\7\2L\n\2\f\2\16\2O\13\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3_\n\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\7\16"+
		"\u0086\n\16\f\16\16\16\u0089\13\16\3\17\3\17\3\17\3\17\3\17\7\17\u0090"+
		"\n\17\f\17\16\17\u0093\13\17\3\17\5\17\u0096\n\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u009f\n\20\f\20\16\20\u00a2\13\20\3\20\5\20\u00a5"+
		"\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u00ae\n\21\f\21\16\21\u00b1"+
		"\13\21\3\21\5\21\u00b4\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\7\27\u00c6\n\27\f\27\16\27\u00c9"+
		"\13\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\5\34"+
		"\u00d7\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u00e0\n\35\3\36\3"+
		"\36\3\36\3\36\5\36\u00e6\n\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\5#\u00f8\n#\3$\3$\3$\3$\3%\3%\3%\2\2&\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\2\2\u00f8"+
		"\2M\3\2\2\2\4^\3\2\2\2\6`\3\2\2\2\bb\3\2\2\2\nd\3\2\2\2\fi\3\2\2\2\16"+
		"n\3\2\2\2\20r\3\2\2\2\22u\3\2\2\2\24y\3\2\2\2\26{\3\2\2\2\30\u0081\3\2"+
		"\2\2\32\u0087\3\2\2\2\34\u008a\3\2\2\2\36\u0099\3\2\2\2 \u00a8\3\2\2\2"+
		"\"\u00b7\3\2\2\2$\u00bb\3\2\2\2&\u00bd\3\2\2\2(\u00bf\3\2\2\2*\u00c1\3"+
		"\2\2\2,\u00c7\3\2\2\2.\u00ca\3\2\2\2\60\u00cc\3\2\2\2\62\u00ce\3\2\2\2"+
		"\64\u00d0\3\2\2\2\66\u00d2\3\2\2\28\u00da\3\2\2\2:\u00e1\3\2\2\2<\u00e9"+
		"\3\2\2\2>\u00eb\3\2\2\2@\u00ed\3\2\2\2B\u00ef\3\2\2\2D\u00f3\3\2\2\2F"+
		"\u00f9\3\2\2\2H\u00fd\3\2\2\2JL\5\4\3\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2"+
		"MN\3\2\2\2N\3\3\2\2\2OM\3\2\2\2P_\5\n\6\2Q_\5\f\7\2R_\5\16\b\2S_\5\20"+
		"\t\2T_\5\22\n\2U_\5\26\f\2V_\5\34\17\2W_\5\36\20\2X_\5 \21\2Y_\5\"\22"+
		"\2Z_\58\35\2[_\5B\"\2\\_\5D#\2]_\5F$\2^P\3\2\2\2^Q\3\2\2\2^R\3\2\2\2^"+
		"S\3\2\2\2^T\3\2\2\2^U\3\2\2\2^V\3\2\2\2^W\3\2\2\2^X\3\2\2\2^Y\3\2\2\2"+
		"^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\5\3\2\2\2`a\7\u0121\2\2a\7"+
		"\3\2\2\2bc\7\u011d\2\2c\t\3\2\2\2de\7\u00ed\2\2ef\7\u010a\2\2fg\5*\26"+
		"\2gh\5,\27\2h\13\3\2\2\2ij\7\u00ed\2\2jk\7\u010b\2\2kl\5\b\5\2lm\5\32"+
		"\16\2m\r\3\2\2\2no\7\u00ed\2\2op\7\u010c\2\2pq\5\32\16\2q\17\3\2\2\2r"+
		"s\7\u00ed\2\2st\7\u010d\2\2t\21\3\2\2\2uv\7\u00ed\2\2vw\7\u010e\2\2wx"+
		"\5\24\13\2x\23\3\2\2\2yz\7\u011f\2\2z\25\3\2\2\2{|\7\u00ed\2\2|}\7\u010f"+
		"\2\2}~\5\30\r\2~\177\7\u00d8\2\2\177\u0080\5\6\4\2\u0080\27\3\2\2\2\u0081"+
		"\u0082\7\u0122\2\2\u0082\31\3\2\2\2\u0083\u0086\5> \2\u0084\u0086\5\4"+
		"\3\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\33\3\2\2\2\u0089\u0087\3\2\2"+
		"\2\u008a\u008b\7\u00ed\2\2\u008b\u008c\7\u0110\2\2\u008c\u008d\5\b\5\2"+
		"\u008d\u0091\5\32\16\2\u008e\u0090\5\f\7\2\u008f\u008e\3\2\2\2\u0090\u0093"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0096\5\16\b\2\u0095\u0094\3\2\2\2\u0095\u0096\3"+
		"\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\5\20\t\2\u0098\35\3\2\2\2\u0099"+
		"\u009a\7\u00ed\2\2\u009a\u009b\7\u0111\2\2\u009b\u009c\5(\25\2\u009c\u00a0"+
		"\5\32\16\2\u009d\u009f\5\f\7\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2"+
		"\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a3\u00a5\5\16\b\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a6\u00a7\5\20\t\2\u00a7\37\3\2\2\2\u00a8\u00a9"+
		"\7\u00ed\2\2\u00a9\u00aa\7\u0112\2\2\u00aa\u00ab\5(\25\2\u00ab\u00af\5"+
		"\32\16\2\u00ac\u00ae\5\f\7\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b2\u00b4\5\16\b\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\5\20\t\2\u00b6!\3\2\2\2\u00b7\u00b8\7\u00ed"+
		"\2\2\u00b8\u00b9\7\u0113\2\2\u00b9\u00ba\5$\23\2\u00ba#\3\2\2\2\u00bb"+
		"\u00bc\7\u0129\2\2\u00bc%\3\2\2\2\u00bd\u00be\7\u012b\2\2\u00be\'\3\2"+
		"\2\2\u00bf\u00c0\7\u0126\2\2\u00c0)\3\2\2\2\u00c1\u00c2\7\u011a\2\2\u00c2"+
		"+\3\2\2\2\u00c3\u00c6\5.\30\2\u00c4\u00c6\5&\24\2\u00c5\u00c3\3\2\2\2"+
		"\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8-\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7\u012c\2\2\u00cb"+
		"/\3\2\2\2\u00cc\u00cd\7\u0139\2\2\u00cd\61\3\2\2\2\u00ce\u00cf\7\u0130"+
		"\2\2\u00cf\63\3\2\2\2\u00d0\u00d1\7\u0131\2\2\u00d1\65\3\2\2\2\u00d2\u00d3"+
		"\7\u012e\2\2\u00d3\u00d6\7\u00e9\2\2\u00d4\u00d7\5\64\33\2\u00d5\u00d7"+
		"\5\62\32\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2"+
		"\u00d8\u00d9\7\u00f8\2\2\u00d9\67\3\2\2\2\u00da\u00db\7\u00ed\2\2\u00db"+
		"\u00df\7\u0114\2\2\u00dc\u00e0\5@!\2\u00dd\u00e0\5\66\34\2\u00de\u00e0"+
		"\5:\36\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"9\3\2\2\2\u00e1\u00e2\7\u0132\2\2\u00e2\u00e5\7\u00e9\2\2\u00e3\u00e6"+
		"\5\64\33\2\u00e4\u00e6\5\62\32\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2"+
		"\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7\u00f8\2\2\u00e8;\3\2\2\2\u00e9\u00ea"+
		"\7\u013a\2\2\u00ea=\3\2\2\2\u00eb\u00ec\7\u0135\2\2\u00ec?\3\2\2\2\u00ed"+
		"\u00ee\7\u0134\2\2\u00eeA\3\2\2\2\u00ef\u00f0\7\u00ed\2\2\u00f0\u00f1"+
		"\7\u0115\2\2\u00f1\u00f2\5(\25\2\u00f2C\3\2\2\2\u00f3\u00f4\7\u00ed\2"+
		"\2\u00f4\u00f5\7\u0116\2\2\u00f5\u00f7\5\60\31\2\u00f6\u00f8\5<\37\2\u00f7"+
		"\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8E\3\2\2\2\u00f9\u00fa\7\u00ed"+
		"\2\2\u00fa\u00fb\7\u0117\2\2\u00fb\u00fc\5H%\2\u00fcG\3\2\2\2\u00fd\u00fe"+
		"\7\u013d\2\2\u00feI\3\2\2\2\22M^\u0085\u0087\u0091\u0095\u00a0\u00a4\u00af"+
		"\u00b3\u00c5\u00c7\u00d6\u00df\u00e5\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}