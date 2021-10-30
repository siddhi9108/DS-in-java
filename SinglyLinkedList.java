package ds.siglyLinkedLists;

public class SinglyLinkedList {
	private Node first;

	public SinglyLinkedList() {

	}

	public boolean isEmpty() {
		return (first == null);
	}

	// used to insert at beginning
	public void insertFirst(int data) {
		Node n1 = new Node();
		n1.data = data;
		n1.next = first;
		first = n1;
	}

	public Node deleteFirst() {
		Node temp = first;
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

	public void insertLast(int data) {
		Node current = first;
		while (current.next != null) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}
}
