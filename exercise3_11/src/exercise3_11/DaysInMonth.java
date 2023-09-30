// Tony Ruiz Ormeno | 9/23/23 | Find number of days in a month from the year
package exercise3_11;

import java.util.*;

public class DaysInMonth {

	public static void main(String[] args) {

		// Create scanner object
		Scanner userInput = new Scanner(System.in);

		// Prompt user for month
		System.out.println("Enter the month number (1-12): ");
		int userMonth = userInput.nextInt();

		if (userMonth >= 1 && userMonth <= 12) {

			// Using a method to find the month name and assigned to variable
			String monthName = findMonth(userMonth);

			// Prompt user for year
			System.out.println("Enter the year: ");
			int userYear = userInput.nextInt();

			// Check if year is a leap year. If true, add one more day to february
			if ((userYear % 4 == 0 && userYear % 100 != 0) || (userYear % 400 == 0)) {
				int numOfDays = findDays(monthName);
				numOfDays = numOfDays + 1;
				;
				// Display Final output
				System.out.println(monthName + " " + userYear + " had " + numOfDays + " days.");

			} else {
				// Assign findDays method that takes in the month name, into the numOfDays
				// variable
				int numOfDays = findDays(monthName);

				// Display Final output
				System.out.println(monthName + " " + userYear + " had " + numOfDays + " days.");
			}

		} else {
			System.out.println("Must enter a number between 1 and 12. Try again.");
		}

		userInput.close();
	}

	// Method to assign month number to the month name
	public static String findMonth(int userMonth) {
		Integer.toString(userMonth);
		String month = null;
		switch (userMonth) {
			case 1:
				month = "January";
				break;
			case 2:
				month = "February";
				break;
			case 3:
				month = "March";
				break;
			case 4:
				month = "April";
				break;
			case 5:
				month = "May";
				break;
			case 6:
				month = "June";
				break;
			case 7:
				month = "July";
				break;
			case 8:
				month = "August";
				break;
			case 9:
				month = "September";
				break;
			case 10:
				month = "October";
				break;
			case 11:
				month = "November";
				break;
			case 12:
				month = "December";
				break;
			default:
				System.out.println("Imaginary month");
		}
		return month;
	}

	// Method to get days of months
	public static int findDays(String monthName) {
		int days = 0;
		switch (monthName) {
			case "January":
				days = 31;
				break;
			case "February":
				days = 28;
				break;
			case "March":
				days = 31;
				break;
			case "May":
				days = 31;
				break;
			case "June":
				days = 30;
				break;
			case "July":
				days = 31;
				break;
			case "August":
				days = 31;
				break;
			case "September":
				days = 30;
				break;
			case "October":
				days = 31;
				break;
			case "November":
				days = 30;
				break;
			case "December":
				days = 31;
				break;
			default:
				System.out.println("Unknown month.");
		}
		return days;
	}

}
