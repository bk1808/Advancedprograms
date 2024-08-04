package programs.advance;

public class ReverseStringWordByWordJRE1_8 {

	public static void main(String[] args) {

		String s = "Java hi is a programming language";

		String[] s1 = s.split(" ");

		StringBuilder build = new StringBuilder();

		String rev = "";

		for (int i = 0; i < s1.length; i++) {

			rev = s1[i] + " " + rev;
		}

		build.append(rev);
		build.reverse();
		System.out.println(build);
	}

}
