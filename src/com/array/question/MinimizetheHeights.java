package com.array.question;

import java.util.Arrays;

public class MinimizetheHeights {
	
	public static void main(String[] args) {
	
		String str="abcd";
		
		String str1="bcda";
		
		System.out.println(anagram(str,str1));;
		
	}
	
	static boolean anagram( String str,String str1) {
		
		char[] ch1=str.toCharArray();
		char[] ch2=str1.toCharArray();
		

		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		
		
		return Arrays.equals(ch1,ch2);
		
		
		
		
		
		
	}

}
