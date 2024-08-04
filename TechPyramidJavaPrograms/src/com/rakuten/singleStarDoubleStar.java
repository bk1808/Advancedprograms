package com.rakuten;

public class singleStarDoubleStar {

	public static void main(String[] args) {
		int row=5;
		for(int i=0;i<row;i++) {
			if(i%2==0) {
				System.out.println("*");
			}
			else if(i%2==1) {
				System.out.println("**");
			}
		}
	}

}
