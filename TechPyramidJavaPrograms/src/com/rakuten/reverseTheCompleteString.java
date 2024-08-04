package com.rakuten;

public class reverseTheCompleteString {

	public static void main(String[] args) {
		String s1="I love RCB";
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}
	}

}
