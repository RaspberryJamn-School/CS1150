import java.util.Scanner;

public class GrabinskiJamesValidateCreditFormat {
	
	public static boolean areLetters(String testString) {
		for (int i = 0; i < testString.length(); i++) {
			if (!Character.isLetter(testString.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean areDigits(String testString) {
		for (int i = 0; i < testString.length(); i++) {
			if (!Character.isDigit(testString.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean evalCreditCardValidity(String cardString) {
		if (cardString.length()!=14) {
			System.out.println("Fail, card length was incorrect");
			return false;
		}
		if (!areLetters(cardString.substring(0, 4))) {
			System.out.println("Fail, first block is not alphabetic");
			return false;
		}
		if (cardString.charAt(4)!='-') {
			System.out.println("Fail, card string separators must be '-'");
			return false;
		}
		if (!areDigits(cardString.substring(5, 9))) {
			System.out.println("Fail, second block is not numeric");
			return false;
		}
		if (cardString.charAt(9)!='-') {
			System.out.println("Fail, card string separators must be '-'");
			return false;
		}
		if (!areDigits(cardString.substring(10, 14))) {
			System.out.println("Fail, third block is not numeric");
			return false;
		}
		System.out.println("Success! Card string valid");
		return true;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a card of the format XXXX-0000-0000: ");
		String fullInput = input.nextLine().trim();
		boolean isCreditCardValid = evalCreditCardValidity(fullInput);
		System.out.println(isCreditCardValid);
		input.close();
	}

}
