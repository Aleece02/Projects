/**
 * File : PAssign08 java
 * Class: CSCI 1301
 * Author: Aleece Ekuban
 * Created on: April 6, 2023
 * Last Modified: April 6, 2023
 * Description: output the renovation/maintenance costs and rental revenue for the properties kept.
 */
public class PAssign08 {
	public static void main(String[] args) {
	      double[] maintenance = {21500.0, 29275.0, 37250.0, 35322.0, 19757.0, 24625.0, 30300.0, 18759.0, 15217.0, 27090.0, 12439.0, 22005.0};
	        double[] rentalIncome = {26752.0, 21421.0, 39759.0, 24783.0, 15297.0, 25264.0, 32159.0, 16157.0, 21705.0, 19420.0, 18275.0, 21350.0};

	        double totalMaintenanceBefore = 0;
	        for (double cost : maintenance) {
	            totalMaintenanceBefore += cost;
	        }
	        System.out.printf("Total maintenance/renovation before donation: $%,.2f\n", totalMaintenanceBefore);

	        // calculate total rental income before donation
	        double totalRentalIncomeBefore = 0;
	        for (double income : rentalIncome) {
	            totalRentalIncomeBefore += income;
	        }
	        System.out.printf("Total rental income before donation: $%,.2f\n\n", totalRentalIncomeBefore);

	        // make decisions to keep or donate properties
	        boolean[] decisions = new boolean[maintenance.length];
	        for (int i = 0; i < decisions.length; i++) {
	            decisions[i] = keepProperty(maintenance[i], rentalIncome[i]);
	        }

	        // calculate total maintenance/renovation costs after donation
	        double totalMaintenanceAfter = 0;
	        for (int i = 0; i < decisions.length; i++) {
	            if (decisions[i]) {
	                totalMaintenanceAfter += maintenance[i];
	            }
	        }
	        System.out.printf("Total maintenance/renovation after donation: $%,.2f\n", totalMaintenanceAfter);

	        // calculate total rental income after donation
	        double totalRentalIncomeAfter = 0;
	        for (int i = 0; i < decisions.length; i++) {
	            if (decisions[i]) {
	                totalRentalIncomeAfter += rentalIncome[i];
	            }
	        }
	        System.out.printf("Total rental income after donation: $%,.2f\n\n", totalRentalIncomeAfter);

	        // calculate total donated rental income
	        double totalDonatedRentalIncome = 0;
	        for (int i = 0; i < decisions.length; i++) {
	            if (!decisions[i]) {
	                totalDonatedRentalIncome += rentalIncome[i];
	            }
	        }
	        System.out.printf("Total Donated Rental Income: $%,.2f\n\n", totalDonatedRentalIncome);

	        // print decisions
	        printDecisions(decisions);
	    }

	    public static boolean keepProperty(double maintenanceCost, double rentalIncome) {
	        double totalMaintenanceCost = maintenanceCost * 4.75;
	        double projectedRentalRevenue = rentalIncome * 10.25;
	        return totalMaintenanceCost < projectedRentalRevenue / 2;
	    }

	    public static void printDecisions(boolean[] decisions) {
	        for (int i = 0; i < decisions.length; i++) {
	            System.out.printf("Property %d - %s\n", i, decisions[i] ? "keep" : "donate");
	        }
	    }//end of main method
	}//end of PAssign08 class