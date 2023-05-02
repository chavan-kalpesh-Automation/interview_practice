package pkg7Exception;

public class ExceptionHandeling03 {
	// throw new is used to handle user defined exception

	public void movieage(int age) {
		if (age > 18) {
			System.out.println("Allow to movie");
		} else
			throw new IllegalArgumentException("Not Allow to Movie");
	}

	public static void main(String[] args) {
		ExceptionHandeling03 obj =new ExceptionHandeling03();
		obj.movieage(17);
//		System.out.println(obj.getMessage());
	}
}
