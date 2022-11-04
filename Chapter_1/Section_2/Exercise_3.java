// Chapter 1 - Exercise 1.2.3

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;

public class Exercise_3
{
	public static void main(String[] args) 
	{
		int count = Integer.parseInt( args[ 0 ] ); 		
		double minValue = Double.parseDouble( args[ 1 ] ); 		
		double maxValue = Double.parseDouble( args[ 2 ] ); 		
		
		Interval2D[] interval_array = new Interval2D[ count ];	
		Interval1D[] interval_width_array = new Interval1D[ count ];
		Interval1D[] interval_height_array = new Interval1D[ count ];
		
		CreateAndDrawRectangles( interval_array , interval_width_array , interval_height_array , minValue , maxValue );
		DetectAndPrintIntersectAndContainCount( interval_array , interval_width_array , interval_height_array );
	}
	
	private static void CreateAndDrawRectangles( Interval2D[] interval_array , Interval1D[] interval_width_array , Interval1D[] interval_height_array, double min , double max )
	{
		
		double canvasMaxValue = max * 2;
		StdDraw.setPenRadius( .005 );
		StdDraw.setScale( 0 , max * 2 );
		
		for( int i = 0; i < interval_array.length; i++ )
		{
			Interval1D width = GenerateInterval2D( min , max );
			Interval1D height = GenerateInterval2D( min , max );
			Interval2D rectangle = new Interval2D( width , height );
			
			interval_width_array[ i ] = width;
			interval_height_array[ i ] = height;
			interval_array[ i ] = rectangle;
			
			rectangle.draw();
		}
	}
	
	private static Interval1D GenerateInterval2D( double min , double max )
	{
		double smallOne = StdRandom.uniformDouble( min , max );
		double bigOne = StdRandom.uniformDouble( min , max );
	
		if( smallOne > bigOne )
		{
			double temp = bigOne;
			bigOne = smallOne;
			smallOne = temp;
		}
		
		return new Interval1D( smallOne , bigOne );
	}
	
	private static void DetectAndPrintIntersectAndContainCount( Interval2D[] interval_array , Interval1D[] interval_width_array , Interval1D[] interval_height_array )
	{
		int intersectCount = 0;
		int containCount = 0;
		for( int i = 0 ; i < interval_array.length - 1 ; i++ )
		{
			for( int j = i + 1 ; j < interval_array.length ; j++ )
			{

				if( interval_array[ i ].intersects( interval_array[ j ] ) )
				{
					intersectCount++;
					if( ( ( interval_width_array[ i ].min() < interval_width_array[ j ].min() && 
							interval_width_array[ i ].max() > interval_width_array[ j ].max() ) && 
							( interval_height_array[ i ].min() < interval_height_array[ j ].min() && 
							interval_height_array[ i ].max() > interval_height_array[ j ].max() ) ) || 
						( ( interval_width_array[ i ].min() > interval_width_array[ j ].min() && 
							interval_width_array[ i ].max() < interval_width_array[ j ].max() ) && 
							( interval_height_array[ i ].min() > interval_height_array[ j ].min() && 
							interval_height_array[ i ].max() < interval_height_array[ j ].max() ) ) )
					{
						containCount++;
						intersectCount--;
					}					
				}
			}
		}
		
		StdOut.printf( "There are %d contains and %d intersects.\n" , containCount , intersectCount );
	}
}
