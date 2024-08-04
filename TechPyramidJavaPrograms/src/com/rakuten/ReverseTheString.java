package com.rakuten;

public class ReverseTheString {

	public static void main(String[] args) {
		String S="My name is Vinay";
		String[] str=S.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
		}
	}
}
