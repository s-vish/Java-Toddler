package javaprograms;

import java.io.PrintStream;

public class PrintIfElseAtATime {
	
	/**
	 * program -3
	 * Challenge is to print If block and else block at a time.
	 * @param args
	 */

	private void print()
	{
		if(System.out.printf("Hello If block \n")==null) {}
		else System.out.print("HEllo Else blcok!");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintIfElseAtATime obj = new PrintIfElseAtATime();
		obj.print();
		
		 
	}

}