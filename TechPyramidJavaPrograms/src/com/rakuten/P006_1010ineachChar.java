package com.rakuten;

public class P006_1010ineachChar {

	public static void main(String[] args) {
		int n=5;
		int count=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				count++;
				if(count%2==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println("");
		}
	}

}
