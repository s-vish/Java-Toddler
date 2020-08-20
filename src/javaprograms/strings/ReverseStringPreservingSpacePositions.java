package javaprograms.strings;

public class ReverseStringPreservingSpacePositions {
	/**
	 * Program - 10
	 * Reverse a string preserving space positions
	 * e.g. given string - Hi This is Vishal
	 * 		result string- la shiV si sihTiH
	 */
	
	
	public void reverseMethod() {
		String str = "i am Vish";
		char[] resultInput=str.toCharArray();
		char[] reverse = new char[resultInput.length];
		
		int i=0;
		while(i!=resultInput.length)
		{
			if(resultInput[i]==' ')
			{
				reverse[i]= ' ';
			}
			++i;
		}
		
		i=0;
		int j = reverse.length-1; //4
		while(i!=resultInput.length)
		{
			if(resultInput[i]!=' ')
			{
				if(reverse[j]==' ')
				{
					j--;
				}
			reverse[j]=resultInput[i];
			j--;
			}
			
			++i;
		}
		System.out.println(reverse);
		
	}
	public static void main(String[] args) {

		ReverseStringPreservingSpacePositions obj = new ReverseStringPreservingSpacePositions();
		obj.reverseMethod();

}
}
