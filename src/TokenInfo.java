
public class TokenInfo {
	private TokenTypeEnum type;
	private String attribute;
	private int line;
	
	
	public TokenInfo(TokenTypeEnum type, String attribute, int line) {
		this.type = type;
		this.attribute = attribute;
		this.line = line;
	}
	
	@Override
	public String toString() {
		return type + ";" + attribute + ";" + line;
	}
	
	public TokenTypeEnum getType() {
		return type;
	}
}
