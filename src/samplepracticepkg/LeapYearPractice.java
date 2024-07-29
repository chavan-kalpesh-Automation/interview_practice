package samplepracticepkg;

public class LeapYearPractice {

	public void validateyearLeaporNot(int year) {
		if((year %100!=0 && year %4==0)||(year %400==0)){
			System.out.println("Given Year "+year+" Is Leap Year.");
		}
		else
			System.out.println("Given Year "+year+"Is Not a Leap Year.");
	}

	public static void main(String[] args) {
		LeapYearPractice obj=new LeapYearPractice();
		obj.validateyearLeaporNot(2400);
	}
}
