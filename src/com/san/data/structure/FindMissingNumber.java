package com.san.data.structure;

import java.util.HashSet;
import java.util.Set;

public class FindMissingNumber {


	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * int arr[] = {1, 2, 3, 5}; System.out.println(missing(arr));
	 * 
	 * }
	 */
	
	public static int missing(int[] arr)
	{
		Set<Integer> set = new HashSet();
		for(int i : arr)
		{
			set.add(i);
		}
		
		for(int k =1;k<arr.length+1;k++)
		{
			if(!set.contains(k))
			{
				return k;
			}
		}
		
		return -1;
	}

}
