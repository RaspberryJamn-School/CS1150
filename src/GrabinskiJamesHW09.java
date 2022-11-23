
public class GrabinskiJamesHW09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car car = new Car("James", "Minecraft", Double.MAX_VALUE, Double.MAX_VALUE);
//		System.out.println(car.getFuelGauge().getGallons());
//		
		Car[] cars = new Car[5];
		createCars(cars);
		System.out.println("Cars at start of simulation");
		printCars(cars);
	}
	
	private static void createCars(Car[] cars) {
		cars[0] = new Car("Shrek", "Toyota Tundra", 15, 6);
		cars[1] = new Car("Fiona", "Audi Q7", 21, 10);
		cars[2] = new Car("Donkey", "Jeep CJ5", 14, 5);
		cars[3] = new Car("Farquaad", "Smart Car", 42, 4);
		cars[4] = new Car("Dragon", "Chevy Suburban", 12, 30);
	}
	
	private static String padWidthByTab(String base, int tabWidth) {
		String ret = base;
		for (int i = 0; i < Math.ceil((tabWidth*8-base.length())/8.0); i++) {
			ret += "	";
		}
		return ret;
	}
	private static void printCars(Car[] cars) {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Owner		Brand			Fuel Economy	Current Gallons");
		System.out.println("-----------------------------------------------------------------------");
		for (int i = 0; i < cars.length; i++) {
			System.out.printf("%s%s%.2f		%.2f\n", padWidthByTab(cars[i].getOwner(), 2), padWidthByTab(cars[i].getBrand(), 3), cars[i].getFuelEconomy(), cars[i].getFuelGauge().getGallons());
		}
	}
} 

/**Class that represents one car
 * */
class Car {
	private String owner;
	private String brand;
	private double fuelEconomy;
	private FuelGauge fuelGauge;
	
	public Car(String owner, String brand, double fuelEconomy, double gallons) {
		this.owner = owner;
		this.brand = brand;
		this.fuelEconomy = fuelEconomy;
		this.fuelGauge = new FuelGauge(gallons);
		
	}
	
	public void updateFuel(double milesTraveled) {
		double proposedFuelUsage = milesTraveled/fuelEconomy;
		fuelGauge.decrementGallons(proposedFuelUsage);
	}
	
	public boolean isOutOfGas() {
		if (fuelGauge.getGallons() > 0.0) {
			return false;
		}
		return true;
	}
	
	
	public String getOwner() {
		return owner;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getFuelEconomy() {
		return fuelEconomy;
	}
	
	public FuelGauge getFuelGauge() {
		return fuelGauge;
	}

}

/**Class that represents the fuel gauge in a car*/
class FuelGauge {
	private double gallons;
	
	public FuelGauge(double gallons) {
		this.gallons = gallons;
	}
	
	public double getGallons() {
		return gallons;
	}
	
	public void decrementGallons(double gallonsUsed) {
		if (gallonsUsed > this.gallons) {
			this.gallons = 0.0;
		} else {
			this.gallons -= gallonsUsed;
		}
	}
}