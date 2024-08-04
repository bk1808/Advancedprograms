package programs;

public class LongestWordInString {

	public static void main(String[] args) {

		String s = "I am a student";
		String[] s1 = s.split(" ");
		
		String small = s1[0];
		String large = s1[0];

		for (int i = 0; i < s1.length; i++) {

			if (s1[i].length() < small.length()) {
				small = s1[i];
			} else if (s1[i].length() > large.length()) {
				large = s1[i];
			}
		}
		System.out.println(large);
		System.out.println(small);

	}
}