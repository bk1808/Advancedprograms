package programs;

public class ProgramToFindUnrepeatedCharacters {

	public static void main(String[] args) {

		String s = "I am a good boy";
		System.out.println("Input: I am a good boy");
		char ch[] = s.toCharArray();
		boolean[] b = new boolean[ch.length];
		int sum = 0;
		for (int i = 0; i < ch.length; i++) {

			if (b[i] == false) {

				int count = 1;
				
				for (int j = i + 1; j < ch.length; j++) {

					if (ch[i] == ch[j]) {

						count++;

						b[j] = true;

					}
					
				}
				System.out.println(ch[i]+"==="+count+"number of times repeated");

				System.out.println(count);
				
				if (ch[i] > 'a' && ch[i] < 'z' || ch[i] > 'A' && ch[i] < 'Z') {
					sum = sum + count;
				}

			}

		}
		System.out.println("Unrepeated characters are: " + sum);

	}

}
