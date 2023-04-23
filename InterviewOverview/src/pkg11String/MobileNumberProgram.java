package pkg11String;

public class MobileNumberProgram {
	
	
	public void mobileNum(String num) {
	for(int i=0;i<num.length();i++) {
		if(num.length()/2==0) {
			System.out.println(num.charAt(i)+"-");
		}
		else
			System.out.print(num.charAt(i));
	}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileNumberProgram obj =new MobileNumberProgram();
	obj.mobileNum("9175966144");
	}

}
