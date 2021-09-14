/*
(Display prime numbers between 2 and 1,000) Modify the program given in Listing
5.15 to display all the prime numbers between 2 and 1,000, inclusive. Display eight
prime numbers per line. Numbers are separated by exactly one space.

 */

package chapter5.loops.exercises;

import java.util.Scanner;


public class Exercise_5_20 {
    public static void main(String[] args) {
        int potentialPrime = 2;
        int primeCount = 0;
        boolean isPrime = true;
        while (potentialPrime <= 1000) {

            for (int i = 2; i <= potentialPrime / 2; i++) {
                if (potentialPrime % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primeCount++;
                System.out.printf("%5d", potentialPrime);
                if (primeCount % 8 == 0) {
                    System.out.println();
                }
            }
            potentialPrime++;
            isPrime = true;
        }
    }
}

