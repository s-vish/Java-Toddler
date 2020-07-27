package javaprograms;

public class AddAndSubtractWithoutOperator {

	/**
	 * How to add & subtract without using + and - operators respectively.
	 */
	
	int a=12;
	int b = 5;
	int c;
	private void operationPlus()
	{
		//addition without '+' operator
		c=a-(-b);
		System.out.println("addition of A & B is "+c);
		
	}
	
	private void operationMinus()
	{
		//suntraction without '-' operator
		c=a+(~b+1);
		System.out.println("subtraction of A & B is "+c);
		
	}
	public static void main(String[] args) {
		AddAndSubtractWithoutOperator obj = new AddAndSubtractWithoutOperator();
		obj.operationPlus();
		obj.operationMinus();

	}

}
