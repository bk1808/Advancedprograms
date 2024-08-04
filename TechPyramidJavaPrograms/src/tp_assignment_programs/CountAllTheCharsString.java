package tp_assignment_programs;

public class CountAllTheCharsString {

	public static void main(String[] args) {

		String s = "dsakda213131KHKJH**//^&*";
		char[] ch = s.toCharArray();

		int upper = 0;
		int lower = 0;
		int special = 0;
		int digit = 0;

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				upper++;
			} else if (ch[i] >= 'a' && ch[i] <= 'z') {
				lower++;

			} else if (ch[i] >= '0' && ch[i] <= '9') {
				digit++;

			} else {
				special++;
			}
		}
		System.out.println("Upper case: " + upper);
		System.out.println("Lower case: " + lower);
		System.out.println("Digits: " + digit);
		System.out.println("Special: " + special);

		int up = 0;
		int low = 0;
		int digi = 0;
		int spec = 0;

		for (int i = 0; i < ch.length; i++) {

			if (Character.isUpperCase(ch[i])) {
				up++;
			} else if (Character.isLowerCase(ch[i])) {
				low++;
			} else if (Character.isDigit(ch[i])) {
				digi++;
			} else {
				spec++;
			}
		}

		System.out.println(up);
		System.out.println(low);
		System.out.println(digi);
		System.out.println(spec);

	}

}
