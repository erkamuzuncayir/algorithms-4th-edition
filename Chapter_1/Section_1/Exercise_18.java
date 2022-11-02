// Chapter 1 - Exercise 1.1.18

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise_18
{
	public static void main( String[] args )
	{
		StdOut.println( "Please enter a number: " );
		int n1 = StdIn.readInt();
		StdOut.println( "Please enter another number: " );
		int n2 = StdIn.readInt();
		FirstMystery( n1 , n2 );
		SecondMystery( n1 , n2 );
	}
	
	public static int FirstMystery(int a, int b)
	{
		StdOut.println( a + " " + b );
		if (b == 0)
		{
			System.out.printf( "First mystery a: %d b: %d\n" , a , b ); 
			return 0;
		}
		if (b % 2 == 0) return FirstMystery(a+a, b/2);
		return FirstMystery(a+a, b/2) + a;
	}
	
	public static int SecondMystery(int a, int b)
	{
		StdOut.println( a + " " + b );
		if (b == 1)
		{
			System.out.printf( "Second mystery a: %d b: %d\n" , a , b ); 
			return 1;
		}
		if (b % 2 == 0) return SecondMystery(a*a, b/2);
		return SecondMystery(a*a, b/2) * a;
	}
}
