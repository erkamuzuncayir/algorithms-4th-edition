// Chapter 1 - Exercise 1.1.3

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_3
{
	public static void main( String[] args )
	{
		StdOut.println( "Enter three numbers to determine whetheter equal or not: " );
		int n1 = StdIn.readInt();
		int n2 = StdIn.readInt();
		int n3 = StdIn.readInt();
		
		boolean isEqual = ( n1 == n2 ) && ( n2 == n3);
		
		if( isEqual )
			StdOut.println( "Numbers are equal." );
		else
			StdOut.println( "Numbers are not equal." );
	}
}
