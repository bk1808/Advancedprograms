package com.rakuten;

public class reverseTheWordInTheString {

	public static void main(String[] args) {
		String s1="my name is vinay krishna";
		String[] split = s1.split(" ");
		for(int i=split.length-1;i>=0;i--) {
			System.out.print(split[i]+" ");
		}
	}

}
