package javaprograms.strings;

import java.util.Scanner;

/** 
 *program - 2
 *Copy one String to another 
 */
public class _2_CopyOneStringToAnother {
	
	public void copyString(String str)
	{
		String userInput = str;
		char y[]=userInput.toCharArray();
		int size = y.length;
		
		char x[]=new char[size];
		int i=0;
		
		while(i!=size)
		{
			x[i]=y[i];
			++i;
		}
		System.out.println(y);
		System.out.println(x);
		
		
	}
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = scr.nextLine();
		scr.close();
		System.out.println("\n");
		_2_CopyOneStringToAnother obj = new _2_CopyOneStringToAnother();
		obj.copyString(s);
		
	}
	
	/**
	 * Steps 
	 * 1. Create a String object
	 * 2. Extract the data from string object and store it in char array
	 * 3. compute the length of the array
	 * 4. create a new array with the length we have calculated in step 3
	 * 5. create index variable in initialized it to zero
	 * 6. copy data from one array to another
	 * 7. print the array
	 */

}
