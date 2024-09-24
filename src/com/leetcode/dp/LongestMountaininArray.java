package com.leetcode.dp;

public class LongestMountaininArray {

	public static void main(String[] args) {

		int[] arr = { 2, 1, 4, 7, 3, 2, 5 };
		System.out.println(longestMountain(arr));
	}

	public static int longestMountain(int[] arr) {

		int n = arr.length;
		int res = 0;
		for (int i = 1; i < n - 1;) {

			// finding the peack point

			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				int count = 1;

				int j = i;
				while (j > 0 && arr[j] > arr[j - 1]) {

					j--;
					count++;
				}
				while (i < n - 1 && arr[i] > arr[i + 1]) {

					i++;
					count++;
				}
				res = Math.max(res, count);

			} else {
				i++;
			}

		}
		return res;

	}
}
