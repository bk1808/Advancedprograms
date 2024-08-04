package programs.advance;

import java.util.LinkedHashSet;

public class RemoveDuplicateCahrctrsUsingLinkedHashSet {


public static void main(String[] args) {
		
		String str = "language";
		
		char []ch=str.toCharArray();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		int count=0;
		for(int i=0 ; i<ch.length ; i++) {
			
			set.add(ch[i]);
			
		}
		String s="";
		
		for(Character c:set) {
			count++;
			s+=c;
		}
		System.out.println(count);
		System.out.println(s);
	}
		
}

