package programs.scanner;

import java.util.Scanner;

public class ProgramConvertAlternateCharUpperLowerStringScanner {

	/* Write a java program to convert string into alternate upper and lower case */

	/* Input: Listen | Output: LiStEn */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter string input");
		String input = s.nextLine();
		char[] ch = input.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (i % 2 == 0) {
				if (ch[i] >= 'A' && ch[i] <= 'Z') {

					ch[i] += 32;

				} else if (ch[i] >= 'a' && ch[i] <= 'z') {

					ch[i] -= 32;

				}

			}

		}
		String result = new String(ch);
		System.out.println(result);
		s.close();
	}
}
	
