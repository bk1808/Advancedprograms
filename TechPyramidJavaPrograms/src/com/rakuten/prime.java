package com.rakuten;

public class prime {

	public static void main(String[] args) {
		int num=24;
		int i=2;
		for( ;i<num;i++) {
			if (num%i==0) { 	
				break;
			}
		}
		if(i==num) {
		System.out.println("its prime");
		
	}
		else {
			System.out.println("non prime");
		}

}
}
