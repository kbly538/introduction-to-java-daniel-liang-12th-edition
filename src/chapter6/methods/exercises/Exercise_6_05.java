/*
(Sort three numbers) Write a method with the following header to display three
numbers in increasing order:

public static void displaySortedNumbers(
double num1, double num2, double num3)

Write a test program that prompts the user to enter three numbers and invokes the
method to display them in increasing order.
 */
package chapter6.methods.exercises;

import java.util.Scanner;

public class Exercise_6_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        displaySortedNumbers(number1, number2, number3);
    }

    public static void displaySortedNumbers(
            double num1, double num2, double num3){
        if (num1 < num2){
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 < num3){
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 < num2){
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("Numbers in decreasing order are: " + num1 + " > " + num2 + " > " + num3);
    }

}

/* OUTPUT
Enter three integers:
2 2 3
Numbers in decreasing order are: 3.0 > 2.0 > 2.0

Enter three integers:
2314 32  2
Numbers in decreasing order are: 2314.0 > 32.0 > 2.0

*/