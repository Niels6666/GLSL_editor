package language;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public final class GLSLSpecification {
	private GLSLSpecification() {
		throw new UnsupportedOperationException();
	}

	public static final Set<String> KEYWORDS = Set.of(makeKeywords());
	public static final Set<String> RESERVED = Set.of(makeReservedKeywords());
	public static final Set<String> IMAGE_FORMATS = Set.of(makeImageFormats());
	public static final List<String> templates = makeTemplates();

	private static String[] makeKeywords() {
		return new String[] { "const", "uniform", "buffer", "shared", "attribute", "varying", "coherent", "volatile",
				"restrict", "readonly", "writeonly", "atomic_uint", "layout", "centroid", "flat", "smooth",
				"noperspective", "patch", "sample", "invariant", "precise", "break", "continue", "do", "for", "while",
				"switch", "case", "default", "if", "else", "subroutine", "in", "out", "inout", "int", "void", "bool",
				"true", "false", "float", "double", "discard", "return", "vec2", "vec3", "vec4", "ivec2", "ivec3",
				"ivec4", "bvec2", "bvec3", "bvec4", "uint", "uvec2", "uvec3", "uvec4", "dvec2", "dvec3", "dvec4",
				"mat2", "mat3", "mat4", "mat2x2", "mat2x3", "mat2x4", "mat3x2", "mat3x3", "mat3x4", "mat4x2", "mat4x3",
				"mat4x4", "dmat2", "dmat3", "dmat4", "dmat2x2", "dmat2x3", "dmat2x4", "dmat3x2", "dmat3x3", "dmat3x4",
				"dmat4x2", "dmat4x3", "dmat4x4", "lowp", "mediump", "highp", "precision", "sampler1D",
				"sampler1DShadow", "sampler1DArray", "sampler1DArrayShadow", "isampler1D", "isampler1DArray",
				"usampler1D", "usampler1DArray", "sampler2D", "sampler2DShadow", "sampler2DArray",
				"sampler2DArrayShadow", "isampler2D", "isampler2DArray", "usampler2D", "usampler2DArray",
				"sampler2DRect", "sampler2DRectShadow", "isampler2DRect", "usampler2DRect", "sampler2DMS",
				"isampler2DMS", "usampler2DMS", "sampler2DMSArray", "isampler2DMSArray", "usampler2DMSArray",
				"sampler3D", "isampler3D", "usampler3D", "samplerCube", "samplerCubeShadow", "isamplerCube",
				"usamplerCube", "samplerCubeArray", "samplerCubeArrayShadow", "isamplerCubeArray", "usamplerCubeArray",
				"samplerBuffer", "isamplerBuffer", "usamplerBuffer", "image1D", "iimage1D", "uimage1D", "image1DArray",
				"iimage1DArray", "uimage1DArray", "image2D", "iimage2D", "uimage2D", "image2DArray", "iimage2DArray",
				"uimage2DArray", "image2DRect", "iimage2DRect", "uimage2DRect", "image2DMS", "iimage2DMS", "uimage2DMS",
				"image2DMSArray", "iimage2DMSArray", "uimage2DMSArray", "image3D", "iimage3D", "uimage3D", "imageCube",
				"iimageCube", "uimageCube", "imageCubeArray", "iimageCubeArray", "uimageCubeArray", "imageBuffer",
				"iimageBuffer", "uimageBuffer", "struct", "int8_t", "i8vec2", "i8vec3", "i8vec4", "int16_t", "i16vec2",
				"i16vec3", "i16vec4", "int32_t", "i32vec2", "i32vec3", "i32vec4", "int64_t", "i64vec2", "i64vec3",
				"i64vec4", "uint8_t", "u8vec2", "u8vec3", "u8vec4", "uint16_t", "u16vec2", "u16vec3", "u16vec4",
				"uint32_t", "u32vec2", "u32vec3", "u32vec4", "uint64_t", "u64vec2", "u64vec3", "u64vec4", "float16_t",
				"f16vec2", "f16vec3", "f16vec4", "float32_t", "f32vec2", "f32vec3", "f32vec4", "float64_t", "f64vec2",
				"f64vec3", "f64vec4" };
	}

	private static String[] makeReservedKeywords() {
		return new String[] { "common", "partition", "active", "asm", "class", "union", "enum", "typedef", "template",
				"this", "resource", "goto", "inline", "noinline", "public", "static", "extern", "external", "interface",
				"long", "short", "half", "fixed", "unsigned", "superp", "input", "output", "hvec2", "hvec3", "hvec4",
				"fvec2", "fvec3", "fvec4", "filter", "sizeof", "cast", "namespace", "using", "sampler3DRect" };
	}

	private static String[] makeImageFormats() {
		return new String[] { "rgba32f", "rgba16f", "rg32f", "rg16f", "r11f_g11f_b10f", "r32f", "r16f", "rgba16",
				"rgb10_a2", "rgba8", "rg16", "rg8", "r16", "r8", "rgba16_snorm", "rgba8_snorm", "rg16_snorm",
				"rg8_snorm", "r16_snorm", "r8_snorm", "rgba32i", "rgba16i", "rgba8i", "rg32i", "rg16i", "rg8i", "r32i",
				"r16i", "r8i", "rgba32ui", "rgba16ui", "rgb10_a2ui", "rgba8ui", "rg32ui", "rg16ui", "rg8ui", "r32ui",
				"r16ui" };
	}

	private static List<String> makeTemplates() {
		try {
			return List.of( //
					Files.readString(new File("res/templates/common.txt").toPath()),
					Files.readString(new File("res/templates/compute_shader.txt").toPath()),
					Files.readString(new File("res/templates/vertex_shader.txt").toPath()),
					Files.readString(new File("res/templates/tess_control_shader.txt").toPath()),
					Files.readString(new File("res/templates/tess_eval_shader.txt").toPath()),
					Files.readString(new File("res/templates/geometry_shader.txt").toPath()),
					Files.readString(new File("res/templates/fragment_shader.txt").toPath())//
			);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
