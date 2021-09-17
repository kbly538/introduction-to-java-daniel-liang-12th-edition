/*
(Math: approximate the square root) There are several techniques for implementing
the sqrt method in the Math class. One such technique is known as the
Babylonian method. It approximates the square root of a number, n, by repeatedly
performing the calculation using the following formula:

nextGuess = (lastGuess + n / lastGuess) / 2

When nextGuess and lastGuess are almost identical, nextGuess is the
approximated square root. The initial guess can be any positive value (e.g., 1).
This value will be the starting value for lastGuess. If the difference between
nextGuess and lastGuess is less than a very small number, such as 0.0001,
you can claim that nextGuess is the approximated square root of n. If not,
nextGuess becomes lastGuess and the approximation process continues.

Implement the following method that returns the square root of n:

public static double sqrt(long n)

Write a test program that prompts the user to enter a positive double value and
displays its square root.
 */
package chapter6.methods.exercises;


import java.util.Scanner;

public class Exercise_6_22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive double value: ");
        long number = input.nextLong();

        System.out.println(sqrt(number));

    }

    private static double sqrt(long number) {
        final double TOLERANCE = 0.00000001;
        double lastGuess = 1;
        double nextGuess = 2;

        while (Math.abs(nextGuess - lastGuess) > TOLERANCE) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + number / lastGuess) / 2.0;

        }


        return nextGuess;
    }

}

/* OUTPUT
Enter a positive double value:
23
4.795831523312719

Enter a positive double value:
64
8.

Enter a positive double value:
256
16.0

*/