//  Write a Java program to test the equality of two arrays.

import java.util.Arrays;

class TestEquality 
{
    public static void main( String args[] ) 
	{
        int [] arr1 = new int [] {20, 5, -95, 43, 17};
        int [] arr2 = new int [] {20, 5, -95, 43, 17};
        System.out.println(Arrays.equals(arr1, arr2));
    }
}