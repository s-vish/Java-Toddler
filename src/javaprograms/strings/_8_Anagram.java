package javaprograms.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program - 8
 * Program to verify input strings are Anagram or not.
 * 
 * Anagram is a word or phrase formed by rearranging the letters of a different word or phrase.
 */
public class _8_Anagram {
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
		_8_Anagram obj = new _8_Anagram();
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter first String");
		String str_one = scr.nextLine();
		System.out.println("Enter second String");
		String str_two=scr.nextLine();
		obj.check(str_one, str_two);
		scr.close();
		
	}

}
