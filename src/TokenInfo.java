
public class TokenInfo {
	String type;
	String attribute;
	int line;
	
	
	public TokenInfo(String type, String attribute, int line) {
		this.type = type;
		this.attribute = attribute;
		this.line = line;
	}
	
	@Override
	public String toString() {
		return type + ";" + attribute + ";" + line;
	}
	
	public String getType() {
		return type;
	}
}
