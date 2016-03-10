import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class TokenTypeRegex {

	public static final Pattern
		INT = Pattern.compile("\\b(int)\\b"),
		FUNC = Pattern.compile("\\b(function)\\b"),
		MAIN = Pattern.compile("\\b(main)\\b"),
		IF = Pattern.compile("\\b(if)\\b"),
		THEN = Pattern.compile("\\b(then)\\b"),
		ELSE = Pattern.compile("\\b(else)\\b"),
		NUM = Pattern.compile("0 | [1-9][0-9]*"),
		ID = Pattern.compile("[a-z][a-zA-Z0-9]*"),
		FID = Pattern.compile("[A-Z][a-zA-Z0-9]"),
		ASSIGN = Pattern.compile("="),
		PLUS = Pattern.compile("+"),
		MINUS = Pattern.compile("-"),
		MULT = Pattern.compile("*"),
		DIV = Pattern.compile("/"),
		AND = Pattern.compile("&&"),
		OR = Pattern.compile("||"),
		REL = Pattern.compile("== | != | <= | >= | < | >"),
		SC = Pattern.compile(";"),
		LP = Pattern.compile("("),
		RP = Pattern.compile(")"),
		LC = Pattern.compile("{"),
		RC = Pattern.compile("}");
//	CMMNT
//	WHITE
//	EOF
	
	public static List<Pattern> getTokenTypes() {
		
		List<Pattern> tokenTypes = new ArrayList<Pattern>();
		
		tokenTypes.add(INT);
		tokenTypes.add(FUNC);
		tokenTypes.add(MAIN);
		tokenTypes.add(IF);
		tokenTypes.add(THEN);
		tokenTypes.add(ELSE);
		tokenTypes.add(NUM);
		tokenTypes.add(ID);
		tokenTypes.add(FID);
		tokenTypes.add(ASSIGN);
		tokenTypes.add(PLUS);
		tokenTypes.add(MINUS);
		tokenTypes.add(MULT);
		tokenTypes.add(DIV);
		tokenTypes.add(AND);
		tokenTypes.add(OR);
		tokenTypes.add(REL);
		tokenTypes.add(SC);
		tokenTypes.add(LP);
		tokenTypes.add(RP);
		tokenTypes.add(LC);
		tokenTypes.add(RC);
//		tokenTypes.add(CMMNT);
//		tokenTypes.add(WHITE);
//		tokenTypes.add(EOF);
		
		
		return tokenTypes;
	}
		
		
	
}
