package com.array.question;

import java.util.Arrays;

public class Countpairswithgivensum {
	public static void main(String[] args) {
		//int k = 6;
		//int arr[] = { 1, 5, 7, 1 };

		int k = 2;
		int arr[] = {1, 1, 1, 1};
		System.out.println(getPairsCount(arr, k));

	}

	static int getPairsCount(int[] arr, int sum) {

		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		int count = 0;
		while (left < right ) {

			if (sum == arr[left] + arr[right] ) {

				count++;
				if(arr[right]==arr[right-1]) {
					
					count++;
					right=right-2;
					
				}
				if(arr[left]==arr[left+1]) {
					count++;
					left=left+2;
				}

			}

			else if (sum < arr[left] + arr[right] ) {

				right--;
			}

			else {
				left++;
			}
		}

		return count;
	}
}