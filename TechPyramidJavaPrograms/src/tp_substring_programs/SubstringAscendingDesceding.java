package tp_substring_programs;

public class SubstringAscendingDesceding {

	public static void main(String[] args) {

		String s="sum";
		
		for(int i=0 ; i<s.length() ; i++) {
			
			for(int j=i+1 ; j<=s.length() ; j++) {
				
				System.out.print(s.subSequence(i, j)+" ");
			}
			
			/* first iteration: 3 times the outer for loop will iterate
			 * substring (0,1)--> 's'int begin, int end index
			 * substring (0,2)--> 'su'
			 * substring (0,3)--> 'sum'
			 * 
			 * second iteration: 2 times the outer for loop will iterate
			 * substring (1,1)--> 'u'int begin, int end index
			 * substring (1,2)--> 'um'
			 * 
			 * third iteration: 1 time the outer loop will iterate
			 * substring (2,1)--> 'm'
			 * 
			 * inner for loop we are taking (j<=s.length) because we are starting 
			 * the index from j=1;
			 * and we are initializing inner for loop j=i+1 because 'j' should be 
			 * one number greater than 'i' until the inner loop iterates
			 * 
			 * */
		}
		
		
	}

}
