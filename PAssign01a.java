/**
 * File: PAssign01.java
 * Class: CSCI 1301
 * Author: Aleece Ekuban
 * Created on: Jan 25, 2023
 * Last Modified: Jan 25, 2023
 * Description: Display number of items to the console
 */

import java.util.Scanner;
public class PAssign01a {
	public static void main(String[] args) {
		double beverages = 0.50; double sandwiches = 2.75;
		double beverage = 5; double sandwich = 3;
		double total = beverage * beverages + sandwich * sandwiches;
		Scanner input = new Scanner(System.in);
	//prompt user for number of beverages
		System.out.println("Enter number of beverages: ");
		input.nextDouble();
	//prompt user for number of sandwiches
		System.out.println("Enter number of sandwiches: ");
		input.nextDouble();
	//output number of beverages and sandwiches
		System.out.println("The total of "  +  beverage  + " beverages "  + "and " + sandwich + " sandwiches" + " is $" + total + ".");
		
		
		

	}

}
