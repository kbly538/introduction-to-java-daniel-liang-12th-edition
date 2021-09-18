/*
(Math: combinations) Write a program that prompts the user to enter 10 integers
and displays all combinations of picking two numbers from the 10 numbers.
*/
package chapter7.arrays1d.exercises;

import java.util.Scanner;

public class Exercise_07_28 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (i != j)
                    System.out.print("(" + numbers[i] + " " + numbers[j] + ") ");
            }
            System.out.println();
        }

    }
}

/* OUTPUT
(1 2) (1 3) (1 4) (1 5) (1 6) (1 7) (1 8) (1 9) (1 10)
(2 3) (2 4) (2 5) (2 6) (2 7) (2 8) (2 9) (2 10)
(3 4) (3 5) (3 6) (3 7) (3 8) (3 9) (3 10)
(4 5) (4 6) (4 7) (4 8) (4 9) (4 10)
(5 6) (5 7) (5 8) (5 9) (5 10)
(6 7) (6 8) (6 9) (6 10)
(7 8) (7 9) (7 10)
(8 9) (8 10)
(9 10)
 */