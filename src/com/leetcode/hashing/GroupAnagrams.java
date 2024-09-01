package com.leetcode.hashing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagrams {
	public static void main(String[] args) {

		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		
	}

	public static List<List<String>> groupAnagrams(String[] strs) {

List<List<String>> list=	Arrays.stream(strs).collect(Collectors.groupingBy(str->{
			
			char[] ch=str.toCharArray();
			Arrays.sort(ch);
			return new String(ch);
			
			})).values().stream().collect(Collectors.toList());
		
		return list;
	}
}
