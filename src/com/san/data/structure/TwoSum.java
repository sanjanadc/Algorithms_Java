package com.san.data.structure;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,7,11,15};
		int target = 9;
		int [] result = twoSum(array,target);
		for(int i : result)
		{
			System.out.println(i);
		}
		
	}
	
	public static int[] twoSum(int[] nums, int target)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		for(int i =0;i<nums.length;i++)
		{
			if(map.containsKey(target - nums[i]))
			{
				return new int[] {map.get(target-nums[i]),i};
			}
			map.put(nums[i],i);
		}
		return null;
	}

}
