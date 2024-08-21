package com.leetcode.slidingwindow;
//https://leetcode.com/problems/maximum-average-subarray-i/description/

public class MaximumAverageSubarrayI {

	public static void main(String[] args) {

		int[] nums = { 1, 12, -5, -6, 50, 3 };
		int k = 4;

		System.out.println(findMaxAverage(nums,k));
		
	}

	public static  double findMaxAverage(int[] nums, int k) {
		double sum=0;
		
		for(int i=0;i<k;i++) {
			
			sum+=nums[i];
		}
		
		System.out.println(sum);
		double maxisum=sum;
		int startIndex=0;
		int endIndex=k;
		
		while(endIndex<nums.length) {
			
			sum=sum-nums[startIndex];
			startIndex++;
			sum=sum+nums[endIndex];
			endIndex++;
			maxisum=Math.max(sum, maxisum);
		}
		
		System.out.println(maxisum); 
		
		return maxisum/k;
	}
}
