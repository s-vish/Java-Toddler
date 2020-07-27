package javaprograms;

public class PrintSemicolonWithoutUsingSemicolon {

	/**
	 * How to Print a semicolon WITHOUT using a semicolon and semicolon at the end.
	 */
	
	private void printSemicolonWithoutSemicolon()
	{
		System.out.printf("%c",+59);
		// %c is character representation
		//59 is ASCII value for semicolon
	}
	private void printSemicolonWithoutSemicolonAtTheEnd()
	{
		if(System.out.printf("%c",+59)==null) {}
	}
	public static void main(String[] args) {
		PrintSemicolonWithoutUsingSemicolon obj = new PrintSemicolonWithoutUsingSemicolon();
		obj.printSemicolonWithoutSemicolon();
		obj.printSemicolonWithoutSemicolonAtTheEnd();
		
	}
	
}
