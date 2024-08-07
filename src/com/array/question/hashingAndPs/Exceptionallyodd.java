package com.array.question.hashingAndPs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Exceptionallyodd {

	
	public static void main(String[] args) {
		
	int	N = 7;
	int Arr[] = {1, 2, 3, 2, 3, 1, 3};
		System.out.println(getOddOccurrence(Arr,N));
	}
	
	static int getOddOccurrence(int[] arr, int n) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);	
		}
		int oddnum=0;
		for (Entry<Integer, Integer> entry : hm.entrySet()) {
			if(entry.getValue()%2!=0) {
				oddnum=entry.getKey();
			}
        }
		
		return oddnum;
    }
}
