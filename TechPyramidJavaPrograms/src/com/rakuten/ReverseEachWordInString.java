package com.rakuten;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String s= "My name is Vinay";
		String[] st=s.split(" ");
		for(int i=0;i<st.length;i++)
			{
			String s1=st[i];
			for(int j=s1.length()-1;j>=0;j--) 
			{
				System.out.print(s1.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
