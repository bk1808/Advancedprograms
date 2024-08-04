package tp_other_programs;

import java.util.Arrays;

public class FindUniqueElementPresentInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 1, 4, 9, 6, 5, 4, 3, 1, 6 };
		Arrays.sort(arr);// []
		
		int count = 1;
		System.out.println("Occurance of each element:");
		for (int i = 1; i <= arr.length; i++) {
			if (i < arr.length && arr[i] == arr[i - 1]) {
				count++; // If the current element is the same as the previous one, increment the count
			} else {
				System.out.println(arr[i - 1] + " occurs " + count + " times");
				count = 1; // Reset count for the next unique element
			}
		}
		System.out.println("Only Duplicate elements");

		for (int i = 1; i < arr.length; i++) {
			if (i == 0 || arr[i] == arr[i - 1]) {
				System.out.println(arr[i] + " ");
			}
		}

		System.out.println("Print only unique elements");

		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || arr[i] != arr[i - 1]) {
				System.out.println(arr[i] + " ");
			}
		}
		System.out.println("Remove duplicate elements");

		for (int i = 0; i < arr.length; i++) {
			// Check if the current element is not equal to the previous and next element
			if ((i == 0 || arr[i] != arr[i - 1]) && (i == arr.length - 1 || arr[i] != arr[i + 1])) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}