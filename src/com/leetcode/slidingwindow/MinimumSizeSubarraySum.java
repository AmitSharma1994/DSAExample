package com.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

//https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=study-plan-v2&envId=top-interview-150
/*Given an array of positive integers nums and a positive integer target, return the minimal length of a 
subarray
 whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.*/
public class MinimumSizeSubarraySum {

	public static void main(String[] args) {

		int target = 15; // 11 o/p=0
		//int[] nums = { 2, 3, 1, 2, 4, 3 };
		int[] nums={1,2,3,4,5};

		System.out.println(minSubArrayLen(target, nums));
	}

	public static int minSubArrayLen(int target, int[] nums) {
		//int window = nums.length;
		int window = Integer.MAX_VALUE;
		int start=0,end=0,currsum=0;
		
		for(end=0;end<nums.length;end++) {
			
			currsum+=nums[end];
			
			while(currsum>=target) {
				currsum-=nums[start];
				window=Math.min(window, end-start+1);
				start++;
			}
			
		}
		
		

		return window==Integer.MAX_VALUE?0:window;
	}
}
