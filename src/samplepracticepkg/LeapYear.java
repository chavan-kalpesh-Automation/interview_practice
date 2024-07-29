package samplepracticepkg;

public class LeapYear {

	public void VerifyLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year+"leap");
		} else {
			System.out.println(year+"Not Leap");
		}
	}

	public static void main(String[] args) {
		LeapYear obj = new LeapYear();
		obj.VerifyLeapYear(2401);

	}
}
