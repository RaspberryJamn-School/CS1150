import java.util.Scanner;

/*
 *  Name: James Grabinski
 *  Class: CS1150 M/W
 *  Due:  Aug 28
 *  Description: Guided Exploration 01 
 *  This program will print a couple paragraphs about my passions and interests.       
 *  The program will calculate my age doubled
 */

public class GrabinskiJamesGE01 { // Class GE01

	public static void main(String[] args) { // main
		final double PI = 3.14159265;
		Scanner input = new Scanner(System.in);
		System.out.print("Gimme a radius please: ");
		double radius = input.nextDouble();
		double area = radius * radius * PI;
		System.out.println("Area of circle with radius = " + radius + " is: " + area);
		input.close();
	}

}
