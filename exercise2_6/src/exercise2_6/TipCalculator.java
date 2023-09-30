// Tony Ruiz Ormeno | 9/16/23 | Financial Application : Calculate Tips
package exercise2_6;

import java.util.*;

public class TipCalculator {

	public static void main(String[] args) {

		// Ask user to enter Subtotal and Gratuity Rate
		System.out.println("Enter the subtotal and gratuity rate: ");

		// Create Scanner object
		Scanner userInput = new Scanner(System.in);

		// Read subtotal
		double subtotal = userInput.nextDouble();

		// Read gatuity rate
		double gratuityRate = userInput.nextDouble();

		// Calling calculation method
		calculateGratuity(subtotal, gratuityRate);

		userInput.close();
	}

	// Calculation method
	static void calculateGratuity(double subtotal, double gratuityRate) {

		// convert gratuity rate into a decimal
		double gratuityPercent = gratuityRate / 100;

		// Calculate gratuity amount
		double gratuity = subtotal * gratuityPercent;

		// Add gratuity amount to the total
		double total = gratuity + subtotal;

		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}

}
