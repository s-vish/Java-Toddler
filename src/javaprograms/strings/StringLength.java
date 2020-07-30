package javaprograms.strings;

import java.util.Scanner;

public class StringLength {
	
	/**
	 * program - 1
	 * Calculate the string length without using length() method
	 */
	
	public void stringLength()
	{

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the String..");
		String str = scr.nextLine();
		scr.close();
		str = str.concat("\0");  //'\0' is an escape character
		char y[]=str.toCharArray();
		int i=0;
		int count=0;
		
		
		while(y[i]!='\0')
		{
			++count;
			++i;
		}
		
		System.out.printf("length of the string is %d",count);
		
		
		
	}
	
	public static void main(String[] args) {
		StringLength obj = new StringLength();
		obj.stringLength();
		
	}

}
