/*
(Analyze scores) Write a program that reads an unspecified number of scores and
determines how many scores are above or equal to the average, and how many
scores are below the average. Enter a negative number to signify the end of the
input. Assume the maximum number of scores is 100.
*/
package chapter7.arrays1d.exercises;

import java.util.Scanner;

public class Exercise_07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = 1;
        double[] scores = new double[100];

        int scoresCounter = 0;
        double scoresSum = 0;

        System.out.println("Enter scores: ");
        while (number > 0) {
            number = input.nextDouble();
            if (number > 0) {
                scores[scoresCounter] = number;
                scoresCounter++;
                scoresSum += number;
            }

        }

        double average = scoresSum / scoresCounter;
        int aboveAvgCounter = 0;
        for (double score : scores) {
            if (score > average)
                aboveAvgCounter++;
        }
        System.out.println("Average is: " + average + " Number of scores above average is " + aboveAvgCounter);
    }
}

/*
12 13 14 15 16 17 18 19 10 20 40 39 87 65 67 67 67 78 89 56 45 -1
Average is: 40.666666666666664 Number of scores above average is 9
 */