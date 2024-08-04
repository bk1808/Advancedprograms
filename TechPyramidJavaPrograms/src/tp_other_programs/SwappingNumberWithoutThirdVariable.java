package tp_other_programs;

import java.util.Arrays;

public class SwappingNumberWithoutThirdVariable {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("Befire swapping: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}