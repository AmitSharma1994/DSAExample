package com.array.searchsorting;

import java.util.ArrayList;
import java.util.List;

public class FirstandLastOccurrences {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };

		System.out.println(find(arr, 9, 5));

	}

	public static ArrayList<Integer> find(int arr[], int n, int x) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(findFirst(arr, x));
		list.add(findLast(arr, x));

		return list;
	}

	private static int findFirst(int[] arr, int x) {
		int low = 0, high = arr.length - 1;
		int result = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == x) {
				result = mid;
				high = mid - 1; // Look for earlier occurrence
			} else if (arr[mid] > x) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return result;
	}

	private static int findLast(int[] arr, int x) {
		int low = 0, high = arr.length - 1;
		int result = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == x) {
				result = mid;
				low = mid + 1; // Look for later occurrence
			} else if (arr[mid] > x) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return result;
	}

}
