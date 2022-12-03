import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GrabinskiJamesHW10 {

	public static void main(String[] args) {
		final String FILE_PATH = "hw10animals.txt";
		
		Animal[] Animal = new Animal[6]; // Specification 4a
		
		File inputFilePath = new File(FILE_PATH);
		Scanner fileInput = null;
		try {
			fileInput = new Scanner(inputFilePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Could not find file \"" + FILE_PATH + "\", stopping testing");
			System.exit(0);
		}
		
		for (int i = 0; i < 6; i++) { // Specification 4b
			switch (fileInput.next().toLowerCase()) {
			case "panther":
				Animal[i] = new Panther(fileInput.next(), fileInput.nextFloat(), fileInput.next(), fileInput.next());
				break;
			case "penguin":
				Animal[i] = new Penguin(fileInput.next(), fileInput.nextFloat(), fileInput.next(), fileInput.next());
				break;
			case "bear":
				Animal[i] = new Bear(fileInput.next(), fileInput.nextFloat(), fileInput.next(), fileInput.next());
				break;
			case "wolf":
				Animal[i] = new Wolf(fileInput.next(), fileInput.nextFloat(), fileInput.next(), fileInput.next());
				break;
			default:
				System.out.println("Failed in finding specific animal type at key 0, line " + i + " in file " + FILE_PATH + ", creating generic-type Animal instead");
				Animal[i] = new Animal(fileInput.next(), fileInput.nextFloat(), fileInput.next(), fileInput.next());
			}
		}
		fileInput.close();
		for (int i = 0; i < Animal.length; i++) { // Specification 4c
			System.out.print("Animal[" + i + "] is a ");
			if (Animal[i] instanceof Panther) {  // Specification 4ci
				System.out.println("Panther");
			} else if (Animal[i] instanceof Penguin) {
				System.out.println("Penguin");
			} else if (Animal[i] instanceof Bear) {
				System.out.println("Bear");
			} else if (Animal[i] instanceof Wolf) {
				System.out.println("Wolf");
			} else {
				System.out.println("n Animal");
			}
			System.out.println(Animal[i].toString()); // Specification 4cii
			Animal[i].eat();
			Animal[i].sleep();
			Animal[i].swim();
			
			System.out.println("");
		}
	}
}

/**Class representing a generic animal;
 * Superclass to other animal classes*/
class Animal { // Specification 2
	protected String name; // i mean you said define them as 'private' but you also said use 'super', so like idk
	protected double weight;
	protected String food;
	protected String location;
	
	public Animal() {
		this.name = "Default Animal";
		this.weight = 1.0;
		this.food = "nothing";
		this.location = "nowhere";
	}
	
	public Animal(String name, double weight, String food, String location) {
		this.name = name;
		this.weight = weight;
		this.food = food;
		this.location = location;
	}
	
	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public String getFood() {
		return food;
	}

	public String getLocation() {
		return location;
	}
	
	@Override
	public String toString() {
		return String.format("Animal Name: %s - Weighs: %.1f lbs - Location: %s", this.name, this.weight, this.location);
	}
	
	public void eat() {
		System.out.println("Animal is eating");
	}
	
	public void sleep() {
		System.out.println("Animal is sleeping - do not disturb");
	}
	
	public void swim() {
		System.out.println("Animal is swimming");
	}
}

class Panther extends Animal { // Specification 3 ...

	public Panther(String name, double weight, String food, String location) {
		super.name = name;
		super.weight = weight;
		super.food = food;
		super.location = location;
	}
	
	@Override
	public String toString() {
		return String.format("Panther: Name: %s - Weighs: %.1f lbs - Location: %s", this.name, this.weight, this.location);
	}
	
	@Override
	public void eat() {
		System.out.println("Panther is eating " + this.food);
	}
	
	@Override
	public void sleep() {
		System.out.println("Panther is sleeping");
	}
}

class Penguin extends Animal {

	public Penguin(String name, double weight, String food, String location) {
		super.name = name;
		super.weight = weight;
		super.food = food;
		super.location = location;
	}
	
	@Override
	public String toString() {
		return String.format("Penguin Name: %s - Weighs: %.1f lbs - Location: %s", this.name, this.weight, this.location);
	}
	
	@Override
	public void eat() {
		System.out.println("Penguin is eating - " + this.food);
	}
	
	@Override
	public void swim() {
		System.out.println("Penguin is swimming");
	}
}

class Bear extends Animal {

	public Bear(String name, double weight, String food, String location) {
		super.name = name;
		super.weight = weight;
		super.food = food;
		super.location = location;
	}
	
	@Override
	public String toString() {
		return String.format("Bear: Name: %s - Weighs: %.1f lbs - Location: %s", this.name, this.weight, this.location);
	}
	
	@Override
	public void eat() {
		System.out.println("Bear is eating " + this.food);
	}
	
	@Override
	public void sleep() {
		System.out.println("Bear is sleeping");
	}
	
	@Override
	public void swim() {
		System.out.println("Bear is swimming");
	}
}

class Wolf extends Animal {

	public Wolf(String name, double weight, String food, String location) {
		super.name = name;
		super.weight = weight;
		super.food = food;
		super.location = location;
	}
	
	@Override
	public String toString() {
		return String.format("Wolf: Name: %s - Weighs: %.1f lbs - Location: %s", this.name, this.weight, this.location);
	}
}
