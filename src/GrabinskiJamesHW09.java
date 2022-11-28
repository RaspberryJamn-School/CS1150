import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
		
		int milesTraveled = 0;
		boolean raceIsActive = true;
		while (raceIsActive) {
			milesTraveled += 1.0;
			for (int i = 0; i < cars.length; i++) {
				cars[i].updateFuel(1.0);
				if (cars[i].isOutOfGas()) {
					raceIsActive = false;
				}
			}
			if (milesTraveled%10==0) {
				System.out.println("Miles Traveled = " + milesTraveled);
				printCars(cars);
			}
		}
		
		System.out.println("Cars at end of simulation");
		printCars(cars);
		Car shortestRunCar = findCarWithNoGas(cars);
		System.out.println(shortestRunCar.getOwner() + "'s car ran out of gas after " + milesTraveled + " miles");
		
		try {
			writeCarDetailsToFile(cars);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	private static void createCars(Car[] cars) {
		cars[0] = new Car("Shrek", "Toyota Tundra", 15, 6);
		cars[1] = new Car("Fiona", "Audi Q7", 21, 10);
		cars[2] = new Car("Donkey", "Jeep CJ5", 14, 5);
		cars[3] = new Car("Farquaad", "Smart Car", 42, 4);
		cars[4] = new Car("Dragon", "Chevy Suburban", 12, 30);
	}
	
	private static String padWidthByTab(String base, int tabWidth) { // attempts to make [base] take up [tabWidth]-tabs worth of space; if the string is too long, it wont add anything
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
		System.out.println("\n");
	}
	
    public static Car findCarWithNoGas(Car[] cars) {
    	Car carThatExistsTrustMeMaybe = cars[0];
    	for (int i = 1; i < cars.length; i++) {
			if (cars[i].isOutOfGas()) {
				carThatExistsTrustMeMaybe = cars[i];
			}
		}
    	return carThatExistsTrustMeMaybe;
    }
    
    public static void writeCarDetailsToFile(Car[] cars) throws IOException {
		final String FILENAME = "Assignment11.txt";
		try {
			File file = new File(FILENAME);
			file.createNewFile();
//			if (file.createNewFile()) {
//				System.out.println("File created: " + file.getName());
//			} else {
//				System.out.println("File already exists.");
//			}
//			System.out.println("File is located at: " + file.getAbsolutePath());
			
			FileWriter fileWriter = new FileWriter(FILENAME);
			for (int i = 0; i < cars.length; i++) {
				fileWriter.write(String.format("%s%s%.2f		%.2f\n", padWidthByTab(cars[i].getOwner(), 2), padWidthByTab(cars[i].getBrand(), 3), cars[i].getFuelEconomy(), cars[i].getFuelGauge().getGallons()));
			}
			fileWriter.close();
	    } catch (IOException e) {
	    	System.out.println("An error occurred.");
	    	e.printStackTrace();
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
	
	/**decrements the gallons within the Car's fuelGauge object according the Car's fuel economy and the distance traveled
	 * */
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

/**Class that represents the fuel gauge in a car; 
 * internal gallons variable cannot be set, only initialized and decremented*/
class FuelGauge {
	private double gallons;
	
	public FuelGauge(double gallons) {
		this.gallons = gallons;
	}
	
	public double getGallons() {
		return gallons;
	}
	
	/**decrements gallons; 
	 * if decrementing would yield a negative value, gallons is set to zero instead*/
	public void decrementGallons(double gallonsUsed) {
		if (gallonsUsed > this.gallons) {
			this.gallons = 0.0;
		} else {
			this.gallons -= gallonsUsed;
		}
	}
}