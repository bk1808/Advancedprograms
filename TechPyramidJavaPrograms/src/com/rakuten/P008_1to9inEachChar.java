package com.rakuten;

public class P008_1to9inEachChar {

	public static void main(String[] args) {
		int n=5;
		int count=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(count);
				count++;
				if(count>9) {
				count=0;
			}
				
			
			}
			System.out.println("");
		}
	}

}
