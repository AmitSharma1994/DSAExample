package com.leetcode.linkedlist;

/*
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}*/
public class PalindromeLinkedList {
	ListNode head;

	public static void main(String[] args) {

		PalindromeLinkedList list = new PalindromeLinkedList();
		
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(1);
		list.add(1);
		
		list.display();
		System.out.println();
		System.out.println(list.isPalindrome());
		list.display();
	}

	void add(int value) {

		ListNode curr = head;
		ListNode n = new ListNode(value);
		if (head == null) {
			head = n;
		} else {
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = n;

		}

	}

	void display() {

		ListNode curr = head;

		while (curr.next != null) {
			System.out.println(curr.val);
			curr = curr.next;
		}
		System.out.println(curr.val);

	}

	public boolean isPalindrome() {

		ListNode fast = head;
		ListNode slow = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast!=null) {
			slow=slow.next;
		}

		fast = head;
		slow = reverseList(slow);

		while (slow != null) {
			if (fast.val != slow.val) {
				return false;
			}
			fast=fast.next;
			slow=slow.next;

		}

		return true;

	}

	private static ListNode reverseList(ListNode reversehead) {

		ListNode prev = null;
		ListNode curr = reversehead;
		ListNode next = reversehead;
		while (curr != null) {
			next=curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		reversehead = prev;

		return reversehead;
	}

}
