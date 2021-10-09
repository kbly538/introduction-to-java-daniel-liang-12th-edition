/*
(Process scores in a text file) Suppose a text file contains an unspecified
number
of scores separated by spaces. Write a program that prompts the user to
enter the file, reads the scores from the file, and displays their total and average.
 */
package chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcessScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file: ");
        String fileName = input.nextLine();

        File file = new File("D:\\intelij-workspace\\introduction-to-java-daniel-liang-12th-edition\\src\\Chapter12\\ExceptionHandlingTextIO\\exercises\\Exercise_12_14\\" + fileName);
        if (!file.exists()) {
            System.out.println("File doesn't exist.");
            System.exit(2);
        }

        try (
                Scanner scoresText = new Scanner(file);
        ) {

            double sum = 0;
            double numberOfScores = 0;
            while (scoresText.hasNext()) {
                double score = scoresText.nextDouble();
                sum += score;
                numberOfScores++;

            }

            System.out.println("The average is: " + sum / numberOfScores);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}

/**
 * Enter file:
 * testProcessScores.txt
 * The average is: 269.725
 */