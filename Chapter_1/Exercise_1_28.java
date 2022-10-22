// Chapter 1 - Exercise 1.1.28

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_28
{    
	public static void main(String[] args) 
    {
        int[] arr = { 1 , 2 , 3 , 3 , 4 , 5 };
        int i = 0;
        int j = 1;
        
        while( j < arr.length ) 
        {
            if( arr[i] == arr[j])
                j++;
            else
                arr[++i] = arr[j];
        }
        
        for( int value: arr)
            StdOut.println(value);
    }
}
