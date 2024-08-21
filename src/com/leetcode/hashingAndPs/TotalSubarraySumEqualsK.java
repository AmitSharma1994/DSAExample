package com.leetcode.hashingAndPs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/subarray-sum-equals-k/description/
public class TotalSubarraySumEqualsK {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 }; // { 1, 1, 1 };
		int k = 3;

		System.out.println(subarraySum(nums, k));
	}

	public static int subarraySum(int[] nums, int k) {

		int prefixSum = 0;
		int count = 0;
		Map<Integer, Integer> hm = new HashMap<>();

		hm.put(0, 1);

		for (int i = 0; i < nums.length; i++) {

			prefixSum += nums[i];
			int remove = prefixSum - k;
			if (hm.containsKey(remove)) {
				count += hm.getOrDefault(remove, 0);
			}
			hm.put(prefixSum, hm.getOrDefault(prefixSum, 0) + 1);

		}

		return count;
	}

}
