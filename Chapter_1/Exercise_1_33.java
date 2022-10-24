// Chapter 1 - Exercise 1.1.33

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;


public class Exercise_1_33 // Matrix Class
{
	public static void main(String[] args) 
	{
		// vector-dot product
		double[] dotProductVectorExampleA = { -4 , -9 };
		double[] dotProductVectorExampleB = { -1 , 2 };
		StdOut.println( Dot( dotProductVectorExampleA , dotProductVectorExampleB ) );
	
		// matrix-matrix product
		double[][] multExampleA = { { 1 , 2 , 3 } , { 4 , 5 , 6 } };
		double[][] multExampleB = { { 7 , 8 } , { 9 , 10 } , { 11 , 12 } };
		double[][] multResult = Mult( multExampleA , multExampleB );
		for( double[] e : multResult )
		{
			for( var f : e )
				StdOut.println( f );	
			StdOut.println();
		}
		
		// matrix-vector product
		double[][] multExampleC = { { 1 , 2 , -3 } , { 2 , 9 , 0 } , { 6 , -1 , -2 } };
		double[] multExampleD = { 2 , 3 , -1 };
		double[] multResultB = Mult( multExampleC , multExampleD );
		for( var e : multResultB )
			StdOut.println( e );	
			
		// transpose
		double[][] transposeExample = { { 1 , 3 , 5 } , { 2 , 4 , 6 } };
		double[][] transposeResult = Transpose( transposeExample );
		
		for( double[] e : transposeResult )
		{
			for( var f : e )
				StdOut.println( f );	
			StdOut.println();
		}
		
	}
	
	public static double Dot( double[] x , double[] y ) // vector dot product
	{
		double result = 0;
		for( int i = 0 ; i < x.length ; i++ )
		{
			result += x[ i ] * y[ i ];
		}
		
		return result;
	}
	
	public static double[][] Mult( double[][] x , double[][] y ) // matrix-matrix product
	{
		double[][] result = new double[ x.length ][ y[ 0 ].length ];
		for( int i = 0; i < x.length ; i++ )
		{
			for( int j = 0; j < y[ i ].length ; j++ )
			{
				var temp = 0;
				for( int k = 0; k < x[ j ].length ; k++ )
				{
					temp += x[ i ][ k ] * y[ k ][ j ];
					result[ i ][ j ] = temp;
				}
			}
		}
		
		return result;
	}
	
	public static double[] Mult( double[][] x , double[] y ) // matrix-vector product
	{
		double[] result = new double[ y.length ];
		for( int i = 0; i < x.length ; i++ )
		{
			var temp = 0;
			for( int j = 0; j < y.length ; j++ )
			{
				temp += x[ i ][ j ] * y[ j ];
				result[ i ] = temp;
			}
		}
		
		return result;
	}
	
	public static double[][] Transpose( double[][] a ) // transpose
	{
		double[][] result = new double[ a[ 0 ].length ][ a.length ];
		for( int i = 0; i < a.length ; i++ )
		{
			for( int j = 0; j < a[ i ].length ; j++ )
			{
				result[ j ][ i ] = a[ i ][ j ];
			}
		}
		
		return result;		
	}
}
