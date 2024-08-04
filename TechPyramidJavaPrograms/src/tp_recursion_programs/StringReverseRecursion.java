package tp_recursion_programs;

public class StringReverseRecursion {

	public static void main(String[] args) {

		String str = "india";
		int a = str.length() - 1;

		reverse(str, a);

	}

	public static void reverse(String str, int a) {

		if (a >= 0) {
			System.out.print(str.charAt(a));
			reverse(str, a - 1);
		}
	}
}

// reverse the given string without using length variable or method
// String s= "a1b34%c5"
// String s= "aaaabbbbbssssccc";
// find the number of occurance of each character of the given string
// print only duplicated characters in the given string
// print onlu unique characters in the given string
// remove duplicate characters in the given string
