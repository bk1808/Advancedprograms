package com.rakuten;

import java.util.Scanner;

public class finalTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int row = sc.nextInt();
		
		for(int i=0,col=0;i<row;) {
			if(i<row) 
				//col<=i  right angled
				//col+i>=row-1 left angled
				//col+i>=row-1 && col <=i equilateral
			{
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			col++;
			if(col==row) {
				System.out.println("");
				i++;
				col=0;
			}
			else {
				continue;
			}
		}
	}
}
