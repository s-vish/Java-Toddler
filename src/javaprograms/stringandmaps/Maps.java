package javaprograms.stringandmaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * Program - 1
 * Map stores data in Key, Value format.
 */



public class Maps {

/**
 * Sequence of data received as user input is not maintained while storing it.	
 */
	public void hashMap(String str)
	{
		Map<Character, Integer> map = new HashMap();
		char y[]=str.toCharArray();
		int size = y.length;
		int i=0;
		while(i!=size)
		{
			if(map.containsKey(y[i])==false)
			{
				map.put(y[i], 1);
			}
			else
			{
				int old_val = map.get(y[i]);
				int new_val = old_val+1;
				map.put(y[i], new_val);
			}
			++i;
		}
		
		

		Set<Entry<Character, Integer>> hmap = map.entrySet();
		for (Entry<Character, Integer> data: hmap) {
			System.out.print(data.getKey());
			System.out.println(data.getValue());
		}
	}
	
	/**
	 * Data is stored in key value format with ascending order when we use tree map.
	 */
	public void treeHashMap(String str)
	{
		Map<Character, Integer> map = new TreeMap<>();
		char y[]=str.toCharArray();
		int size = y.length;
		int i=0;
		while(i!=size)
		{
			if(map.containsKey(y[i])==false)
			{
				map.put(y[i], 1);
			}
			else
			{
				int old_val = map.get(y[i]);
				int new_val = old_val+1;
				map.put(y[i], new_val);
			}
			++i;
		}
		
		

		Set<Entry<Character, Integer>> hmap = map.entrySet();
		for (Entry<Character, Integer> data: hmap) {
			System.out.print(data.getKey());
			System.out.println(data.getValue());
		}
	}
	
	/**
	 * order of the character occurrence in input string is maintained 
	 * while storing the data in in map format when we use LinkedHashMap.
	 */
	public void linkedHashMap(String str)
	{
		Map<Character, Integer> map = new LinkedHashMap<>();
		char y[]=str.toCharArray();
		int size = y.length;
		int i=0;
		while(i!=size)
		{
			if(map.containsKey(y[i])==false)
			{
				map.put(y[i], 1);
			}
			else
			{
				int old_val = map.get(y[i]);
				int new_val = old_val+1;
				map.put(y[i], new_val);
			}
			++i;
		}
		
		

		Set<Entry<Character, Integer>> hmap = map.entrySet();
		for (Entry<Character, Integer> data: hmap) {
			System.out.print(data.getKey());
			System.out.println(data.getValue());
		}
	}
	
	public static void main(String[] args) {
		
		Maps obj = new Maps();
//		obj.hashMap("sillyspider");
//		obj.treeHashMap("sillyspiders");
		obj.linkedHashMap("sillyspider");
	}

}
