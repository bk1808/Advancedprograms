package programs.scanner;

public class CovertUpperToLowerToUpper {

	public static void main(String[] args) {

		String s = "My Name Is Arun";
		String s1 = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {

				c -= 32;
			} else if (c >= 'A' && c <= 'Z') {
				c += 32;
			}
			
			s1+=c;
		}
		System.out.println(s1);
	}

}
