package tp_string_programs;

public class StringSpaceDoNotReverse {

	public static void main(String[] args) {

		String s = "I love my india";
//		int a = s.replaceAll(" ", "").length()-1;
		String s1 = s.replace(" ", "");
		int n = s1.length() - 1;

		for (int i = 0; i < s.length(); i++) {
			
			//(Character.isSpaceChar(s.charAt(i))
			if (s.charAt(i) == ' ') {

				System.out.print(s.charAt(i));

			} else {

				System.out.print(s1.charAt(n--));
			}

		}
	}

}
