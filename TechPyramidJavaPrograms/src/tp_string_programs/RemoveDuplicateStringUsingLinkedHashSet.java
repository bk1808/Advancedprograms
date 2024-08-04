package tp_string_programs;

import java.util.LinkedHashSet;

public class RemoveDuplicateStringUsingLinkedHashSet {

	public static void main(String[] args) {
	
		String s = "alpha alpha beta beta";
		String[] str = s.split(" ");
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		for(int i = 0 ; i<str.length ; i++) {
			
			lhs.add(str[i]);
			
		}	
		System.out.println(lhs);
		}
		
	}
