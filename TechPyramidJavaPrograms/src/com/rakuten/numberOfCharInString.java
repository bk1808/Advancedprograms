package com.rakuten;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class numberOfCharInString {

	public static void main(String[] args) {
		String s="ababxyccsyaacc";
		HashMap<Character, Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else {
				map.put(s.charAt(i),1);
			}
		}
		for (java.util.Map.Entry<Character, Integer> entry: map.entrySet()) {
			
			if(entry.getValue()>1) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
	}
	
}
