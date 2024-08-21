package com.leetcode.fastslowpointer;

public class FindtheDuplicateNumber {

	public static void main(String[] args) {

		int[] nums = {1,3,4,2,2};
		
		System.out.println(findDuplicate(nums));
	}

	//Aproch1 using sorting and find the duplicate
	
	//Apoch2 using hashset

	//Aproch 3 using fast and slow pointer
	public static int findDuplicate(int[] nums) {
		
		int slow=0;
		int fast=0;
		do {
			slow=nums[slow];
			fast=nums[nums[fast]];	
		}
		while(slow!=fast);
		
		slow=0;
		while(slow!=fast) {
			slow=nums[slow];
			fast=nums[fast];
		}
		
		return slow;
		
		
		
		


	}
}
