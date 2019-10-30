package hw3;

import java.util.Scanner;

public class E59 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double angle = 0;
		String direction = null;
		double angle2 = 0, angle3 = 22.5, angle4 = 67.5, angle5 = 112.5, angle6 = 157.5, angle7 = 202.5,
				angle8 = 247.5, angle9 = 292.5, angle10 = 337.5, angle11 = 360;
		
		//Asks user to enter angle
		System.out.print("Enter the angle for the direction you are heading: ");
		angle = in.nextDouble();
		
		//Calculates direction user is heading
		if (angle >= angle2 && angle <= angle3) {
			direction = "north (N)";
		}
		else if (angle > angle3 && angle < angle4) {
			direction = "northeast (NE)";
		}
		else if (angle >= angle4 && angle <= angle5) {
			direction = "east (E)";
		}
		else if (angle > angle5 && angle < angle6) {
			direction = "southeast (SE)";
		}
		else if (angle >= angle6 && angle <= angle7) {
			direction = "south (S)";
		}
		else if (angle > angle7 && angle < angle8) {
			direction = "southwest (SW)";
		}
		else if (angle >= angle8 && angle <= angle9) {
			direction = "west (W)";
		}
		else if (angle > angle9 && angle < angle10) {
			direction = "northwest (NW)";
		}
		else if (angle >= angle10 && angle <= angle11) {
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
