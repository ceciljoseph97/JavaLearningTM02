/*	
 Write a java program that will return the first half of the string,
  if the length of the string is even. It should return null for odd length string.

Example1)
i/p:TomCat
o/p:Tom

Example2)
i/p:Apron
o/p:null*/


public class HalfOrNull {

	public static void main(String[] args) {
		String Main=new String("TomCat");
		int len=Main.length();
		if(len%2==0) System.out.print("the string is of even length and the half of the string is >>"+ Main.substring(0,(len/2)));
		else System.out.print("String is of odd length so >> Null");

	}

}
