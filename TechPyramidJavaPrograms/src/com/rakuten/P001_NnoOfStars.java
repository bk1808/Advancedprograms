package com.rakuten;

import java.util.Scanner;

public class P001_NnoOfStars {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value: " );
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
