/**
 * File : PAssign04 java
 * Class: CSCI 1301
 * Author: Aleece Ekuban
 * Created on: Feb 23, 2023
 * Last Modified: Feb 23, 2023
 * Description: Determine whether points are within the rectangle.
 */
import java.util.*;

public class PAssign04 {

	public static void main(String[] args) {

//Assign scanner and variables

		Scanner input = new Scanner(System.in);

//user input width and height

		System.out.print("Enter width for rectangle: ");

		int width = input.nextInt();

		System.out.print("Enter height for rectangle: ");

		int height = input.nextInt();

		if (width < 0 || height < 0) {

			System.out.println("Your rectangle must have a positive height and width.");

		} else {

//user input center

			System.out.print("Enter x,y value for center point of rectangle: ");

			String centerString[] = input.next().split(",");

			int centerX = Integer.parseInt(centerString[0]);

			int centerY = Integer.parseInt(centerString[1]);

//user input test point

			System.out.print("Enter x,y value for test point: ");

			String testString[] = input.next().split(",");

			int testX = Integer.parseInt(testString[0]);

			int testY = Integer.parseInt(testString[1]);

//calculations
			Double distanceH = Math.sqrt(Math.pow(testX - centerX, 2));
			Double distanceV = Math.sqrt(Math.pow(testY - centerY, 2));

			if (distanceH <= width / 2 && distanceV <= height / 2) {
//output

				System.out.print("(" + testX + ", " + testY + ") is in the rectangle centered at (" + centerX + ", "
						+ centerY + ") with width " + width + " and height " + height);
			} else {
				System.out.print("(" + testX + ", " + testY + ") is not in the rectangle centered at (" + centerX + ", "
						+ centerY + ") with width " + width + " and height " + height);
			}
		}
	}
}
