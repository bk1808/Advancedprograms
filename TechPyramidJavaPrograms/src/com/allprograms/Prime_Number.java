package com.allprograms;

public class Prime_Number {

	public static void main(String[] args) {

		int n = 13;

		if (n == 1) {

			System.out.println(n + " is not a prime number");
			return;
		}

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {

				System.out.println(n + " is not a prime number");
				return;

			}

		}
		System.out.println(n + " is a prime number");

	}

}
