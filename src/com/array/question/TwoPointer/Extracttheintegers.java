package com.array.question.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Extracttheintegers {

	public static void main(String[] args) {

		String s = "1: Prakhar Agrawal, 2: Manish Kumar Rai, 3: Rishabh Gupta56";

		System.out.println(extractIntegerWords(s));

	}

	static ArrayList<String> extractIntegerWords(String s) {

		ArrayList<String> list = new ArrayList<>();

		char[] ch = s.toCharArray();
		StringBuilder sb = new StringBuilder();

		int left = 0;
		int right = ch.length - 1;

		while (left < right) {

			if (Character.isDigit(ch[left])) {
				list.add(sb.append(ch[left]).toString());
				left++; // increasing the left pointer
				sb.setLength(0);
			} else if (Character.isDigit(ch[right])) {
				list.add(sb.append(ch[right]).toString());
				right--; // decreaseing the right Pointer
				sb.setLength(0);
			} else {
				left++;
				right--;
			}
		}

		return list;

		
	}

}
