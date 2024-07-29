package xceedance;

public class Array {

	public static void declare_using_new_keyword() {
		int[] checkarray = new int[5];

		checkarray[0] = 1;
		checkarray[1] = 2;
		checkarray[2] = 3;
		checkarray[3] = 4;
		checkarray[4] = 5;

		for (int i = 0; i < checkarray.length; i++) {
			System.out.println(checkarray[i]);
		}
	}

	public static void declare_using_array_literal() {
		int checkarray[] = { 1, 23, 45, 56, 67 };
		for (int i = 0; i < checkarray.length; i++) {
			System.out.print(checkarray[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		declare_using_new_keyword();
		declare_using_array_literal();

	}

}
