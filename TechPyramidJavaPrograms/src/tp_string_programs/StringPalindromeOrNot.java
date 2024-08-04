package tp_string_programs;

public class StringPalindromeOrNot {

	public static void main(String[] args) {


		String s = "wow";
		s.equalsIgnoreCase(s);
		String res = "";

		for (int i = 0; i < s.length(); i++) {

			res = s.charAt(i) + res;

		}
		if (res.equals(s)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

	}

}
