package javaprograms.strings;

import java.util.Scanner;


/** 
 *program - 3
 *Copy one String to another 
 */
public class ReverseTheString {
	public void reverseString(String str)
	{
		String actualString = str;
		char y[] = actualString.toCharArray();
		int size = y.length;
		
		char x[] = new char[size];
		
		int i=0;
		while(i!=size)
		{
			x[(size-1)-i]=y[i];
			++i;
		}
		System.out.println(x);
		
	}
	
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the text");
		ReverseTheString obj =new ReverseTheString();
		obj.reverseString(scr.nextLine());
		scr.close();
				
	}
	
/*
 * this program is similar to "Copy one String to another" just one condition is changed in while loop.
 *  
 */

}
