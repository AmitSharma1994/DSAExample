package com.leetcode.array;

import java.util.HashSet;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {

        int n = 5;
        int[] arr = {1, 2, 2, 2, 3};
        System.out.println(removeDuplicates(arr,n));
    }

    public static int removeDuplicates(int[] arr, int n) {
        HashSet set = new HashSet();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);

        }
        return set.size();

    }
}
