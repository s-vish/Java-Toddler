package javaprograms;

public class _4_AddAndSubtractWithoutOperator {

	/**
	 * Program - 4
	 * How to add & subtract without using + and - operators respectively.
	 */
	
	private int a=12;
	private int b = 5;
	private int c;
	public void operationPlus()
	{
		//addition without '+' operator
		c=a-(-b);
		System.out.println("addition of A & B is "+c);
		
	}
	
	public void operationMinus()
	{
		//subtraction without '-' operator
		c=a+(~b+1);
		System.out.println("subtraction of A & B is "+c);
		
	}
	public static void main(String[] args) {
		_4_AddAndSubtractWithoutOperator obj = new _4_AddAndSubtractWithoutOperator();
		obj.operationPlus();
		obj.operationMinus();

	}

}
