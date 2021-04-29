package operations;

import java.util.Scanner;

public class NumbersOperation {



	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		double number1;
		double number2;
		
		System.out.println("Enter the first number");
		number1=scan.nextDouble();
		System.out.println("Enter the second number");
		number2=scan.nextDouble();
		
		System.out.println("Addition: "+(number1+number2));
		System.out.println("Subtraction: "+(number1-number2));
		System.out.println("Multiplication: "+(number1*number2));
	}

}
