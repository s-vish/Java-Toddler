package javaprograms.stringandmaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * program - 5 Find the maximum occurring character in a String using Maps
 *
 */
public class FindMaximumOccuringCharacter {

	public void findMaximumOccuringCharacter(String str) {
		char[] y = str.toCharArray();
		int size = y.length;
		Map<Character, Integer> map = new LinkedHashMap<>();

		int i = 0;
		while (i != size) {
			if (map.containsKey(y[i]) == false) {
				map.put(y[i], 1);
			} else {
				int oldVal = map.get(y[i]);
				int newVal = oldVal + 1;
				map.put(y[i], newVal);
			}
			++i;
		}

		char c = ' ';
		int maxValue = 0;
		Set<Map.Entry<Character, Integer>> set = map.entrySet();
		for (Map.Entry<Character, Integer> data : set) { // this logic will print first maximum occurring character in a
															// String

			if (data.getValue() > maxValue) {
				c = data.getKey();
				maxValue = data.getValue();
			}

		}
		System.out.println("Key is " + c);
		System.out.println("Val is " + maxValue);

		// This login is used in case we want to print the all maximum occurring
		// characters in a String
		for (Map.Entry<Character, Integer> data : set) {

			if (data.getValue() == maxValue) {
				if (data.getKey() != c) {
					c = data.getKey();
					maxValue = data.getValue();
					System.out.println("Key is " + c);
					System.out.println("Val is " + maxValue);
				}
			}

		}

	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the string ..."); // e.g. GOD_BLESS_SPIDERMAN
		FindMaximumOccuringCharacter obj = new FindMaximumOccuringCharacter();
		obj.findMaximumOccuringCharacter(scr.nextLine());
		scr.close();
	}
}
