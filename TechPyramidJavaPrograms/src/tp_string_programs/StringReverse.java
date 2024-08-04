package tp_string_programs;

public class StringReverse {

	public static void main(String[] args) {

		String s= "india";
		s.equalsIgnoreCase(s);
		String res = "";
		
		for(int i = 0 ; i<s.length() ; i++) {
			
			res=s.charAt(i)+res;
			
		}
		
		System.out.println(res);
	}

}
