package coreJava;

public class GetMaximumandMinElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 12, 2, 34, 54, 67, 87 };
int maxlength=array.length-1;
		int num;
		for(int i=0;i<=array.length-1;i++) {
			for(int j=i+1;j<=array.length-1;j++) {
				if(array[i]>array[j]) {
					num=array[i];
					array[i]=array[j];
					array[j]=num;
				}
			}
		}
//		
		System.out.println("Min Element From Array is : "+array[0]);
		System.out.println("Max Element From Array is : "+array[maxlength]);
				
		
	}

}
