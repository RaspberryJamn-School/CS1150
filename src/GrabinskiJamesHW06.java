
public class GrabinskiJamesHW06 {
	private static boolean isStringAllLetter(String testString) {
		for (int i = 0; i < testString.length(); i++) {
			if (Character.isAlphabetic(testString.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isStringAllDigit(String testString) {
		for (int i = 0; i < testString.length(); i++) {
			if (Character.isDigit(testString.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean validateDiscoverCard(String cardString) {
		if (cardString.length() != 15) {
			System.out.println("The credit card length entered is not correct.");
			return false;
		}
		
		System.out.println(cardString.substring(0, 4));
		if (!isStringAllLetter(cardString.substring(0, 4))) {
			System.out.println("You didn't enter a letter for the X positions.");
			return false;
		}
		if (!isStringAllDigit(cardString.substring(5, 9))) {
			System.out.println("You didn't enter digits for the # positions.");
			return false;
		}
		if (!isStringAllDigit(cardString.substring(10))) {
			System.out.println("You didn't enter digits for the # positions.");
			return false;
		}
		if (cardString.charAt(4)!='-'||cardString.charAt(9)!='-') {
			System.out.println("You didn't enter '-' as the block separator");
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if (validateDiscoverCard("")) {
//			System.out.println("nothing dw");
//		} else {
//			System.out.println("nothing but fail");
//		}
		System.out.println(validateDiscoverCard("ABCD-2398-00000"));
	}

}
