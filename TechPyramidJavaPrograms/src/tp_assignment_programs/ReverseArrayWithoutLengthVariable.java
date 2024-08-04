package tp_assignment_programs;

public class ReverseArrayWithoutLengthVariable {

	public static void main(String[] args) {

		int[] input = {1,2,3,4,5,6,7,8};
		String output = "";
		for(int data:input) {
			
			output=data+output;
			
		}
		System.out.println(output);
	}

}
