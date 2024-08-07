package com.array.question.hashingAndPs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
public class Countpairswithgivensum {
	public static void main(String[] args) {
		 int k = 6;
		 int arr[] = { 1, 5, 7, 1 };// o/p=2

		
		
		
      //   int k = 2;
	//	int arr[] = { 1, 1, 1, 1 };
		 
		//int k= 5;
		//int arr[]= { 1, 1 ,4};
		 
			//int k = 2;
			//int arr[] = { 4, 12, 5, 4 };
		System.out.println("output\t"+getPairsCount(arr, k));

	}
/*
	static int getPairsCount(int[] arr, int sum) {
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		int count = 0;
		while (left <= right) {

			if (arr[left] + arr[right] == sum) {
				//count +=(right-left);
				count++;
				left++;
			} else if (arr[left] + arr[right] > sum) {
				right--;
			} else {
				left++;
			}

		}
		return count;
	}*/
	
	//Using hashmap
	
	/*
	static int getPairsCount(int[] arr, int sum) {

		int count = 0;
		Map<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {

			int b = sum - arr[i];
			if (!hm.containsKey(arr[i])) {
				hm.put(arr[i], 1);
				if (hm.containsKey(b) &&i!=0) {
					System.out.println("counting"+hm.get(b));
					count += hm.get(b);
				}
			} else {
				
				if (hm.containsKey(b)) {
					System.out.println("counting"+hm.get(b));
					count += hm.get(b);
				}
				hm.put(arr[i], hm.get(arr[i]) + 1);

			}

			
		}
		System.out.println(hm);

		return count;
	}
	*/
	
	
	static int getPairsCount(int[] arr, int sum) {
		int count = 0;
		Map<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > sum) {
				continue;
			}
			int secondval = sum - arr[i];
			count += hm.getOrDefault(secondval, 0);
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
		}
		System.out.println(hm);

		return count;
	}
	
}
	
