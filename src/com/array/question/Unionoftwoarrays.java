package com.array.question;

import java.util.ArrayList;
import java.util.Arrays;

public class Unionoftwoarrays {
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 4 ,5, 2 ,3, 6, 5 ,6, 8 ,9};
		int arr2[] = {1, 2, 3};
		
		System.out.println(doUnion(arr1,arr2));
		
	}
	 public static int doUnion(int arr1[], int arr2[]) {
		
			/*
			 * int m=arr1.length+arr2.length;
			 * 
			 * ArrayList<Integer> list=new ArrayList<>();
			 * 
			 * int i=0,j=0;
			 * 
			 * for(int k=0;k<m;k++) {
			 * 
			 * if( i<arr1.length && j<arr2.length && arr1[i]<arr2[j] ) {
			 * 
			 * list.add(arr1[i]); i++; } else if( i<arr1.length && j<arr2.length &&
			 * arr1[i]>arr2[j]) { list.add(arr2[j]); j++; }
			 * 
			 * else if( i<arr1.length && j<arr2.length && arr1[i]==arr2[j] ) {
			 * list.add(arr1[i]); System.out.println(arr1[i]); i++; j++; } else if(
			 * i<arr1.length ) { list.add(arr1[i]); System.out.println(arr1[i]); i++; j++; }
			 * }
			 */
		 ArrayList<Integer> list=new ArrayList<>();
		 int m=arr1.length,n=arr2.length;
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		 int i = 0,j=0;
		 while(i<m && j<n) {
			 if(arr1[i]<arr2[j]  && !list.contains(arr1[i])) {
				 list.add(arr1[i++]);
			 }
			 else if(arr1[i]>arr2[j] && !list.contains(arr1[j])) {
				 list.add(arr2[j++]);
			 }
			 else if( arr1[i]==arr2[j] && !list.contains(arr1[i])) {
				 list.add(arr1[i++]);
				 j++;
			 }
		 }
		 
		 while(i<m && !list.contains(arr1[i])) {
			 list.add(arr1[i++]);
		 }
		 
		 while(j<n && !list.contains(arr1[j])) {
			 list.add(arr2[j++]);
		 }
		 return list.size();
	    }
}
