package tp_string_programs;

public class StringWordReverse {

	public static void main(String[] args) {

		String s = "welcome to tek pyramid welcome to gc18";
		String [] str = s.split(" ");
		String reverse = "";
		for(int i=0 ; i<str.length; i++) {
			
			reverse=str[i]+" "+reverse;
			
			
		}
		System.out.println(reverse);
		
		
	}

}
