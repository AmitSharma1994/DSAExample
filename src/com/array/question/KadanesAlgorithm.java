package com.array.question;

public class KadanesAlgorithm {

	public static void main(String[] args) {
		
		int arr[]= {1, 2, 3, -2, 5};
		
		int sum=0;
		long maxi=arr[1];
		
		
		for(int i=0;i<arr.length;i++) {
			
			sum=sum+arr[i];
			
			maxi=max(sum,maxi);
			
		}
		System.out.println(maxi);
	}

	private static long max(int sum, long maxi) {
		if(sum>maxi) {
			
			return sum;
			
		}
		else {
		
			return maxi;
		}
		
	}
}
