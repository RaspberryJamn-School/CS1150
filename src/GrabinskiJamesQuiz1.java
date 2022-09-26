import java.util.Scanner;

public class GrabinskiJamesQuiz1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ONE character for cruise line - H: Holland N: Norwegian R: Royal Caribbean");
		char lowercaseCruiseChar = Character.toLowerCase(input.nextLine().charAt(0));
		if (lowercaseCruiseChar=='h' || 
			lowercaseCruiseChar=='n' || 
			lowercaseCruiseChar=='r') {
			switch (lowercaseCruiseChar) {
			case 'h':
				System.out.println("Selected Holland Cruise Line");
				break;
			case 'n':
				System.out.println("Selected Norwegian Cruise Line");
				break;
			case 'r':
				System.out.println("Selected Royal Caribbean");
				break;
			default:
				break;
			}
			System.out.println("Enter number of days to cruise - 1 to 20: ");
			int numDaysOnCruise = input.nextInt();
			if (numDaysOnCruise>=1&&numDaysOnCruise<=20) {
				int dailyRate = 0;
				if (numDaysOnCruise<=3) {
					dailyRate = 200;
				}
				if (numDaysOnCruise>3&&numDaysOnCruise<=7) {
					dailyRate = 180;
				}
				if (numDaysOnCruise>7) {
					dailyRate = 150;
				}
				int finalCalculatedPrice = dailyRate*numDaysOnCruise;
				System.out.print("At $");
				System.out.print(dailyRate);
				System.out.print(" per day, the cruise will cost $");
				System.out.println(finalCalculatedPrice);
			} else {
				System.out.println("Invalid number of days - goodbye");
			}
		} else {
			System.out.println("Invalid cruise line - goodbye");
		}
		input.close();
	}

}
