package javaprograms.strings;

import java.util.Scanner;

public class _6_VerifyIntegerString {
	
	/**
	 * Program - 6
	 * How to verify if a String contains only integers
	 */

	//Approach - 1
	public void check(String str)
	{
		char y[]=str.toCharArray(); // here we are using character array to extact each character from the object.
		int size = y.length;
		
		int i=0;
		while(i!=size)
		{
			if(y[i]>='0' && y[i]<='9')
			{
				i++;
			}
			else
			{
				System.out.println("not an integer string");
				System.exit(0);
			}
		
		}
		System.out.println("It's an integer string");
	}
	
	//Approach - 2
	public void check2(String str)
	{
		// In this program we are using charAt() method to deal with each charater stored in str object.
		int size = str.length();
		int i = 0;
		while(i!=size)
		{
			if(str.charAt(i)>='0'&&str.charAt(i)<='9')
			{
				++i;
			}
			else
			{
				System.out.println("Not an integer string");
				System.exit(0);
			}
		}
		System.out.println("It's an integer String");
	}
	
	public static void main(String[] args) {
		_6_VerifyIntegerString obj = new _6_VerifyIntegerString();
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the text...");
//		obj.check(scr.nextLine().toString());
		obj.check2(scr.nextLine().toString());
		scr.close();
	}
	
}
