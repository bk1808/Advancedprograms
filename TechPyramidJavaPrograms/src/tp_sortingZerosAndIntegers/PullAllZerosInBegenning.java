package tp_sortingZerosAndIntegers;

public class PullAllZerosInBegenning {

	public static void main(String[] args) {

		int[] a = { 1, 0, 2, 5, 0, 4, 0, 8, 0, 9, 0 };
		int result[] = new int[a.length];
		int index = result[0];
		for (int i = a.length - 1; i >= 0; i++) {

			if (a[i] != 0) {
				result[index--] = a[i];
			}

		}

		for(int n:result) {
			System.out.println(n+" ");
		}
	}

}
