package com.rakuten;

public class P011_ABCDEinEachLine {

	public static void main(String[] args) {
		int n=5;
		int k;
		for(int i=1;i<=n;i++) {
			k=65;
			for(int j=1;j<=n;j++) {
				System.out.print((char)k);
				k++;
			}
			System.out.println("");
		}
		  
	}

}
