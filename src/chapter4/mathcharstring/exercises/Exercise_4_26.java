/*
(Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.
java, to fix the possible loss of accuracy when converting a float value to an int
value. Read the input as a string such as "11.56". Your program should extract
the dollar amount before the decimal point, and the cents after the decimal
amount using the indexOf and substring methods.
 */
package chapter4.mathcharstring.exercises;

import java.util.Scanner;

public class Exercise_4_26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount as a decimal number, e.g. 11.56");
        String amount = input.nextLine();


        // Amount in cents
        int remainingCents = Integer.parseInt(amount.substring(amount.indexOf(',') + 1));

        int totalDollars = Integer.parseInt(amount.substring(0, amount.indexOf(',')));

        int totalQuarters = remainingCents / 25;
        remainingCents = remainingCents % 25;

        int totalDimes = remainingCents / 10;
        remainingCents = remainingCents % 10;

        int totalNickels = remainingCents / 5;
        remainingCents = remainingCents % 5;

        System.out.println("It is " + totalDollars + " dollars " + totalQuarters + " quarters " +
                totalDimes + " dimes " + totalNickels + " nickels and " + remainingCents + " pennies");


        input.close();

    }
}
