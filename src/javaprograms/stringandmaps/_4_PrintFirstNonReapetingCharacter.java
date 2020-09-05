package javaprograms.stringandmaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Program - 4
 * Print first non-repeating character from the string.
 * e.g 'sillyspider', 'chocolate', 'lili'
 */
public class _4_PrintFirstNonReapetingCharacter {

	public void printNonRepeatingCharacter(String str)
	{
		char[]y=str.toCharArray();
		int size = y.length;
		Map<Character,Integer>map = new LinkedHashMap<>();
		
		int i=0;
		while(i!=size)
		{
			if(map.containsKey(y[i])==false)
			{
				map.put(y[i], 1);
			}
			else
			{
				int oldValue=map.get(y[i]);
				int newValue=oldValue+1;
				map.put(y[i], newValue);
			}
			++i;
		}
		
		Set<Map.Entry<Character,Integer>>set = map.entrySet();
		for (Map.Entry<Character, Integer> data : set) {
			if(data.getValue()==1)
			{
			System.out.println(data.getKey());
			System.exit(0); 
			}
		}
		System.out.println("Input string having no non-repeating character");
		
	}
	
	public static void main(String[] args) {
		_4_PrintFirstNonReapetingCharacter obj = new _4_PrintFirstNonReapetingCharacter();
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the string...");
		obj.printNonRepeatingCharacter(scr.nextLine());
		scr.close();
	}
	
}
