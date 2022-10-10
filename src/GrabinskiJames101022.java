
public class GrabinskiJames101022 {
	
	public static double celsiusToFahrenheit(double celsius) {
		return 9.0/5*celsius+32;
	}
	
	public static void main(String args[]) {
		System.out.println("Celsius	Fahrenheit");
		System.out.println("------------------");
		for (double i = 40.0; i >=31.0; i-=1.0) {
			System.out.printf("%.1f	%.1f\n", i, celsiusToFahrenheit(i));
		}
		
	}
}
