package programs;

public class DigitalSumOfNumber {

	public static void main(String[] args) {

		int n=444; int sum=0;
		
		while(n>0) {
		
			int rem=n%10;//extract one number
			sum=sum+rem;//add the extracted number to sum container
			n=n/10;//remove one number		
		}
		System.out.println(sum);
		
	}
}