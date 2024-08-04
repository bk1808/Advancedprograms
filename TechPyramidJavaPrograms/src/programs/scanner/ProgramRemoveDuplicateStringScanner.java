package programs.scanner;

import java.util.Scanner;

public class ProgramRemoveDuplicateStringScanner {

	/* Write a java program to remove duplicate from a string and print */
	/* Input: Java is a programming language | Output: Jav isprogmnlue */
	/* In this program i have used empty string to concatinate the characters 
	 * present in the array and to print as one string. Another alternate method is
	 * using StringBuilder class we can appent the characters of array*/

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter string input");
		String input = s.nextLine();
		char[] ch = input.toCharArray();
		boolean[] b = new boolean[ch.length];

//		StringBuilder build = new StringBuilder();
		String result = "";

		for (int i = 0; i < ch.length; i++) {

			if (b[i] == false) {
				int count = 0;
				for (int j = 0; j < ch.length; j++) {

					if (ch[i] == ch[j]) {

						count++;
						b[j] = true;
					}
				}
//				build.append(ch[i]);
				result += ch[i];

			}

		}
//		System.out.println(build);
		System.out.println(result);
		s.close();
	}

}
