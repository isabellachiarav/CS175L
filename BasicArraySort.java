import java.util.Arrays;

public class BasicArraySort {

	public static void main(String[] args) {
		
		double lowest = 0;
		String numbersString;
		double[] numb = {88,47,90,50,77,83,92,96,62,79};

		for (int i = 0; i < numb.length; i++) {
		    for (int j = i; j < numb.length; j++) {
		        if (numb[i] > numb[j]) {
		            lowest = numb[i];
		            numb[i] = numb[j];
		            numb[j] = lowest;
		        }
		    }
		}
		
		numbersString = Arrays.toString(numb);

		System.out.println(numbersString);
		
	}

}
