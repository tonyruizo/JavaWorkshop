// Tony Ruiz Ormeno | 10/1/23 | Conversion from miles to kilometers table.

public class App {
    public static void main(String[] args) throws Exception {
        // Assign the value of 1 mile in kilometers
        double mileInKilometer = 1.609;

        // Display titles of table
        System.out.println("Miles \t Kilometers");

        // Loop starting at 1 (for the mile), stops at 10 miles, add plus one mile if less or equal to 10.
        for (int i = 1; i <= 10; i++) {

            // Multiply current mile to 1.609 and assign to kilometer
            double kilometer = mileInKilometer * i;
            
            // Display table
            System.out.printf("%d \t %.3f\n", i,  kilometer);
        }

    }
}
