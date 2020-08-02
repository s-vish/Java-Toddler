package javaprograms.strings;

import java.util.Scanner;

/**
 * Program - 5
 * here formula is (upper_case = lower_case - 32) &  (lower_case= upper_case + 32)
 */
public class ConvertCase {

	// Program to convert loser case string to upper case
	public void lowerToUpper(String str) {
		String userInput = str;
		char x[] = userInput.trim().toLowerCase().toCharArray(); // trim the string and convert all characters before doing operation
		int size = x.length;
		int i = 0;

		while (i != size) {
			if (x[i] != ' ') { //if condition performs uppercase conversion operation only if character is not a blank space.
				x[i] = (char) (x[i] - 32);
			}
			++i;
		}
		System.out.println("user input : " + str);
		System.out.print("result : ");
		System.out.println(x);
	}

	// Program to convert upper case string to lower case
	public void upperToLower(String str) {
		String userInput = str;
		char x[] = userInput.trim().toUpperCase().toCharArray(); // trim the string and convert all characters before doing operation
		int size = x.length;
		int i = 0;
		while (i != size) {
			if (x[i] != ' ') {
				x[i] = (char) (x[i] + 32);
			}
			++i;
		}
		System.out.println("user input : " + str);
		System.out.print("result : ");
		System.out.println(x);
	}

	// Program to convert first letter of every work in upper case.
	public void upperFirstUpperCase(String str) {
		String userInput = str;
		
		char cArr[] = userInput.trim().toLowerCase().toCharArray(); //trim the string and convert all characters before doing operation
		int size = cArr.length;

		int i = 0;
		cArr[i] = (char) (cArr[i] - 32);
		while (i != size) {
			if (cArr[i] == ' ' && cArr[i + 1] != ' ') {
				cArr[i + 1] = (char) (cArr[i + 1] - 32);
			}

			i++;
		}
		System.out.println("user input : " + str);
		System.out.print("result : ");
		System.out.println(cArr);

	}

	public static void main(String[] args) {
		ConvertCase obj = new ConvertCase();
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the text...");

		obj.lowerToUpper(scr.nextLine().toString()); // e.g. "hello world", "HellO WoRLd", "HELLoWorld" 
		obj.upperToLower(scr.nextLine().toString()); //e.g. "HELLO WORLD" ,"hello world", "HellO WoRLd", "HELLoWorld"
		obj.upperFirstUpperCase(scr.nextLine().toString()); // e.g. "hello world", "HellO WoRLd", "HELLoWorld"
		scr.close();

	}
}
