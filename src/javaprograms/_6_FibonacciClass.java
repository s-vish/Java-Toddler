package javaprograms;

import java.util.Scanner;

/**
 * Print the nth Number from the Fibonacci series
 *
 */
public class _6_FibonacciClass {

	public int printNumber(int x) {
		int num1 = 0;
		int num2 = 1;
		int temp = 0;
		int i = 2;
		System.out.print(" "+num1);
		while (i <= x) {
			temp = num1 + num2;
			num1 = num2;
			num2 = temp;
			System.out.print(" "+num1);
			++i;
			
		}

		return num1;
	}

	public static void main(String[] args) {
		Scanner scr =new Scanner(System.in);
		System.out.println("Enter the nth index ...");
		int num = scr.nextInt();
		_6_FibonacciClass obj = new _6_FibonacciClass();
		System.out.printf("User has requested %dth Number \n",num);
		System.out.println("\n Answer is >> "+obj.printNumber(num));
		scr.close();

	}
}
