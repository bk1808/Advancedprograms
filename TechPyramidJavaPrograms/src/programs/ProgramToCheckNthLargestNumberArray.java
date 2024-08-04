package programs;

import java.util.Scanner;

public class ProgramToCheckNthLargestNumberArray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Nth value");
		int n = s.nextInt();
		int[] a = { 22, 3, 1, 5, 6, 8 };
		for (int i = 0; i < a.length; i++) {

			int count = 0;
			for (int j = 0; j < a.length; j++) {

				if (a[j] > a[i]) {
					count++;

				}

			}
			if (count == n - 1) {
				System.out.println(a[i] + " is: " + n + " largest");
			}
		}
		s.close();

	}

}
