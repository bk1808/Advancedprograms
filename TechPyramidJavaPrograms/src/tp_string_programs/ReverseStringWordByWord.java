package tp_string_programs;

public class ReverseStringWordByWord {

	public static void main(String[] args) {

		String s = "welcome to gc18";
		String[] str = s.split(" ");

		for (int i = 0; i < str.length; i++) {

			String s1 = " " + str[i];

			for (int j = s1.length() - 1; j >= 0; j--) {

				System.out.print(s1.charAt(j));

			}
		}

	}

}
