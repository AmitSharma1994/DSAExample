package com.leetcode.TwoPointer;

//https://leetcode.com/problems/valid-palindrome-ii/submissions/1360110052/
public class ValidPalindromeII {
	public static void main(String[] args) {
		String s="abca";
		System.out.println(validPalindrome(s));
	}
	
	 public static boolean validPalindrome(String s) {
		 
		 int left=0;int right=s.length()-1;
		 
		 while(left<=right) {
			 
			 if(s.charAt(left)==s.charAt(right)) {
				 
				 left++;
				 right--;
			 }
			 else {
				 
				 return  checkPalindrome(s,left+1,right)||checkPalindrome(s, left, right-1);
			 }
			 
			
		 }
		 
		 return true;
	        
	    }
	 
	 
 private static boolean checkPalindrome(String s,int left,int right) {
		 
		 while(left<=right) {
			 
			 if(s.charAt(left)!=s.charAt(right)) {
				 
				 return false;
			 }
			 left++;
			 right--;
		 }
		 
		 return true;
	        
	    }
}
