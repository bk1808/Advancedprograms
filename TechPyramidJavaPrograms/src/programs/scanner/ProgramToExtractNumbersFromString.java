package programs.scanner;

public class ProgramToExtractNumbersFromString {

	public static void main(String[] args) {

		String s = "abcd1234cdf636";
		String s1 = "";
		
		int number = 0;
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {

				number = c - 48;
				s1 = s1 + number;

			}

		}
		System.out.println(s1);
	}

}
