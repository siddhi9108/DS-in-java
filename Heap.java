package heapimplementation;

public class Heap {
	private Node[] heapArray;
	private int maxSize;
	private int currentSize;

	public Heap(int size) {
		this.maxSize = size;
		currentSize = 0;
		heapArray = new Node[size];
	}

	public int getSize() {
		return currentSize;
	}

	public boolean isEmpty() {
		return (currentSize == 0);
	}

	public boolean insert(int key) {
		if (currentSize == maxSize) {
			return false;
		}
		Node newNode = new Node(key);
		heapArray[currentSize] = newNode;

		trickleUp(currentSize);

		currentSize++;
		return true;
	}

	public void trickleUp(int idx) {
		int parentIdx = (idx - 1) / 2;
		Node nodeToInsert = heapArray[idx];

		while (idx > 0 && heapArray[parentIdx].getKey() < nodeToInsert.getKey()) {
			heapArray[idx] = heapArray[parentIdx];
			idx = parentIdx;
			parentIdx = (parentIdx - 1) / 2;
		}
		heapArray[idx] = nodeToInsert;
	}

	public Node remove() {
		Node root = heapArray[0];
		--currentSize;
		heapArray[0] = heapArray[currentSize];

		trickleDown(0);
		return root;

	}

	private void trickleDown(int idx) {
		int largerChildIdx;
		Node top = heapArray[idx];
		while (idx < currentSize / 2) {
			int leftChildIdx = 2 * idx + 1;
			int rightChildIdx = leftChildIdx + 1;

			if (rightChildIdx < currentSize && heapArray[leftChildIdx].getKey() < heapArray[rightChildIdx].getKey()) {
				largerChildIdx = rightChildIdx;
			} else {
				largerChildIdx = leftChildIdx;
			}
			if (top.getKey() >= heapArray[largerChildIdx].getKey()) {
				break;
			}
			heapArray[idx] = heapArray[largerChildIdx];
			idx = largerChildIdx;

		}
		heapArray[idx] = top;
	}
}
