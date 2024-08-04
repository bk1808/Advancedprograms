package com.rakuten;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class removeDuplicate {

	public static void main(String[] args) {
		String s1="a";
		String s2="b";
		System.out.println(s1==s2);
		
		String a1=new String("ababxycc");
		String a2=new String("ababxycc");
		System.out.println(a1==a2);
//		HashSet<Character> set=new HashSet<>();
//		for(int i=0;i<s.length();i++) {
//			set.add(s.charAt(i));
//		} 
//		System.out.println(set);
//		
//		Set<Character> set1=s.chars().mapToObj(p->(char)p).collect(Collectors.toSet());
//		System.out.println(set1);
	}
}
