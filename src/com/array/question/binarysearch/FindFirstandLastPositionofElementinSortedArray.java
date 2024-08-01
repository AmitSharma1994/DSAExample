package com.array.question.binarysearch;

public class FindFirstandLastPositionofElementinSortedArray {

	public static void main(String[] args) {

		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;

		int result[] = searchRange(nums, target);

		System.out.println(result[0] + "\t" + result[1]);

	}

	public static int[] searchRange(int[] nums, int target) {

		int left = findLeftBoundIndex(nums, target);
		int right = findRightBoundIndex(nums, target);

		return new int[] { left, right };
	}

	private static int findLeftBoundIndex(int[] nums, int target) {

		int index = -1;
		int low = 0;
		int high = nums.length - 1; // 6--5

		while (low <= high) {

			int mid = (low + high) / 2;

			if (nums[mid] == target) {

				index = mid;
				high = mid - 1;

			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return index;
	}

	private static int findRightBoundIndex(int[] nums, int target) {

		int index = -1;
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = (low + high)/ 2;
			if (nums[mid] == target) {
				index = mid;
				low = mid + 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}

		return index;
	}
}