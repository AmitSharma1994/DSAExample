package com.leetcode.backtracking.recursion;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		String Str="AmitKuamrSharma";
		
		
		
		
Map<Character,Long>	map=	Str.chars().mapToObj(e-> Character.toLowerCase((char)e)).
collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		

map.forEach((e1,e2)->{
	
	if(e2>1) {
		System.out.println(e1+" "+e2);	
	}
	
	
});
		//char[] ch=Str.toCharArray();
		
		//Arrays.stream(ch).
		
		
		//a=4
		//
		
	}
}
