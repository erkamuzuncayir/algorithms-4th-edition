// Chapter 1 - Exercise 1.1.29

import edu.princeton.cs.algs4.StdOut;

public class Exercise_29
{
    public static void main(String[] args) 
    {
        int[] arr = { 1 , 2 , 3 , 4 , 4 , 4 , 5 };
        int key = 4;
        
        FindLesser( arr , key );
    }
    
    public static void FindLesser( int[] arr , int key )
    {
        int truncatedLength = 0;
        for( int value: arr )
        {
            if( value < key )
            {  
                truncatedLength++;
            }
        }
        int[] truncatedArr = new int[truncatedLength];
        int count = 0;
    
        for( int i = 0 ; i < arr.length ; i++ )
        {
            if( arr[i] < key )
            {  
                truncatedArr[i] = arr[i];
            }
            else if( arr[i] == key )
                count++;
        }
        
        StdOut.println( "Key count: " + count );
        StdOut.print( "Lesser values: " );
        for( int value: truncatedArr)
            StdOut.print(value + " ");
    }
}
