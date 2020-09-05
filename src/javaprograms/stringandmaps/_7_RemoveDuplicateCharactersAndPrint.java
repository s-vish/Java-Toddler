package javaprograms.stringandmaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Program - 7  remove duplicate characters in a String using Maps
 * Print only single occurrence of each letter 
 */
public class _7_RemoveDuplicateCharactersAndPrint {
	
	public void printSingleTime(String str)
	{
		char[]y = str.toCharArray();
		int size = y.length;
		Map<Character,Integer>map = new LinkedHashMap<>();
		int i =0;
		while(i!=size)
		{
			if(map.containsKey(y[i])==false)
			{
				map.put(y[i], 1);
			}
			else
			{
				int oldVal=map.get(y[i]);
				int newVal=oldVal+1;
				map.put(y[i], newVal);
			}
			++i;
		}
		
		Set<Map.Entry<Character,Integer>>set=map.entrySet();
		for (Map.Entry<Character, Integer> data : set) {
			System.out.println(data.getKey());
		}
		
	}

	public static void main(String[] args) {
		_7_RemoveDuplicateCharactersAndPrint obj = new _7_RemoveDuplicateCharactersAndPrint();
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the String...");
		obj.printSingleTime(scr.nextLine());
		scr.close();
	}
}
