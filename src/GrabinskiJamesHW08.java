public class GrabinskiJamesHW08 {

	public static void main(String[] args) {
		Student student1 = new Student("Firmware Rebels", 3.5);
		Student student2 = new Student("Debug Entity", 2.7);
		Student student3 = new Student("Zip Demons", 4.0);
		Student student4 = new Student("Stack Terror", 3.2);
		Student student5 = new Student("Binary Beast", 2.8);
		Student student6 = new Student("Method Madness", 3.6);
		Student student7 = new Student("Heap Hellion", 3.9);
		Student[] studentArr = new Student[7];
		studentArr[0] = student1;
		studentArr[1] = student2;
		studentArr[2] = student3;
		studentArr[3] = student4;
		studentArr[4] = student5;
		studentArr[5] = student6;
		studentArr[6] = student7;
		
		System.out.println("********************************************");
		System.out.println("Part1:  Array of Student Objects in Main ");
		System.out.println("********************************************\n");
		System.out.println("--------------------------------------------");
		System.out.println("Student			GPA");
		System.out.println("--------------------------------------------");
		for (int i = 0; i < studentArr.length; i++) {
			System.out.println(studentArr[i].getName()+"		"+studentArr[i].getGPA());
		}
		System.out.println("\n--------------------------------------------");
		System.out.println("Student with highest gpa");
		System.out.println("--------------------------------------------");
		Student maxGPAStudent = studentArr[0];
		double maxStudentGPA = maxGPAStudent.getGPA();
		for (int i = 1; i < studentArr.length; i++) {
			if (studentArr[i].getGPA() > maxStudentGPA) {
				maxStudentGPA = studentArr[i].getGPA();
				maxGPAStudent = studentArr[i];
			}
		}
		System.out.println("Student:     " + maxGPAStudent.getName());
		System.out.println("GPA: " + maxGPAStudent.getGPA());
		
		
		
		System.out.println("\n\n********************************************");
		System.out.println("Part 2 Array of Students in Course Class   ");
		System.out.println("********************************************\n");
		
		System.out.println("Number of courses available: " + Course.getNumCourses());
		Course CS1150 = new Course("CS1150", 6);
		
		System.out.println(CS1150.getName() + " is available for registering, max number of students is " + CS1150.getMaxStudents());
		System.out.println("Number of students currently enrolled: " + CS1150.getNumStudents());

		for (int i = 0; i < studentArr.length; i++) {
			CS1150.addStudent(studentArr[i]);
		}
		System.out.println("\n\n--------------------------------------------");
		System.out.println("Course Information ");
		System.out.println("--------------------------------------------");
		System.out.println("Number of courses: " + Course.getNumCourses());
		System.out.println("Course: " + CS1150.getName());
		System.out.println("Number of students: " + CS1150.getNumStudents());
		
		System.out.println("Roster");
		System.out.println("--------------------------------------------");
		System.out.println("Student			GPA");
		System.out.println("--------------------------------------------");
		
		CS1150.displayStudents();

		System.out.printf("\nCourse Average GPA: %.2f\n", CS1150.getAverageGPA());
		maxGPAStudent = CS1150.getHighestGPA();
		System.out.println("Highest GPA in Course: ");
		System.out.println("Student: " + maxGPAStudent.getName());
		System.out.println("GPA: " + maxGPAStudent.getGPA());
	}

}

class Student {
	String name;
	double gpa;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getGPA() {
		return this.gpa;
	}
	
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
}

class Course {
	String name;
	int maxStudents;
	Student[] students;
	int numStudents;
	private static int numCourses = 0;
	
	public Course(String name, int maxNumStudents) {
		this.name = name;
		this.maxStudents = maxNumStudents;
		students = new Student[maxNumStudents];
		numStudents = 0;
		numCourses++;
	}

	public String getName() {
		return this.name;
	}

	public int getMaxStudents() {
		return this.maxStudents;
	}

	public int getNumStudents() {
		return this.numStudents;
	}

	public static int getNumCourses() {
		return numCourses;
	}
	
	public void addStudent(Student studentToAdd) {
		if (numStudents >= maxStudents) {
			System.out.println("The class is full. " + studentToAdd.getName() + ", you have been added to the waitlist");
			// Add them to the waitlist (allegedly)
			return;
		}
		students[numStudents] = studentToAdd;
		numStudents++;
	}
	
	public Student getHighestGPA() {
		Student returnStudent = students[0];
		double maxGPA = returnStudent.getGPA();
		for (int i = 1; i < numStudents; i++) {
			if (students[i].getGPA() > maxGPA) {
				maxGPA = students[i].getGPA();
				returnStudent = students[i];
			}
		}
		return returnStudent;
	}
	
	public double getAverageGPA() {
		double cummGPA = 0.;
		for (int i = 0; i < numStudents; i++) {
			cummGPA += students[i].getGPA();
		}
		cummGPA /= numStudents;
		return cummGPA;
	}
	
	private String tabPadString(String string, int tabWidth) {
		for (int i = 0; i < (tabWidth-Math.floor(string.length()/8.0)); i++) {
			string += "	";
		}
		return string;
	}
	
	public void displayStudents() {
		for (int i = 0; i < numStudents; i++) {
			System.out.println(tabPadString(students[i].getName(), 3) + students[i].getGPA());
		}
	}
}