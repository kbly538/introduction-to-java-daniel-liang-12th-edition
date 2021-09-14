/*
(Perfect number) A positive integer is called a perfect number if it is equal to the sum
of all of its positive divisors, excluding itself. For example, 6 is the first perfect number
because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. There are
four perfect numbers < 10,000. Write a program to find all these four numbers.
 */

package chapter5.loops.exercises;

import java.util.Scanner;

public class Exercise_5_33 {
    public static void main(String[] args) {

        int potentialPerfectNumber = 1; // add 1 while < 10000

        while (potentialPerfectNumber < 10000) {
            int divisorsSum = 0;
            for (int i = 1; i <= potentialPerfectNumber; i++) {
                if (potentialPerfectNumber % i == 0 && i != potentialPerfectNumber)
                    divisorsSum += i;
            }

            if (potentialPerfectNumber == divisorsSum) {
                System.out.println(potentialPerfectNumber + " is a perfect number.");
            }
            potentialPerfectNumber++;
        }
    }
}

/* OUTPUT
6 is a perfect number.
28 is a perfect number.
496 is a perfect number.
8128 is a perfect number.
*/