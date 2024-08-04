package com.rakuten;

public class P010_specificPattern2 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j%2==0) {
					System.out.print("*");
				}
				else if(j==3) {
					System.out.print("0");
				}
				else if(j==1 || j==5) {
					System.out.print("1");
				}
			}
			System.out.println("");
		}
	}

}
