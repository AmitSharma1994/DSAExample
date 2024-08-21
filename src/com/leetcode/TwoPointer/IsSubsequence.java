package com.leetcode.TwoPointer;

public class IsSubsequence {

	public static void main(String[] args) {
		String s = "", t = "";

		System.out.println(isSubsequence(s, t));
	}

	public static boolean isSubsequence(String s, String t) {

		int left = 0;
		int right = 0;

		if (s.length() == 0) {
			return true;
		}
		if (s.length() == 0 && t.length() == 0) {
			return true;
		}
		while (right < t.length()) {

			if (s.charAt(left) == t.charAt(right)) {

				left++;
				right++;

			} else {
				right++;
			}

			if (left == s.length()) {

				return true;
			}

		}

		return false;
	}
}
