// Chapter 1 - Exercise 1.1.24

import java.util.Arrays;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise_24
{
	public static void main( String[] args )
	{
		StdOut.println( "Please enter a number: " );
		int n1 = StdIn.readInt();
		StdOut.println( "Please enter another number: " );
		int n2 = StdIn.readInt();
		
		int result = ComputeGCD( n1 , n2 );
		
		StdOut.printf( "GCD of two number is %d " , result );
	}

	public static int ComputeGCD( int n1 , int n2 )
	{ 
		if( n2 == 0 )
			return n1;
			
		int temp = n1 % n2;
		return ComputeGCD( n2 , temp );	
	}
}
