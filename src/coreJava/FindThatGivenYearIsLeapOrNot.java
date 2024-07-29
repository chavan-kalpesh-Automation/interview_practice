package coreJava;

public class FindThatGivenYearIsLeapOrNot {

	public static void main(String[] args) {

		int year = 2025;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " Given Year is Leap Year ");
		} else
			System.out.println(year + " Given Year is Not a Leap Year ");

	}
}
