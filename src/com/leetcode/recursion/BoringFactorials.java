package com.leetcode.recursion;

public class BoringFactorials {

	public static void main(String[] args) {

		System.out.println(multiply(5));;
		
		System.out.println(boringFactorials(18, 19));
	}

	public static int boringFactorials(int n, int p) {
		 int m=multiply(n)%p;
		
		return  m;
	}

	private static int multiply(int n) {

		if (n == 1) {
			return 1;
		}

		else {
			return n * multiply(n - 1);
		}

	}
}
