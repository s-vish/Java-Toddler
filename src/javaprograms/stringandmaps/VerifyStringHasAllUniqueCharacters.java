package javaprograms.stringandmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Program - 1
 * Verify String has ALL UNIQUE CHARACTERS or NOT
 * e.g. 'spiderman' is having all unique characters where as 'sillyspiderman' is not having unique characters.
 */
public class VerifyStringHasAllUniqueCharacters {
	
	public void verifyMethod(String str)
	{
		String userInputStr = str;
		char[]y=userInputStr.toCharArray();
		int size = y.length;
		
		Map<Character, Integer>map = new HashMap<>();
		
		int i=0;
		while(i!=size)
		{
			if(map.containsKey(y[i])==false)
			{
				map.put(y[i], 1);
			}
			else
			{
				int oldVal= map.get(y[i]);
				int newVal= oldVal+1;
				map.put(y[i],newVal);
			}
			
			++i;
		}
		
		Set<Map.Entry<Character,Integer>>hmap = map.entrySet();
		for (Map.Entry<Character, Integer> data : hmap) {
			if(data.getValue()>1)
			{
				System.out.println("String not having unique characters");
				System.exit(0);
			}
		}
		System.out.println("String is having unique characters");
	}
	
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the String..");
		String inputStr = scr.nextLine();
		VerifyStringHasAllUniqueCharacters obj = new VerifyStringHasAllUniqueCharacters();
		obj.verifyMethod(inputStr);
		scr.close();
	}

}
