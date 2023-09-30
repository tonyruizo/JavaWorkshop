// Tony Ruiz Ormeno | 9/29/23 | Exercise 4.4

import java.util.*;

public class AreaOfHexagon {

  public static void main(String[] args) {
    // Create a scanner object
    Scanner userInput = new Scanner(System.in);

    System.out.println("Find the Area of a Hexagon\n");

    // Prompt user to enter input
    System.out.println("Enter the side: \n");
    double side = userInput.nextDouble();

    // Calculate using formula
    double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));

    // Display to user
    System.out.printf("The area of the hexagon is %.2f", area);

    // Close scanner
    userInput.close();
  }

}
