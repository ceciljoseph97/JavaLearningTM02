/*Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.

The strings will not be the same length, but they may be empty (length 0).

If input is "hi" and "hello", then output will be "hihellohi".*/



public class ShortLongShort {

	public static void main(String[] args) {
		String a = "hi";
		String b = "hello";
		String out;

		if (a.length() < b.length()) 
			out = a + b + a;
		else
			out = b + a + b;
		
		System.out.println(out);
	}

}
