package javaprograms;

public class _5_Swapping {

	/**
	 * program - 5
	 * Swap two numbers using Addition and Subtraction operators.
	 * Swap two numbers using Multiplication and Division operators.
	 * Swap two numbers using Bitwise operator.
	 * Swap using single line statement for above three cases.
	 * Swap three numbers
	 * Swap four numbers
	 */
	
	private int a =6;
	private int b = 0;
	private  int c=10;
	private int d=14;
	
	public void swapUsingPlusAndMinus()
	{
		System.out.println("Using Addition and Subtraction operators.");
		System.out.printf("Before swapping : a=%d and b=%d \n",a,b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.printf("After swapping : a=%d and b=%d\n" ,a,b);
		/**
		 * Limitation is... it may fail due to overflow.
		 */
	}
	
	public void swapUsingMulAndDiv()
	{
		System.out.println("\nUsing Multiplication and Division operators.");
		System.out.printf("Before swapping : a=%d and b=%d \n",a,b);
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.printf("After swapping : a=%d and b=%d \n",a,b);
		/**
		 * Limitation is... it may fail due to exception. i.e if one of the number is zero.
		 */
	}
	
	public void swapUsingBitwiseOperator()
	{
		System.out.println("\nSwap two numbers using Bitwise operator.");
		System.out.printf("Before swapping : a=%d and b=%d \n",a,b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.printf("After swapping : a=%d and b=%d \n",a,b);
				
		/**
		 * this swapping technique is most reliable as no failure due to overflow or exception.
		 */
	}
	
	public void singleLineSwappingOperation() {
		System.out.println("\nSwap two numbers using Bitwise operator.");
		System.out.printf("Before swapping : a=%d and b=%d \n",a,b);
//		a=a+b-(b=a);	//or 
//		a=a*b/(b=a);	//or
		a=a^b^(b=a);
		System.out.printf("After swapping : a=%d and b=%d \n",a,b);
	}
	
	public void swapThreeNumbers()
	{
		System.out.println("\nSwap three numbers using Bitwise operator.");
		System.out.printf("Before swapping : a=%d and b=%d c=%d\n",a,b,c);
		a=a^b^(b=a);
		b=b^c^(c=b);
		System.out.printf("After swapping : a=%d b=%d and c=%d\n",a,b,c);
	}
	
	public void swapFourNumbers()
	{
		System.out.println("\nSwap four numbers using Bitwise operator.");
		System.out.printf("Before swapping : a=%d and b=%d c=%d and d=%d \n",a,b,c,d);
		a=a^b^(b=a);
		b=b^c^(c=b);
		c=c^d^(d=c);
		
		System.out.printf("After swapping : a=%d and b=%d c=%d and d=%d \n",a,b,c,d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_5_Swapping obj =new _5_Swapping();
//		obj.swapUsingPlusAndMinus();
//		obj.swapUsingMulAndDiv();
//		obj.swapUsingBitwiseOperator();
//		obj.singleLineSwappingOperation();
//		obj.swapThreeNumbers();
//		obj.swapFourNumbers();
	}

}
