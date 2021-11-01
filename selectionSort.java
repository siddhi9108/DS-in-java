package ds.sortingMethods.selectionSort;

public class selectionSort {
	public static void main(String[] args) {
		int[] arr = selectionSort(new int[] { 4, 56, 74, 32, 1 });
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}

	public static int[] selectionSort(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		return a;
	}
}
