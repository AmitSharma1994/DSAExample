package com.leetcode.hashing;

import java.util.HashMap;
import java.util.Map;

public class FindLuckyIntegerinanArray {


    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4};
        FindLuckyIntegerinanArray obj = new FindLuckyIntegerinanArray();
        System.out.println(obj.findLucky(arr)); // Output: 2

    }

    public int findLucky(int[] arr) {
        int max = -1;
        int j = 1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for(Map.Entry<Integer,Integer> map1: map.entrySet()){
            if(map1.getKey()==map1.getValue()){
                Math.max(map1.getKey(),max);
            }
        }
        return max;
    }

}

