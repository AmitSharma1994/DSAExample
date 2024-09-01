package com.leetcode.recursion;

public class SumNumber {
	static int sumofNumber(int n) {
		//for best case;
		if(n==1) {
			return 1;
			
		}
		else {
			return n+sumofNumber(n-1);	
		}
		
		
	}

	public static void main(String[] args) {
		
		System.out.println(sumofNumber(5));
		
	}

}
