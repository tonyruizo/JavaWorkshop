// Tony Ruiz Ormeno | 10/08/23 | SumDigits Method
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner userInput = new Scanner(System.in);

        // Get user digits
        System.out.println("Enter digits you want to sum together: \n");
        long digits = userInput.nextLong();

        // Calculate using method
        int result = sumDigits(digits);

        // Display result
        System.out.println("The sum of the digits is " + result);

        userInput.close();
    }
    // Method
    public static int sumDigits(long n) {
        int sum = 0;

        // Extract each digit and add to sum one at a time
        while ( n > 0) {
            int digit = (int)(n % 10);
            sum += digit;
            n /= 10;
        }
        // return total of sum
        return sum;
    }
}
