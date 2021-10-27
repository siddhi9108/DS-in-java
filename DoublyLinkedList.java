package doublyLinkedLists;

public class DoublyLinkedList {

	private Node first;
	private Node last;

	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int data) {
		Node n1 = new Node();
		n1.data = data;

		if (isEmpty()) {
			last = n1;
		} else {
			first.previous = n1;
		}
		n1.next = first;
		this.first = n1;
	}

	public void insertLast(int data) {
		Node n1 = new Node();
		n1.data = data;

		if (isEmpty()) {
			first = n1;
		} else {
			last.next = n1;
			n1.previous = last;
		}
		last = n1;
	}

	public Node deleteFirst() {
		Node temp = first;
		if (first.next == null) {
			last = null;
		} else {
			first.next.previous = null;
		}
		first = first.next;
		return temp;
	}

	public Node deleteLast() {
		Node temp = last;
		if (first.next == null) {
			first = null;
		} else {
			last.previous.next = null;
		}
		last = last.previous;
		return temp;
	}

	public boolean insertAfter(int key, int data) {
		Node current = first;
		while (current.data != key) {
			current = current.next;
			if (current == null) {
				return false;
			}
		}
		Node n = new Node();
		n.data = data;

		if (current == last) {
			current.next = null;
			last = n;
		} else {
			n.next = current.next;
			current.next.previous = n;
		}
		n.previous = current;
		current.next = n;

		return true;
	}

	public Node deleteKey(int key) {
		Node current = first;
		while (current.data != key) {
			current = current.next;
			if (current == null) {
				return null;
			}
		}
		if (current == first) {
			first = current.next;
		} else {
			current.previous.next = current.next;
		}
		if (current == last) {
			last = current.previous;
		} else {
			current.next.previous = current.previous;
		}
		return current;
	}

	public void displayForward() {
		System.out.println("List(first --> last): ");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}

	public void displayBackward() {
		System.out.println("List(last --> first): ");
		Node current = last;
		while (current != null) {
			current.displayNode();
			current = current.previous;
		}
		System.out.println();
	}

}
