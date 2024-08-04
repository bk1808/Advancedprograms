package tp_assignment_programs;

public class Find_length_array_without_length_variable_method {

	public static void main(String[] args) {

		int [] input = {1,2,3,4,5,6,7,8};
		int output=0;
		
		for(int length:input) {
		
			output++;
		}
		System.out.println("Length of array is: "+output);
	}

}
