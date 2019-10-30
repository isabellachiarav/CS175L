package hw3;

import java.util.Scanner;

public class E511 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double degrees = 0;
		String state = null;

		//Asks the user for temperature and if they are using C or F
		System.out.print("Are you entering a temperature in Celsius or Fahrenheit (C or F)?: ");
		String tempType = in.next();
		System.out.print("Enter a temperature value: ");
		double tempValue = in.nextDouble();

		//Prints temperature user has entered
		System.out.println();
		System.out.println("Temperature: " + tempValue + " " + tempType);

		//Converts F values to C for easier calculations
		if(tempType.equals("F")) {
			tempValue = (tempValue - 32.0) * 5.0 / 9.0;
		}

		//Calculates which state of matter the water is
		if (tempValue < 0) {
            state = "solid";
        } 
		else if (tempValue >= 100) {
            state = "gas";
        } 
		else {
            state = "liquid";
        }
		
		//Prints the state of the water
		System.out.println();
		System.out.println("Water is a " + state + " at the given temperature at sea level.");

	}

}
