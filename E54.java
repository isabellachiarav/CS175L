package hw3;

import java.util.Scanner;

public class E54 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//Asks the user to enter 3 numbers
		System.out.print("Enter the first number: ");
		double n1 = in.nextDouble();
		System.out.print("Enter the second number: ");
		double n2 = in.nextDouble();
		System.out.print("Enter the third number: ");
		double n3 = in.nextDouble();
		
		//Compares numbers and prints comparisons
		if (n1 == n2 && n2 == n3) {
			System.out.println("All the same.");
		}
		else if (n1 != n2 && n1 != n3 && n2 != n3) {
			System.out.println("All different.");
		}
		else {
			System.out.println("Neither.");
		}
		
	}

}
