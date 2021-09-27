/* Listing 5.8 */
package chapter05.loops.listings;

public class TestSum {
    public static void main(String[] args) {
        double sum = 0;

        for (double i = 0.01d; i <= 1.0d; i += 0.01d) {
            sum += i;
        }


        System.out.println("The sum is " + sum);
    }
}
