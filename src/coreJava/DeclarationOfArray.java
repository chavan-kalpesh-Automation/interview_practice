package coreJava;

public class DeclarationOfArray {

	public void declareOfArrayUsingNewKeyword() {
		int[] array = new int[5];
		array[4] = 5;
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		array[0] = 4;

		for (int i = 0; i < 5; i++) {

			System.out.print(array[i]);
		}

	}
	
	public void delaringOfArrayUsingArrayLiteral() {
		int [] array = {1,2,3,4,5,6};
		
		for(int i=0;i<array.length-1;i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeclarationOfArray ojb = new DeclarationOfArray();
		ojb.declareOfArrayUsingNewKeyword();
		System.out.println(" ");
		ojb.delaringOfArrayUsingArrayLiteral();
	}

}
