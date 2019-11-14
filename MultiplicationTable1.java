
public class MultiplicationTable1 {

	public static void main(String[] args) {

				//prints first two rows
				int i, j, sum, max = 10, sumMax = 100;
				System.out.print("   ");
				for (i = 1; i <= max; i++) {
					System.out.printf("%5d", i);
				}
				System.out.println();
				System.out.println("______________________________________________________");
				
				//main multiplication table
				for (i = 1; i <= max; i++) {
					if (i < 10) {
						System.out.print(" " + i + "|");
					}
					else {
						System.out.print(i + "|");
					}
					for (j = 1; j <= max; j++) {
						sum = i * j;
						System.out.printf("%5d", sum);
					}
					System.out.println();
				}

		}

	}

