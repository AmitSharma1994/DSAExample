package com.array.question.hashingAndPs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//https://www.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1
public class CheckEqualArrays {

	public static void main(String[] args) {
		
		int arr1[] = {1, 2, 5, 4, 0}; 
		int arr2[] = {2, 4, 5, 0, 1};

		System.out.println(check(arr1,arr2));
	}

	
    public static boolean check(int[] arr1, int[] arr2) {
    	
    	
    	HashMap<Integer,Integer> hm1=new HashMap<>();
    	
    	HashMap<Integer,Integer>  hm2=new HashMap<>();
    	
    	for(int i=0;i<arr1.length;i++) {
    		hm1.put(arr1[i],hm1.getOrDefault(arr1[i], 0)+1 );
    		hm2.put(arr2[i],hm2.getOrDefault(arr2[i], 0)+1 );
    	}
    	
    //	System.out.println(hm1);
    	
    //	System.out.println(hm2);
    	
	/*
	 * for(Entry<Integer, Integer> entry:hm1.entrySet()) {
	 * 
	 * if(hm2.get(entry.getKey())==entry.getValue()) {
	 * 
	 * } else { return false; } }
	 */
    	
    	return hm1.equals(hm2);
    }
}
