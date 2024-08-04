package programs;

public class RemoveDuplicatesFromStringUsingMethods {

	public static void main(String[] args) {

		String input = "Java is a programming language";
		String output = "";

		for (int i = 0; i < input.length(); i++) {
			/*character is stored and fetched inside 'ch*/
			char ch = input.charAt(i);
			char ch1 = Character.toUpperCase(ch);
			char ch2 = Character.toLowerCase(ch);
			/*condition to check upper and lower case*/
			if (output.indexOf(ch1) == -1 && output.indexOf(ch2) == -1) {

				output += ch;
			}

		}
		System.out.println(output);
	}
}
