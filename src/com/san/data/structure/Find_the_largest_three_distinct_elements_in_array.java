package com.san.data.structure;

import java.util.Arrays;

public class Find_the_largest_three_distinct_elements_in_array {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * int arr[] = {10, 4, 3, 50, 23, 90} ; largestThree(arr);
	 * 
	 * }
	 */	
	public static void largestThree(int[] arr)
	{
		int i, first, second, third;
		third = first = second = Integer.MIN_VALUE;
	        for (i = 0; i < arr.length; i++) {
	            /* If current element is greater than
	            first*/
	            if (arr[i] > first) {
	                third = second;
	                second = first;
	                first = arr[i];
	            }
	 
	            /* If arr[i] is in between first and
	            second then update second  */
	            else if (arr[i] > second) {
	                third = second;
	                second = arr[i];
	            }
	 
	            else if (arr[i] > third)
	                third = arr[i];
	        }
	 
	        System.out.println("Three largest elements are " + first + " " + second + " " + third);
	    
	 
		
	}
	
	

}
