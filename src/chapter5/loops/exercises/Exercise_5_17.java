/*
(Display pyramid) Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid
 */

package chapter5.loops.exercises;

import java.util.Scanner;

public class Exercise_5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer from 1 to 15: ");
        int layers = input.nextInt();

        for (int i = 1; i <= layers; i++) {
            for (int j = layers - i; j >= 1; j--) {
                System.out.printf("%4s", " ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.printf("%4d", j);
            }

            for (int j = 2; i >= j; j++) {
                System.out.printf("%4d", j);
            }

            System.out.println();
        }


    }
}