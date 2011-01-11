package org.strategoxt.debug.core.util;


public class StringUtil {

	/**
	 * Trims the quotes.
	 * <p>
	 * For example,
	 * <ul>
	 * <li>("a.b") => a.b
	 * <li>("a.b) => "a.b
	 * <li>(a.b") => a.b"
	 * <li>(""a.b"") => "a.b"
	 * </ul>
	 * 
	 * @param value
	 *            the string may have quotes
	 * @return the string without quotes
	 */
	public static String trimQuotes(String value) {
		if (value == null)
			return value;

		value = value.trim();
		if (value.startsWith("\"") && value.endsWith("\""))
			return value.substring(1, value.length() - 1);

		return value;
	}
	
	/**
	 * Concat the contents of String[] A and String[] B and return the result.
	 * 
	 * Method also accepts null as method parameter.
	 * @param A
	 * @param B
	 * @return
	 */
	public static String[] concat(String[] A, String[] B) {
		// If A and B are null it will enter the first if-block in the first call 
		// and in the second call it will enter the second if-block. 
		if (A == null)
		{
			return concat(new String[0], B);
		}
		else if (B == null)
		{
			return concat(A, new String[0]);
		}
		else
		{
			String[] C = new String[A.length + B.length];
			System.arraycopy(A, 0, C, 0, A.length);
			System.arraycopy(B, 0, C, A.length, B.length);
			return C;
		}
	}
}
