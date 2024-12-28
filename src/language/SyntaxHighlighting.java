package language;

import java.awt.Color;
import java.util.HashMap;

import javax.swing.text.AttributeSet;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import org.antlr.v4.runtime.Token;

import main.java.testNVIDIA.NVIDIALexer;

public final class SyntaxHighlighting {
	private SyntaxHighlighting() {
		throw new UnsupportedOperationException();
	}
	

	/**
	 * @param symbol
	 * @return null if this symbol is not associated with a color.
	 */
	public static final AttributeSet getColor(Token symbol) {
		int type = symbol.getType();
		return type > 0 ? colors[type] : null;
	}

	public static final MutableAttributeSet ERROR_HIGHLIGHT = new SimpleAttributeSet();
	public static final MutableAttributeSet WARNING_HIGHLIGHT = new SimpleAttributeSet();

	static {
		StyleConstants.setBackground(ERROR_HIGHLIGHT, new Color(255, 0, 0, 100));
		StyleConstants.setBackground(WARNING_HIGHLIGHT, new Color(255, 255, 0, 100));
	}

	public static final AttributeSet UNKNOWN = create(new Color(250, 170, 170), false, false);
	public static final AttributeSet COMMENT = create(new Color(128, 128, 128), false, false);

	// returned by getColor()
	public static final AttributeSet NORMAL = create(new Color(250, 250, 250), false, false);
	public static final AttributeSet KEYWORD = create(new Color(255, 143, 64), false, false);
	public static final AttributeSet CONSTANT = create(new Color(100, 150, 190), false, false);
	public static final AttributeSet STRING_LITERAL = create(new Color(181, 206, 168), false, false);
	public static final AttributeSet DIRECTIVE = create(new Color(197, 134, 192), false, false);
	public static final AttributeSet ERROR_MESSAGE = create(new Color(236, 40, 40), false, false);
	public static final AttributeSet EXTENSION_NAME = create(new Color(128, 242, 246), false, false);
	public static final AttributeSet MACRO_NAME_OR_ID = create(new Color(86, 156, 214), false, true);

	// identifier colors
	public static final int LAYOUT_IDENTIFIER_TYPE = 317;
	public static final int TYPE_NAME_TYPE = 318;
	public static final int TYPE_MEMBER_TYPE = 319;
	public static final int FUNCTION_DECLARATION_TYPE = 320;
	public static final int FUNCTION_CALL_TYPE = 321;
	public static final int PARAMETER_IDENTIFIER_TYPE = 322;
	public static final int LOCALVAR_IDENTIFIER_TYPE = 323;
	public static final int GLOBAL_IDENTIFIER_TYPE = 324;

	public static final AttributeSet LAYOUT_IDENTIFIER = create(new Color(177, 102, 218), true, false);
	public static final AttributeSet TYPE_NAME = create(new Color(18, 144, 195), false, false);
	public static final AttributeSet TYPE_MEMBER = create(new Color(102, 225, 248), false, false);
	public static final AttributeSet FUNCTION_DECLARATION = create(new Color(30, 181, 64), false, false);
	public static final AttributeSet FUNCTION_CALL = create(new Color(150, 236, 58), false, false);
	public static final AttributeSet PARAMETER_IDENTIFIER = create(new Color(191, 169, 254), false, false);
	public static final AttributeSet LOCALVAR_IDENTIFIER = create(new Color(243, 236, 121), false, false);
	public static final AttributeSet GLOBAL_IDENTIFIER = create(new Color(141, 218, 248), true, true);

	private static final AttributeSet create(Color color, boolean italic, boolean bold) {
		MutableAttributeSet res = new SimpleAttributeSet();
		StyleConstants.setForeground(res, color);
		StyleConstants.setItalic(res, italic);
		StyleConstants.setBold(res, bold);
		return res;
	}

	private static final AttributeSet[] colors = new AttributeSet[NVIDIALexer.VOCABULARY.getMaxTokenType() + 1 + 8];

