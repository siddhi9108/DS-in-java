package algo.recursion.siddhi;

public class App {

	public static void main(String[] args) {
		System.out.println(recursiveLinearSearch(new int[] 
				{ 4, 48, 23, 12, 33, 44, 55, 66 }, 0, 3));
		// reduceByOne(12);
	}

	public static void reduceByOne(int x) {
		if (x >= 0) { // Base Case
			reduceByOne(x - 1);
		}
		System.out.println("Completed: " + x);
	}

	public static int recursiveLinearSearch(int[] a, int i, int x) {
		if (i > a.length - 1) {
			return -1;
		} else if (a[i] == x) {
			return i;
		} else {
			System.out.println("index at: " + i);
			return recursiveLinearSearch(a, i + 1, x);
		}
	}
}
