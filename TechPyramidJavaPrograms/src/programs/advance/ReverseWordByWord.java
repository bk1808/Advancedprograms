package programs.advance;

public class ReverseWordByWord {

	public static void main(String[] args) {
		
		String s = "Java hi is a programming language";

		StringBuilder build = new StringBuilder();
		
		build.append(s);
		
		build.reverse();
		System.out.println(build);
	}
	
	
}
