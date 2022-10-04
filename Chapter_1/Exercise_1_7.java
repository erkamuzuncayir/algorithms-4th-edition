// Chapter 1 - Exercise 1.1.7

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_7
{
	public static void main( String[] args )
	{
		// a. Finds square root of number
		StdOut.println( "a." );
		double t = 9.0;
		while (Math.abs(t - 9.0/t) > .001)
			t = (9.0/t + t) / 2.0;
		StdOut.printf("%.5f\n", t);
		
		
		// b. Sum of numbers from 1 to 1000
		StdOut.println( "b." );
		int sum = 0;
		for (int i = 1; i < 1000; i++)
			for (int j = 0; j < i; j++)
				sum++;
		StdOut.println(sum);
		
		// c. 
		
		StdOut.println( "c." );
		int sum = 0;
		for (int i = 1; i < 1000; i *= 2)
			for (int j = 0; j < 1000; j++)
				sum++;
		StdOut.println(sum);
		
	}
}
