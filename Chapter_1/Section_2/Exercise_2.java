// Chapter 1 - Exercise 1.2.2

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Interval1D;

public class Exercise_2
{
	public static void main(String[] args) 
	{
		int intervalCount = Integer.parseInt( args[ 0 ] );
		Interval1D[] interval_array = new Interval1D[ intervalCount ];	

		for( int i = 0; i < intervalCount; i++ )
		{
			double start = StdIn.readDouble();
			double end = StdIn.readDouble();
			interval_array[ i ] = new Interval1D( start, end ); 
			
		}

		FindAndPrintIntersectIntervals( interval_array );
	}
	
	private static void FindAndPrintIntersectIntervals( Interval1D[] interval_array )
	{
		boolean doesIntersect = false;
		for( int i = 0; i < interval_array.length - 1; i++ )
		{
			for( int j = i + 1; j < interval_array.length; j++ )
			{
				doesIntersect = interval_array[ i ].intersects( interval_array[ j ] );
				if( doesIntersect )
				{
					doesIntersect = false;

					StdOut.printf( "The interval arrays %.2f - %.2f and %.2f - %.2f are intersects each other\n" , 										interval_array[ i ].min() , interval_array[ i ].max() , 
									interval_array[ j ].min() , interval_array[ j ].max() );
				}
			}
		}
		
	}
}
