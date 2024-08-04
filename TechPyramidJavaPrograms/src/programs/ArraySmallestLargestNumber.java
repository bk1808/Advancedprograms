package programs;

import java.util.Arrays;

public class ArraySmallestLargestNumber {

	public static void main(String[] args) {

		int[] a = { 1, 3, 5, 19, 2, 7 };
		int largest=a[0]; int smallest=a[0];
		for (int i = 1; i < a.length; i++) {
			
			if(a[i]<smallest) {
				smallest=a[i];
			}
			if (a[i]>largest){
				largest=a[i];
			}
		}
		System.out.println(smallest+" is smallest");
		System.out.println(largest+" is largest");
	}

}
