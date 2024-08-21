package com.leetcode.TwoPointer;

public class ReverseWordsinaString {
	public static void main(String[] args) {

		String s = "the sky is blue";

		System.out.println(reverseWords(s));
	}

	public static String reverseWords(String s) {

		String str[] = s.replaceAll("\\s+", " ").split(" ");

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length; i++) {

			if (i == str.length - 1 && str[i] != " ") {
				sb.append(str[i]);
			}

			if (str[i] != " ") {

				sb.append(str[i]).append(" ");
			}

			System.out.println(sb.reverse());

		}

		int left = 0;
		int right = str.length - 1;
		while (left < right) {
			String temp = str[left];
			str[left++] = str[right];
			str[right--] = temp;

		}

		for (String str1 : str) {
			sb.append(str1).append(" ");
		}

		for (int i = 0; i < str.length; i++) {
			if (i == str.length - 1) {
				sb.append(str[i]);
			} else if (str[i] != " ") {
				sb.append(str[i]).append(" ");
			}

			return sb.toString();
		}
		return s;
	}
}
