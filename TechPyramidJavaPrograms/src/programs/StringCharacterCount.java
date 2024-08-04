package programs;

public class StringCharacterCount {

	public static void main(String[] args) {

		String s = "a2b2c1a1b2";
		//a-2,b-2,c-1,a-1,b-2
		for(int i=0 ; i<s.length()-1 ; i=i+2) {
		
			char ch = s.charAt(i);
			int count = s.charAt(i+1)-48;
			for(int j=0 ; j<count ; j++) {
				System.out.print(ch);
			}
			
		}
		
		
		
	}

}
