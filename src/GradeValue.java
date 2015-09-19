import java.util.Scanner;
/**
 * @author Tony
 *
Create an application that asks the user for a grade value. Based on the value, give back the letter grade corresponding to the value range. 
80-100    A
70-79      B
60-69      C
50-59      D
0-49        F
* Also take in account incorrect value
*/
import java.util.Scanner;
public class GradeValue {

// Create a Scanner member to be available through out class run
//private static Scanner scanner;
private static Scanner scanner;

	public static void main(String[] args) {
		//Variables to capture String of user input
		String input;
		// Converted grade value of user input string
		int gradeValue;
		
		// introduction
		System.out.println("[\tYou are using the Grade Value Application\t]");
		// initialize the scanner
		scanner = new Scanner(System.in);
		//asks the user for a grade value
		System.out.println("Please provide a grade value");
		// store user input into a grade variable
		input = scanner.nextLine();
		// convert the string for input into a int value
		gradeValue = Integer.parseInt(input);
		
		System.out.println("Grade:" + gradeValue);
		
		

		
		
		

	}
}
