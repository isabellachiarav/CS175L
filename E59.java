package hw3;

import java.util.Scanner;

public class E59 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double angle = 0;
		String direction = null;
		
		//Asks user to enter angle
		System.out.print("Enter the angle for the direction you are heading: ");
		angle = in.nextDouble();
		
		//Calculates direction user is heading
		if (angle >= 0 && angle <= 22.5) {
			direction = "north (N)";
		}
		else if (angle > 22.5 && angle < 67.5) {
			direction = "northeast (NE)";
		}
		else if (angle >= 67.5 && angle <= 112.5) {
			direction = "east (E)";
		}
		else if (angle > 112.5 && angle < 157.5) {
			direction = "southeast (SE)";
		}
		else if (angle >= 157.5 && angle <= 202.5) {
			direction = "south (S)";
		}
		else if (angle > 202.5 && angle < 247.5) {
			direction = "southwest (SW)";
		}
		else if (angle >= 247.5 && angle <= 292.5) {
			direction = "west (W)";
		}
		else if (angle > 292.5 && angle < 337.5) {
			direction = "northwest (NW)";
		}
		else if (angle >= 337.5 && angle <= 360) {
			direction = "north (N)";
		}
		else {
			System.out.println("Invalid angle.");
		}
		
		//Prints direction user is heading
		System.out.println("You are heading " + direction + ".");

		in.close();
	}

}
