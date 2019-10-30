import java.util.Scanner;

public class LetterGradeConversion {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double numberGrade = 0;
		
		System.out.print("Enter a letter grade (followed by + or - if applicable) or Q to quit the program: ");

		while (in.hasNext()){

			String grade = in.next();
			
			if (grade.equals("Q")) {
				break;
			}
			
			if (grade.equals("A") || grade.equals("A+")) {
				numberGrade = 4.0;
				System.out.println("The numeric value is " + numberGrade + ".");
			}
			else if (grade.equals("A-")) {
				numberGrade = 3.7;
				System.out.println("The numeric value is " + numberGrade + ".");
			}
			else if (grade.equals("B+")) {
				numberGrade = 3.3;
				System.out.println("The numeric value is " + numberGrade + ".");
			}
			else if (grade.equals("B")) {
				numberGrade = 3.0;
				System.out.println("The numeric value is " + numberGrade + ".");
			}
			else if (grade.equals("B-")) {
				numberGrade = 2.7;
				System.out.println("The numeric value is " + numberGrade + ".");
			}
			else if (grade.equals("C+")) {
				numberGrade = 2.3;
				System.out.println("The numeric value is " + numberGrade + ".");
			}
			else if (grade.equals("C")) {
				numberGrade = 2.0;
				System.out.println("The numeric value is " + numberGrade + ".");
			}
			else if (grade.equals("C-")) {
				numberGrade = 1.7;
				System.out.println("The numeric value is " + numberGrade + ".");
			}
			else if (grade.equals("D+")) {
				numberGrade = 1.3;
				System.out.println("The numeric value is " + numberGrade + ".");
			}
			else if (grade.equals("D")) {
				numberGrade = 1.0;
				System.out.println("The numeric value is " + numberGrade + ".");
			}
			else if (grade.equals("D-")) {
				numberGrade = 0.7;
				System.out.println("The numeric value is " + numberGrade + ".");
			}
			else if (grade.equals("F")) {
				numberGrade = 0.0;
				System.out.println("The numeric value is " + numberGrade + ".");
			}
			else {
				System.out.println("Invalid letter grade.");
			}
			
			System.out.print("Enter a letter grade (followed by + or - if applicable) or Q to quit the program: ");
			

		}

	}

}
