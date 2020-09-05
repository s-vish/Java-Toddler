package javaprograms.strings;

/**
 * Program - 9
 * Verify is the string is a pangram
 * pangram is a sentence using every letter of a given alphabet at least once.
 * e.g - the quick brown fox jumps over a lazy dog
 */
public class _9_Pangram {

	
	public void checkPanram(String str)
	{
	char y[] = str.replace(" ", "").toUpperCase().toCharArray();
	int size = y.length;
	int a[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	
	int i=0;
	while(i!=size) {
		int index = y[i]-65;
		a[index]=1;
		++i;
	}
	
	i=0;
	while(i!=26)
	{
		if(a[i]==1)
		{
			++i;
		}
		else
		{
			System.out.println("Not a Pangram");
			System.exit(0);
		}
	}
	System.out.println("it is a Pangram");
	}
	public static void main(String[] args) {
		_9_Pangram obj = new _9_Pangram();
		obj.checkPanram("the quick brown fox jumps over a lazy dog");
	}
}
