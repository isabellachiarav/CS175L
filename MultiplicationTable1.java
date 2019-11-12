
public class MultiplicationTable1 {

	public static void main(String[] args) {

		//prints a 10x10 multiplication table
		int i, j, sum, max = 10, sumMax = 100;
		for (i = 1; i <= max; i++) {
			for (j = 1; j <= max; j++) {
				sum = i * j;
				System.out.print(sum);
				if(sum < max){
					System.out.print("    ");
				}
				else if(sum >= sumMax){
					System.out.print("  ");
				}
				else if(sum >= max){
					System.out.print("   ");
				}
			}
			System.out.println();
		}


	}

}
