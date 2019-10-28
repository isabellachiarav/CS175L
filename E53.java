package hw3;

import java.util.Scanner;

public class E53 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int digits = 0;
		int zero = 0;
		final int ONE_BILLION = 1000000000;
		final int ONE_HUNDRED_MILLION = 100000000;
		final int TEN_MILLION = 10000000;
		final int ONE_MILLION = 1000000;
		final int ONE_HUNDRED_THOUSAND = 100000;
		final int TEN_THOUSAND = 10000;
		final int ONE_THOUSAND = 1000;
		final int ONE_HUNDRED = 100;
		final int TEN = 10;
		
		//Asks user to enter an integer
		System.out.print("Enter an integer: ");
		int integer = in.nextInt();
		
		//Makes negative inputs positive in order to calculate digits
		if (integer < zero) {
			integer *= -1;
		}
		
		//Calculates how many digits the integer has
		if (integer >= ONE_BILLION) {
			digits = 10;
		}
		else if (integer >= ONE_HUNDRED_MILLION) {
			digits = 9;
		}
		else if (integer >= TEN_MILLION) {
			digits = 8;
		}
		else if (integer >= ONE_MILLION) {
			digits = 7;
		}
		else if (integer >= ONE_HUNDRED_THOUSAND) {
			digits = 6;
		}
		else if (integer >= TEN_THOUSAND) {
			digits = 5;
		}
		else if (integer >= ONE_THOUSAND) {
			digits = 4;
		}
		else if (integer >= ONE_HUNDRED) {
			digits = 3;
		}
		else if (integer >= TEN) {
			digits = 2;
		}
		else {
			digits = 1;
		}
		
		//Prints the number of digits
		System.out.println("The integer has " + digits + " digits.");
		
	}

}
