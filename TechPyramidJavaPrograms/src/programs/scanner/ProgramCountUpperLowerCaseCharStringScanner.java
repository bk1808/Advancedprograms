package programs.scanner;

import java.util.Scanner;

public class ProgramCountUpperLowerCaseCharStringScanner {
	/* Write a java program to count the number of upper & lower case letters */

	/* Input: I am a traVeLLer | Output: uppercase:4 lowercase:9 */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter string input");
		String input = s.nextLine();

		int upper = 0;
		int lower = 0;
		for (int i = 0; i < input.length(); i++) {

			char c = input.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				upper++;
			} else if (c >= 'a' && c <= 'z') {
				lower++;
			}

		}
		System.out.println("Number of upper case are: " + upper);
		System.out.println("Number of lower case are: " + lower);
		s.close();
	}

}
