package programs.advance;

import java.util.Arrays;

public class SortArrayAscendingJRE1_8 {

	public static void main(String[] args) {

		int [] a= {18,2,3,25,5,7,9,15};
		
		Arrays.sort(a);
		for(int i=0 ; i<a.length ; i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
