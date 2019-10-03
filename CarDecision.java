import java.text.NumberFormat;
import java.util.Scanner;

public class CarDecision {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		//Car data
		String stickerHybrid = "Make:Toyota,Model:Prius,Cost:31000,MPG:30";
		String stickerRegular= "Make:Toyota,Model:Corolla,Cost:28000,MPG:20";
		
		//Split hybrid data into arrays
		String [] dataHybrid = stickerHybrid.split(",");
		String [] makeHybrid = dataHybrid[0].split(":");
		String [] modelHybrid = dataHybrid[1].split(":");
		String [] costHybrid = dataHybrid[2].split(":");
		double costHybridTotal = Integer.parseInt(costHybrid[1]);
		String [] mpgHybrid = dataHybrid[3].split(":");
		double mpgHybridTotal = Integer.parseInt(mpgHybrid[1]);
		
		//Split regular data into arrays
		String [] dataRegular = stickerRegular.split(",");
		String [] makeRegular = dataRegular[0].split(":");
		String [] modelRegular = dataRegular[1].split(":");
		String [] costRegular = dataRegular[2].split(":");
		double costRegularTotal = Integer.parseInt(costRegular[1]);
		String [] mpgRegular = dataRegular[3].split(":");
		double mpgRegularTotal = Integer.parseInt(mpgRegular[1]);
		
		//Asks the user how many miles they drive per year and cost of gas
		System.out.print("Enter miles traveled in a year: ");
		double milesYear = in.nextDouble();
		System.out.print("Enter cost per gallon of gas: ");
		double cpgGas = in.nextDouble();
		
		//Calculate the cost per year for both hybrid and regular
		double yearlyGasRegular = milesYear / mpgRegularTotal * cpgGas;
		double yearlyGasHybrid = milesYear / mpgHybridTotal * cpgGas;
		
		//Prints the cost to own the hybrid and regular car for years 1 through 5
		int year = 0;
		while (year <= 4) {
			year++;
			costRegularTotal += yearlyGasRegular;
			costHybridTotal += yearlyGasHybrid;
			System.out.println("Cost to own after year " + year + " for " + makeHybrid[1] + " " + modelHybrid[1] + " " + formatter.format(costHybridTotal) + ".");
			System.out.println("Cost to own after year " + year + " for " + makeRegular[1] + " " + modelRegular[1] + " " + formatter.format(costRegularTotal) + ".");

			//Prints if the hybrid is most cost efficient than the regular after 5 years
			if (costHybridTotal < costRegularTotal) {
				System.out.println("The hybrid car pays back after " + year + " years.");
			}
//			else {
//				System.out.println("The hybrid car does not pay back after " + year + " years.");
//			}
			
		}
		

	}

}
