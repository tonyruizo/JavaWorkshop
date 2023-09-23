// Tony Ruiz Ormeno | 9/22/23 | Health Application: BMI
package exercise3_6;
import java.util.*;

public class BMI_Calculator {

	public static void main(String[] args) {
		
		// Create scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        int weight = input.nextInt();

        // If statements to make sure inputs are valid and greater than 0
        if (weight > 0) {
        	
            System.out.println("Enter feet: ");
            int feet = input.nextInt();

            if (feet >= 0) {
            	
                System.out.println("Enter inches: ");
                int inches = input.nextInt();

                if (inches >= 0) {
                    
                	// Convert feet to inches and add inches
                	double height = feet * 12 + inches;
                	
                    // Calculate BMI
                    double bmi = weight / (height * height) * 703;
                    
                    System.out.println("Your BMI is: " + bmi);
                    
                    // Range
                    if (bmi < 18.5) {
                    	
                    	System.out.println("Underweight");
                    	
                    } else if (bmi >= 18.5 && bmi <= 24.9) {
                    	
                    	System.out.println("Normal");
                    
                    } else if (bmi >= 25 && bmi <= 29.9) {
                    	
                    	System.out.println("Obese");
                    	
                    } else {
                    	System.out.println("Extremely obese");
                    }
                    
                } else {
                    System.out.println("Inches must be a valid number.");
                }
            } else {
                System.out.println("Feet must be a valid number.");
            }
        } else {
            System.out.println("Weight must be a valid number.");
        }
		
		
	}

}
