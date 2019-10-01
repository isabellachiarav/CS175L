import java.text.NumberFormat;
import java.util.Scanner;

public class CarCostCalculation {

	public static void main(String[] args) {

		double costRegular;
		double mpgRegular;
		double costHybrid;
		double mpgHybrid;
		double milesYear;
		double cpgGas;
		double yearlyGasRegular;
		double yearlyGasHybrid;
		int year = 0;

		Scanner in = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();

		System.out.print("Enter cost of regular car: ");
		costRegular = in.nextDouble();

		System.out.print("Enter miles per gallon of regular car: ");
		mpgRegular = in.nextDouble();

		System.out.print("Enter cost of hybrid car: ");
		costHybrid = in.nextDouble();

		System.out.print("Enter miles per gallon of hybrid car: ");
		mpgHybrid = in.nextDouble();

		System.out.print("Enter miles traveled in a year: ");
		milesYear = in.nextDouble();

		System.out.print("Enter cost per gallon of gas: ");
		cpgGas = in.nextDouble();

		yearlyGasRegular = milesYear / mpgRegular * cpgGas;
		yearlyGasHybrid = milesYear / mpgHybrid * cpgGas;

		while (year <= 4) {
			year++;
			costRegular += yearlyGasRegular;
			costHybrid += yearlyGasHybrid;
			System.out.println("Cost to own after year " + year + " for regular car: " + formatter.format(costRegular));
			System.out.println("Cost to own after year " + year + " for hybrid car: " + formatter.format(costHybrid));
			if (costHybrid < costRegular) {
				System.out.println("The hybrid car pays back after " + year + " years.");
			}
			else {
				System.out.println("The hybrid car does not pay back after " + year + " years.");
			}
		}

		



	}



}