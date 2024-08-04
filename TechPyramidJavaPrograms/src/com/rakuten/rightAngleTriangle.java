package com.rakuten;

import java.util.Iterator;
import java.util.Scanner;

public class rightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner st=new Scanner(System.in);
//		
//		System.out.println("enter rows");
		
		int row=5;
		
		for (int i=0,col=0;i<row;) {    // col=0 i=0
			
			if(col+i>=row-1 && col <=i) {
				System.out.print("*");	
			}
			else {
				System.out.print(" ");
			}
			 col++;
			 if (col==row) {
	                System.out.println();
	                i++; // Move to the next row 
	                col=0;
	           }
			 else {
				 continue;
			 }
			
		}

	}

}


// right angle triangle  col+i>=row-1

// left angle triangle col <=i  

//equlateral triangle i<row;
