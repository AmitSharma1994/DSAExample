package com.leetcode.tree;

//https://leetcode.com/problems/find-largest-value-in-each-tree-row/description/
//Input: root = [1,3,2,5,3,null,9]
//Output: [1,3,9]

import java.util.ArrayList;
import java.util.List;

public class FindLargestValueinEachTreeRow {

    public static void main(String[] args) {

    }

    public static List<Integer> largestValues(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        list.add(root.val);

        if (root.left.val > root.right.val) {

        }
        return List.of();
    }
}
