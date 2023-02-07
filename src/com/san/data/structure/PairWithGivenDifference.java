package com.san.data.structure;

import java.util.HashMap;

public class PairWithGivenDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 20, 3, 2, 50, 80};
		int n = 78;
		difference(arr,n);
	}
	
	public static int[] difference(int[] arr, int n)
	{
		
	

	    HashMap<Integer,Integer> map = new HashMap();
	    for(int i =0;i<arr.length;i++)
	    {
	    	int comp = n+arr[i];
	    	if(map.containsKey(comp))
	    	{
	    	
	    		return new int[] {map.get(comp),arr[i]};
	    	}
	    	map.put(arr[i],i);
	    	
	    }
	  return null;	
	}

}
