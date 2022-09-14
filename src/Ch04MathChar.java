import java.util.Scanner;

public class Ch04MathChar {

	public static void main(String[] args) {
//		double randomDouble = Math.random();
//		int randomInt = (int)Math.random();
//		randomInt = (int)(Math.random()*10.);
//		randomInt = (int)(Math.random()*10. +1.);
		
		final int MIN = 1;
		final int MAX = 12;
		int randomMonth = (int)(Math.random()*(MAX-MIN+1.)+MIN);
		
		switch (randomMonth) {
		case 1:
			System.out.print("January");
			break;
		case 2:
			System.out.print("February");
			break;
		case 3:
			System.out.print("March");
			break;
		case 4:
			System.out.print("April");
			break;
		case 5:
			System.out.print("May");
			break;
		case 6:
			System.out.print("June");
			break;
		case 7:
			System.out.print("July");
			break;
		case 8:
			System.out.print("August");
			break;
		case 9:
			System.out.print("September");
			break;
		case 10:
			System.out.print("October");
			break;
		case 11:
			System.out.print("November");
			break;
		case 12:
			System.out.print("December");
			break;
		default:
			System.out.print("HEY, SOMETHING GOT MESSED UP");
		}
		System.out.println(".");
		
		char charTest = 'あ';
		int charIntValue = 0;
		System.out.println(charTest);
		charIntValue = (int)charTest;
		System.out.println(charIntValue);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a character: ");
		char someChar =input.next().charAt(0);
		
		if (Character.isUpperCase(someChar)) {
			System.out.printf("An uppercase character was entered, ascii value %d\n", (int)someChar);
			System.out.printf("Were it lowercase, the character would be %c, ascii value %d\n", Character.toLowerCase(someChar), (int)Character.toLowerCase(someChar));
		} else if (Character.isLowerCase(someChar)) {
			System.out.printf("A lowercase character was entered, ascii value %d\n", (int)someChar);
			System.out.printf("Were it uppercase, the character would be %c, ascii value %d\n", Character.toUpperCase(someChar), (int)Character.toUpperCase(someChar));
		} else if (Character.isDigit(someChar)) {
			System.out.printf("A digit was entered, ascii value %d\n", (int)someChar);
		}
		input.close();
	}

}
