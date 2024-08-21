package com.leetcode.hashingAndPs;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/contiguous-array/description/

/*Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.*/


public class ContiguousArray {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0 };
		System.out.println(findMaxLength(nums));
	}

	public static int findMaxLength(int[] nums) {

		int maxlenght = 0;
		int prefixsum = 0;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				nums[i] = -1;
			}
			prefixsum += nums[i];
			if (!map.containsKey(prefixsum)) {
				map.put(prefixsum, i);
			} else {
				int lenght = i - map.get(prefixsum);
				if (lenght > maxlenght) {
					maxlenght = lenght;
				}
			}

		}

		return maxlenght;
	}

}
