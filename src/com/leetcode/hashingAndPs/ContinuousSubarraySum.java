package com.leetcode.hashingAndPs;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {

	public static void main(String[] args) {

		int k = 7;//k = 3;//k = 6;  true
		int[] arr = {23,2,4,6,6};//{5,0,0,0} ;// { 23, 2, 6, 4, 7 };  //[5,0,0,0]

		System.out.println(checkSubarraySum(arr,k));
	}

	public static boolean checkSubarraySum(int[] nums, int k) {

		int prefixsum=0;
		int rem=0;
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			
		 rem=(rem+nums[i])%k;
		 
		 if(!map.containsKey(rem)) {
			 map.put(rem,i );
		 }
			
		 else {
			 return true;
		 }
		 
		 
		}
		
		return false;
	}
}
