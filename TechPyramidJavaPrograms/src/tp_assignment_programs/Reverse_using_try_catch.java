package tp_assignment_programs;

public class Reverse_using_try_catch {

	public static void main(String[] args) {

		String input= "tek pyramid";
		
		String rev="";
		int i=0;
		while (true) {
			try {
				char ch = input.charAt(i);
				rev=ch+rev;
				i++;
			}
			catch(StringIndexOutOfBoundsException e) {
				break;
			}
		}
		System.out.println(rev);
	}

}
