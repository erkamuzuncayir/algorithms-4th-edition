// Chapter 1 - Exercise 1.2.1

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise_1 
{
	public static void main(String[] args) 
	{
		int number = Integer.parseInt( args[ 0 ] ); 		
		Point2D[] points = new Point2D[ number ];	
	
		CreateAndDrawPoints( points );

		double shortestDistance = CalculateShortestDistance( points );
		StdOut.printf( "The shortest distance between two point is %.3f" , shortestDistance );
	}
	
	private static void CreateAndDrawPoints( Point2D[] points )
	{
		StdDraw.setCanvasSize( 1024 , 512 );
		StdDraw.setPenRadius( .015 );
		StdDraw.setXscale( 0 , 1 );
		StdDraw.setYscale( 0 , 1 );
		
		for( int i = 0; i < points.length; i++ )
		{
			double randomPointX = StdRandom.uniform();
			double randomPointY = StdRandom.uniform();
			
			Point2D randomPoint = new Point2D( randomPointX , randomPointY );
			
			StdDraw.point(randomPoint.x(), randomPoint.y()); 
			points[ i ] = randomPoint;
		}
	}
	
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
	}
}
