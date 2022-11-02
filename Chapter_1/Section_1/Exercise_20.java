// Chapter 1 - Exercise 1.1.20

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise_20
{
	public static void main( String[] args )
	{
		StdOut.println( "Please enter a number: " );
		int number = StdIn.readInt();
		
		double result = GetFactorial( number );
		StdOut.println( result );
	}
	

	private static double GetFactorial( int number )
	{
		if( number == 1 )
			return 0;
		
		return GetFactorial( number - 1 ) + Math.log( number );
	}
}
