import java.text.NumberFormat;
import java.util.Scanner;

public class PaintCost {

	public static void main(String[] args) {
		
		/*
		 * This program will calculate the cost to paint a house
		 */
		double houseLengthFeet;
		double houseLengthInches;
		double houseWidthFeet;
		double houseWidthInches;
		double houseHeightFeet;
		double houseHeightInches;
		double windowLengthFeet;
		double windowLengthInches;
		double windowWidthFeet;
		double windowWidthInches;
		double doorLengthFeet;
		double doorLengthInches;
		double doorWidthFeet;
		double doorWidthInches;
		double sqFtCost;
		double sqFtPeak;
		double sqFtNormal;
		double sqFtWindows; 
		double sqFtDoors;
		double sqFtToPaint;
		int windowNumber;
		int doorNumber;
		
		Scanner in = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		//User enters the width of the house, width is calculated in feet
		System.out.print("Enter the width of the house in feet without the remainder of inches: ");
		houseWidthFeet = in.nextDouble();
		System.out.print("Enter the remaining inches in the width of the house: ");
		houseWidthInches = in.nextDouble();
		houseWidthFeet += houseWidthInches/12;
		
		//User enters the length of the house, length is calculated in feet
		System.out.print("Enter the length of the house in feet without the remainder of inches: ");
		houseLengthFeet = in.nextDouble();
		System.out.print("Enter the remaining inches in the length of the house: ");
		houseLengthInches = in.nextDouble();
		houseLengthFeet += houseLengthInches/12;
		
		//User enters the height of the house, height is calculated in feet
		System.out.print("Enter the height of the house in feet without the remainder of inches: ");
		houseHeightFeet = in.nextDouble();
		System.out.print("Enter the remaining inches in the height of the house: ");
		houseHeightInches = in.nextDouble();
		houseHeightFeet += houseHeightInches/12;
		
		//User enters the width of the windows, width is calculated in feet
		System.out.print("Enter the width of the windows in feet without the remainder of inches: ");
		windowWidthFeet = in.nextDouble();
		System.out.print("Enter the remaining inches in the width of the windows: ");
		windowWidthInches = in.nextDouble();
		windowWidthFeet += windowWidthInches/12;
		
		//User enters the length of the windows, length is calculated in feet
		System.out.print("Enter the length of the windows in feet without the remainder of inches: ");
		windowLengthFeet = in.nextDouble();
		System.out.print("Enter the remaining inches in the length of the windows: ");
		windowLengthInches = in.nextDouble();
		windowLengthFeet += windowLengthInches/12;
		
		//User enters the width of the doors, width is calculated in feet
		System.out.print("Enter the width of the doors in feet without the remainder of inches: ");
		doorWidthFeet = in.nextDouble();
		System.out.print("Enter the remaining inches in the width of the doors: ");
		doorWidthInches = in.nextDouble();
		doorWidthFeet += doorWidthInches/12;
		
		//User enters the length of the doors, length is calculated in feet
		System.out.print("Enter the length of the doors in feet without the remainder of inches: ");
		doorLengthFeet = in.nextDouble();
		System.out.print("Enter the remaining inches in the length of the doors: ");
		doorLengthInches = in.nextDouble();
		doorLengthFeet += doorLengthInches/12;
		
		//User enters the number of windows
		System.out.print("Enter the number of windows: ");
		windowNumber = in.nextInt();
		
		//User enters the number of doors
		System.out.print("Enter the number of doors: ");
		doorNumber = in.nextInt();
		
		//User enters the cost the painter charges per square foot in dollars
		System.out.print("Enter the cost the painter charges per square foot in dollars: ");
		sqFtCost = in.nextDouble();
		
		//Calculate the square footage of the peak sides
		sqFtPeak = (houseLengthFeet * houseWidthFeet) + (.5 * houseLengthFeet * (houseHeightFeet - houseWidthFeet));
		
		//Calculate the square footage of the normal sides
		sqFtNormal = houseLengthFeet * houseWidthFeet;
		
		//Calculate the square footage of the windows
		sqFtWindows = windowLengthFeet * windowWidthFeet * windowNumber;
		
		//Calculate the square footage of the doors
		sqFtDoors = doorLengthFeet * doorWidthFeet * doorNumber;
		
		//Find the total square footage of the house
		sqFtToPaint = (2 * sqFtPeak) + (2 * sqFtNormal) - sqFtWindows - sqFtDoors;
		
		//Find the total cost of painting the house
		sqFtCost = sqFtCost * sqFtToPaint;
		System.out.println("The total cost to paint the house is " + formatter.format(sqFtCost) + ".");
		
		//github problems
		
	}

}
