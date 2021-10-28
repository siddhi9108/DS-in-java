package ds.circularLinkedList;

import ds.siglyLinkedLists.Node;

public class CircularLinkedList {
	private Node first;
	private Node last;

	public CircularLinkedList() {
		first = null;
		last = null;
	}

	private boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int data) {
		Node n = new Node();
		n.data = data;

		if (isEmpty()) {
			last = n;
		}
		n.next = first;
		first = n;
	}

	public void insertLast(int data) {
		Node n = new Node();
		n.data = data;

		if (isEmpty()) {
			first = n;
		} else {
			last.next = n;
			last = n;
		}
	}

	public int deleteFirst() {
		int temp = first.data;

		if (first.next == null) {
			last = null;
		}
		first = first.next;
		return temp;
	}

	public void displayList() {
		System.out.println("List(first-->last)");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
}
