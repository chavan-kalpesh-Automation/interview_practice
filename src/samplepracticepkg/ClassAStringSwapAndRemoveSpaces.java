package samplepracticepkg;

public class ClassAStringSwapAndRemoveSpaces {

	public static void main(String[] args) {

		String fullname = "QA Automation Test Engineer Profile ";

		fullname = fullname.replaceAll("\\s", "");
		
		System.out.println(fullname);
		
		String rev="";
		for(int i=fullname.length()-1;i>=0;i--){
			rev=rev+fullname.charAt(i);
		}
		System.out.println(rev);	}
}
