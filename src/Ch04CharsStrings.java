import java.util.Scanner;

public class Ch04CharsStrings {

	public static void main(String[] args) {
//		String studentNameA = "Alice Addams";
//		String firstNameA = "Alice";
//		int myStringLength = firstNameA.length();
//		System.out.println("The length of the student's first name is "+myStringLength);
//		System.out.println("The first letter of the student's name is "+firstNameA.charAt(0));
//		System.out.println("The last letter of the student's name is "+firstNameA.charAt(firstNameA.length()-1));
		String firstNameA = "Alice";
		String middleNameA = "Amy";
		String lastNameA = "Addams";
		
		String nameA = firstNameA + " " + middleNameA + " " + lastNameA;
		System.out.println(nameA);
		
		String str1 = "I love refridgerators";
		String str2 = "I love refridgerators";
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("They're the same picture");
		} else {
			System.out.println("They're not the same picture");
		}
		System.out.println(str1.compareTo(str2));
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter three words separated by spaces: ");
		String word1 = input.next();
		String word2 = input.next();
		String word3 = input.next();
		System.out.println("Word 1 is: [" + word1 + "]");
		System.out.println("Word 2 is: [" + word2 + "]");
		System.out.println("Word 3 is: [" + word3 + "]");
		input.close();
		
	}

}
