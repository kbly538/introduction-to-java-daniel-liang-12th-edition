/* Listing 5.12 */
package chapter05.loops.listings;

public class TestBreak {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100) {
                break;
            }
        }
        System.out.println("Then number is " + number);
        System.out.println("The sum is " + sum);
    }
}
