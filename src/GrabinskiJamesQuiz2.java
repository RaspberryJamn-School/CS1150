import java.util.Scanner;

public class GrabinskiJamesQuiz2 {

	public static void main(String[] args) {
		final int NUM_EMPLOYEES = 5;
		
		Employee employee1= new Employee("Firmware Rebels", 75000);
		Employee employee2= new Employee("Debug Entity", 120000);
		Employee employee3= new Employee("Zip Demons", 82500);
		Employee employee4= new Employee("Stack Terror", 120000);
		Employee employee5= new Employee("Binary Heap", 65000);
		
		Employee[] employees = new Employee[NUM_EMPLOYEES];
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		employees[3] = employee4;
		employees[4] = employee5;
		
		double averageEmployeeSalary = Employee.getTotalSalaries()/Employee.getNumberOfEmployees();
		System.out.printf("The average salary is $%.2f.\n", averageEmployeeSalary);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a minimum salary: ");
		double minSalary = input.nextDouble();
		input.close();
		int numSalariesGreaterThanInputtedMin = findNumSalariesGreater(employees, minSalary);
		System.out.printf("There are %d employees making more than %.2f.", numSalariesGreaterThanInputtedMin, minSalary);
		
		System.out.println();
		displayEmployeesLessThanAverage(employees, averageEmployeeSalary);
	}
	
	public static int findNumSalariesGreater(Employee[] array, double minSalary) {
		int qualifyingEmployeeCount = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].getSalary() > minSalary) {
				qualifyingEmployeeCount++;
			}
		}
		return qualifyingEmployeeCount;
	}
	
	public static void displayEmployeesLessThanAverage(Employee[] array, double average) {
		System.out.println("List of employees making less than the average salary.\n");
		System.out.println("Name			Salary");
		System.out.println("-----------------------------------------");
		for (int i = 0; i < array.length; i++) {
			if (array[i].getSalary() < average) {
				System.out.printf("%s		%.2f\n", array[i].getName(), array[i].getSalary());
			}
		}
	}
}

class Employee {
	String name;
	double salary;
	
	static int numberOfEmplyees;
	static double totalSalaries;
	
	public Employee() {
		this.name = "Default Name";
		this.salary = 0.0;
		numberOfEmplyees++;
		totalSalaries += this.salary;
	}
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		numberOfEmplyees++;
		totalSalaries += this.salary;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public static int getNumberOfEmployees() {
		return numberOfEmplyees;
	}
	
	public static double getTotalSalaries() {
		return totalSalaries;
	}
}
