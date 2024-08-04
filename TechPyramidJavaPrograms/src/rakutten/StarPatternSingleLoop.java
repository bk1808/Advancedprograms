package rakutten;

public class StarPatternSingleLoop {

	public static void main(String[] args) {

		int n = 5;
		String star = "*";

		for (int i = 0; i < n; i++) {

			System.out.println(star);
			star += "*";

		}

	}

}

/*
 * String star = "*"; int n = 5;
 * 
 * for (int i = 0; i < n; i++) {
 * 
 * if (i > 0) {
 * 
 * System.out.println(star); star += "*"; }
 */