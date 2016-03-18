import java.io.FileNotFoundException;


public class ParserMain {
	
	private static CharReader charReader;
	
	public static void main(String[] args) {
		
		if(args[0] == null) {
			System.out.println("No filename passed");
			return;
		}

		try {
			charReader = new CharReader(args[0]);
			
		} catch (FileNotFoundException e) {
			
			System.out.println("File not Found");
			return;
		}
		
		
		TokenInfo token;
		
		do {
			
			token = yylex();
			
		} while(token.getType() != TokenTypeEnum.EOF);
		
	}
	
	
	private static TokenInfo yylex() {
		
		
		
		
		return new TokenInfo(TokenTypeEnum.EOF, "", -1);
	}
		

}
