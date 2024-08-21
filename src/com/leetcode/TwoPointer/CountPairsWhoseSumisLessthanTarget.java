package com.leetcode.TwoPointer;

//https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CountPairsWhoseSumisLessthanTarget {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(-1, 1, 2, 3, 1);
		int target = 2;
		System.out.println(countPairs(nums, target));
	}

	public static int countPairs(List<Integer> nums, int target) {

		Collections.sort(nums);  //sorting

		int left = 0;  //left Pointer
		int right = nums.size() - 1; //right Pointer
		int sum = 0;
		while (left <= right) {
			if (nums.get(left) + nums.get(right) < target) {
				sum += right - left;  //counting the pairs.
				left++;  //if target is less than then we are incraseing left pointer so that will count more pairs
			} else {
				right--;  //if target is greater than then we are decrasing right pointer means //because larger number is avaible in right side.
			}

		}
		return sum;
	}
}
