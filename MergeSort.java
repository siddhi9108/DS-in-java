package ds.sortingMethods.MergeSort;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 111, 7, 45, 56, 33, 24, 0 };
		MergeSort1 ob = new MergeSort1();
		ob.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
