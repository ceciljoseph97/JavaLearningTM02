/* Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of *

Example1)
i/p:ab*cd
o/p:ad*/
public class noLRofx {

	public static void main(String[] args) {
		String str = "abc*ccd";
		
		StringBuffer sb = new StringBuffer(str);
		int i=sb.indexOf("*");
		sb.delete(i-1, i+2);
		System.out.println(sb.toString());

	}

}
