package com.san.data.structure;
import java.util.*;
public class FirstRepeatingElement {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * int arr[] = {10, 5, 3, 4, 3, 5, 6}; repeating(arr);
	 * 
	 * }
	 */
	
	public static int repeating( int[] arr)
	{
				
		int min = -1;
		  
        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();
  
        // Traverse the input array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            // If element is already in hash set, update min
            if (set.contains(arr[i]))
                min = i;
  
            else // Else add element to hash set
                set.add(arr[i]);
        }
  
        // Print the result
        if (min != -1) {
            System.out.println(
                "The first repeating element is "
                + arr[min]);}
        
      	return -1;
		}
}
