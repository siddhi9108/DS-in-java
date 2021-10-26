package binarySearchTree;

public class Application {

	public static void main(String[] args) {
		BST tree = new BST();
		tree.insert(9, "Nine");
		tree.insert(10, "Ten");
		tree.min();
		tree.max();
		// tree.remove(10);
		System.out.println(tree.min().key);
		System.out.println(tree.max().key);

		System.out.println(tree.remove(10));
		System.out.println(tree.max().key);
	}

}
