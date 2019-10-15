import java.text.NumberFormat;
import java.util.Scanner;

public class GroceryDiscount {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		int continueGame = 1;
		
		while (continueGame == 1){
			
			System.out.print("Enter the cost of your groceries: ");
			double groceryCost = in.nextDouble();
			
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
			System.out.print("Would you like to calculate more coupons? Enter 1 for yes and 0 for no: ");
			continueGame = in.nextInt();
			
		}

	}

}
