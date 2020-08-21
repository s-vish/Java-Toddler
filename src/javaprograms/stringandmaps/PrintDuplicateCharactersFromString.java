package javaprograms.stringandmaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * print duplicate characters present in a String using Maps
 *
 */
public class PrintDuplicateCharactersFromString {

	public void printDuplicateCharacters(String str)
	{
		char[]y=str.toCharArray();
		int size = y.length;
		Map<Character,Integer> map = new LinkedHashMap<>();
		int i = 0;
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
		
		Set<Map.Entry<Character,Integer>>set = map.entrySet();
		for (Map.Entry<Character, Integer> data : set) {
			if(data.getValue()>1)
			{
				System.out.println(data.getKey() +" : "+data.getValue());
			}
		}
	}
	
	public static void main(String[] args) {
		PrintDuplicateCharactersFromString obj =new PrintDuplicateCharactersFromString();
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the String..."); //e.g 'sillyspider' , 'maharashtra' , 'bangaluru'
		obj.printDuplicateCharacters(scr.nextLine());
		scr.close();
	}
}
