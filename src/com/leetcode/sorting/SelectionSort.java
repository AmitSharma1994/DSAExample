package com.leetcode.sorting;

//https://www.geeksforgeeks.org/problems/selection-sort/1

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 64, 25, 12, 22, 11,45,67,96,1,12 };

		selectionSort(arr, arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

	static void selectionSort(int arr[], int n) {

		
		for (int i = 0; i < n - 1; i++) {
			int mini = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[mini]) {
					mini = j;
				}
			}
				int temp = arr[mini];
				arr[mini] = arr[i];
				arr[i] = temp;
			

		}
		
		
		
	}
}
