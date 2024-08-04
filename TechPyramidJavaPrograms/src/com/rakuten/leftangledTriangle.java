package com.rakuten;

public class leftangledTriangle {

	public static void main(String[] args) {
		
		int row=5;
		for(int i=0,col=0;i<row;) {
			if(col+i>=row-1) {
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
