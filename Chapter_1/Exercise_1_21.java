// Chapter 1 - Exercise 1.1.21

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_21
{
	public static void main( String[] args )
	{
		StdOut.println( "Please enter how much data do you want to store: " );
		int count = StdIn.readInt();
		
		// Arrays for datas
		String[] nameArr = new String[ count ];
		int[] numberArr = new int[ count ];
		int[] dividerArr = new int[ count ];
		double[] resultArr = new double[ count ];
		
		// Gets input and store them
		for( int i = 0 ; i < count ; i++ )
		{
			StdOut.println( "Please enter name: " );
			nameArr[ i ] = StdIn.readString();
			StdOut.println( "Please enter a number: " );
			numberArr[ i ] = StdIn.readInt();
			StdOut.println( "Please enter a divider: " );
			dividerArr[ i ] = StdIn.readInt();
		
			resultArr[ i ] = numberArr[ i ] / (double)dividerArr[ i ];
		}
		
		// Prints table
		StdOut.printf( "Name\t\tNumber\tResult\n" );
		for( int i = 0 ; i < count ; i++ )
			StdOut.printf( "%S\t\t%d\t%.3f\n" , nameArr[ i ] , numberArr[ i ] , resultArr[ i ] );
	}
	
}
