package com.allprograms;

public class Reverse_Words_In_Same_Place {

	public static void main(String[] args) {

		
		String s = "Java is a programming language";
		String[] sc = s.split(" ");
		
		for(int i=0 ; i<sc.length ; i++) {
			
			String str = sc[i];	
			StringBuilder build = new StringBuilder(str).reverse();
			System.out.print(build.toString()+" ");
						
		}
		
		
	}

}
