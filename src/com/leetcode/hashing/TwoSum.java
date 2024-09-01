package com.leetcode.hashing;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		int nums[] = { 1, 4, 5, 2, 7, 11, 15 };
		int target = 9;
		
		System.out.println(twoSum(nums, target));

	}

	public static int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap(); // 2,0
		int[] index = new int[2];
		int count = 0;
		map.put(nums[0], 0);
		for (int i = 1; i < nums.length; i++) {
			map.put(nums[i], i);
			int checkvalue = target - nums[i]; // 9-2 7 9-7=2

			if (map.containsKey(checkvalue)) {

				int value = map.get(checkvalue); // 0,1
				index[count++] = value;
				index[count++] = i;
				break;

			}
			map.put(nums[i], i);

		}

		return index;

	}
}
