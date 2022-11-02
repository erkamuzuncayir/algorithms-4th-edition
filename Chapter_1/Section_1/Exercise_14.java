// Chapter 1 - Exercise 1.1.14

import edu.princeton.cs.algs4.StdOut;

public class Exercise_14
{
	public static void main( String[] args )
	{
		int number = Integer.parseInt( args[ 0 ] );
		Lg( number );
	}

	private static void Lg( int number )
	{
		int maxNumberLesserThanArgument = 0;
		for( int i = 1 ; i < number ; i *= 2 )
			maxNumberLesserThanArgument++;
		
		StdOut.println( --maxNumberLesserThanArgument );
	}
}
