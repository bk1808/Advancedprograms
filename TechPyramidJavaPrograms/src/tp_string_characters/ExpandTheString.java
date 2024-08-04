package tp_string_characters;

public class ExpandTheString {

	public static void main(String[] args) {

		String s = "a2b2c1a1b2";

		for (int i = 0; i < s.length(); i++) {

			if (Character.isLetter(s.charAt(i))) {

				char ch = s.charAt(i);
				int count = s.charAt(i + 1) - 48;
				for (int j = 0; j < count; j++) {
					System.out.print(ch);
				}
			}
		}

	}
}