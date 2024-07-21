package com.array.question;

public class MinMaxArray {
	
	public static void main(String[] args) {
	int[]	arr = {3, 2, 1, 56, 10000, 167};
	
	int i=0;
	 long max=arr[i];
	 long min=arr[i];
	 
	 for(i=1;i<arr.length;i++) {
		 if(arr[i]>max) {
			 
			 max=arr[i];
			 
			 
		 }
		 if(arr[i]<min) {
			 min=arr[i];
			 
		 }
	 }
	 
	 System.out.println(max+"  "+min);
	}

}
