// Chapter 1 - Exercise 1.1.12

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise_12
{
	public static void main( String[] args )
	{
		// It prints 0 to 10 numbers respectively.
		int[] a = new int[10];
		for (int i = 0; i < 10; i++)
			a[i] = 9 - i;
		for (int i = 0; i < 10; i++)
			a[i] = a[a[i]];
		for (int i = 0; i < 10; i++)
			System.out.println(i);
	}
}
