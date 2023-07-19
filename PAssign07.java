
/**
 * File : PAssign07 java
 * Class: CSCI 1301
 * Author: Aleece Ekuban
 * Created on: Mar 30, 2023
 * Last Modified: Mar 30, 2023
 * Description: asks user for specific number of values to enter.
 */
import java.util.Scanner;

public class PAssign07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of values: ");
		int size = input.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter value (" + (i + 1) + " of " + size + "): ");
			arr[i] = input.nextInt();
		}

		// Determine all index locations and values in the array
		
		for (int i = 0; i < size; i++) {
			System.out.println("Index " + i + ": " + arr[i]);
		}

		// Determine and display maximum value and its location
		int max = arr[0];
		int maxIndex = 0;

		for (int i = 1; i < size; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}

		System.out.println("\n" + "Maximum: " + max + " at index " + maxIndex);

		// Determine and display minimum value and its location
		int min = arr[0];
		int minIndex = 0;

		for (int i = 1; i < size; i++) {
			if (arr[i] < min) {
				min = arr[i];
				minIndex = i;
			}
		}

		System.out.println("Minimum: " + min + " at index " + minIndex);

		// Determine and display average value of all values
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += arr[i];
		}
		double avg = (double) sum / size;
		System.out.printf("Average: %.4f\n", avg);

		// Determine and display count of how many values were over the average
		int overAvgCount = 0;
		for (int i = 0; i < size; i++) {
			if (arr[i] > avg) {
				overAvgCount++;
			}
		}

		System.out.println("Values over average: " + overAvgCount);

		// Determine and display count of how many values were under the average
		int underAvgCount = 0;
		for (int i = 0; i < size; i++) {
			if (arr[i] < avg) {
				underAvgCount++;
			}
		}

		System.out.println("Values under average: " + underAvgCount);

		
	}//end of main method
}//end of PAssign07 class
