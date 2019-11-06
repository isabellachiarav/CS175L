import java.util.Scanner;

public class GradeVersion2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double gradePoints = 0.0;
		double numberGrade = 0.0;
		double totalNumberGrade = 0;
		int totalCreditHours = 0;
		double gpa = 0.0;
		String info = null;
		
		System.out.print("Enter course info separated by commas with no spaces (title, credit hours, letter grade "
				+ "(followed by + or - if applicable)) or Q to quit the program: ");
		
		while (in.hasNext()) {
			
			info = in.next();
			
			if (info.equals("Q")) {
				break;
			}
			
			String [] dataInfo = info.split(",");
			String title = dataInfo[0];
			int creditHours = Integer.parseInt(dataInfo[1]);
			String grade = dataInfo[2];
			
			if (grade.equals("A") || grade.equals("A+")) {
				numberGrade = 4.0;
			}
			else if (grade.equals("A-")) {
				numberGrade = 3.7;
			}
			else if (grade.equals("B+")) {
				numberGrade = 3.3;
			}
			else if (grade.equals("B")) {
				numberGrade = 3.0;
			}
			else if (grade.equals("B-")) {
				numberGrade = 2.7;
			}
			else if (grade.equals("C+")) {
				numberGrade = 2.3;
			}
			else if (grade.equals("C")) {
				numberGrade = 2.0;
			}
			else if (grade.equals("C-")) {
				numberGrade = 1.7;
			}
			else if (grade.equals("D+")) {
				numberGrade = 1.3;
			}
			else if (grade.equals("D")) {
				numberGrade = 1.0;
			}
			else if (grade.equals("D-")) {
				numberGrade = 0.7;
			}
			else if (grade.equals("F") || grade.equals("WF")) {
				numberGrade = 0.0;
			}
			else if (grade.equals("P") || grade.equals("NP") || grade.equals("I") || grade.equals("W")) {
				creditHours = 0;
			}
			else {
				System.out.println("Invalid letter grade.");
			}
			
			gradePoints = numberGrade * creditHours;
			totalNumberGrade += gradePoints;
			totalCreditHours += creditHours;
			gpa = totalNumberGrade / totalCreditHours;
			
			System.out.println("Course: " + title + " | Credit Hours: " + creditHours + " | Letter Grade: " + grade + " | "
					+ "Grade Points: " + totalNumberGrade);
			
			System.out.print("Enter course info separated by commas with no spaces (title, credit hours, letter grade "
					+ "(followed by + or - if applicable)) or Q to quit the program: ");
		}

	System.out.printf("GPA: %.2f", gpa);


	}

}
