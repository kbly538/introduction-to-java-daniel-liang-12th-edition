/*
(InputMismatchException) Write a program that prompts the user to read
two integers and displays their sum. Your program should prompt the user to
read the number again if the input is incorrect.
 */
package chapter12.ExceptionHandlingTextIO.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_12_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int number1;
        int number2;
        int result = 0;
        boolean done = false;

        do {
            try {
                number1 = input.nextInt();
                number2 = input.nextInt();
                result = number1 + number2;
                done = true;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input. Try again.");
                input.nextLine();
            }
            System.out.println("Result is:  " + result);
        } while (!done);


    }
}
/* OUTPUT
Enter two numbers:
A 2
Incorrect input. Try again.
Result is:  0
5 5
Result is:  10
 */