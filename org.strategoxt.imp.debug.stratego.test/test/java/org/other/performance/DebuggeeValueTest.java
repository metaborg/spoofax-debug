package org.other.performance;

public class DebuggeeValueTest {

	public int BREAKPOINT = 23;
	
	public static void main(String[] args) {
		DebuggeeValueTest test = new DebuggeeValueTest();
		test.loopStrings();
	}
	
	public static String STRINGHOLDER = "stringHolder";
	
	protected String stringHolder = null;
	
	public void loopStrings()
	{
		int maxStringLength = 200;
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < maxStringLength; i++)
		{
			stringHolder = builder.toString();
			nothing(); // BREAKPOINT
			builder.append(nextChar());
		}
	}
	
	public char nextChar()
	{
		return 'a';
	}
	
	public void nothing()
	{
		
	}
}
