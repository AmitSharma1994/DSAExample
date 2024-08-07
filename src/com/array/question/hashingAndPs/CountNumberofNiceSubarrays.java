package com.array.question.hashingAndPs;

//https://leetcode.com/problems/count-number-of-nice-subarrays/description/
public class CountNumberofNiceSubarrays {

	public static void main(String[] args) {
		int[] gain = {-4,-3,-2,-1,4,3,2};
		//{0,-5,-4,1,1,-6}
		System.out.println(runningSum(gain));
		
	}

	/*
	 * public int numberOfSubarrays(int[] nums, int k) {
	 * 
	 * Math. return 2; }
	 */
	
	public static int runningSum(int[] gain) {

		int[] arr = new int[gain.length + 1];
		int prefixsum = 0;
		arr[0] = 0;
		int max = arr[0];
		for (int i = 0; i < gain.length; i++) {
			prefixsum += gain[i];
			arr[i + 1] = prefixsum;
		}

		for (int j = 1; j < arr.length; j++) {
			if (arr[j] > max) {
				max = arr[j];
			}
		}

		return max;
	}
}
