/*
 *  Write a Program that will check whether a given String is Palindrome or not
 * */
public class PalindromOrNot {
	public static String isPalindrome(String input) {
		StringBuffer sb=new StringBuffer(input);
		if(sb.reverse().toString().equalsIgnoreCase(input)) return "Palindrome";
		else return "Not Palindrome";
	}

	public static void main(String[] args) {
		String m="malayala";
		System.out.printf("%s is %s",m, isPalindrome(m));
		

	}

}
