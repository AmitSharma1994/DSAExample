package com.leetcode.greedy;

public class JumpGameII {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 1, 4 };
		
		System.out.println(jump(nums));

	}

	public static int jump(int[] nums) {
		int destination = nums.length-1;
		int totaljump = 0;
		int lastjumpindex = 0;
		int coverage = 0;
if(nums.length==1) {
	return 0;
	
}
		
		for (int i = 0; i < nums.length; i++) {

			coverage = Math.max(coverage, i + nums[i]);

			if (i == lastjumpindex) {
				lastjumpindex = coverage; //2
				totaljump++;
				if (coverage >= destination) {
					return totaljump;
				}
			}

		}

		return totaljump;
	}

}
