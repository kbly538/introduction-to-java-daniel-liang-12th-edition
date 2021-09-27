/*
(Decimal to binary) Write a program that prompts the user to enter a decimal
integer then displays its corresponding binary value. Don’t use Java’s Integer.
toBinaryString(int) in this program.
 */

package chapter05.loops.exercises;

import java.util.Scanner;

public class Exercise_5_37 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal integer: ");
        int number = input.nextInt();
        String binaryNumber = number == 0 ? "0" : ""; // if number equals zero assign "0" to the string.

        while (number > 0) {
            binaryNumber = number % 2 + binaryNumber;
            number /= 2;
        }

        System.out.println("Binary number: " + binaryNumber);

    }
}

/* OUTPUT
Enter a decimal integer:
127
Binary number: 1111111
*/