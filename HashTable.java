package ds.hashtable;

public class HashTable {
	String[] hashArray;
	int arraySize;// slots available
	int size = 0; // counter

	public HashTable(int noOfSlots) {
		if (isPrime(noOfSlots)) {
			hashArray = new String[noOfSlots];
			arraySize = noOfSlots;
		} else {
			int primeCount = getNextPrime(noOfSlots);
			hashArray = new String[primeCount];
			arraySize = primeCount;

			System.out.println("HashTable size is not prime: " + noOfSlots);
			System.out.println("HashTable size changes: " + primeCount);

		}
	}

	private boolean isPrime(int num) {
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	private int getNextPrime(int minNum) {
		for (int i = minNum; true; i++) {
			if (isPrime(i)) {
				return i;
			}
		}
	}

	// return preferred index position
	public int hashFunct1(String word) {
		int hashVal = word.hashCode();
		hashVal = hashVal % arraySize;
		if (hashVal < 0) {
			hashVal += arraySize;
		}
		return hashVal;

	}

	// return step size greater than 0
	public int hashFunct2(String word) {
		int hashVal = word.hashCode();
		hashVal = hashVal % arraySize;

		if (hashVal < 0) {
			hashVal += arraySize;
		}
		return 3 - hashVal % 3;

	}

	public void insert(String word) {
		int hashVal = hashFunct1(word);
		int stepSize = hashFunct2(word);

		while (hashArray[hashVal] != null) {
			hashVal = hashVal + stepSize;
			hashVal = hashVal % arraySize;
		}

		hashArray[hashVal] = word;
		System.out.println("insterted word: " + word);
		size++;

	}

	public String find(String word) {
		int hashVal = hashFunct1(word);
		int stepSize = hashFunct2(word);

		while (hashArray[hashVal] != null) {
			if (hashArray[hashVal].equals(word)) {
				return hashArray[hashVal];
			}
			hashVal = hashVal + stepSize;
			hashVal = hashVal % arraySize;
		}
		return hashArray[hashVal];

	}

	public void displayTable() {
		System.out.println("Table: ");
		for (int i = 0; i < arraySize; i++) {
			if (hashArray[i] != null) {
				System.out.print(hashArray[i] + " ");
			} else {
				System.out.print("** ");
			}
			System.out.println("");
		}
	}
}
