
/**
 * File : PAssign06 java
 * Class: CSCI 1301
 * Author: Aleece Ekuban
 * Created on: Mar 21, 2023
 * Last Modified: Mar 24, 2023
 * Description: user enters string and character and determine how many times the character shows up.
 */
import java.util.Scanner;

public class PAssign06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Ask the user to enter a string

		while (true) {

			System.out.print("Enter a string: ");
			String stringInput = scanner.nextLine();

			if (stringInput.equalsIgnoreCase("STOP")) {
				break;
			}
			// Ask user t enter a character

			System.out.print("Enter a character: ");
			char charInput = scanner.next().charAt(0);
			scanner.nextLine();

			// Call the countCharacters() method

			int count = countCharacters(stringInput, charInput);

			// Print the count of characters

			printCount(charInput, stringInput, count);

			// call the reverseString() method

			String reversedString = reverseString(stringInput);

			// print the reverse of string input

			System.out.println("The reverse of " + stringInput + " is " + reversedString);
		}
	}// end of main method

	// countCharacter method
	public static int countCharacters(String stringInput, char charInput) {
		int count = 0;
		for (int i = 0; i < stringInput.length(); i++) {
			if (stringInput.charAt(i) == charInput) {
				count++;
			}
		}
		return count;
	}

	public static void printCount(char charInput, String stringInput, int count) {
		System.out.println(charInput + " occurs in " + stringInput + " " + count + " times");

	}

	public static String reverseString(String stringInput) {
		String reversedString = "";
		for (int i = stringInput.length() - 1; i >= 0; i--) {
			reversedString += stringInput.charAt(i);
		}
		return reversedString;
	}
}
//end of PAssign06 class
