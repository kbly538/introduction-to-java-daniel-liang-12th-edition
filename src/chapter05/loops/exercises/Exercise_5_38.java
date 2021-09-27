/*
(Decimal to octal) Write a program that prompts the user to enter a decimal
integer and displays its corresponding octal value. Don’t use Java’s Integer.
toOctalString(int) in this program.
 */

package chapter05.loops.exercises;

import java.util.Scanner;

public class Exercise_5_38 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal integer: ");
        int number = input.nextInt();
        String octalNumber = number == 0 ? "0" : ""; // if number equals zero assign "0" to the string.

        while (number > 0) {
            octalNumber = number % 8 + octalNumber;
            number /= 8;
        }

        System.out.println("Octal number: " + octalNumber);

    }
}

/* OUTPUT
Enter a decimal integer:
1000
Octal number: 1750
*/