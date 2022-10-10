/*
 * Ch06 Methods Class Code
 */

import java.util.Scanner;

public class GrabinskiJamesMethodExample12 {

	public static void main(String[] args) {
		
		//declare and initialize to sum 1 to max 
		int number = 0; 
		int total = 0; 
		
		//add comments to explain concepts from lecture on methods
		
		Scanner input = new Scanner(System.in);	
		
		//call the function to get a positive number
		//pass the input variable as an argument to read from the keyboard
		number = getPositiveNumber(input); 
										
		//call function caclulateSum to find the sum of the numbers
		//pass the number as an argument 
		//the function returns the sum 
		//must assign the return value to a variable
		total = calculateSum(number);
		
		//display the sum
		System.out.printf("The sum of numbers from 1 to %d is %d", number, total);
		
		//call function to display sum
		//pass the number as an argument
		//nothing is returned from the displaySum so do not assign to a variable
		displaySum(number);
		
		
		input.close();
		
	}//end of main
	
		
	/*
	Always put comments explaining function 
	Repeats prompting for integer number until number is positive 
	Assume only integer values are entered
	Parameter:  Scanner input object to read in numbers
	Return: integer positiveNumber
	*/
	public static int getPositiveNumber (Scanner inputReader) {
		
		int positiveNumber = 0;
	    do
	    {
			System.out.println("Enter a positive number:");
			positiveNumber = inputReader.nextInt();			
	    }while(positiveNumber <= 0);
		

		return positiveNumber;
		
	} // end of sum
	
	/*
	Get sum of numbers from 1 to maxNumber
	Parameter: Integer maxNumber
	Return: Integer totalSum
	*/	
	public static int calculateSum(int maxNumber)
	{
		int totalSum= 0;
	
		for(int count = 1; count <= maxNumber; count++)
		{
			totalSum = totalSum + count;
			
		}
				
		return totalSum;
	}//end calculateSum
	
	
	/*
	Display sum of numbers from 1 to maxNumber
	Parameter: Integer maxNumber
	Return: void (not returning any value) 
	*/
	public static void displaySum(int maxNumber)
	{
		int totalSum= 0;
	
		for(int count = 1; count <= maxNumber; count++)
		{
			totalSum = totalSum + count;
			System.out.printf("Count: %d Sum: %d\n", count, totalSum);
		}
				
		System.out.printf("The sum of numbers from 1 to %d is %d\n", maxNumber, totalSum);
	}//end calculateSum



}