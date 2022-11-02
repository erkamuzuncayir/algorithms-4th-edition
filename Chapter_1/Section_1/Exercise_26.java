// Chapter 1 - Exercise 1.1.26

import edu.princeton.cs.algs4.StdOut;

public class Exercise_26
{
	public static void main( String[] args )
	{
		int a = 3 , b = 2 , c = 1 , t = 0;
		
		if (a > b) 
		{ 
			t = a; 
			a = b; 
			b = t; 
		}
		if (a > c) 
		{ 
			t = a; 
			a = c; 
			c = t; 
		}
		if (b > c) 
		{ 
			t = b; 
			b = c; 
			c = t; 
		}
			
		StdOut.printf( "a is %d, b is %d, c is %d, t is %d" , a , b , c , t );
	}
}
