package com.rakuten;

public class removeEandUpdateXwithoutReplaceMethod {

	public static void main(String[] args) {
		String s="I am waiting here";

		
		for(int i=0;i<s.length();i++) {
			char str = s.charAt(i);
			if(str=='e') {
				System.out.print("x");
			}
			else {
				System.out.print(str);
			}
		}
		
	}

}
