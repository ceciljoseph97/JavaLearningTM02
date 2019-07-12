/*Write a java program that accepts a string and returns a new string without the first and last character of the input string.

Example1)
i/p:Suman
o/p:uma*/



public class noFirstAndLastChar {

	public static void main(String[] args) {
		String Main=new String("Cecil Joseph");
		int len=Main.length();
		StringBuilder sb=new StringBuilder(Main);
		sb.deleteCharAt(0);
		sb.deleteCharAt(len-2);
		System.out.println(sb.toString());

	}

}
