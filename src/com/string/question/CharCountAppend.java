package com.string.question;

public class CharCountAppend {

	public static void main(String[] args) {
		
		
		String input = "aabbbccddaaabbccceeff";

		String output = "a2b3c2d2a3b2c3e2f2";
		              //  b2c3d2a2b3c2e3f2
		
		char[] ch=input.toCharArray();
		
		StringBuilder sb=new StringBuilder();
		
		int count=1;
		int i=1;
		for(i=1;i<ch.length;i++) {
			
			if(ch[i]==ch[i-1]) {
				count++;
				
			}
			else {
				sb.append(ch[i-1]).append(count);
				count=1;
			}
			
		}
		sb.append(ch[i-1]).append(count);
		
		System.out.println(sb.toString().equals(output));
			
		
	}
}
