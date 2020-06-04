package ds.searching;

public class LinearSearch {

	public static int linearSearch(int[] a, int x) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				return i;

			}

		}
		return -1;

	}

	public static void main(String[] args) {
		int []a = new int[5];

		a[0] = 10;

		a[1] = 20;

		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		System.out.println(LinearSearch.linearSearch(a, 40));
	}

}
