package programs.scanner;

public class ProgramAchiveMethodOverloading {
	/* Write a java program to achieve method overloading */

	public static void main(String[] args) {

		demo(10, 20);
		demo(10.5, 15.6);
		demo("praveen", 35);
		demo('a', 'b');

	}

	public static void demo(int a, int b) {

		int sum = a + b;
		System.out.println(sum);
	}

	public static void demo(double a, double b) {

		double sum = a + b;
		System.out.println(sum);

	}

	public static void demo(String name, int age) {

		System.out.println(name);
		System.out.println(age);
	}

	public static void demo(char a, char s) {

		System.out.println(a);
		System.out.println(s);
	}

}
