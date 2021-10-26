package binarySearchTree;

public class BST {
	private Node root;

	public void insert(int key, String value) {

		Node n = new Node(key, value);
		if (root == null) {
			root = n;
		} else {
			Node now = root;
			Node parent;

			while (true) {
				parent = now;
				if (key < now.key) {
					now = now.LChild;
					if (now == null) {
						parent.LChild = n;
						return;
					}
				} else {
					now = now.RChild;
					if (now == null) {
						parent.RChild = n;
						return;
					}
				}
			}
		}
	}

	public Node min() {
		Node now = root;
		Node last = null;

		while (now != null) {
			last = now;
			now = now.LChild;
		}
		return last;
	}

	public Node max() {
		Node now = root;
		Node last = null;

		while (now != null) {
			last = now;
			now = now.RChild;
		}
		return last;
	}

	public boolean remove(int key) {

		Node now = root;
		Node parentNode = root;

		boolean isLeftChild = false;

		while (now.key != key) {
			parentNode = now;
			if (key < now.key) {
				now = now.LChild;
				isLeftChild = true;
			} else {
				now = now.RChild;
				isLeftChild = false;
			}
			if (now == null) {
				return false;
			}
		}

		// found the node

		Node del = now;
		// if node is a leaf
		if (del.LChild == null && del.RChild == null) {
			if (del == root) {
				root = null;
			} else if (isLeftChild) {
				parentNode.LChild = null;
			} else {
				parentNode.RChild = null;
			}
		}
		// if one child that is on left
		else if (del.RChild == null) {
			if (del == root) {
				root = del.LChild;
			} else if (isLeftChild) {
				parentNode.LChild = del.LChild;
			} else {
				parentNode.RChild = del.LChild;
			}
		}
		// if one child that is on right
		else if (del.LChild == null) {
			if (del == root) {
				root = del.RChild;
			} else if (isLeftChild) {
				parentNode.LChild = del.RChild;
			} else {
				parentNode.RChild = del.RChild;
			}
		}
		// if 2 child
		else {
			Node successor = getSuccessor(del);
			// connect parent of node to delete to successor
			if (del == root) {
				root = successor;
			} else if (isLeftChild) {
				parentNode.LChild = successor;
			} else {
				parentNode.RChild = successor;
			}
			successor.LChild = del.LChild;
		}

		return true;
	}

	private Node getSuccessor(Node del) {
		Node successorParent = del;
		Node successor = del;
		Node current = del.RChild;
		while (current != null) {
			successorParent = successor;
			successor = current;
			current = current.LChild;

		}
		if (successor != del.RChild) {
			successorParent.LChild = successor.RChild;
			successor.RChild = del.RChild;
		}
		return successor;
	}
}
