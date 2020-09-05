package javaprograms.strings;


/**
 * Program - 15
 * Delete all occurrences of a given character from a String.
 */
public class _15_DeleteTheCharacterFromString {
	
	public static void main(String[] args) {
		
		String str = "sillyspider";
		char[]y=str.toCharArray();
		int size = y.length;
		int i= 0;
		char c ='d'; //value of which all occurrences should be removed.
		String result ="";
		while(i!=size)
		{
			if(y[i]!=c)
			{
				result=result+y[i];
			}
			++i;
		}
		System.out.println("Given String is : >"+str);
		System.out.println("Final String is : >"+result);
	}

}
