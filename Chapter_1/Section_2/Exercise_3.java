// Chapter 1 - Exercise 1.2.3

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise_3
{
	public static void main(String[] args) 
	{
		int count = Integer.parseInt( args[ 0 ] ); 		
		double minValue = Double.parseDouble( args[ 1 ] ); 		
		double maxValue = Double.parseDouble( args[ 2 ] ); 		
		
		Interval2D[] interval_array = new Interval2D[ count ];	
	
		CreateAndDrawRectangles( interval_array , minValue , maxValue );
/*
		double shortestDistance = CalculateShortestDistance( points );
		StdOut.printf( "The shortest distance between two point is %.3f" , shortestDistance );
*/
	}
	
	private static void CreateAndDrawRectangles( Interval2D[] interval_array , double min , double max )
	{
		
		double canvasMaxValue = max * 2;
		StdDraw.setPenRadius( .005 );
		StdDraw.setScale( 0 , max* 2 );
		
		for( int i = 0; i < interval_array.length; i++ )
		{
			Interval1D width = GenerateInterval2D( min , max );
			Interval1D height = GenerateInterval2D( min , max );
			double halfWidth = width.length() / 2;
			double halfHeight = height.length() / 2;
			
			Interval2D rectangle = new Interval2D( width , height );
			rectangle.draw();
		/*			
		*	double randomPointX = StdRandom.uniformDouble( halfWidth , canvasMaxValue - halfWidth );
		*	double randomPointY = StdRandom.uniformDouble( halfHeight , canvasMaxValue - halfHeight );
		*	
		*	
		*	StdDraw.rectangle( 2 , 2 , halfWidth , halfHeight ); */
			
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
	/*
	private static double CalculateShortestDistance( Point2D[] points )
	{
		double shortestDistance = points[ 0 ].distanceTo( points[ 1 ] );
		double distanceBetweenTwoPoint = shortestDistance;
		for( int i = 0; i < points.length - 1; i++ )
		{
			for( int j = i + 1; j < points.length; j++ )
			{
				distanceBetweenTwoPoint = points[ i ].distanceTo( points[ j ] );
				
				if( distanceBetweenTwoPoint < shortestDistance )
					shortestDistance = distanceBetweenTwoPoint; 
			}
		}
		
		return shortestDistance;
	}*/
}
