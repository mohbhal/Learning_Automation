package ds.searching;

public class BinarySearch {

	public static int getvalue(int a[], int key) {
		int l = 0;

		int h = a.length - 1;

		while (l <= h) {
			int mid = (l + h) / 2;

			if (key < a[mid]) {
				h = mid - 1;
			} else if (key > a[mid]) {

				l = mid + 1;
			}
			else return mid;
		}
		return -1;

	}

	public static void main(String[] args) {

		System.out.println(
				getvalue(new int[] { 1,2,3,4,5,7,9,23,45,67,89,90 }, 89));

	}

}
