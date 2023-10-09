// Tony Ruiz Ormeno | 10/01/23 | Exercise 5.7 Financial Application: Compute Future Tution
public class App {
    public static void main(String[] args) throws Exception {
        double tuition = 10000;
        double increase = 0.05;
        double tenthYear = 0;
        double fourYearCost = 0;

        // Loop from 1 to 14
        for (int i = 1; i <= 14; i++){
            // Loop 10000 * 0.05 + 10000 (14 TIMES)
            tuition += (tuition * increase);

            // Total of amount increased at the Tenth year 
            if (i == 10) {
                tenthYear = tuition;
            }

            // Add the last four years, for the total costs of four years, after the tenth year
            if (i > 10) {
                fourYearCost += tuition ++;             
            }
        }

        System.out.printf("The cost of a tuition in 10 years will be $%.2f a year.\n", tenthYear);
        System.out.printf("The cost for a four years' worth tuition after the tenth year is $%.2f\n",fourYearCost);
    }
}