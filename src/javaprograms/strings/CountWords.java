package javaprograms.strings;

import java.util.Scanner;

/**
 * Program - 14
 * write a program to count number of words present in sentence
 */
public class CountWords {
	
	public void countWords(String str)
	{
		
		String[]y=str.split(" ");
		for (String data : y) {
			System.out.println(data);
		}
		
	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the string...");
		CountWords obj = new CountWords();
		obj.countWords(scr.nextLine());
		scr.close();
	}
}
