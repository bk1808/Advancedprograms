package programs;

public class ReverseStringByWordAndCharacters {

	public static void main(String[] args) {

		String s = "Hello My name is Ram";
		System.out.println("Input: Hello My name is Ram");
		String str[] = s.split(" ");
		String rev = "";
		for (int i = 0; i < str.length; i++) {

			
			rev = " "+str[i] + rev;

		}
		System.out.println(rev);

		char ch[] = rev.toCharArray();

		String s1 = "";
		for (int i = 0; i < ch.length; i++) {

			s1 = ch[i] + s1;
		}
		System.out.println("Output: " + s1);
	}

}
