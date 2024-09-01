package com.leetcode.tree;

/*Tree Implementation
1.imlemented the insert value in BST while given value and this insert method calling another method with passing root and value
which is recursivley call and insert the value appropriate place and return the final root.
2.implemented the preorder,inorder and postorder traversing.
3.implemented the search element.

*/

public class BinarySearchTreeEx {

	TreeNode root;

	void insert(int value) {

		root = insertNode(root, value);

	}

	TreeNode insertNode(TreeNode root, int value) {

		if (root == null) {
			TreeNode node = new TreeNode(value);
			root = node;

			return root;
		}

		if (root.val > value) {

			root.left = insertNode(root.left, value);

		} else {
			root.right = insertNode(root.right, value);
		}

		return root;

	}

//we have  created the overloaded method because we need to pass the root in inorder menthod 
	// so we need to decalare the root as static while caling single inorder method
	// from main method.
	void inorder() {
		inOrder(root);

	}

	void inOrder(TreeNode root) {

		if (root == null) {

			return;
		}

		inOrder(root.left);
		System.out.print(root.val + " ");
		inOrder(root.right);

	}

	// implement search elemtn in BST.

	boolean search(int key) {

		TreeNode node = search(root, key);

		if (node != null) {
			return true;
		} else {
			return false;
		}

	}

	TreeNode search(TreeNode root, int key) {

		if (root == null || key == root.val) {
			return root;
		}
		if (key < root.val) {
			return search(root.left, key);
		} else {

			return search(root.right, key);
		}

	}

	public static void main(String[] args) {

		BinarySearchTreeEx bst = new BinarySearchTreeEx();

		bst.insert(4);
		bst.insert(2);
		bst.insert(3);
		bst.insert(1);
		bst.insert(5);
		bst.insert(6);
		bst.insert(7);

		bst.inorder();
		System.out.println(bst.search(10));
	}
}
