package javaprograms.stringandmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map stores data in Key, Value format.
 * 
 *
 */

public class MapOfString {
	
	public static void main(String[] args) {
		
		String str = "vishalshevale";
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

}
