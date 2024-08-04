package programs.advance;

import java.util.Arrays;

public class SortArrayDescendingJRE1_8 {
	
	public static void main(String[] args) {
		
		int [] b = {1,5,7,9,46,85,12};
		Arrays.sort(b);
		
		for(int i=b.length-1 ; i>0 ; i--) {
			System.out.println(b[i]);
		}
	}
	
}
