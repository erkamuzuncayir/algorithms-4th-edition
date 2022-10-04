// Chapter 1 - Exercise 1.1.9

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_9
{
	public static void main( String[] args )
	{
		StdOut.println( "Please enter an integer:" );
		
		int n = StdIn.readInt();
		String binaryN = "";
		
		for( int i = n ; i > 0 ; i /= 2 )
		{
			binaryN = ( i % 2 ) + binaryN;
		}
		StdOut.println( binaryN );
	}
}
