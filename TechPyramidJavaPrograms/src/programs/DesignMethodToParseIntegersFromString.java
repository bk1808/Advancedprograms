package programs;

public class DesignMethodToParseIntegersFromString {

	public static void main(String[] args) {
		String s = "asc123bsd4";

		System.out.println(stringSum(s));
	}

	public static int stringSum(String s) {

		String temp = "0";
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			if (ch>='0' && ch<= '9') {

				temp += ch;

			} else {

				sum += Integer.parseInt(temp);
				temp = "0";

			}

		}
		return sum + Integer.parseInt(temp);

	}
}
