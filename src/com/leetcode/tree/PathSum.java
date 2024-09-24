package com.leetcode.tree;

import java.util.Stack;
//https://leetcode.com/problems/path-sum/description/
public class PathSum {

	public static void main(String[] args) {

	}

	public boolean hasPathSum(TreeNode root, int targetSum) {

		if (root == null) {

			return false;
		}

		Stack<TreeNode> path = new Stack<>();

		Stack<Integer> pathsum = new Stack<>();

		path.push(root);
		pathsum.push(root.val);

		while (!path.isEmpty()) {

			TreeNode temp = path.pop();
			int tempvalue = pathsum.pop();

			if (temp.left == null && temp.right == null && tempvalue == targetSum) {

				return true;
			}

			if (temp.left != null) {

				path.push(temp.left);
				pathsum.push(tempvalue + temp.left.val);

			}
			if (temp.right != null) {
				path.push(temp.right);
				pathsum.push(tempvalue + temp.right.val);
			}

		}

		return false;

	}
}
