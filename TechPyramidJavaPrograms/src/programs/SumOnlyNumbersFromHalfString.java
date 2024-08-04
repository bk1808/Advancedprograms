package programs;

public class SumOnlyNumbersFromHalfString {

	public static void main(String[] args) {
		String s = "asc123bsd4";
		String temp = "0";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {

				temp += ch;

			} else {

				sum += Integer.parseInt(temp);
				temp = "0";

			}
		}
		System.out.println(sum + Integer.parseInt(temp));
	}
}