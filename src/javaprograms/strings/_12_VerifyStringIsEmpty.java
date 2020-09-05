package javaprograms.strings;

/**
 * Program - 12
 * Note: String is considered as empty when length of the string is zero
 */
public class _12_VerifyStringIsEmpty {

	public void verifyLength(String str)
	{
	
		if(str.length()==0)
			System.out.println("String is empty");
		else
			System.out.println("String is not empty");
	}
	
	public static void main(String[] args) {
		_12_VerifyStringIsEmpty obj =new _12_VerifyStringIsEmpty();
		String str =""; //other inputs 1. only space | 2. null
		obj.verifyLength(str);
	}
}
