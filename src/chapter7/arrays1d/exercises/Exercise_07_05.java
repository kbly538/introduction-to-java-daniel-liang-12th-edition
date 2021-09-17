/*
(Print distinct numbers) Write a program that reads in 10 numbers and displays the
number of distinct numbers and the distinct numbers in their input order and separated
by exactly one space (i.e., if a number appears multiple times, it is displayed
only once). (Hint: Read a number and store it to an array if it is new. If the number is
already in the array, ignore it.) After the input, the array contains the distinct numbers.
*/
package chapter7.arrays1d.exercises;

import java.util.Scanner;

public class Exercise_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[10];

        int distinctScores = 0;

        System.out.println("Enter 10 scores: ");
        for (int i = 0; i < 10; i++) {
            int score = input.nextInt();
            boolean isSeen = false;
            for (int j = 0; j < scores.length; j++) {
                if (scores[j] == score) {
                    isSeen = true;
                    break;
                }
            }
            if (!isSeen) {
                scores[i] = score;
                distinctScores++;
            }
        }


        System.out.println("Number of distinct scores: " + distinctScores);
        System.out.print("Distinc scores are : ");
        for (int score : scores) {
            if (score != 0) {
                System.out.print(score + " ");
            }
        }
    }
}

/*

 */