	static {
		colors[0] = UNKNOWN;
		colors[NVIDIALexer.ATOMIC_UINT] = KEYWORD;
		colors[NVIDIALexer.ATTRIBUTE] = KEYWORD;
		colors[NVIDIALexer.BOOL] = KEYWORD;
		colors[NVIDIALexer.BREAK] = KEYWORD;
		colors[NVIDIALexer.BUFFER] = KEYWORD;
		colors[NVIDIALexer.BVEC2] = KEYWORD;
		colors[NVIDIALexer.BVEC3] = KEYWORD;
		colors[NVIDIALexer.BVEC4] = KEYWORD;
		colors[NVIDIALexer.CASE] = KEYWORD;
		colors[NVIDIALexer.CENTROID] = KEYWORD;
		colors[NVIDIALexer.COHERENT] = KEYWORD;
		colors[NVIDIALexer.CONST] = KEYWORD;
		colors[NVIDIALexer.CONTINUE] = KEYWORD;
		colors[NVIDIALexer.DEFAULT] = KEYWORD;
		colors[NVIDIALexer.DISCARD] = KEYWORD;
		colors[NVIDIALexer.DMAT2] = KEYWORD;
		colors[NVIDIALexer.DMAT2X2] = KEYWORD;
		colors[NVIDIALexer.DMAT2X3] = KEYWORD;
		colors[NVIDIALexer.DMAT2X4] = KEYWORD;
		colors[NVIDIALexer.DMAT3] = KEYWORD;
		colors[NVIDIALexer.DMAT3X2] = KEYWORD;
		colors[NVIDIALexer.DMAT3X3] = KEYWORD;
		colors[NVIDIALexer.DMAT3X4] = KEYWORD;
		colors[NVIDIALexer.DMAT4] = KEYWORD;
		colors[NVIDIALexer.DMAT4X2] = KEYWORD;
		colors[NVIDIALexer.DMAT4X3] = KEYWORD;
		colors[NVIDIALexer.DMAT4X4] = KEYWORD;
		colors[NVIDIALexer.DO] = KEYWORD;
		colors[NVIDIALexer.DOUBLE] = KEYWORD;
		colors[NVIDIALexer.DVEC2] = KEYWORD;
		colors[NVIDIALexer.DVEC3] = KEYWORD;
		colors[NVIDIALexer.DVEC4] = KEYWORD;
		colors[NVIDIALexer.ELSE] = KEYWORD;
		colors[NVIDIALexer.FALSE] = KEYWORD;
		colors[NVIDIALexer.FLAT] = KEYWORD;
		colors[NVIDIALexer.FLOAT] = KEYWORD;
		colors[NVIDIALexer.FOR] = KEYWORD;
		colors[NVIDIALexer.HIGHP] = KEYWORD;
		colors[NVIDIALexer.IF] = KEYWORD;
		colors[NVIDIALexer.IIMAGE1D] = KEYWORD;
		colors[NVIDIALexer.IIMAGE1DARRAY] = KEYWORD;
		colors[NVIDIALexer.IIMAGE2D] = KEYWORD;
		colors[NVIDIALexer.IIMAGE2DARRAY] = KEYWORD;
		colors[NVIDIALexer.IIMAGE2DMS] = KEYWORD;
		colors[NVIDIALexer.IIMAGE2DMSARRAY] = KEYWORD;
		colors[NVIDIALexer.IIMAGE2DRECT] = KEYWORD;
		colors[NVIDIALexer.IIMAGE3D] = KEYWORD;
		colors[NVIDIALexer.IIMAGEBUFFER] = KEYWORD;
		colors[NVIDIALexer.IIMAGECUBE] = KEYWORD;
		colors[NVIDIALexer.IIMAGECUBEARRAY] = KEYWORD;
		colors[NVIDIALexer.IMAGE1D] = KEYWORD;
		colors[NVIDIALexer.IMAGE1DARRAY] = KEYWORD;
		colors[NVIDIALexer.IMAGE2D] = KEYWORD;
		colors[NVIDIALexer.IMAGE2DARRAY] = KEYWORD;
		colors[NVIDIALexer.IMAGE2DMS] = KEYWORD;
		colors[NVIDIALexer.IMAGE2DMSARRAY] = KEYWORD;
		colors[NVIDIALexer.IMAGE2DRECT] = KEYWORD;
		colors[NVIDIALexer.IMAGE3D] = KEYWORD;
		colors[NVIDIALexer.IMAGEBUFFER] = KEYWORD;
		colors[NVIDIALexer.IMAGECUBE] = KEYWORD;
		colors[NVIDIALexer.IMAGECUBEARRAY] = KEYWORD;
		colors[NVIDIALexer.IN] = KEYWORD;
		colors[NVIDIALexer.INOUT] = KEYWORD;
		colors[NVIDIALexer.INT] = KEYWORD;
		colors[NVIDIALexer.INVARIANT] = KEYWORD;
		colors[NVIDIALexer.ISAMPLER1D] = KEYWORD;
		colors[NVIDIALexer.ISAMPLER1DARRAY] = KEYWORD;
		colors[NVIDIALexer.ISAMPLER2D] = KEYWORD;
		colors[NVIDIALexer.ISAMPLER2DARRAY] = KEYWORD;
		colors[NVIDIALexer.ISAMPLER2DMS] = KEYWORD;
		colors[NVIDIALexer.ISAMPLER2DMSARRAY] = KEYWORD;
		colors[NVIDIALexer.ISAMPLER2DRECT] = KEYWORD;
		colors[NVIDIALexer.ISAMPLER3D] = KEYWORD;
		colors[NVIDIALexer.ISAMPLERBUFFER] = KEYWORD;
		colors[NVIDIALexer.ISAMPLERCUBE] = KEYWORD;
		colors[NVIDIALexer.ISAMPLERCUBEARRAY] = KEYWORD;
		colors[NVIDIALexer.IVEC2] = KEYWORD;
		colors[NVIDIALexer.IVEC3] = KEYWORD;
		colors[NVIDIALexer.IVEC4] = KEYWORD;
		colors[NVIDIALexer.LAYOUT] = KEYWORD;
		colors[NVIDIALexer.LOWP] = KEYWORD;
		colors[NVIDIALexer.MAT2] = KEYWORD;
		colors[NVIDIALexer.MAT2X2] = KEYWORD;
		colors[NVIDIALexer.MAT2X3] = KEYWORD;
		colors[NVIDIALexer.MAT2X4] = KEYWORD;
		colors[NVIDIALexer.MAT3] = KEYWORD;
		colors[NVIDIALexer.MAT3X2] = KEYWORD;
		colors[NVIDIALexer.MAT3X3] = KEYWORD;
		colors[NVIDIALexer.MAT3X4] = KEYWORD;
		colors[NVIDIALexer.MAT4] = KEYWORD;
		colors[NVIDIALexer.MAT4X2] = KEYWORD;
		colors[NVIDIALexer.MAT4X3] = KEYWORD;
		colors[NVIDIALexer.MAT4X4] = KEYWORD;
		colors[NVIDIALexer.MEDIUMP] = KEYWORD;
		colors[NVIDIALexer.NOPERSPECTIVE] = KEYWORD;
		colors[NVIDIALexer.OUT] = KEYWORD;
		colors[NVIDIALexer.PATCH] = KEYWORD;
		colors[NVIDIALexer.PRECISE] = KEYWORD;
		colors[NVIDIALexer.PRECISION] = KEYWORD;
		colors[NVIDIALexer.READONLY] = KEYWORD;
		colors[NVIDIALexer.RESTRICT] = KEYWORD;
		colors[NVIDIALexer.RETURN] = KEYWORD;
		colors[NVIDIALexer.SAMPLE] = KEYWORD;
		colors[NVIDIALexer.SAMPLER1D] = KEYWORD;
		colors[NVIDIALexer.SAMPLER1DARRAY] = KEYWORD;
		colors[NVIDIALexer.SAMPLER1DARRAYSHADOW] = KEYWORD;
		colors[NVIDIALexer.SAMPLER1DSHADOW] = KEYWORD;
		colors[NVIDIALexer.SAMPLER2D] = KEYWORD;
		colors[NVIDIALexer.SAMPLER2DARRAY] = KEYWORD;
		colors[NVIDIALexer.SAMPLER2DARRAYSHADOW] = KEYWORD;
		colors[NVIDIALexer.SAMPLER2DMS] = KEYWORD;
		colors[NVIDIALexer.SAMPLER2DMSARRAY] = KEYWORD;
		colors[NVIDIALexer.SAMPLER2DRECT] = KEYWORD;
		colors[NVIDIALexer.SAMPLER2DRECTSHADOW] = KEYWORD;
		colors[NVIDIALexer.SAMPLER2DSHADOW] = KEYWORD;
		colors[NVIDIALexer.SAMPLER3D] = KEYWORD;
		colors[NVIDIALexer.SAMPLERBUFFER] = KEYWORD;
		colors[NVIDIALexer.SAMPLERCUBE] = KEYWORD;
		colors[NVIDIALexer.SAMPLERCUBEARRAY] = KEYWORD;
		colors[NVIDIALexer.SAMPLERCUBEARRAYSHADOW] = KEYWORD;
		colors[NVIDIALexer.SAMPLERCUBESHADOW] = KEYWORD;
		colors[NVIDIALexer.SAMPLERSHADOW] = KEYWORD;
		colors[NVIDIALexer.SHARED] = KEYWORD;
		colors[NVIDIALexer.SMOOTH] = KEYWORD;
		colors[NVIDIALexer.STRUCT] = KEYWORD;
		colors[NVIDIALexer.SUBROUTINE] = KEYWORD;
		colors[NVIDIALexer.SWITCH] = KEYWORD;
		colors[NVIDIALexer.TRUE] = KEYWORD;
		colors[NVIDIALexer.UIMAGE1D] = KEYWORD;
		colors[NVIDIALexer.UIMAGE1DARRAY] = KEYWORD;
		colors[NVIDIALexer.UIMAGE2D] = KEYWORD;
		colors[NVIDIALexer.UIMAGE2DARRAY] = KEYWORD;
		colors[NVIDIALexer.UIMAGE2DMS] = KEYWORD;
		colors[NVIDIALexer.UIMAGE2DMSARRAY] = KEYWORD;
		colors[NVIDIALexer.UIMAGE2DRECT] = KEYWORD;
		colors[NVIDIALexer.UIMAGE3D] = KEYWORD;
		colors[NVIDIALexer.UIMAGEBUFFER] = KEYWORD;
		colors[NVIDIALexer.UIMAGECUBE] = KEYWORD;
		colors[NVIDIALexer.UIMAGECUBEARRAY] = KEYWORD;
		colors[NVIDIALexer.UINT] = KEYWORD;
		colors[NVIDIALexer.UNIFORM] = KEYWORD;
		colors[NVIDIALexer.USAMPLER1D] = KEYWORD;
		colors[NVIDIALexer.USAMPLER1DARRAY] = KEYWORD;
		colors[NVIDIALexer.USAMPLER2D] = KEYWORD;
		colors[NVIDIALexer.USAMPLER2DARRAY] = KEYWORD;
		colors[NVIDIALexer.USAMPLER2DMS] = KEYWORD;
		colors[NVIDIALexer.USAMPLER2DMSARRAY] = KEYWORD;
		colors[NVIDIALexer.USAMPLER2DRECT] = KEYWORD;
		colors[NVIDIALexer.USAMPLER3D] = KEYWORD;
		colors[NVIDIALexer.USAMPLERBUFFER] = KEYWORD;
		colors[NVIDIALexer.USAMPLERCUBE] = KEYWORD;
		colors[NVIDIALexer.USAMPLERCUBEARRAY] = KEYWORD;
		colors[NVIDIALexer.UVEC2] = KEYWORD;
		colors[NVIDIALexer.UVEC3] = KEYWORD;
		colors[NVIDIALexer.UVEC4] = KEYWORD;
		colors[NVIDIALexer.VARYING] = KEYWORD;
		colors[NVIDIALexer.VEC2] = KEYWORD;
		colors[NVIDIALexer.VEC3] = KEYWORD;
		colors[NVIDIALexer.VEC4] = KEYWORD;
		colors[NVIDIALexer.VOID] = KEYWORD;
		colors[NVIDIALexer.VOLATILE] = KEYWORD;
		colors[NVIDIALexer.WHILE] = KEYWORD;
		colors[NVIDIALexer.WRITEONLY] = KEYWORD;
		colors[NVIDIALexer.INT8_T] = KEYWORD;
		colors[NVIDIALexer.I8VEC2] = KEYWORD;
		colors[NVIDIALexer.I8VEC3] = KEYWORD;
		colors[NVIDIALexer.I8VEC4] = KEYWORD;
		colors[NVIDIALexer.INT16_T] = KEYWORD;
		colors[NVIDIALexer.I16VEC2] = KEYWORD;
		colors[NVIDIALexer.I16VEC3] = KEYWORD;
		colors[NVIDIALexer.I16VEC4] = KEYWORD;
		colors[NVIDIALexer.INT32_T] = KEYWORD;
		colors[NVIDIALexer.I32VEC2] = KEYWORD;
		colors[NVIDIALexer.I32VEC3] = KEYWORD;
		colors[NVIDIALexer.I32VEC4] = KEYWORD;
		colors[NVIDIALexer.INT64_T] = KEYWORD;
		colors[NVIDIALexer.I64VEC2] = KEYWORD;
		colors[NVIDIALexer.I64VEC3] = KEYWORD;
		colors[NVIDIALexer.I64VEC4] = KEYWORD;
		colors[NVIDIALexer.UINT8_T] = KEYWORD;
		colors[NVIDIALexer.U8VEC2] = KEYWORD;
		colors[NVIDIALexer.U8VEC3] = KEYWORD;
		colors[NVIDIALexer.U8VEC4] = KEYWORD;
		colors[NVIDIALexer.UINT16_T] = KEYWORD;
		colors[NVIDIALexer.U16VEC2] = KEYWORD;
		colors[NVIDIALexer.U16VEC3] = KEYWORD;
		colors[NVIDIALexer.U16VEC4] = KEYWORD;
		colors[NVIDIALexer.UINT32_T] = KEYWORD;
		colors[NVIDIALexer.U32VEC2] = KEYWORD;
		colors[NVIDIALexer.U32VEC3] = KEYWORD;
		colors[NVIDIALexer.U32VEC4] = KEYWORD;
		colors[NVIDIALexer.UINT64_T] = KEYWORD;
		colors[NVIDIALexer.U64VEC2] = KEYWORD;
		colors[NVIDIALexer.U64VEC3] = KEYWORD;
		colors[NVIDIALexer.U64VEC4] = KEYWORD;
		colors[NVIDIALexer.FLOAT16_T] = KEYWORD;
		colors[NVIDIALexer.F16VEC2] = KEYWORD;
		colors[NVIDIALexer.F16VEC3] = KEYWORD;
		colors[NVIDIALexer.F16VEC4] = KEYWORD;
		colors[NVIDIALexer.FLOAT32_T] = KEYWORD;
		colors[NVIDIALexer.F32VEC2] = KEYWORD;
		colors[NVIDIALexer.F32VEC3] = KEYWORD;
		colors[NVIDIALexer.F32VEC4] = KEYWORD;
		colors[NVIDIALexer.FLOAT64_T] = KEYWORD;
		colors[NVIDIALexer.F64VEC2] = KEYWORD;
		colors[NVIDIALexer.F64VEC3] = KEYWORD;
		colors[NVIDIALexer.F64VEC4] = KEYWORD;
		colors[NVIDIALexer.ADD_ASSIGN] = NORMAL;
		colors[NVIDIALexer.AMPERSAND] = NORMAL;
		colors[NVIDIALexer.AND_ASSIGN] = NORMAL;
		colors[NVIDIALexer.AND_OP] = NORMAL;
		colors[NVIDIALexer.BANG] = NORMAL;
		colors[NVIDIALexer.CARET] = NORMAL;
		colors[NVIDIALexer.COLON] = NORMAL;
		colors[NVIDIALexer.COMMA] = NORMAL;
		colors[NVIDIALexer.DASH] = NORMAL;
		colors[NVIDIALexer.DEC_OP] = NORMAL;
		colors[NVIDIALexer.DIV_ASSIGN] = NORMAL;
		colors[NVIDIALexer.DOT] = NORMAL;
		colors[NVIDIALexer.ARROW] = NORMAL;
		colors[NVIDIALexer.EQ_OP] = NORMAL;
		colors[NVIDIALexer.EQUAL] = NORMAL;
		colors[NVIDIALexer.GE_OP] = NORMAL;
		colors[NVIDIALexer.INC_OP] = NORMAL;
		colors[NVIDIALexer.LE_OP] = NORMAL;
		colors[NVIDIALexer.LEFT_ANGLE] = NORMAL;
		colors[NVIDIALexer.LEFT_ASSIGN] = NORMAL;
		colors[NVIDIALexer.LEFT_BRACE] = NORMAL;
		colors[NVIDIALexer.LEFT_BRACKET] = NORMAL;
		colors[NVIDIALexer.LEFT_OP] = NORMAL;
		colors[NVIDIALexer.LEFT_PAREN] = NORMAL;
		colors[NVIDIALexer.MOD_ASSIGN] = NORMAL;
		colors[NVIDIALexer.MUL_ASSIGN] = NORMAL;
		colors[NVIDIALexer.NE_OP] = NORMAL;
		colors[NVIDIALexer.NUMBER_SIGN] = DIRECTIVE;
		colors[NVIDIALexer.OR_ASSIGN] = NORMAL;
		colors[NVIDIALexer.OR_OP] = NORMAL;
		colors[NVIDIALexer.PERCENT] = NORMAL;
		colors[NVIDIALexer.PLUS] = NORMAL;
		colors[NVIDIALexer.QUESTION] = NORMAL;
		colors[NVIDIALexer.RIGHT_ANGLE] = NORMAL;
		colors[NVIDIALexer.RIGHT_ASSIGN] = NORMAL;
		colors[NVIDIALexer.RIGHT_BRACE] = NORMAL;
		colors[NVIDIALexer.RIGHT_BRACKET] = NORMAL;
		colors[NVIDIALexer.RIGHT_OP] = NORMAL;
		colors[NVIDIALexer.RIGHT_PAREN] = NORMAL;
		colors[NVIDIALexer.SEMICOLON] = NORMAL;
		colors[NVIDIALexer.SLASH] = NORMAL;
		colors[NVIDIALexer.STAR] = NORMAL;
		colors[NVIDIALexer.SUB_ASSIGN] = NORMAL;
		colors[NVIDIALexer.TILDE] = NORMAL;
		colors[NVIDIALexer.VERTICAL_BAR] = NORMAL;
		colors[NVIDIALexer.XOR_ASSIGN] = NORMAL;
		colors[NVIDIALexer.XOR_OP] = NORMAL;
		colors[NVIDIALexer.DOUBLECONSTANT] = CONSTANT;
		colors[NVIDIALexer.FLOATCONSTANT] = CONSTANT;
		colors[NVIDIALexer.INTCONSTANT] = CONSTANT;
		colors[NVIDIALexer.UINTCONSTANT] = CONSTANT;
		colors[NVIDIALexer.BLOCK_COMMENT] = NORMAL;
		colors[NVIDIALexer.LINE_COMMENT] = NORMAL;
		colors[NVIDIALexer.LINE_CONTINUATION] = NORMAL;
		colors[NVIDIALexer.IDENTIFIER] = null;
		colors[NVIDIALexer.WHITE_SPACE] = NORMAL;
		colors[NVIDIALexer.DEFINE_DIRECTIVE] = DIRECTIVE;
		colors[NVIDIALexer.ELIF_DIRECTIVE] = DIRECTIVE;
		colors[NVIDIALexer.ELSE_DIRECTIVE] = DIRECTIVE;
		colors[NVIDIALexer.ENDIF_DIRECTIVE] = DIRECTIVE;
		colors[NVIDIALexer.ERROR_DIRECTIVE] = DIRECTIVE;
		colors[NVIDIALexer.EXTENSION_DIRECTIVE] = DIRECTIVE;
		colors[NVIDIALexer.IF_DIRECTIVE] = DIRECTIVE;
		colors[NVIDIALexer.IFDEF_DIRECTIVE] = DIRECTIVE;
		colors[NVIDIALexer.IFNDEF_DIRECTIVE] = DIRECTIVE;
		colors[NVIDIALexer.LINE_DIRECTIVE] = DIRECTIVE;
		colors[NVIDIALexer.PRAGMA_DIRECTIVE] = DIRECTIVE;
		colors[NVIDIALexer.UNDEF_DIRECTIVE] = DIRECTIVE;
		colors[NVIDIALexer.VERSION_DIRECTIVE] = DIRECTIVE;
		colors[NVIDIALexer.INCLUDE_DIRECTIVE] = DIRECTIVE;
		colors[NVIDIALexer.SPACE_TAB_0] = DIRECTIVE;
		colors[NVIDIALexer.NEWLINE_0] = DIRECTIVE;
		colors[NVIDIALexer.MACRO_NAME] = MACRO_NAME_OR_ID;
		colors[NVIDIALexer.NEWLINE_1] = DIRECTIVE;
		colors[NVIDIALexer.SPACE_TAB_1] = DIRECTIVE;
		colors[NVIDIALexer.CONSTANT_EXPRESSION] = NORMAL;
		colors[NVIDIALexer.NEWLINE_2] = DIRECTIVE;
		colors[NVIDIALexer.ERROR_MESSAGE] = ERROR_MESSAGE;
		colors[NVIDIALexer.NEWLINE_3] = DIRECTIVE;
		colors[NVIDIALexer.BEHAVIOR] = DIRECTIVE;
		colors[NVIDIALexer.EXTENSION_NAME] = EXTENSION_NAME;
		colors[NVIDIALexer.NEWLINE_4] = DIRECTIVE;
		colors[NVIDIALexer.SPACE_TAB_2] = DIRECTIVE;
		colors[NVIDIALexer.NEWLINE_5] = DIRECTIVE;
		colors[NVIDIALexer.MACRO_IDENTIFIER] = MACRO_NAME_OR_ID;
		colors[NVIDIALexer.NEWLINE_6] = DIRECTIVE;
		colors[NVIDIALexer.SPACE_TAB_3] = DIRECTIVE;
		colors[NVIDIALexer.LINE_EXPRESSION] = NORMAL;
		colors[NVIDIALexer.NEWLINE_7] = DIRECTIVE;
		colors[NVIDIALexer.MACRO_ESC_NEWLINE] = NORMAL;
		colors[NVIDIALexer.MACRO_TEXT] = NORMAL;
		colors[NVIDIALexer.NEWLINE_8] = DIRECTIVE;
		colors[NVIDIALexer.DEBUG] = NORMAL;
		colors[NVIDIALexer.NEWLINE_9] = DIRECTIVE;
		colors[NVIDIALexer.OFF] = DIRECTIVE;
		colors[NVIDIALexer.ON] = DIRECTIVE;
		colors[NVIDIALexer.OPTIMIZE] = DIRECTIVE;
		colors[NVIDIALexer.SPACE_TAB_5] = DIRECTIVE;
		colors[NVIDIALexer.STDGL] = DIRECTIVE;
		colors[NVIDIALexer.PROGRAM_TEXT] = NORMAL;
		colors[NVIDIALexer.NEWLINE_10] = DIRECTIVE;
		colors[NVIDIALexer.SPACE_TAB_6] = DIRECTIVE;
		colors[NVIDIALexer.NEWLINE_11] = DIRECTIVE;
		colors[NVIDIALexer.NUMBER] = CONSTANT;
		colors[NVIDIALexer.PROFILE] = DIRECTIVE;
		colors[NVIDIALexer.SPACE_TAB_7] = DIRECTIVE;
		colors[NVIDIALexer.NEWLINE_12] = DIRECTIVE;
		colors[NVIDIALexer.GLSL_FILE_NAME] = STRING_LITERAL;
		colors[NVIDIALexer.SPACE_TAB_8] = DIRECTIVE;

		colors[LAYOUT_IDENTIFIER_TYPE] = LAYOUT_IDENTIFIER;
		colors[TYPE_NAME_TYPE] = TYPE_NAME;
		colors[TYPE_MEMBER_TYPE] = TYPE_MEMBER;
		colors[FUNCTION_DECLARATION_TYPE] = FUNCTION_DECLARATION;
		colors[FUNCTION_CALL_TYPE] = FUNCTION_CALL;
		colors[PARAMETER_IDENTIFIER_TYPE] = PARAMETER_IDENTIFIER;
		colors[LOCALVAR_IDENTIFIER_TYPE] = LOCALVAR_IDENTIFIER;
		colors[GLOBAL_IDENTIFIER_TYPE] = GLOBAL_IDENTIFIER;
	}
}