package programs;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {

		String s = "Java is a programming language";
		String s1 = "";
		char[] ch = s.toCharArray();
		boolean[] b = new boolean[ch.length];

		for (int i = 0; i < ch.length; i++) {

			if (b[i] == false) {

				int count = 1;

				for (int j = i+1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						count++;
						b[j] = true;
					}

				}
				s1 += ch[i];
				/*if (duplicate != 0) {
					System.out.print(ch[i]);
				
				}*/

			}
			
		}
		System.out.println(s1);
	}
}