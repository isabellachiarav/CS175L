package hw3;

import java.text.NumberFormat;
import java.util.Scanner;

public class E510 {

	public static void main(String[] args) {
		
		final int STANDARD = 40;   // standard hours in a work week

		double pay = 0.0;
		String name = null;
		Scanner in = new Scanner (System.in);

		//Asks user for name and hours worked
		System.out.print("Enter your name: ");
		name = in.next();
		System.out.print("Enter your hourly wage: ");
		double rate = in.nextDouble();
		System.out.print("Enter the number of hours worked: ");
		double hours = in.nextInt();

		System.out.println ();

		//Calculate overtime at "time and a half"
		if (hours > STANDARD) {
			pay = STANDARD * rate + (hours - STANDARD) * (rate * 1.5);
		}
		else {
			pay = hours * rate;
		}
		
		//Print 'paycheck'
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.println(name + "'s Paycheck: " + fmt.format(pay));
		

	}

}
