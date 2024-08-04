package com.allprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Mobile_Number_Largest {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the mobile number");
		String number = s.next();
		char[] ch = number.toCharArray();
		int index=s.nextInt();
		
		for(int i=0 ; i<ch.length ; i++) {
			
			char c = ch[i];
			if(Character.isDigit(c)) {
				c-=48;
				
			}
			System.out.println(c);
//			System.out.println(index+" largest number is: "+str[str.length-index]);
			
		}
		
		s.close();
	}

}
