package tp_assignment_programs;

public class ReverseStringWithoutLength {

	public static void main(String[] args) {
		String str = "india";
		String rev = "";

		for (char a : str.toCharArray()) {

			rev = a + rev;

		}
		System.out.println(rev);

	}

}
