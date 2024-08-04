package com.allprograms;

import java.util.Scanner;

public class Prime_Numbers_M_N {

	public static void main(String[] args) {

		System.out.println("Enter M value");
		Scanner s = new Scanner(System.in);

		int m = s.nextInt();

		for (int i = 0; i <= m; i++) {

			int n = i;
			int count = 0;
			for (int j = 2; j < n; j++) {

				if (n % j == 0) {
					count++;
					System.out.println(n + " is not prime");
					break;
				}
			}
			if (count == 0 && n != 1) {

				System.out.println(n + " is prime");
			}

		}

		s.close();
	}
}
