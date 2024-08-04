package programs;

public class CompressTheString {

	public static void main(String[] args) {

		String s = "hi hello how are you";
		
		StringBuilder build = new StringBuilder();
		
			build.append(s).reverse();
			
		System.out.println(build);
		
	}

}
