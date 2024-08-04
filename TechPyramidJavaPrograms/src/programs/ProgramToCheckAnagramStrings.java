package programs;

import java.util.Arrays;

public class ProgramToCheckAnagramStrings {

	public static void main(String[] args) {

		String s1="Race"; 
		String s2="Care";
		String lower1 = s1.toLowerCase();
		String lower2 = s2.toLowerCase();
		char[] ch1=lower1.toCharArray();
		char[] ch2=lower2.toCharArray();
		Arrays.sort(ch1); 
		Arrays.sort(ch2); 
		boolean b = Arrays.equals(ch1, ch2);
		if(b==true) {
		System.out.println("The given string is anagram");
		}
		else {
			System.out.println("The given string is not an anagram");
		}
		
	}

}
