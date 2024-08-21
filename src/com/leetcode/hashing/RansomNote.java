package com.leetcode.hashing;

import java.util.HashMap;

public class RansomNote {

	public static void main(String[] args) {

		String ransomNote = "fihjjjjei", magazine = "hjibagacbhadfaefdjaeaebgi";

		System.out.println(canConstruct(ransomNote, magazine));

	}

	public static boolean canConstruct(String ransomNote, String magazine) {

		boolean flag = false;

		HashMap<Character, Integer> hm = new HashMap<>();

		HashMap<Character, Integer> hm1 = new HashMap<>();

		for (int i = 0; i < magazine.length(); i++) {

			hm.put(magazine.charAt(i), hm.getOrDefault(magazine.charAt(i), 0) + 1);
		}

		for (int j = 0; j < ransomNote.length(); j++) {

			hm1.put(ransomNote.charAt(j), hm1.getOrDefault(ransomNote.charAt(j), 0) + 1);

		}

		System.out.println(hm);

		System.out.println();
		System.out.println(hm1);

		for (int k = 0; k < ransomNote.length(); k++) {

			if (hm.containsKey(ransomNote.charAt(k))) {

				if (hm.get(ransomNote.charAt(k)) >= hm1.get(ransomNote.charAt(k))) {

					flag = true;
					 //return true;
				} else {
					//flag = false;
					 return false;
				}
			} else {
				//
				//flag = false;
				return false;
			}
		}
		return flag;

	}
}
