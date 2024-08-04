package tp_substring_programs;

public class SwapStringWithoutThirdVariable {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "api";
		
		System.out.println("Before swapping: ");
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());//0, 7-3;0-3
		s1=s1.substring(s2.length());//4-7;
		
		System.out.println("After swapping: ");
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
	}

}
