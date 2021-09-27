/* Listing 5.9 */
package chapter05.loops.listings;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();

        int gcd = 0;
        int k = 1; // potential greatest common divisor
        while (number1 / 2 >= k && number2 / 2 >= k) {
            if (number1 % k == 0 && number2 % k == 0) {
                gcd = k;
            }
            k++;
        }

        System.out.println("Greatest common divisor of " + number1 + " and " + number2 + " is " + gcd);
    }
}
