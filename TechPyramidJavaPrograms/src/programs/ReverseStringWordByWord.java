package programs;

public class ReverseStringWordByWord {

	public static void main(String[] args) {

		String s = "Hello i am a good boy";
		System.out.println("Input: Hello i am a good boy");
		String str[] = s.split(" ");
		String rev = "";
		for (int i = 0; i < str.length; i++) {

			rev = str[i]+" "+rev;

		}
		System.out.println("Output: "+rev);
	}
}
