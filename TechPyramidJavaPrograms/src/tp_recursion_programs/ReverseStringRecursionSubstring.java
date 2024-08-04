package tp_recursion_programs;

public class ReverseStringRecursionSubstring {

	public static void main(String[] args) {

		String str="India";
		reverse(str);
				
	}
	public static void reverse(String str) {
		
		
		if(str.length()>=1) {
			
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0, str.length()-1));
		}
		
	}

}
