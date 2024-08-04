//WAJP to find the Nth largest element in an integer array

/*
 * Steps:
 * 
 * 1. First we should have repeated element value or duplicate value inside array
 * 2. We must sort the array elements value before finding the Nth largest 
 * */

package com.allprograms;

import java.util.*;

public class Find_Nth_largest_element_int_array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = { 50, 30, 40, 10, 25, 35 };
		Arrays.sort(a);
		System.out.println("Input Element From 1 to: " + a.length);
		try {
		int n = s.nextInt();
		System.out.println(n + " largest element is:");
		System.out.println(a[a.length - n]);// to find the nth largest element from the last
		}
		catch(Exception e) {

		System.out.println("Enter index within the range");
		}
		
	s.close();
	}

}
