package ds.searchingMethods.binary.search;

import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		int p = 0;
		int[] arr = new int[10];
		int r = arr.length - 1;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store: ");
		int n = ob.nextInt();
		System.out.println("Enter array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = ob.nextInt();
		}
		System.out.println("Enter key: ");
		int key = ob.nextInt();

		while (p <= r) {
			int q = (p + r) / 2;
			if (arr[q] > key) {
				r = q - 1;
			} else if (key > arr[q]) {
				p = q + 1;
			} else {
				System.out.println(q);
			}
		}
		// System.out.println("Key not found");
	}

}
