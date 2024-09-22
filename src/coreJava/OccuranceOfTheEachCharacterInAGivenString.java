package coreJava;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfTheEachCharacterInAGivenString {

	public static void main(String[] args) {

		String fullname="kalpesh sanjay chavan";
		
		
		//create hashmap to store the each character occurance 
		Map<Character,Integer>charcount=new HashMap<>();
		
		//loop through each character in string 
		for(char c:fullname.toCharArray()){
			//convert the character into lowercase in case
			c=Character.toLowerCase(c);
			
			//check the character is already in map
			if(charcount.containsKey(c)) {
				//Increment the count of character 
				charcount.put(c, charcount.get(c)+1);
			}
			else
			{
				charcount.put(c, 1);
			}
			
		}
		System.out.println("Character Occurance in the given string ");
		for(Map.Entry<Character, Integer> entry :charcount.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
