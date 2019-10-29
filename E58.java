package hw3;

import java.util.Scanner;

public class E58 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		//Asks user for four numbers
		System.out.println("Please enter four numbers:  ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();

		//Looks for pairs and prints if found
		if((a==b && c == d)|| (a==c && b==d) || (c==b && a==d)) {
			System.out.println("Two pairs.");
		}
		else{
			System.out.println("Not two pairs.");
		}

	}

}
