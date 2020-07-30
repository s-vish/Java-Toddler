package javaprograms.strings;

import java.util.Scanner;

/**
 * Program - 7
 * How to count vowels, consonants & special symbols in a String
 */
public class CountVowelsConsonantsSpecialSymbols {

	public void count(String str) {
		String userInput = str;
		char y[] = userInput.toCharArray();
		int size = y.length;
		int count_vowel = 0;
		int count_consonant = 0;
		int count_special_symbols = 0;

		int i = 0;
		while (i != size) {
			if ((y[i] >= 'a' && y[i] <= 'z') || y[i]>='A' && y[i]<='Z') {
				if (y[i] == 'a' || y[i] == 'e' || y[i] == 'i' || y[i] == 'o' || y[i] == 'u'||
						y[i] == 'A' || y[i] == 'E' || y[i] == 'I' || y[i] == 'O' || y[i] == 'U') {
					count_vowel++;
				} else {
					count_consonant++;
				}
			} else {
				count_special_symbols++;
			}
			++i;
		}

		System.out.println("number of Vowels are : " + count_vowel);
		System.out.println("number of Consonants are : " + count_consonant);
		System.out.println("number of Special Symbols are : " + count_special_symbols);
	}

	public static void main(String[] args) {
		CountVowelsConsonantsSpecialSymbols obj = new CountVowelsConsonantsSpecialSymbols();
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the text....");
		obj.count(scr.nextLine().toString());
		scr.close();
	}

}
