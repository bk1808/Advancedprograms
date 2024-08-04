package programs;

public class ProgramToFindSmallestNumberFromArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 0, 45, 89 };

		int smallest = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] <= smallest) {
				smallest = a[i];
			}

		}
		System.out.println(smallest);

	}

}
