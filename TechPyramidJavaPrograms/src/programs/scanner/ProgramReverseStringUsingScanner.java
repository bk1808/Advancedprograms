package programs.scanner;

import java.util.Scanner;

public class ProgramReverseStringUsingScanner {

	/* Write a java program to reverse a string using scanner class */

	/* Input: Hello | Output: olleH */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter string input");
		String input = s.nextLine();
		String rev = "";
		for (int i = 0; i < input.length(); i++) {

			char c = input.charAt(i);
			rev = c + rev;

		}
		System.out.println("After reversing");
		System.out.println(rev);
		s.close();
	}

}
