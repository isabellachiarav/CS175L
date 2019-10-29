package hw3;

import java.util.Scanner;

public class E57 {

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
		if ((n1 < n2 && n2 < n3) || (n1 > n2 && n2 > n3)) {
			System.out.println("The numbers are in order.");
		}
		else {
			System.out.println("The numbers are not in order.");
		}

	}

}
