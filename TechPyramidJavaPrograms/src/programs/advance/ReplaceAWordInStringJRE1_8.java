package programs.advance;

public class ReplaceAWordInStringJRE1_8 {

	public static void main(String[] args) {

		String s = "Java hi is a programming language";

		StringBuilder build = new StringBuilder();

		build.append(s);

		build.delete(5, 8);
		System.out.println(build);

	}

}
