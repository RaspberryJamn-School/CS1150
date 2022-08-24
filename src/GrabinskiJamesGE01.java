
public class GrabinskiJamesGE01 {
	private static int raindrop_number(int arg) {
		System.out.print(arg);
		System.out.print(" ");
		if (arg == 1) {
			return 1;
		}
		if (arg % 2 == 0) {
			return raindrop_number(arg/2);
		} else {
			return raindrop_number(arg*3+1);
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Oi oi oi we coding");
		for (int i = 1; i <= 12; i++) {
			raindrop_number(i);
			System.out.println();
		}
	}

}
