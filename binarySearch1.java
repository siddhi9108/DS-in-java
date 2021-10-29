package ds.searchingMethods.binary.search;

import java.util.Scanner;

public class binarySearch1 {

	public static void main(String[] args) {
		int p = 0;
		int[] arr = new int[10];
		int r = arr.length - 1;
		int q = (p + r) / 2;
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
			if (key == arr[q]) {
				System.out.println("Key Found" + q);
				break;
			} else {
				if (key > arr[q]) {
					p = q + 1;
				} else {
					r = q - 1;
				}
			}
		}
		System.out.println("Key not found");
	}

}
