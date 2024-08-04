package interview_programs;

import java.util.Scanner;

public class LargestElementInArray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter size");
		int size = s.nextInt();
		int [] a = new int[size];
		System.out.println("Enter values");
		for(int i=0 ; i<a.length ; i++) {
			a[i]=s.nextInt();
		}
		System.out.println("The largest is;");		
		int max=a[0];
		for(int i=1 ; i<a.length; i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		System.out.println(max);
		s.close();
		
	}

}
