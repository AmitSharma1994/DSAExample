package com.leetcode.linkedlist;

import java.util.Stack;

public class RemoveNodesFromLinkedList {
	
	public static void main(String[] args) {
		
	}
//remove node using stack.
	  public ListNode removeNodesusingStack(ListNode head) {
		  Stack<ListNode> stack = new Stack();
	        ListNode curr = head;
	        while (curr != null) {
	            stack.push(curr);
	            curr = curr.next;
	        }

	        ListNode newhead = stack.pop();
	        int maxvalue = newhead.val;
	        while (!stack.isEmpty()) {
	            ListNode node = stack.pop();
	            if (node.val < maxvalue) {
	                continue;
	            } else {

	                node.next = newhead;
	                newhead = node;
	                maxvalue = node.val;

	            }

	        }
	        return newhead;
	  }
	
	  //remove node using LinkedList.
	  
}
