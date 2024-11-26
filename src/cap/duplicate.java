package cap;

public class duplicate {
public static void main(String args[]) {
	String namee ="Sakkett";
	char []name=namee.toCharArray();
	for(int i=0;i<=name.length-1;i++) {
		for (int j=i+1;j<=name.length-1;j++) {
			
			if(name[i]==name[j]) {
				System.out.println(name[i]);
			}
		}
	}
	
}
}
