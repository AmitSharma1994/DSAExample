package com.leetcode.stack;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {

		String s = "()[]{}";

		System.out.println(isValid(s));

	}

	public static boolean isValid(String s) {

		Stack<Character> stack = new Stack<>();

		for (Character ch : s.toCharArray()) {

			if (ch == '(') {
				stack.push(')');

			} else if (ch == '{') {
				stack.push('}');
			} else if (ch == '[') {
				stack.push(']');
			} else if (stack.isEmpty() || stack.pop() != ch) {
				return false;
			}
		}

		return stack.isEmpty();
	}
}
