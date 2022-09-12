import java.util.Scanner;

public class GrabinskiJamesGE03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // setup input
		System.out.print("eyy can i get a radius: ");
		double radius = input.nextDouble(); // pull double radius
		System.out.print("eyy can i get a height: ");
		double height = input.nextDouble(); // pull double height
		
		if (radius > 0) {
			double sphereVolume = 4./3. * Math.PI * Math.pow(radius, 3.);
			System.out.printf("Volume of a sphere with radius %.2f is %.2f\n", radius, sphereVolume);
			if (height > 0) {
				double coneVolume = 1./3. * Math.PI * radius * radius * height;
				double cylinderVolume = Math.PI * radius * radius * height;
				System.out.printf("Volume of a cone with radius %.2f and height %.2f is %.2f\n", radius, height, coneVolume);
				System.out.printf("Volume of a cylinder with radius %.2f and height %.2f is %.2f\n", radius, height, cylinderVolume);
			}
		} else {
			System.out.print("Invalid radius entered. Unable to perform calculation.");
		}
	}

}
