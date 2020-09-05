package javaprograms.stringandmaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Program - 3
 * Print all non-repeating characters from the string
 */
public class _3_PrintAllNonRepeatedCharactersInString {

	public void printNonRepeatedCharacters(String str) {

		String userInput = str;
		char[] y = userInput.toCharArray();
		int size = y.length;

		Map<Character, Integer> map = new LinkedHashMap<>();

		int i = 0;
		while (i != size) {
			if (map.containsKey(y[i]) == false) {
				map.put(y[i], 1);
			} else {
				int oldVvalue = map.get(y[i]);
				int newValue = oldVvalue + 1;
				map.put(y[i], newValue);
			}
			++i;
		}
		
		
		//print - method 1
		Set <Map.Entry<Character,Integer>> set =map.entrySet();
		for (Map.Entry<Character, Integer> data : set) {
			if(data.getValue()==1)
			{
			System.out.println(data.getKey()+" : " +data.getValue());
			}
		}
		
		
		//print - method 2
//		Set<Character>set=map.keySet();
//		for (Character data : set) {
//			if(map.get(data)==1)
//			System.out.println(data + " : "+map.get(data));
//		}

	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the string value...");
		_3_PrintAllNonRepeatedCharactersInString obj = new _3_PrintAllNonRepeatedCharactersInString();
		obj.printNonRepeatedCharacters(scr.nextLine());
		scr.close();
	}
}
