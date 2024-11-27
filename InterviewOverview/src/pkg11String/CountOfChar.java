package pkg11String;

public class CountOfChar {
	String name = " kalpesh is good boy";

	public void countwithspace() {
		int totalcount = 0;
		name = name.trim();
		for (int i = 0; i < name.length(); i++) {
			totalcount++;
		}
		System.out.println(totalcount);
	}

	public void totalcountwithoutSpace() {
		int withoutspace = 0;
		name = name.trim();

		for (int i = 0; i < name.length(); i++) {
if(name.charAt(i)!=' ') {
	withoutspace++;
}

		}
		System.out.println(withoutspace);
	}

	public static void main(String[] args) {

		CountOfChar obj =new CountOfChar();
		obj.countwithspace();
		obj.totalcountwithoutSpace();
		
		
	}

}
