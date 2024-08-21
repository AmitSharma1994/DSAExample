package com.leetcode.greedy;

public class JumpGame {

	public static void main(String[] args) {

		int[] nums = {3,2,1,0,4 };

		System.out.println(canJump(nums));

	}

	public static boolean canJump(int[] nums) {

		int finaldestination = nums.length - 1;

		for (int i = nums.length - 2; i >= 0; i--) {

			if (i + nums[i] >= finaldestination) {

				finaldestination = i;
			}

		}

		return finaldestination == 0;

	}
}
