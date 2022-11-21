
public class GrabinskiJamesHW09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("James", "Minecraft", Double.MAX_VALUE, Double.MAX_VALUE);
		System.out.println(car.getFuelGauge().getGallons());
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