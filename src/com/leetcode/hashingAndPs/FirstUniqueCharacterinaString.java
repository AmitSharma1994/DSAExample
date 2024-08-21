package com.leetcode.hashingAndPs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

//https://leetcode.com/problems/first-unique-character-in-a-string/description/
public class FirstUniqueCharacterinaString {

	public static void main(String[] args) {
	String	s = "aabb";
		
		System.out.println(firstUniqChar(s));
	}

	public static int firstUniqChar(String s) {

		int index=0;
		char[] ch = s.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap();
		for (int i = 0; i < ch.length; i++) {
			map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
		}

		char firstchar;
		Optional<Character> c=map.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst();
		
		if(c.isPresent()) {
			firstchar=c.get();
		}
		else {
			return -1;
		}
		
		for (int i = 0; i < ch.length; i++) {
	        if(ch[i]==firstchar) {
	        	index= i;
	        }
		}

		
		return index;
	}
}
