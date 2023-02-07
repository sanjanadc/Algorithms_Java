package com.san.data.structure;

import java.util.Arrays;

public class TwoElementsCloseToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 60, -10, 70, -80, 85};
		int k =0;
		System.out.println(closetozero(arr,k));
	}
	
	public static int closetozero(int[] nums,int k)
	{
		 Arrays.sort(nums);
	        int answer = -1;
	        int left = 0;
	        int right = nums.length - 1;
	        while (left < right) {
	            int sum = nums[left] + nums[right];
	            if (sum < k) {
	                answer = Math.max(answer, sum);
	                left++;
	            } else {
	                right--;
	            }
	        }
	        return answer;
				
	}
		
		
	}
