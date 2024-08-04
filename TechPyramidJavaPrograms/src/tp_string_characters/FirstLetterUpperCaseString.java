package tp_string_characters;

public class FirstLetterUpperCaseString {

	public static void main(String[] args) {

		
		String s = "i am from karnataka";
		String [] str = s.split(" ");
		
		for(int i=0 ; i<str.length ; i++) {
			
			String ch = str[i];
			ch = Character.toUpperCase(ch.charAt(0))+ch.substring(1);
			System.out.print(ch+" ");
		}
		
	}

}
