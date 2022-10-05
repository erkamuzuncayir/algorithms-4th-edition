// Chapter 1 - Exercise 1.1.19

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_19
{
	public static void F()
	{
		long f = 0;
		long g = 1;
		for (int i = 0; i < 93; i++)
		{
			/* 	
				93th fibonacci number is the biggest fibonacci number 
				we can print as a long value type.
			*/
			StdOut.println( i+1 + " " + f);
			f = f + g;
			g = f - g;
		}
	}
	public static void main(String[] args)
	{
		F();
	}
}
