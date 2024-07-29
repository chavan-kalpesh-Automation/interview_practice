package cap;

public class SwapStringWithoutUsingThirdString {

	public static void main(String[] args) {

		String groom = "kalpesh";
		String bride = "rohini";

		System.out.println("Original String groom :" + groom + "Original String bride :" + bride);
		
		groom =groom+bride;//a=a+b
		
		
		//b=a-b
		bride =groom.substring(0, groom.length()-bride.length());
		
		//a=a-b
		
		
		groom =groom.substring(bride.length());
		
		System.out.println("After Swaping Groom :"+groom+ " After Swaping Bride :"+bride);
		

	}

}
