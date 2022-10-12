import java.util.Scanner;

public class GrabinskiJamesCH07 {

	public static void main(String[] args)
	{
		// Examples of processing arrays

		// explain
		int[] numbers = new int[5];
		
		//explain
		int numbersLength = numbers.length;

		// 1. Explain
		System.out.println("Program asks for a tentative 5 values");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter " + numbersLength + " values: ");
		for (int i = 0; i < numbersLength; i++) {
			numbers[i] = input.nextInt();
		}

		// 2. Explain
		System.out.println("Dictate the contents of the numbers array");
		for (int i = 0; i < numbersLength; i++) {
			System.out.println("numbers[" + i + "] = " + numbers[i]);
		}

		// 3. Explain
		System.out.println("Calculate the sum of all entries in the numbers array");
		int badNameVar = 0;
		for (int i = 0; i < numbersLength; i++) {
			badNameVar = badNameVar + numbers[i];
		}
		System.out.println("badNameVar = " + badNameVar);

		// 4. Explain
		System.out.println("Find the maximum number of all entries in the numbers array");
		int badNameVar2 = numbers[0];
		for (int i = 1; i < numbersLength; i++) {
			if (numbers[i] > badNameVar2) {
				badNameVar2 = numbers[i];
			}
		}
		System.out.println("badNameVar2 = " + badNameVar2);
		
		input.close();
	} // main
}// end class