package hw3;

import java.util.Scanner;

public class E56 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//Asks the user to enter 3 numbers
		System.out.print("Enter the first number: ");
		double n1 = in.nextDouble();
		System.out.print("Enter the second number: ");
		double n2 = in.nextDouble();
		System.out.print("Enter the third number: ");
		double n3 = in.nextDouble();
		System.out.print("How would you like to compare? (Lenient or Strict): ");
		String mode = in.next();
		
		//Compares numbers and prints comparisons
		if (mode.equals("Strict")) {
			if (n1 < n2 && n2 < n3) {
				System.out.println("The numbers are in increasing order.");
			}
			else if (n1 > n2 && n2 > n3) {
				System.out.println("The numbers are in decreasing order.");
			}
			else {
				System.out.println("The numbers are not in order.");
			}
		}
		else if (mode.equals("Lenient")) {
			if (n1 <= n2 && n2 <= n3) {
				System.out.println("The numbers are in increasing order.");
			}
			else if (n1 >= n2 && n2 >= n3) {
				System.out.println("The numbers are in decreasing order.");
			}
			else if (n1 == n2 && n2 == n3) {
				System.out.println("The numbers are both in increasing order and decreasing order.");
			}
			else {
				System.out.println("The numbers are not in order.");
			}
		}
			
	}

}
