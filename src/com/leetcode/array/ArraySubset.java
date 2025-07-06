package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class ArraySubset {

    public static void main(String[] args) {
        long a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
        //int a2[] = {11, 3, 7, 1, 7};

        long a2[] = {19, 5, 3};

        System.out.println(subtest(a1, a2));
        ;


    }

    public static boolean subtest(long a1[], long a2[]) {

        Map<Long, Long> map = new HashMap();

        boolean flag = false;
        for (long num : a1) {
            map.put(num, map.getOrDefault(num, (long) 0) + 1);
        }

        for (long num2 : a2) {

            if (!map.containsKey(num2) || map.get(num2) == 0) {
                return false;
            }

            map.put(num2, map.get(num2) - 1);

        }

        return true;
    }

}
