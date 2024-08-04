package programs;

public class CountLowerUpperCaseChar {

	public static void main(String[] args) {

		String s = "I am a traVeLLer";
		String s1 = s.replace(" ", "");

		int lower = 0;
		int upper = 0;
		for (int i = 0; i < s1.length(); i++) {

			char c = s1.charAt(i);

			if (c >= 'A' && c <= 'Z') {
				upper++;
			} else if (c >= 'a' && c <= 'z') {
				lower++;
			}

		}
		System.out.println(upper);
		System.out.println(lower);

	}
}
