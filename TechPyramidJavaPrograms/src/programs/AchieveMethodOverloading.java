package programs;

public class AchieveMethodOverloading {

	public static void main(String[] args) {

		add(10, 20);
		add(10, 30, 50);
		add(90);

	}

	public static void add(int a, int b) {

		int sum = a + b;
		System.out.println(sum);

	}

	public static void add(int a, int c, int d) {

		int sum = a + c + d;
		System.out.println(sum);
	}

	public static void add(int a) {

		System.out.println(a);

	}

}
