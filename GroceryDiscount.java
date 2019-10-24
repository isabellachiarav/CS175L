import java.text.NumberFormat;
import java.util.Scanner;

public class GroceryDiscount {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();

		System.out.print("Enter the cost of your groceries or 'E' to end: ");

		while (in.hasNextDouble()) {

			double groceryCost = in.nextDouble();
			
			if (groceryCost >= 10 && groceryCost <= 1000 ) {

				if (groceryCost < 10) {
					System.out.println("You receive no coupon.");
				}
				else if (groceryCost <= 60) {
					double discount = 8;
					System.out.println("You receive a coupon for " + formatter.format(groceryCost * (discount*0.01)) + 
							" (" + discount + "% of your purchase)");
				}
				else if (groceryCost <= 150) {
					double discount = 10;
					System.out.println("You receive a coupon for " + formatter.format(groceryCost * (discount*0.01)) + 
							" (" + discount + "% of your purchase)");
				}
				else if (groceryCost <= 210) {
					double discount = 12;
					System.out.println("You receive a coupon for " + formatter.format(groceryCost * (discount*0.01)) + 
							" (" + discount + "% of your purchase)");
				}
				else {
					double discount = 14;
					System.out.println("You receive a coupon for " + formatter.format(groceryCost * (discount*0.01)) + 
							" (" + discount + "% of your purchase)");
				}
				
			}
			
			else {
				System.out.println("Input out of range.");
			}

			System.out.print("Enter the cost of your groceries or 'E' to end: ");
		}	
	}

}

