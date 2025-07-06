package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfTwoList {
	
	public static void main(String[] args) {
	
		List<Integer> list1=Arrays.asList(6,7,8,9);

		List<Integer> list2=Arrays.asList(4,3,5,2);
		
		ArrayList list3=new ArrayList<Integer>();
		
		StringBuilder sb=new StringBuilder();

		StringBuilder sb1=new StringBuilder();

		for(int i=0;i<list1.size();i++){

			sb.append(list1.get(i));                 
			sb1.append(list2.get(i));
		}

		String[] str={sb.toString(),sb1.toString()};
		int sum=Integer.parseInt(str[0])+Integer.parseInt(str[1]);
		
		System.out.println(str[0]+"\t"+str[1]);

		System.out.println(sum);
		//11141

		//list3 1,4,1,1,1

		
		
	list3=	(ArrayList) list3.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		
		
		while(sum>0){
			list3.add(sum%10);            
		sum=sum/10;

		}
	System.out.println(list3);
	

	}
	


}
