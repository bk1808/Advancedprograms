package programs;

public class ProgramToMergeTwoArraysInZigZag {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 4, 5, 6 };

		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {

			if ( i%2==0) {

				c[i] = a[i];

			} else {
				c[i] = b[i];
			}

		}
		
		/*
		 * for (int i = 0; i < b.length; i++) {
		 * 
		 * if (i % 2 == 1) {
		 * 
		 * c[i] = b[i];
		 * 
		 * } else { c[i+b.length] = a[i]; }
		 * 
		 * }
		 */
		
		
		for (int z : c) {
			System.out.println(z);
		}
	}
}