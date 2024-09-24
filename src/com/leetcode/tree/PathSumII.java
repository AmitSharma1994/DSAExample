package com.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/path-sum-ii/description/

public class PathSumII {

	public static void main(String[] args) {
		TreeNode root = null;
	int	targetSum=22;
		  
	pathSum(root, targetSum);
	        

	}
	
	   public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
	        List<List<Integer>> result = new ArrayList();
	        pathsum(root, targetSum, new ArrayList(), result);
	        return result;

	    }

	 private static void pathsum(TreeNode root, int sum, List<Integer> path, List<List<Integer>> result) {

	        if (root == null) {
	            return;
	        }
	        path.add(root.val);
	        if(root.left==null &&root.right==null&& root.val==sum){
	            result.add(path);
	        }

	        pathsum(root.left,sum-root.val, new ArrayList(path), result) ;
	            pathsum(root.right, sum-root.val, new ArrayList(path), result) ;

	    }
	
}
