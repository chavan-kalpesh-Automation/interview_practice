package coreJava;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionDemo {
	
	@FunctionalInterface
	interface functionInterface{
		int operatation(int a,int b);
	};
	
	

	public static void main(String []args) {

		functionInterface	add =(a,b)->a+b;
		System.out.print("Adding of two integer value using lambda function : "+add.operatation(4, 5));
		System.out.println(" ");
		List<Integer>rollNumbers=new ArrayList<Integer>();
		rollNumbers.add(1);
		rollNumbers.add(2);
		rollNumbers.add(3);
		rollNumbers.add(4);
		rollNumbers.add(5);
		
//		by using normal way 
		System.out.println(" Array List Using Normal Interface ");
		for(int number:rollNumbers) {
			System.out.println(number);
		}
		
		System.out.println("Using Lambda Function");
		rollNumbers.forEach(number->System.out.println(number));
	}

}
