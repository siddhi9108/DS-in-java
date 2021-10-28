package ds.circularLinkedList;

public class App {
	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.insertFirst(100);
		list.insertFirst(90);
		list.insertFirst(901);
		list.insertFirst(910);
		list.insertFirst(9110);
		list.insertFirst(9044);
		list.insertLast(11111111);

		list.displayList();
	}
}
