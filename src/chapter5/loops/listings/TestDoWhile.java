/* Listing 5.6 */
package chapter5.loops.listings;

import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args) {
        int data = 0;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println(
                    "Enter an integer ( the input ends if it is 0): ");
            data = input.nextInt();

            sum += data;
        } while (data != 0);

        System.out.println("Sum is " + sum);
    }
}
