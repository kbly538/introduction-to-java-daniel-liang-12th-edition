/*
(Computer architecture: bit-level operations) A short value is stored in 16 bits.
Write a program that prompts the user to enter a short integer and displays the 16
bits for the integer.
 */

package chapter05.loops.exercises;

import java.util.Scanner;

public class Exercise_5_44 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a short value: ");
        short number = input.nextShort();
        String bits = "";

        for (int i = 0; i < 16; i++) {
            bits = (number & 1) + bits;
            number = (short) (number >> 1);
        }

        System.out.println(bits);


    }
}

/* OUTPUT
Enter a short value: 7
0000000000000111
*/