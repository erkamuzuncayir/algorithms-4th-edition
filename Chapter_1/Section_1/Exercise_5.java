// Chapter 1 - Exercise 1.1.5

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise_5
{
	public static void main( String[] args )
	{
		StdOut.println( "Enter two numbers to determine if they are between 0 and 1 or not: " );
		double n1 = StdIn.readDouble();
		double n2 = StdIn.readDouble();
		
		boolean isBothBetweenZeroAndOne = ( n1 > 0 && n1 < 1) && ( n2 > 0 && n2 < 1);
		
		if( isBothBetweenZeroAndOne )
			StdOut.println( isBothBetweenZeroAndOne );
		else
			StdOut.println( isBothBetweenZeroAndOne );
	}
}
