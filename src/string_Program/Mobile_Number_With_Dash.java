package string_Program;

public class Mobile_Number_With_Dash {

	public static void main(String[] args) {
		String number = "9175966144";

		char array []=number.toCharArray();
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]%2==1) {
			System.out.print(array[i]);
		}
		
	}
	}
}
