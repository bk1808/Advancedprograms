package programs;

public class ReverseAString {

	public static void main(String[] args) {

		String s = "Hello how are you";
		char[] ch = s.toCharArray();
		String rev = "";
		for (int i = 0; i < ch.length; i++) {

			rev = ch[i] + "" + rev;

		}

		System.out.println(rev);

	}
}
