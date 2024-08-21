package com.leetcode.hashingAndPs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortArraybyIncreasingFrequency {

	public static void main(String[] args) {
		
		int[] arr= {1,1,2,2,2,3};
		
		frequencySort(arr);
	}
	
	 public static void frequencySort(int[] nums) {
	         
		 //HashMap<Integer, Integer> map=new HashMap<>();
		 
		LinkedHashMap<Integer, Integer> map=new LinkedHashMap<>();
		 
		 
		 for(int i=0;i<nums.length;i++) {
			 	
			 if(!map.containsKey(nums[i])) {
				 
				 map.put(nums[i], 1);
			 }else {
				 map.put(nums[i],map.get(nums[i])+1);
			 }
		 }
		 
		 System.out.println(map);
		 
		 
		 //using comprater we need to sort the value in accending order and store the value in array and return it.
		 
		 
	    }

}
