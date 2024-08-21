package com.leetcode.TwoPointer;

public class ValidPalindrome {
	public static void main(String[] args) {

		//String s = "A man, a plan, a canal: Panama";
		String s="race a car";
		System.out.println(isPalindrome(s));
	}

	public static boolean isPalindrome(String s) {

		String str = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		int left = 0;
		int right = str.length() - 1;

		while (left <= right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}
}
