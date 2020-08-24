package javaprograms.strings;

import java.util.Scanner;

/**
 * Swipe two string without using 3rd String variable
 *
 */
public class StringSwapping {

	public void swipe(String str1, String str2)
	{
		System.out.printf("Before swapping \n"+"String one is "+str1 +"\n"+"String two is "+str2+"\n");
		str1=str1+str2;
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.printf("\nAfter swapping \n"+"String one is "+str1 +"\n"+"String two is "+str2);
		
	}
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the first String");
		String str1 = scr.nextLine();
		System.out.println("Enter the seconds String");
		String str2=scr.nextLine();
		StringSwapping obj = new StringSwapping();
		obj.swipe(str1, str2);
		scr.close();
	}

}
