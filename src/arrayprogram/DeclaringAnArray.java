package arrayprogram;

public class DeclaringAnArray {
	public static void main(String[] args) {
		//Declaring an array using new keywords 
		int [] array=new  int [4];
		
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		for (int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		System.out.println(" ");
		//Declaring an array using array litral method 
		
		int []arraylitral= {1,2,3,4,5,6,7,8,9};
		for (int i=0;i<arraylitral.length;i++) {
			System.out.print(arraylitral[i]);
		}
	}
}
