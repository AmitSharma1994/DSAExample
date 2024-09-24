package com.leetcode.matrix;

//https://leetcode.com/problems/matrix-diagonal-sum/description/

public class MatrixDiagonalSum {
	
	public static void main(String[] args) {
		
	int[][]	mat ={{1,1,1,1},
	              {1,1,1,1},
	              {1,1,1,1},
	              {1,1,1,1}};
	          System.out.println(diagonalSum(mat));
	}

	
	
    public  static int diagonalSum(int[][] mat) {
    	int sum=0;
    	int count=1;
    	for(int i=0;i<mat.length;i++) {
    		for(int j=0;j<mat[i].length;j++) {
    			
    			if(i==j || j==mat[i].length-count) {
    				sum+=mat[i][j];
    			}
    			
    		}
    		count++;
    	}
    	
    	
		return sum;
        
    }
}
