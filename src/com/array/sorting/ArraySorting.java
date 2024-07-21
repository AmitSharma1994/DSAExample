package com.array.sorting;

import java.util.ArrayList;
import java.util.List;

public class ArraySorting {
	public static void main(String[] args) {
		int arr[]= {2,4,5,1,8,7};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			
			
		}
		
		List<Integer> list=new ArrayList();
		for(int k:arr) {
			list.add(k);
		}
		
		System.out.println(list);
	}
}
