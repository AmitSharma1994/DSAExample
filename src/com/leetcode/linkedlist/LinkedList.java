package com.leetcode.linkedlist;

class Node {
	Node next;
	int data;

	public Node(int data) {

		this.data = data;
		this.next = null;
	}

}

public class LinkedList {
	Node head = null;

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.display();
		list.delete(20);
		System.out.println();
		list.display();
		
	}

	void add(int value) {
		Node curr = head;
		Node n = new Node(value);
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

		Node curr = head;

		while (curr.next != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
		System.out.println(curr.data);

	}

	void delete(int datas) {
		Node curr = new Node(-1);
		curr.next = head;

		while (curr.next != null) {
			if (curr.next.data == datas) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}

		}
	}
	
	//Node reverseList(Node head) {
	Node reverseList() {
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        head=prev;
     
     return head;  
    }
}
