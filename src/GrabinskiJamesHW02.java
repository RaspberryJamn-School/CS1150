import java.util.Scanner;

public class GrabinskiJamesHW02 {

	public static void main(String[] args) {
		final double LEAW = 0.15; // learning activities weight
		final double HWKW = 0.35; // homework weight
		final double QIZW = 0.1; // quiz weight
		final double MDTW = 0.2; // midterm weight
		final double FEXW = 0.2; // final exam weight
		
		Scanner input = new Scanner(System.in);
		System.out.println("***************************************************");
		System.out.println("	Final Grade Calculator");
		System.out.println("***************************************************");
		System.out.print("Enter learning activities grade: ");
		double leag = input.nextDouble(); // ask for learning activities grade
		if (leag>=0.0 && leag <=100.0) { // check if given input is within valid range
			System.out.print("Enter homework grade: ");
			double hwkg = input.nextDouble(); // ask for homework grade
			if (hwkg>=0.0 && hwkg <=100.0) { // check if given input is within valid range
				System.out.print("Enter quiz grade: ");
				double qizg = input.nextDouble(); // ask for quiz grade
				if (qizg>=0.0 && qizg <=100.0) { // check if given input is within valid range
					System.out.print("Enter midterm grade: ");
					double mdtg = input.nextDouble(); // ask for midterm grade
					if (mdtg>=0.0 && mdtg <=100.0) { // check if given input is within valid range
						System.out.print("Enter final exam grade: ");
						double fexg = input.nextDouble(); // ask for final exam grade
						if (fexg>=0.0 && fexg <=100.0) { // check if given input is within valid range
							System.out.println("------------------------------------------------\n");
							double finalGradePercentage = leag*LEAW+hwkg*HWKW+qizg*QIZW+mdtg*MDTW+fexg*FEXW ; // calculate grade based on given scores & set weights
							System.out.printf("Final Percentage: %.2f\n", finalGradePercentage);
							System.out.print("Final Letter Grade: ");
							if (finalGradePercentage>=90.) { // Select letter by range elimination
								System.out.println("A");
							} else if (finalGradePercentage>=80.) {
								System.out.println("B");
							} else if (finalGradePercentage>=70.) {
								System.out.println("C");
							} else if (finalGradePercentage>=60.) {
								System.out.println("D");
							} else {
								System.out.println("F");
							}
							System.out.println("\n------------------------------------------------"); // print letter grade table
							System.out.println("    	Letter Grade 			Range");
							System.out.println("------------------------------------------------");
							System.out.println("	A				90-100");
							System.out.println("	B				80-89");
							System.out.println("	C 				70-79");
							System.out.println("	D				60-69");
							System.out.println("	F				0-59");
							System.out.println("\n------------------------------------------------"); // print set weight table
							System.out.println("    	Category 			Percent");
							System.out.println("------------------------------------------------");
							System.out.printf("	Learning Activities		%d%%\n", (int)(LEAW*100.));
							System.out.printf("	Homework			%d%%\n", (int)(HWKW*100.));
							System.out.printf("	Quiz    			%d%%\n", (int)(QIZW*100.));
							System.out.printf("	Midterm				%d%%\n", (int)(MDTW*100.));
							System.out.printf("	Final Exam			%d%%\n", (int)(FEXW*100.));
							
						} else {
							System.out.printf("%.2f is not a valid final exam grade.", fexg);
						}
					} else {
						System.out.printf("%.2f is not a valid midterm grade.", mdtg);
					}
				} else {
					System.out.printf("%.2f is not a valid quiz grade.", qizg);
				}
			} else {
				System.out.printf("%.2f is not a valid homework grade.", hwkg);
			}
		} else {
			System.out.printf("%.2f is not a valid learning activities grade.", leag);
		}
		input.close();
	}

}
