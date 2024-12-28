package info;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

public class PreParsingInfo {
	public List<Token> toSkip = new ArrayList<>();
	public List<String> includes = new ArrayList<>();
}
