// Tony Ruiz Ormeno | 9/30/23 | Exercise 4.13

import java.util.*;

public class VowelOrConsonant {

  public static void main(String[] args) {
    // Create a new scanner object named userInput
    Scanner userInput = new Scanner(System.in);

    // Prompt user to enter a letter
    System.out.println("Enter a letter: \n");
    String inputFilter = userInput.next();

    // Filtering to grab first character if user enters more than one.
    char letter = inputFilter.toLowerCase().charAt(0);

    // If statement to check if letter is a vowel, if its a consonant or an invalid
    if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
      System.out.println(letter + " is a vowel.");
    } else if (letter >= 'a' && letter <= 'z') {
      System.out.println(letter + " is a consonant.");
    } else {
      System.out.println(letter + " is an invalid input.");
    }

    // Closing scanner object
    userInput.close();

  }
}
