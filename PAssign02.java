/**
 * File : PAssign02.java
 * Class: CSCI 1301
 * Author: Aleece Ekuban
 * Created on: Feb 1, 2023
 * Modified on: Feb 3, 2023
 * Description: calculate final grade.
 */
import java.util.Scanner;
public class PAssign02 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// create variables
		double Revel = 82.7 * 0.10;
		double Programming = 91.5 * 0.10;
		double Lab = 95.1 * 0.10;
		double Exam1 = 75.5 * 0.15;
		double Exam2 = 87.0 * 0.15;
		double Exam3 = 88.5 * 0.15;
		double Final = 92.25 * 0.25;
		double Test = Revel + Programming + Lab + Exam1 + Exam2 + Exam3 + Final;
		
		//Input data
		System.out.println("Enter Revel grade:");
		input.nextDouble();
		System.out.println("Enter Programming Assignments grade:");
		input.nextDouble();
		System.out.println("Enter Lab grade:");
		input.nextDouble();
		System.out.println("Enter Exam 1 grade:");
		input.nextDouble();
		System.out.println("Enter Exam 2 grade:");
		input.nextDouble();
		System.out.println("Enter Exam 3 grade:");
		input.nextDouble();
		System.out.println("Enter Final Exam grade:");
		input.nextDouble();
		System.out.println("There were 7 grades entered.");
	
		//output data
		System.out.println("The final grade for this course is " + Test +".");
	}//end of main method
	
}//end of PAssign02 class
