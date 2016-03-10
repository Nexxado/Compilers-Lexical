import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ParserMain {
	
	static int lineIndex = 0;
	static int charIndex = 0;
	
	public static void main(String[] args) {
//		System.out.println(args[0]);
		
		Pattern ID = Pattern.compile("\\bint\\b");
		Matcher matcher = ID.matcher("");
//		matcher.find();
//		System.out.println(matcher.group());
//		System.out.println(matcher.matches());
		
//		while(matcher.find()) {
//			System.out.println("I found the text \"" + matcher.group() + "\" starting at index " + matcher.start() + " and ending at index " + matcher.end());
//			
//			System.out.println(matcher.group());
//		}
		
		TokenInfo token;
		String line = "";
		String content = "";
		
			try {
				content = new Scanner(new File("test.txt")).useDelimiter("\\Z").next();
			} catch (FileNotFoundException e1) {
				System.out.println("Couldn't open file");
				return;
			}
			
			for(int i = 0; i < content.length(); i++) {
				if(Pattern.compile("\\s").matcher(content.charAt(i) + "").matches())
					System.out.print("#");
				else
					System.out.print(content.charAt(i));
			}
		
		
//		do {
//			
//			token = yylex(line);
//			System.out.println(token);
//			
//		} while(token.getType().equals("EOF"));
		
	}
	
	
	private static TokenInfo yylex(String input) {
		
		int charIndex = 0;
		int lineIndex = 1;
		String temp;
		
		try {
			
			Scanner sc = new Scanner(new File("test.txt"));
//			temp = sc.nextLine();
//			System.out.println(temp);
//			temp = sc.nextLine();
//			System.out.println(temp);
//			temp = sc.nextLine();
//			System.out.println(temp);
//			temp = sc.nextLine();
//			System.out.println(temp);
//			temp = sc.nextLine();
//			System.out.println(temp);
			
			while(true) {
				
				temp = sc.nextLine();
				String lexema;
				
				for(int i = 0; i < temp.length(); i++) {
					char c  = temp.charAt(i);
					
				}
				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			System.out.println("File Ended - " + e);
		}
		
		return null;
	}
	
}
