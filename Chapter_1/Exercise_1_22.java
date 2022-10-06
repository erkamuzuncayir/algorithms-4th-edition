// Chapter 1 - Exercise 1.1.22

import java.util.Arrays;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise_1_22
{
	public static void main( String[] args )
	{
		StdOut.println( "Please enter a number between 0 and 100: " );
		int n = StdIn.readInt();
		int[] numberArr = new int[100];
		
		for(int i = 0 ; i < numberArr.length ; i++ )
			numberArr[ i ] = StdRandom.uniform( 100 );
			
		Arrays.sort( numberArr );
		int result = rank( n , numberArr );
	
		StdOut.printf( "Number is found at index %d" , result );
		
	}

	public static int rank(int key, int[] a)
	{ 
		return rank(key, a, 0, a.length - 1); 
	}

	public static int rank(int key, int[] a, int lo, int hi)
	{ 
		BinarySearchWatcher( a[ lo ] , a[ hi ] );
		// Index of key in a[], if present, is not smaller than lo
		// and not larger than hi.
		if (lo > hi) 
			return -1;
		int mid = lo + (hi - lo) / 2;
		if (key < a[mid]) 
			return rank(key, a, lo, mid - 1);
		else if (key > a[mid]) 
			return rank(key, a, mid + 1, hi);
		else 
			return mid;
	}
	
	public static void BinarySearchWatcher( int lo, int hi )
	{
		StdOut.printf( "low is %d and high is %d\n" , lo ,hi );
	
	}
}
