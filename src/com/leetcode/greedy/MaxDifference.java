package com.leetcode.greedy;
//1432. Max Difference You Can Get From Changing an Integer
//https://leetcode.com/problems/max-difference-you-can-get-from-changing-an-integer/description/
//Example 1:
//
//Input: num = 555
//Output: 888
//Explanation: The first time pick x = 5 and y = 9 and store the new integer in a.
//The second time pick x = 5 and y = 1 and store the new integer in b.
//We have now a = 999 and b = 111 and max difference = 888
//Example 2:
//
//Input: num = 9
//Output: 8
//Explanation: The first time pick x = 9 and y = 9 and store the new integer in a.
//The second time pick x = 9 and y = 1 and store the new integer in b.
//We have now a = 9 and b = 1 and max difference = 8

public class MaxDifference {
    public static void main(String[] args) {
        int num = 555;
        System.out.println(maxDiff(num));
    }

    private static int maxDiff(int num) {
        String s = String.valueOf(num);
        int n = s.length();
        int a = 0, b = 0;

        // Find the first digit that is not 9
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '9') {
                a = Integer.parseInt(s.replace(s.charAt(i), '9'));
                break;
            }
        }

        // Find the first digit that is not 1
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '1') {
                b = Integer.parseInt(s.replace(s.charAt(i), '1'));
                break;
            }
        }

        System.out.println("a: " + a + ", b: " + b);
        return a - b ;
    }
}

// Time Complexity: O(n), where n is the number of digits in num.
// Space Complexity: O(n), for storing the string representation of num.
