package com.leetcode.recursion;

public class FibonaciSeriesusing {

	public static void main(String[] args) {

		

		for (int i = 0; i < 8; i++) {

			System.out.print(fib(i)+" ");

		}

	}

	static int fib(int n) {

		if (n <= 1) {

			return n;
		}
		return fib(n - 2) + fib(n - 1);

	}

}
