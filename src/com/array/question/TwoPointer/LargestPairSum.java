package com.array.question.TwoPointer;

//https://www.geeksforgeeks.org/problems/pair-sum--120604/1?page=1&category=two-pointer-algorithm&sortBy=difficulty

public class LargestPairSum {

	public static void main(String[] args) {

		int arr[] = { 12, 34, 10, 6, 40 };

		System.out.println(pairsum(arr));

	}

	public static int pairsum(int[] arr) {

		int left = 0;
		int right = arr.length - 1;

		int pair1 = arr[left];
		int pair2 = arr[right];

		while (left < right) {

			if (arr[left + 1] > arr[left]) {

				pair1 = arr[left];
				left++;
			}

			else if (arr[right - 1] > arr[right]) {
				pair2 = arr[right];
				right--;
			}
			else {
				left++;
				right--;
			}
		}

		return pair1+pair2;
	}
}
