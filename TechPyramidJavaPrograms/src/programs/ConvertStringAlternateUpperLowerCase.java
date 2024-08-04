package programs;


public class ConvertStringAlternateUpperLowerCase {

	public static void main(String[] args) {

		String s = "Listen to you";

		char[] ch = s.toCharArray();

		for (int i = 1; i < ch.length; i++) {

			if (i % 2 == 0) {
				
				if (ch[i] >= 'A' && ch[i] <= 'Z') {

					ch[i] += 32;

				} else if (ch[i] >= 'a' && ch[i] <= 'z') {
					ch[i] -= 32;
				}

			}
		}
		
		String s1 = new String(ch);
		System.out.println(s1);
	
	}

}
