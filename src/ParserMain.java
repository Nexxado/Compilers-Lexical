import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ParserMain {
	
	public static void main(String[] args) {
//		System.out.println(args[0]);
		
		Pattern ID = Pattern.compile("int");
		Matcher matcher = ID.matcher("dafuq int this int is");
		matcher.find();
		System.out.println(matcher.group());
		
//		while(matcher.find()) {
//			System.out.println("I found the text \"" + matcher.group() + "\" starting at index " + matcher.start() + " and ending at index " + matcher.end());
//			
//			System.out.println(matcher.group());
//		}
	}
}
