// Chapter 1 - Exercise 1.1.32

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

// I couldn't figured out how can I use StdDraw so, my solution just find interval counts.
public class Exercise_32 
{
	public static void main(String[] args) 
	{
		// Values for test
		double[] a = { 2 , 2.5 , 4.3 , 5.5 , 6.6 , 6.7, 6.8,  8.3, 10 };
		int countOfValues = 4;
		double start = 2.5;
		double end = 9.3;
		
		double interval = ( end - start ) / countOfValues;
		double intervalTraverseValue = start + interval;
		
		int intervalCount = 0;
		int objectCountOfInterval = 0;
		
		for( int i = 0 ; i < a.length ; i++ )
		{
			if( a[ i ] < start && intervalTraverseValue < end )
				continue;

			if( a[ i ] <= intervalTraverseValue )
				objectCountOfInterval++; 
			else if( a[ i ] <= intervalTraverseValue + interval )
			{
				intervalCount++;
				StdOut.printf( "%d. interval count is %d\n" , intervalCount , objectCountOfInterval );
				objectCountOfInterval = 1;
				intervalTraverseValue += interval;
			}			
			else
			{
				intervalCount++;
				StdOut.printf( "%d. interval count is %d\n" , intervalCount , objectCountOfInterval );
				objectCountOfInterval = 0;
				intervalTraverseValue += interval;
			}
		}
	}
}
