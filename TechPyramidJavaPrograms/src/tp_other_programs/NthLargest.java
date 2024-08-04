package tp_other_programs;

import java.util.Arrays;
import java.util.Scanner;

public class NthLargest {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the index");
		int [] a = {10,80,5,9,40,60};
		int index = s.nextInt();
		Arrays.sort(a);
		System.out.println(index+" largest is: ");
		System.out.println(a[a.length-index]);
		s.close();
		
	}

}
