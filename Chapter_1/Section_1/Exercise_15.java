// Chapter 1 - Exercise 1.1.15

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise_15
{
	public static void main( String[] args )
	{
		StdOut.print( "Please enter array size: " );
		int size = StdIn.readInt();
		StdOut.print( "Please enter search number: " );
		int searchNumber = StdIn.readInt();
		
		int[] arr = new int[ size ];

		// Generates random array that max number is search number
		for( int i = 0 ; i < arr.length ; i++ )
			arr[ i ] = StdRandom.uniform( searchNumber + 1 );
		
		// Finds search number in randomly filled array.
		int result = Histogram( arr , searchNumber );
		StdOut.println( result );
	}
	
	private static int Histogram( int[] arr , int searchNumber )
	{
		int result = 0;
		for( int i = 0 ; i < arr.length ; i++ )
		{
			if( arr[ i ] == searchNumber )
			{
				StdOut.println( arr[i] );
				return i;
			}
			else
				result++; 
		}
		
		return result;
	}
}
