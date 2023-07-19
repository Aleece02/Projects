/**
 * File: PAssign01b2.java
 * Class: CSCI 1301
 * author: Aleece Ekuban
 * Created on: Jan 25, 2023
 * Modified on: Jan 25, 2023
 *Description: Calculate area of triangle
 */
import java.util.Scanner;
public class PAssign01b2 {
//assign variables
	
	public static void main(String[] args) {
		double base = 7.0; double height = 9.0;
		double total = 1.0 / 2.0 * base * height;
		Scanner input = new Scanner(System.in);
//prompt user for base
		System.out.println("Enter base value: ");
		input.nextDouble();
//prompt user for height value
		System.out.println("Enter height value: ");
		input.nextDouble();
//output value
		System.out.println("A triangle with base " + base + " and height " + height + " has an area of " + total + ".");
	}

}