package com.leetcode.hashing;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {

		String s = "anagram", t = "nagaram";
		
		System.out.println(isAnagram(s, t));

	}

	public static boolean isAnagram(String s, String t) {

		char[] ch1 = s.toCharArray();
		char[] ch2 = t.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		return Arrays.equals(ch1, ch2);

	}

}
