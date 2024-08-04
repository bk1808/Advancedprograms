package com.rakuten;

public class AnagramPro {

	public static void main(String[] args) {
		boolean flag=true;
		String s1="care";
		String s2="race";
		
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				if(!s2.contains(s1.charAt(i)+"")) {
					flag=false;
					break;
				}	
			}
			if(flag==true) {
				System.out.println("anagram");
			}
			else {
				System.out.println("not anagram");
			}
			
		}
		else {
			System.out.println("not anagram");
		}
		
	}

}
