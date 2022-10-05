// Chapter 1 - Exercise 1.1.16

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_16
{
	public static void main( String[] args )
	{
		int number = StdIn.readInt();
		String result = exR1( number );
		StdOut.println( result );
	}
	// Returns 311361142246
	public static String exR1(int n)
	{
		if (n <= 0) return "";
		return exR1(n-3) + n + exR1(n-2) + n;
	}
}
