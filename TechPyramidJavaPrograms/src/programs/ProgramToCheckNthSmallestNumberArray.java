package programs;

import java.util.Scanner;

public class ProgramToCheckNthSmallestNumberArray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Nth smallest");
		int n = s.nextInt();
		int[] a = { 22, 34, 7, 4, 2, 11 };
		for (int i = 0; i < a.length; i++) {

			int count = 0;
			for (int j = 0; j < a.length; j++) {

				if (a[j] < a[i]) {

					count++;
				}

			}
			if (count == n - 1) {
				System.out.println(a[i] + " is " + n + "-largest");
			}
		}
		s.close();
	}

}
