package programs.scanner;

public class ProgramToFindLargestNumberFromArray {

	public static void main(String[] args) {

		int [] a = {1,2,0,45,89};
		
		int largest=0;
		for(int i=0 ; i<a.length ; i++) {
			
			if(a[i]>=largest) {
				largest=a[i];
			}
		}
		System.out.println(largest);
		
	}

}
