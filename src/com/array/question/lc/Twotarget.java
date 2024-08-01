package com.array.question.lc;

public class Twotarget {

	public static void main(String[] args) {
		
		int[] numbers = {2,7,11,15}; 
		
	int[] arr=	new int[] {1,2,4,5};
	
	
				int target = 9;
		
				
		System.out.println(twotarget(numbers,target));
		
		
	}

	 public static int[] twotarget(int[] numbers, int target) {
	        
		 int[] index=new int[numbers.length];
		 int left = 0;
			int right = numbers.length - 1;
			int count = 1;
		 while (left < right ) {

				if (target == numbers[left] + numbers[right] ) {
			 index[count++]=left;
			 index[count++]=right;
			 break;
				}

				else if (target < numbers[left] + numbers[right] ) {

					right--;
				}

				else {
					left++;
				}
			}
		 
		 
		 return index;
	    }
	
}
