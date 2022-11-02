// Chapter 1 - Exercise 1.1.11

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise_11
{
	public static void main( String[] args )
	{
		boolean[][] twoDimensionalBooleanArray = new boolean[ 5 ][ 5 ];
		
		for( int i = 0 ; i < twoDimensionalBooleanArray.length ; i++ )
		{
			for( int j = 0 ; j < twoDimensionalBooleanArray[ i ].length ; j++ )
			{
				twoDimensionalBooleanArray[ i ][ j ] = ( Math.random() ) > 0.5 ? true : false;
				StdOut.print( twoDimensionalBooleanArray[ i ][ j ] );
			}
			StdOut.println();
		}
	}
}
