package javaprograms.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to verify input strings are Anagram or not.
 */
public class Anagram {
	//example of anagram -  silent, listen | brainy, binary | aradhya, hradaya | aradhya He IS, HE iS hRadAya
	public void check(String first_str, String second_str)
	{
		char x[]=first_str.trim().replace(" ", "").toLowerCase().toCharArray();
		char y[]=second_str.trim().replace(" ", "").toLowerCase().toCharArray();
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		boolean flag = Arrays.equals(x, y);
		if(flag==true)
		{
			System.out.println("Strings are Anagram");
		}
		else {
			System.out.println("Strings are not Anagram");
		}
	}
	
	public static void main(String[] args) {
		Anagram obj = new Anagram();
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter first String");
		String str_one = scr.nextLine();
		System.out.println("Enter second String");
		String str_two=scr.nextLine();
		obj.check(str_one, str_two);
		scr.close();
		
	}

}
