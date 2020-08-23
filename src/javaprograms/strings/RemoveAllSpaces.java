package javaprograms.strings;

/**
 * Program - 11
 */
public class RemoveAllSpaces {

	public void replaceSpace(String str)
	{
		String y = str;
		y=y.replaceAll("\\s",""); //matches single whitespace character
		System.out.println(y);
		
	}
	
	public static void main(String[] args) {
		RemoveAllSpaces obj =new RemoveAllSpaces();
		obj.replaceSpace("Hello world a			b");
	}
	
}
