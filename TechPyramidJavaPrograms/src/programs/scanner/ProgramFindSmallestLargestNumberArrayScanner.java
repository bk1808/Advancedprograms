package programs.scanner;

import java.util.Scanner;

public class ProgramFindSmallestLargestNumberArrayScanner {

	/* Write a java program to find the smallest and largest number in an array */

	/* Input: [1,3,5,6,2,7] | Output: largest=7 smallest=1 */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter size");
		int size = s.nextInt();
		int[] array = new int[size];

		
		for (int i = 0; i < array.length; i++) {

			array[i] = s.nextInt();

		}
		int largest=array[0]; int smallest=array[0];
		/*intialize with 1, because i am comparing the first element with others*/
		for (int i = 1; i < array.length; i++) {
			
			if(array[i]>largest) {
				largest=array[i];
			}
			if(array[i]<smallest) {
				smallest=array[i];
			}

		}
		System.out.println(largest);
		System.out.println(smallest);
		s.close();
	}
}