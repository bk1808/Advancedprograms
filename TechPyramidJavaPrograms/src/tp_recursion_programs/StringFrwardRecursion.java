package tp_recursion_programs;

public class StringFrwardRecursion {

	public static void main(String[] args) {

		
		String str = "india";
		int a = 0;
		reverse(str, a);
	}

	public static void reverse(String str, int a) {

		if(a<=str.length()-1) {
			
			System.out.print(str.charAt(a));
			reverse(str,a+1);
		}
		
		
	}
}