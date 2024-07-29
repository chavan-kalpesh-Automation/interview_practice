package interview_practice;

import java.util.Arrays;

public class String_Anagram_ {
//Check Whether two string are anagram or not

	public static void main(String[] args) {

		String name1="kalpesh";
		String name2="rohini";

		name1=name1.toLowerCase();
		name2=name2.toLowerCase();

		if(name1.length()==name2.length()) {
			//Convert String into Char array
			char[] chararr1=name1.toCharArray();
			char [] chararr2=name2.toCharArray();

			//if sorted char arrays are same then the string is anagram

			boolean result=	Arrays.equals(chararr1, chararr2);
			if(result) {
					System.out.println(name1 +" and "+name2 +" are anagram ");
			}
			else
				System.out.println(name1 +" and "+name2 +" are not anagram ");
		}
		else
			System.out.println(name1 +" and "+name2 +" are not anagram ");
	}

}
