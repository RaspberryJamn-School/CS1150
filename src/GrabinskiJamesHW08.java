
public class GrabinskiJamesHW08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		numCourses++;
	}
	
}