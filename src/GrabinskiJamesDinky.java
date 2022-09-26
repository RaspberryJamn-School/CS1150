import java.util.Scanner;

public class GrabinskiJamesDinky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double answer = -1.0;
		do {
			System.out.print("What number might be a valid percentage? ");
			answer = input.nextDouble();
		} while (answer>100.||answer<0.);
		System.out.println("thanks");
		input.close();
		
//		int cumm = 0;
//		for (int i = 1; i <= 5; i++) {
//			if (i%2==1) {
//				cumm +=i;
//			}
//		}
//		System.out.println(cumm);
	}

}
