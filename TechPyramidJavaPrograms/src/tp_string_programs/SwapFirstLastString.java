package tp_string_programs;

public class SwapFirstLastString {

	
	
	public static void main(String[] args) {
		
		
		String s = "I am a java programmer";
		String [] str = s.split(" ");
		
		String temp = str[0];
		str[0]=str[4];
		str[4]=temp;

		
		for(int i=0 ; i<str.length ; i++) {
			
			System.out.print(str[i]+" ");
			
		}
	}
	
	
}
