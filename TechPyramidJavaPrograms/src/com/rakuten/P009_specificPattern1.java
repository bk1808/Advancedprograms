package com.rakuten;

public class P009_specificPattern1 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i%2==0) {
					if(j%2==0) {
						System.out.print("*");
					}
					else {
						System.out.print("1");
					}
				}
				else {
					if(j%2==0) {
						System.out.print("*");
					}
					else {
						System.out.print("0");
					}
				}
			}
			System.out.println("");
		}
	}

}
