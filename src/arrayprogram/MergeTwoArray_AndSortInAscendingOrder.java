package arrayprogram;

import java.util.Arrays;

public class MergeTwoArray_AndSortInAscendingOrder {

	public static void main(String[] args) {

		int array1[]= {1,3,5,8,7,10};
		int array2[]= {2,3,4,6,9,11};
		
		int length1=array1.length;  //6
		int length2=array2.length;  //5
		
		//Create New Array to hold merge result
		int merge_Array[]=new int[length1+length2];
		
//		Initialization of variable 
		int i=0,j=0,k=0;
		
		//merge arrays when there is element remaining
		while (i<length1 && j<length2) {  //0<6 && 0<5

			if(array1[i]<=array2[j]) {   //1<=2
				merge_Array[k++]=array1[i++];//merge in new array 1
			}
			else {
				merge_Array[k++]=array2[j++];
				
			}
		}
		while (i<length1) {
			merge_Array[k++]=array1[i++];
		}
		while (j<length2) {
			merge_Array[k++]=array2[j++];
		}
		System.out.println(Arrays.toString(merge_Array));
		
	}

}
