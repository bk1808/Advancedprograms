package programs.scanner;

public class FindLongestWordInString {

	/*WAJP to find the longest word in the string
	 * Input: I am a student | Output: student
	 */
	
	public static void main(String[] args) {
		
		String s="I am a student";
		String[] s1=s.split(" ");
		
		String longest=s1[0]; 
		for(int i=0 ; i<s1.length ; i++) {
			
			if(s1[i].length()>longest.length()) {
				longest=s1[i];
			}
			
		}
		System.out.println(longest);
	}
	

}
