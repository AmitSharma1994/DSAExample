package com.leetcode.slidingwindow;

import java.util.HashMap;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/?envType=study-plan-v2&envId=top-interview-150

/*Given a string s, find the length of the longest 
substring without repeating characters.*/

/* we have used the sliding window and hasing and two pointer */

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		//String s = "aab";

		 String s = " ";

		System.out.println(lengthOfLongestSubstring(s));

	}

	public static int lengthOfLongestSubstring(String s) {

		int start = 0, length = 0;

		HashMap<Character, Integer> hm = new HashMap();

		for (int end = 0; end < s.length(); end++) {
			char c = s.charAt(end);
			if (hm.containsKey(c)) {
				if (start<=hm.get(c)) {
					start = hm.get(c);
				}
			}
			length = Math.max(length, end - start+1);
			hm.put(c, end);

		}

		return length;
	}

}
