import java.util.Scanner;

public class GrabinskiJamesValidateStrictRules {

	public static boolean areLetters(String testString) { // test if all chars in a string are letters
		for (int i = 0; i < testString.length(); i++) {
			if (!Character.isLetter(testString.charAt(i))) { // if any char is Not letter,
				return false; // then fail the test
			}
		}
		return true; // if we never found a non letter char, pass
	}

	public static boolean areDigits(String testString) {
		for (int i = 0; i < testString.length(); i++) {
			if (!Character.isDigit(testString.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a card of the format XXXX-0000-0000: ");
		String cardString = input.nextLine().trim();
		input.close();
		if (cardString.length()!=14) {
			System.out.println("Fail, card length was incorrect");
			System.exit(0);
		}
		if (!areLetters(cardString.substring(0, 4))) { // extract first 4 chars from the input string
			System.out.println("Fail, first block is not alphabetic");
			System.exit(0);
		}
		if (!areDigits(cardString.substring(5, 9))) {
			System.out.println("Fail, second block is not numeric");
			System.exit(0);
		}
		if (!areDigits(cardString.substring(10, 14))) {
			System.out.println("Fail, third block is not numeric");
			System.exit(0);
		}
		if (cardString.charAt(4)!='-') {
			System.out.println("Fail, card string separators must be '-'");
			System.exit(0);
		}
		if (cardString.charAt(9)!='-') {
			System.out.println("Fail, card string separators must be '-'");
			System.exit(0);
		}

		System.out.println("Correct length 14 (you did it!)");
	}
}
