/*Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on. 
Any characters left, will go to the end of the result.

Example1)
i/p:Hello,World
o/p:HWeolrllod*/
public class ababPattern {

	public static void main(String[] args) {
		
		String a = "Hello";
		String b = "World123";

		String larger = a.length() > b.length() ? a : b;
		String smaller = a.length() < b.length() ? a : b;

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < smaller.length(); i++) {
			sb.append(a.charAt(i)).append(b.charAt(i));
		}
		
		sb.append(larger.substring(smaller.length(), larger.length()));
		
		System.out.println(sb);
		
	}

}
