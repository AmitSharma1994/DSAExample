package com.array.question;

//Given an array arr[] of positive integers. 
//Return true if all the array elements are palindrome otherwise, return false.
public class Palindromic {
	
	public static void main(String[] args) {
		
		int arr[] = {111, 222, 333, 444, 555};
		
		System.out.println(palindrone(131));
	}
	

  static boolean palindrone(int n) {
  
  int value=n;
  
  StringBuilder sb=new StringBuilder(); while(n>0) { sb.append(n%10); n=n/10; }
  if(value==Integer.parseInt(sb.toString())) {
  System.out.println("this is if condition"); return true; } else {
  System.out.println(value+"this is false statment"+Integer.parseInt(sb.
  toString())); return false; } } 
 
    public static boolean palinArray(int[] arr) {
        
        for(int i=0;i<arr.length;i++){
            int value=arr[i];
            int reversenum=0;
            while(value>0){
                int rem=value%10;
                reversenum=reversenum*10+rem;
                value=value/10;
            }
            if(reversenum!=arr[i]){
                
                return false;
            }
        }
        return true;
}
    }