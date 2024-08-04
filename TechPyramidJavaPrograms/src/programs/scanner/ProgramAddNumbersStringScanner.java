package programs.scanner;

import java.util.Scanner;

public class ProgramAddNumbersStringScanner {
	/* Write a java program to add numbers in a string */

	/* Input: a="asc123bsd4" | Output: 10 */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter string input");
		String input = s.nextLine();

		int sum = 0;
		for (int i = 0; i < input.length(); i++) {

			char c = input.charAt(i);
			if (c > '0' && c < '9') {

				sum = sum + (c - 48);

			}

		}
		System.out.println(sum);
		s.close();
	}
}