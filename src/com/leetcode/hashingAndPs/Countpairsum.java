package com.leetcode.hashingAndPs;

import java.util.HashMap;

//https://www.geeksforgeeks.org/problems/count-pair-sum5956/1
public class Countpairsum {

	public static void main(String[] args) {

		int M = 4, N = 4;
				//int Sum = 10;
				int Sum = 994;
		//int arr1[] = { 1, 3, 5, 7 };
		//int arr2[] = { 2, 3, 5, 8 };
		
		int arr1[] = { 274, 380, 770, 777, 851 };
				int arr2[] = { 143, 256, 580, 861, 885};
		
		System.out.println(countPairs(arr1, arr2, M, N, Sum));

	}

	static int countPairs(int arr1[], int arr2[], int M, int N, int x) {

		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr2.length; i++) {

			hm.put(arr2[i], hm.getOrDefault(arr2[i], 0) + 1);

		}
		int count = 0;
		for (int j = 0; j < arr1.length; j++) {
			int seondpair = x - arr1[j];

			if (hm.containsKey(seondpair)) {
				count += hm.getOrDefault(seondpair, 0);
			}
		}

		return count;

	}
}
