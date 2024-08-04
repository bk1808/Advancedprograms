package programs;

public class ProgramToRemoveNumbersFromString {

	public static void main(String[] args) {

		String s = "Ab2hishek12";
		StringBuilder build = new StringBuilder();
		String s1="";
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (Character.isLetter(c)) {

				build.append(c).toString();
				s1+=c;

			}

		}
		System.out.println(build);
		System.out.println(s1);
	}

}
