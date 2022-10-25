import java.util.Scanner;

public class GrabinskiJamesHW06 {
	public static boolean doesUserLoginWithinXTries(Scanner methodInput, String correctPin, int tries) {
		int loginFailWarnings = 0;
		boolean loginVerified = false;
		do {
			if (validLogin(methodInput, correctPin)) {
				loginVerified = true;
			} else {
				loginFailWarnings++;
			}
		} while(!loginVerified && loginFailWarnings < tries);
		return loginVerified;
	}
	
	public static boolean validLogin(Scanner methodInput, String correctPin) {
		System.out.print("Enter pin:");
		String submittedPin = methodInput.nextLine();
		return submittedPin.equals(correctPin);
	}
	
	public static double getCharityPercent(Scanner methodInput, double min,  double max) {
		double submittedPercent = 0.;
		do {
			System.out.printf("Enter the percentage going to charity. Must be in the range of %.0f%% to %.0f%%: ", min, max);
			submittedPercent = methodInput.nextDouble();
		} while(!(submittedPercent >= min && submittedPercent <= max));
		return submittedPercent;
	}
	
	public static void displayTicketInformation(double percent) {
		System.out.println("----- Denver Nuggets Ticket Sales Mode -----");
		System.out.printf("Buy Nuggets tickets and %.2f%% will go to charity.\n", percent);
		System.out.println("\n\nLevel			Price Per Person");
		System.out.println("-------------------------------------");
		System.out.println("Courtside		$300");
		System.out.println("Mid Level		$200");
		System.out.println("Upper Level		$100");// contested between Sample Output 1 and specification 3c
		System.out.println("-------------------------------------");
	}
	
	public static char getValidLevel(Scanner readInput) {
		String inputString = "";
		char submittedLevel = 'L';
		boolean isSubmittedLevelValid = false;
		do {

			System.out.println("Enter one of the following characters to select your level.");
			System.out.println("C: Courtside  M: Mid Level   U: Upper Level");
			do {
				inputString = readInput.nextLine();
			} while(inputString.length() == 0);
			submittedLevel = Character.toLowerCase(inputString.charAt(0));
			switch (submittedLevel) {
			case 'c':
			case 'm':
			case 'u':
			case 'q':
				isSubmittedLevelValid = true;
				break;
			default:
				isSubmittedLevelValid = false;
				break;
			}
		} while(isSubmittedLevelValid == false);
		return submittedLevel;
	}
	
	public static int getNumberTickets(Scanner methodInput, int min, int max) {
		int submittedNumber = 0;
		do {
			System.out.printf("Enter the number of tickets you want to purchase. Must be in the range of %d to %d: ", min, max);
			submittedNumber = methodInput.nextInt();
		} while(!(submittedNumber >= min && submittedNumber <= max));
		return submittedNumber;
	}
	
	public static double calculateCharge(char level, int tickets) {
		double scaleFactor = 0.;
		switch (level) {
		case 'c':
			scaleFactor = 300.;
			break;
		case 'm':
			scaleFactor = 200.;
			break;
		case 'u':
			scaleFactor = 100.; // contested between Sample Output 1 and specification 3c
			break;
		default:
			break;
		}
		return tickets * scaleFactor;
	}
	
	public static boolean isCharAlpha(char c) {
		int ic = (int) c;
		return ((ic >= 65) && (ic <= 90)) || ((ic >= 97) && (ic <= 122));
	}
	public static boolean isCharDigit(char c) {
		int ic = (int) c;
		return ((ic >= 48) && (ic <= 57));
	}
	
	public static void processPayment(Scanner methodInput) {
		String cardString = "";
		boolean cardValid = false;
		do {
			System.out.print("Enter your credit card in the pattern XXXX-####-#####: ");
			cardString = methodInput.next();
			if (cardString.length() != 15) {
				System.out.println("The credit card length entered is not correct.\n");
			} else {
				if (!(
						isCharAlpha(cardString.charAt(0))&&
						isCharAlpha(cardString.charAt(1))&&
						isCharAlpha(cardString.charAt(2))&&
						isCharAlpha(cardString.charAt(3))
						)) {
					System.out.println("You didn't enter a letter for the X positions.\n");
				} else {
					if (!(
							isCharDigit(cardString.charAt(5))&&
							isCharDigit(cardString.charAt(6))&&
							isCharDigit(cardString.charAt(7))&&
							isCharDigit(cardString.charAt(8))&&
							isCharDigit(cardString.charAt(10))&&
							isCharDigit(cardString.charAt(11))&&
							isCharDigit(cardString.charAt(12))&&
							isCharDigit(cardString.charAt(13))&&
							isCharDigit(cardString.charAt(14))
							)) {
						System.out.println("You didn't enter digits for the # positions.\n");
					} else {
						if (!(
								(cardString.charAt(4)=='-')&&
								(cardString.charAt(9)=='-')
								)) {
							System.out.println("You didn't enter '-' as the block separators\n");
						} else {
							cardValid = true;
							//Mail.send(addressBook.getProfileByCard(cardString).mailingAddress, new Bill((double) likeABillionDollars));
						}
					}
				}
			}
		} while (!cardValid);
	}
	/*
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Admin must log-in to set up the Denver Nugget ticket sales for charity");
		
		final String LOGIN_PIN = "RuoK";
		
		if (!doesUserLoginWithinXTries(input, LOGIN_PIN, 3)) {
			System.out.println("Exiting Denver Nuggets fundraiser.");
		} else {
			double charityPercentage = 0.;
			final double MIN_CHARITY_PERCENTAGE = 5;
			final double MAX_CHARITY_PERCENTAGE = 25;
			charityPercentage = getCharityPercent(input, MIN_CHARITY_PERCENTAGE, MAX_CHARITY_PERCENTAGE);
			System.out.println();
			
			final int MIN_TICKET_ORDER = 1;
			final int MAX_TICKET_ORDER = 10;
			
			char currentLevel = 'L';
			int currentTicketSaleCount = 0;
			double proposedCharge = 0.;
			double totalSales = 0.;
			double totalCharitySales = 0.;
			
			boolean salesMode = true;
			while (salesMode) {
				displayTicketInformation(charityPercentage);
				currentLevel = getValidLevel(input);
				if (currentLevel != 'q') {
					currentTicketSaleCount = getNumberTickets(input, MIN_TICKET_ORDER, MAX_TICKET_ORDER);
					proposedCharge = calculateCharge(currentLevel, currentTicketSaleCount);
					System.out.printf("Your charge is %.1f\n\n", proposedCharge);
					processPayment(input);
					System.out.printf("Thanks for your purchase. $%.2f will go to charity\n\n", proposedCharge * 0.01 * charityPercentage);
					totalSales += proposedCharge;
				} else {
					if (doesUserLoginWithinXTries(input, LOGIN_PIN, 3)) {
						totalCharitySales = totalSales * 0.01 * charityPercentage;
						System.out.printf("\nTotal sales $%.2f\n", totalSales);
						System.out.printf("Total raised for charity: $%.2f\n", totalCharitySales);
						System.out.println("Exiting Denver Nuggets fundraiser.\n");
						salesMode = false;
					}
				}
			}
		}
	}
}
