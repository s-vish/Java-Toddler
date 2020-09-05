package javaprograms.strings;

import java.util.Scanner;

/**
 * Program - 14
 * write a program to count number of words present in sentence
 */
public class _14_CountWords {
	
	public void countWords(String str)
	{
		
		String[]y=str.split(" ");
		System.out.println("number of words are "+y.length);
		for (String data : y) {
			System.out.println(data);
		}
		
	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the string...");
		_14_CountWords obj = new _14_CountWords();
		obj.countWords(scr.nextLine());
		scr.close();
	}
}
