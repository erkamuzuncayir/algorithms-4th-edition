// Chapter 1 - Exercise 1.1.13

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise_13
{
	public static void main( String[] args )
	{
		StdOut.println( "Please enter rows and columns:" );
		int rows = StdIn.readInt();
		int columns = StdIn.readInt();
		
		int[][] twoDimensionalArray = new int[ rows ][ columns ];

		// Generates array
		for( int i = 0 ; i < twoDimensionalArray.length ; i++ )
			for( int j = 0 ; j < twoDimensionalArray[ i ].length ; j++ )
				twoDimensionalArray[ i ][ j ] = StdRandom.uniform( 100 );
		
		StdOut.println( "Normal Array" );
		PrintArray( twoDimensionalArray);
		
		StdOut.println( "Transposed Array" );
		PrintTransposedArray( twoDimensionalArray );

	}
	

	private static void PrintArray( int[][] arr )
	{
		for( int i = 0 ; i < arr.length ; i++ )
		{
			for( int j = 0 ; j < arr[ i ].length ; j++ )
				StdOut.print( arr[ i ][ j ] + " " );
				
			StdOut.println(); // New line
		}
	}
	
	private static void PrintTransposedArray( int[][] arr )
	{
		for( int i = 0 ; i < arr[ i ].length ; i++ )
		{
			for( int j = 0 ; j < arr.length ; j++ )
				StdOut.print( arr[ j ][ i ] + " " );

			StdOut.println(); // New line
		}
	}
}
