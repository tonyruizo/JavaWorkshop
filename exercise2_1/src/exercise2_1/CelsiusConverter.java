// Tony Ruiz Ormeno

package exercise2_1;

import java.util.*;

public class CelsiusConverter {

	public static void main(String[] args) {

		// Ask user to enter celsius
		System.out.println("Enter a degree in Celsius: ");

		try (
				// Get user's input
				Scanner userInput = new Scanner(System.in)) {
			// Read user's input
			double celsius = userInput.nextDouble();

			// Calculation Conversion
			double fahrenheit = 1.8 * celsius + 32;

			// Display Result
			System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
		}
	}

}
