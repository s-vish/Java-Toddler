package javaprograms;

public class _2_PrintSemicolonWithoutUsingSemicolon {

	/**
	 * Program - 2
	 * How to Print a semicolon WITHOUT using a semicolon and semicolon at the end.
	 */
	
	public void printSemicolonWithoutSemicolon()
	{
		System.out.printf("%c",+59);
		// %c is character representation
		//59 is ASCII value for semicolon
	}
	public void printSemicolonWithoutSemicolonAtTheEnd()
	{
		if(System.out.printf("%c",+59)==null) {}
	}
	public static void main(String[] args) {
		_2_PrintSemicolonWithoutUsingSemicolon obj = new _2_PrintSemicolonWithoutUsingSemicolon();
		obj.printSemicolonWithoutSemicolon();
		obj.printSemicolonWithoutSemicolonAtTheEnd();
		
	}
	
}
