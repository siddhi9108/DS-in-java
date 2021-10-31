package ds.sortingMethods.MergeSort;

public class MergeSort1 {
	void sort(int arr[]) {
		sort(arr, 0, arr.length - 1);
	}

	public static void sort(int[] arr, int start, int end) {
		if (end <= start) {
			return;
		}
		int mid = (start + end) / 2;
		sort(arr, start, mid);
		sort(arr, mid + 1, end);
		merge(arr, start, mid, end);
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int[] mergedArr = new int[end - start + 1];
		int i = start;
		int j = mid + 1;
		int k = 0;
		while (i <= mid && j <= end) {
			if (arr[i] < arr[j]) {
				mergedArr[k] = arr[i];
				i++;
			} else {
				mergedArr[k] = arr[j];
				j++;
			}
			k++;
		}
		if (i <= mid) {
			while (i <= mid) {
				mergedArr[k] = arr[i];
				i++;
				k++;
			}
		} else if (j <= end) {
			while (i < end) {
				mergedArr[k] = arr[j];
				j++;
				k++;
			}
		}
		for (int l = 0; l < mergedArr.length; l++) {
			arr[start + 1] = mergedArr[i];
		}
	}
}
