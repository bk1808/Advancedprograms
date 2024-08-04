package tp_sortingZerosAndIntegers;

public class AnotherWayToSortZerosInArray {

	public static void main(String[] args) {

		int a[] = { 1, 0, 6, 0, 8, 0, 8, 9, 5 };
		int result[] = new int[a.length];
		int index = result[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				result[index++] = a[i];
			}
		}
		for (int n : result) {
			System.out.print(n+" ");
		}
	}

}