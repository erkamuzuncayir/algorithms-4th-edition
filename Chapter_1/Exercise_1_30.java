// Chapter 1 - Exercise 1.1.30

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_30
{
	public static void main( String[] args )
	{
		StdOut.println( "Please enter one number for rows and columns:" );
		int arrayDepth = StdIn.readInt();
		
		boolean[][] twoDimensionalArray = GenerateArray( arrayDepth );

		for( int i = 0 ; i < twoDimensionalArray.length ; i++ )
		{
			for( int j = 0 ; j < twoDimensionalArray[ i ].length ; j++ )
				StdOut.print( twoDimensionalArray[i][j] );
			
			StdOut.println();
		}
	}
	

	private static boolean[][] GenerateArray( int arrayDepth )
	{
		boolean[][] arr = new boolean[ arrayDepth ][ arrayDepth ];
		
		for( int i = 0 ; i < arr.length ; i++ )
			for( int j = 0 ; j < arr[ i ].length ; j++ )
			{
				if( ComputeGCD( i , j ) == 1 )
				{
					arr[ i ][ j ] = false;

				}
				else
					arr[ i ][ j ] = true;		
			}
			
		return arr;
	}
	
	public static int ComputeGCD( int n1 , int n2 )
	{
		if( n2 == 0 )
			return n1;
			
		int temp = n1 % n2;
		return ComputeGCD( n2 , temp );	
	}
}
