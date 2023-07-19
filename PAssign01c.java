/**
 * File: PAssign01c.java
 * Class: CSCI 1301
 * Author: Aleece Ekuban
 * Created on: Jan 25, 2023
 * Modified on: Jan25, 2023
 * Description: Display the output of equation
 */
import java.util.Scanner;
public class PAssign01c {

	public static void main(String[] args) {
	//assign variables
		double V = 0.25; int T = 313;  double R = 8.31446; double n = 1; double total = n * R * T / V;
		Scanner input = new Scanner(System.in);
	//output
		System.out.println("The pressure of 1 mole(s) of an ideal gas with volume " + V + " m^3 at temperature " + T + " K is " + total + " pascals.");
	}

}
