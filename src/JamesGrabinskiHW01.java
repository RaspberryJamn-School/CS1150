import java.util.Scanner;

public class JamesGrabinskiHW01 {

	public static void main(String[] args) {// oh god oh god oh god 
		//nice done in 20 mins
		// TODO Auto-generated method stub
		System.out.println("**************************************************");
		System.out.println("This program will calculate body fat for a female");
		System.out.println("using the Army formula and the BMI formula.");
		System.out.println("-------------------------------------------------");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter height in inches: ");
		final double HEIGHT = input.nextDouble();
		System.out.print("Enter neck in inches: ");
		final double NECK = input.nextDouble();
		System.out.print("Enter waist in inches: ");
		final double WAIST = input.nextDouble();
		System.out.print("Enter hip in inches: ");
		final double HIP = input.nextDouble();
		System.out.print("Enter weight in pounds: ");
		final double WEIGHT = input.nextDouble();
		input.close();
		System.out.println("");
		System.out.println("**************************************************");
		final double ABF = 163.205d*Math.log10(WAIST+HIP-NECK)-97.684*Math.log10(HEIGHT)-78.387;
		final double BMI = WEIGHT/(HEIGHT*HEIGHT)*703.0;
		System.out.println("Your Army body fat is "+ABF);
		System.out.println("");
		System.out.println("");
		System.out.println("Maximum Body Fat to Join Army");
		System.out.println("Age                                 Female");
		System.out.println("-------------------------------------------------");
		System.out.println("17-20                               30%");
		System.out.println("21-27                               32%");
		System.out.println("28-39                               34%");
		System.out.println("40 and over                         36%");
		System.out.println("**************************************************");
		System.out.println("Your BMI is "+BMI);
		System.out.println("");
		System.out.println("");
		System.out.println("Recommended Body Weight");
		System.out.println("BMI                                Weight Status");
		System.out.println("-------------------------------------------------");
		System.out.println("Below 18.5                          Underweight");
		System.out.println("18.5 - below 25                  Healthy Weight");
		System.out.println("25.0 - below 30                      Overweight");
		System.out.println("Over 30                                   Obese");
	}

}
