package ds.sortingMethods.insertionSort;

public class insertionSort {

	public static void main(String[] args) {
		int arr[] = insertionSort(new int[] { 1, 4, 11, 222, 33, 43, 123, 331 });
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

	public static int[] insertionSort(int[] a) {
		for (int i = 1; i < a.length - 1; i++) {
			int element = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > element) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = element;
		}
		return a;
	}

}
