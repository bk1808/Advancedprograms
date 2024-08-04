package tp_string_characters;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "Hitler woman";
		String s2 = "Mother inlaw";
		String s3 = s1.toLowerCase();
		String s4 = s2.toLowerCase();
		char [] ch1=s3.toCharArray();
		char [] ch2 = s4.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean anagram = Arrays.equals(ch1, ch2);
		if(anagram==true) {
			System.out.println("String is anagram");
		}
		else {
			System.out.println("String is not anagram");
		}
		
		
	}

}
