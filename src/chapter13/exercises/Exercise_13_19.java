/*
(Convert decimals to fractions) Write a program that prompts the user to enter a
decimal number and displays the number in a fraction. (Hint: read the decimal
number as a string, extract the integer part and fractional part from the string, and
use the Rational class in Listing 13.13 to obtain a rational number for the decimal
number.)
 */
package chapter13.exercises;

import chapter13.listings.RationalNumber.Rational;

import java.util.Scanner;

public class Exercise_13_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.println("Enter a decimal number: ");
        String[] terms = input.next().split(",");

        // Parse input
        boolean isNegative = terms[0].charAt(0) == '-';
        int integerPart = Integer.parseInt(isNegative ? terms[0].split("-")[1] : terms[0]);
        int fractionPart = Integer.parseInt(terms[1]);
        double fractionPartDenominator = Math.pow(10, terms[1].length());

        // Create decimal number
        Rational r = new Rational(integerPart * (int) fractionPartDenominator + fractionPart, (int) fractionPartDenominator);
        r = isNegative ? (new Rational(-1, 1).multiply(r)) : r;
        System.out.println("The fraction number is: " + r);

    }
}

/* OUTPUT
Enter a decimal number:
3,25
The fraction number is: 13/4


Enter a decimal number:
-0,45452
The fraction number is: -11363/25000





 */