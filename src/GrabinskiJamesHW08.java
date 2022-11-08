public class GrabinskiJamesHW08 {

	public static void main(String[] args) {
		Student student1 = new Student("Firmware Rebels", 3.5);
		Student student2 = new Student("Debug Entity", 2.7);
		Student student3 = new Student("Zip Demons", 4.0);
		Student student4 = new Student("Stack Terror", 3.2);
		Student student5 = new Student("Binary Beast", 2.8);
		Student student6 = new Student("Method Madness", 3.6);
		Student student7 = new Student("Heap Hellion", 3.9);
		Student[] studentArr = new Student[8];
		studentArr[0] = student1;
		studentArr[1] = student2;
		studentArr[2] = student3;
		studentArr[3] = student4;
		studentArr[4] = student5;
		studentArr[5] = student6;
		studentArr[6] = student7;
		
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
	static int numCourses = 0;
	
	public Course(String name, int maxNumStudents) {
		this.name = name;
		this.maxStudents = maxNumStudents;
		students = new Student[maxNumStudents];
		numStudents = 0;
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

	public int getNumCourses() {
		return numCourses;
	}
	
	public void addStudent(Student studentToAdd) {
		if (numStudents >= maxStudents) {
			System.out.println("Error: Course [" + this.name + "] cannot accept any more students");
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
			System.out.println(tabPadString(students[i].getName(), 2) + students[i].getGPA());
		}
	}
}