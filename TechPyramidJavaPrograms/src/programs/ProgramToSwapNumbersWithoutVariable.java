package programs;

public class ProgramToSwapNumbersWithoutVariable {

	public static void main(String[] args) {

		int a = 10;
		System.out.println("Before 'a' is: " + a);
		int b = 20;
		System.out.println("Before 'b' is: " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After reversing 'a' is: " + a);
		System.out.println("After reversing 'b' is: " + b);
	}

}
