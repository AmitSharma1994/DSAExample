package com.array.question.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1

public class MaxSumSubarrayofsizeK {

	public static void main(String[] args) {

		int N = 4, K = 2;
			List<Integer>	Arr = Arrays.asList(100, 200, 300, 400);
			
			System.out.println(MaxSumSubarrayofsizeK(K, Arr, N));
		
}

	private static long MaxSumSubarrayofsizeK(int K, List<Integer> Arr, int N) {
		

		long sum = 0;
		for (int i = 0; i < K; i++) {
			sum = sum + Arr.get(i);

		}

		System.out.println(sum);
		long maxisum = sum;

		int startIndex = 0;
		int endIndex = K;

		while (endIndex < N) {
			sum = sum - Arr.get(startIndex);
			startIndex++;
			sum = sum + Arr.get(endIndex);
			endIndex++;
			maxisum=Math.max(maxisum, sum);
		}
		return maxisum;
		
	}

	static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N) {

		long sum = 0;
		for (int i = 0; i < K; i++) {
			sum = sum + Arr.get(i);

		}

		long maxisum = sum;

		int startIndex = 0;
		int endIndex = K;

		while (endIndex < Arr.size()) {
			sum = sum - Arr.get(startIndex);
			startIndex++;
			sum = sum - Arr.get(endIndex);
			endIndex++;
			maxisum=Math.max(maxisum, sum);
		}
		return maxisum;
	}
	

}
