package com.leetcode.TwoPointer;

public class PalindromeNumber {

	public static void main(String[] args) {

		int x = 10;

		System.out.println(isPalindrome(x));

	}

	public static boolean isPalindrome(int x) {
		String s = String.valueOf(x);
		int left = 0;
		int right = s.length() - 1;

		while (left <= right) {

			if (s.charAt(left) != s.charAt(right)) {

				return false;
			} else {
				left++;
				right--;
			}
		}

		return true;
	}
}
