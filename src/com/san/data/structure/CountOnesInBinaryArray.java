package com.san.data.structure;

public class CountOnesInBinaryArray {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * int arr[] = { 1, 1, 1, 1, 0, 0, 0 }; System.out.println(binary(arr)); }
	 */
	public static int binary(int[] nums)
	{
		int l =0;
		int r = nums.length-1;
		while(l<=r)
		{
			int m = l+(r-l)/2;
			if(nums[m]<1)
				l=m+1;
			else if(nums[m]>1)
				r = m-1;
			else if(nums[m] == 1)
			    return m+1;
			    		
	
		}
		return -1;
	}
}
