package hw3;

import java.util.Scanner;

public class E51 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		final int ZERO = 0;
		
		//Asks user to enter an integer
		System.out.print("Enter an integer: ");
		int integer = in.nextInt();
		
		//Prints if the integer is 0, positive, or negative
		if (integer == ZERO) {
			System.out.println("The integer is " + ZERO + ".");
		}
		else if (integer > ZERO) {
			System.out.println("The integer is positive.");
		}
		else {
			System.out.println("The integer is negative.");
		}
		
	}

}
