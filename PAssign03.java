/**
 * File : PAssign03 java
 * Class: CSCI 1301
 * Author: Aleece Ekuban
 * Created on: Feb 15, 2023
 * Last Modified: Feb 15, 2023
 * Description: Display order to console.
 */
import java.util.Scanner;
public class PAssign03 {

	public static void main(String[] args) {
		//Assign variables and scanner
		Scanner input = new Scanner(System.in);
		double beverage = 0.50; double sandwich = 2.75;
		
			//Prompt user for number of beverages
			System.out.print("Enter number of beverages: ");
			double userinput = input.nextDouble();
			
			//If statement beverages
			if (userinput <= 0) {
				System.out.println("ERROR: A quantity of zero is not allowed.");
				System.out.println("Enter number of beverages: ");
				userinput = input.nextDouble();
			}
				System.out.println("Ordered: " + userinput + " beverages.");
				double beverages = userinput;
			
				//Prompt user for number of sandwiches
				System.out.print("Enter number of sandwiches: ");
				double userinput2 = input.nextDouble();
			
			//If statement sandwiches
			if (userinput2 <=0) {
				System.out.println("ERROR: A quantity of zero is not allowed.");
				System.out.println("Enter number of beverages: ");
				userinput2 = input.nextDouble();
			}
				System.out.println("Ordered: " + userinput2 + " sandwiches");
				double sandwiches = userinput;
			
				//calculate total and tax
				double total = (userinput * beverage) + (userinput2 * sandwich);
				double tax = total * 1.075;
			
			//If statement if number = 0
			if (beverages <= 0 && sandwiches <= 0) {
				System.out.println("Your order total could not be calculated due to a zero quantity for an item.");
			}else {
				System.out.println("The subtotal of " + userinput + " beverages and " + userinput2 + " sandwiches is $" + total + ".");
				System.out.println("With tax, the total is $" + tax + ".");
			}
	}//end of main method
	
}//end of PAssign03 class
