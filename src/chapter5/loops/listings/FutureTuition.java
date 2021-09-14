/* Listing 5.10 */
package chapter5.loops.listings;

public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;
        int year = 0;
        while (tuition < 20000) {
            tuition *= 1.07;
            year++;
        }

        System.out.println("Tuition will be double in " + year + " years.");
        System.out.printf("Tuition will be $%.2f in %1d years.", tuition, year);
    }
}
