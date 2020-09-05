
package javaprograms.strings;

import java.util.Scanner;

/**
 * program -4
 * String is Palindrome or not.
 */
public class _4_Palindrome {

	public void palindromeCheck(String str) {
	String userInput = str;
	userInput = userInput.replace(" ", ""); //removes black spaces
	userInput = userInput.toUpperCase(); //convert all to characters in string to upper case.
	char x[]=userInput.toCharArray();
	int size = x.length;
	
	char y[]= new char[size];
	int i=0;
	while(i!=size)
	{
		y[(size-1)-i]=x[i];
		++i;
	}
		
	i=0;
	while(i!=size)
	{
		if(y[i]!=x[i])
		{
			System.out.println("String is NOT a Palindrome");
			System.exit(0);
		}
		else
		{
			++i;
			continue;
		} 
	}
	System.out.println("String is a Palindrome");
	}
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the string");
		String inputText = scr.nextLine();
		scr.close();

		_4_Palindrome obj = new _4_Palindrome();
		obj.palindromeCheck(inputText);
	}
	
	/**
	 * Login for palindrome
	 * 1. Save the string data without spaces using .replace method
	 * 2. Save the string data using .toUpperCase or .toLowerCase method.
	 * 3. Store string data in char array
	 * 4. Store the charr array data into another char array in reverse order
	 * 5. use a loop to check whether characters at each index are matching or not
	 */

}
