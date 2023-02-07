package com.san.data.structure;

public class Binary_Search {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * int arr[] = { 5, 6, 7, 8, 9, 10 }; int key = 9;
	 * System.out.print(search(arr,key));
	 * 
	 * }
	 */

	public static int search(int[] array, int target)
	{
		int l =0;
		int r = array.length-1;
		while(l<=r)
		{
			int m = l+(r-l)/2;
			if(array[m]== target)
				return m;
			else if(array[m]<target)
				l = m+1;
			else
				r=m-1;
		}
		return -1;
	}
}
