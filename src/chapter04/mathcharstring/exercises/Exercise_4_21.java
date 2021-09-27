/*
(Check SSN) Write a program that prompts the user to enter a Social Security
number in the format DDD-DD-DDDD, where D is a digit. Your program should
check whether the input is valid.
 */
package chapter04.mathcharstring.exercises;

import java.util.Scanner;

public class Exercise_4_21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a social security number (1234-56-7890): ");
        String ssn = input.nextLine();
        input.close();

        if (ssn.length() == 12) {
            char digit1 = ssn.charAt(0);
            char digit2 = ssn.charAt(1);
            char digit3 = ssn.charAt(2);
            char digit4 = ssn.charAt(3);
            char separator1 = ssn.charAt(4);
            char digit5 = ssn.charAt(5);
            char digit6 = ssn.charAt(6);
            char separator2 = ssn.charAt(7);
            char digit7 = ssn.charAt(8);
            char digit8 = ssn.charAt(9);
            char digit9 = ssn.charAt(10);
            char digit10 = ssn.charAt(11);

            if (Character.isDigit(digit1)
                    && Character.isDigit(digit2)
                    && Character.isDigit(digit3)
                    && Character.isDigit(digit4)
                    && separator1 == '-'
                    && Character.isDigit(digit5)
                    && Character.isDigit(digit6)
                    && separator2 == '-'
                    && Character.isDigit(digit7)
                    && Character.isDigit(digit8)
                    && Character.isDigit(digit9)
                    && Character.isDigit(digit10)) {
                System.out.println("The SSN is valid.");
            } else {
                System.out.println("The SSN is invalid.");
            }
        } else {
            System.out.println("Invalid SSN format.");
        }
    }
}
