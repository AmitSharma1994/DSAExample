package com.leetcode.tree;

//https://www.youtube.com/watch?v=R4V4n-waxn4&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=104
//Definition for a binary tree node.
class TreeNode {

    int val; // this can be generic Type
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class TreeImplementEx {

    TreeNode root;

    public static void main(String[] args) {
        TreeImplementEx bt = new TreeImplementEx();
        bt.createBinaryTree();
        System.out.println("Preorder");
        bt.preOrder(bt.root);
        System.out.println("Inorder");
        bt.InOrder(bt.root);
        System.out.println("Postorder");
        bt.postOrder(bt.root);
    }

    void createBinaryTree() {

        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixed = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixed;
        third.right = seventh;

    }

    // using recursion method for InOrder

    // using recursing method InOrder.
    public void preOrder(TreeNode root) {

        if (root == null) {
            return;
        }
        System.out.print(root.val + "  ");
        preOrder(root.left);
        preOrder(root.right);

    }

    // using recursion method for PostOrder

    public void InOrder(TreeNode root) {

        if (root == null) {
            return;
        }

        InOrder(root.left);
        System.out.print(root.val + " ");
        InOrder(root.right);

    }

    public void postOrder(TreeNode root) {

        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + "  ");

    }

}
