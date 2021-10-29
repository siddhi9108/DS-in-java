package ds.searchingMethods.linear.search;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store: ");
		int n = ob.nextInt();
		int[] arr = new int[10];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = ob.nextInt();
		}
		System.out.println("Enter key: ");
		int x = ob.nextInt();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == x) {
				System.out.println("Found");
				break;
			}
			if (arr[i] != x) {
				System.out.println("Not found");
				break;
			}

		}
		// System.out.println(arr[i]);
	}
}
