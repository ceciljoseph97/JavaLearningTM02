/*	
 Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.

Example1)
i/p:Wipro
o/p:WiWiWiWiWi*/


public class nCopies {

	public static void main(String[] args) {
		String str = "Wipro";
		int n = str.length();
		
		//method 1
		StringBuffer sb=new StringBuffer(2*n);
		while(n>0) {
		sb.append(str.substring(0,2));
		n--;}
		System.out.println("Repeater is "+sb.toString());
		//method 2
		
		/*
		 * String repeater = "";
		 * 
		 * if (n < 2) repeater = str; else repeater = str.substring(0, 2);
		 * 
		 * String output = "";
		 * 
		 * for (int i = 0; i < n; i++) { output += repeater; }
		 * 
		 * System.out.println(output);
		 */
		
	}

}
