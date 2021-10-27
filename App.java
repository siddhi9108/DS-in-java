package doublyLinkedLists;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertFirst(22);
		list.insertFirst(221);
		list.insertFirst(122);
		list.insertLast(222);
		list.insertLast(2266);
		list.insertLast(2221);
		list.displayBackward();
		list.displayForward();
		list.deleteFirst();
		list.deleteLast();
		list.deleteKey(22);
		list.displayForward();
		list.insertAfter(221, 33);
		list.insertAfter(222, 43);
		list.displayForward();
	}

}
