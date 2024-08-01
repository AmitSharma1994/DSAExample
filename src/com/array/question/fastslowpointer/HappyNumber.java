package com.array.question.fastslowpointer;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/happy-number/description/
public class HappyNumber {

	public static void main(String[] args) {

		int n = 19;
		System.out.println(isHappy(n));

	}

	public static boolean isHappy(int n) {

		Set<Integer> set = new HashSet();

		while (true) {
			int sum = 0;
			while (n != 0) {
				int rem = n % 10;
				sum += Math.pow(rem, 2);
				 n = n / 10;
			}
			if (sum == 1) {
				return true;
			}
			n = sum;
			if (set.contains(n)) {
				return false;
			}
			set.add(n);
		}

	}
}
