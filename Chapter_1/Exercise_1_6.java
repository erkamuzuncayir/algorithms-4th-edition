// Chapter 1 - Exercise 1.1.6

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

// Program prints first sixteen Fibonacci numbers
public class Exercise_1_6
{
	public static void main( String[] args )
	{
		int f = 0;
		int g = 1;
		for (int i = 0; i <= 15; i++)
		{
			StdOut.println(f);
			f = f + g;
			g = f - g;
		}
	}
}
