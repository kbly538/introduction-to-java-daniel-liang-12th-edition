/*
(Count characters, words, and lines in a file) Write a program that will count
the number of characters, words, and lines in a file. Words are separated by
whitespace characters. The file name should be passed as a command-line
argument
 */
package Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountContent {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java CountContent fileName");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File doesn't exist.");
            System.exit(2);
        }

        try (Scanner input = new Scanner(file);
        ) {
            int numberOfChars = 0;
            int numberOfWords = 0;
            int numberOfLines = 0;
            String s;
            while (input.hasNext()) {
                s = input.nextLine();
                numberOfChars += s.length();

                if (!s.isEmpty())
                    for (String word : s.split(" "))
                        numberOfWords++;

                numberOfLines++;
                numberOfChars++; // for line breaks
            }

            System.out.println("File " + file.getName() + " has ");
            System.out.println(numberOfChars + " characters");
            System.out.println(numberOfWords + " words");
            System.out.println(numberOfLines + " lines");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

/**
 * OUTPUT
 * File testProcessScores.txt has
 * 61 characters
 * 17 words
 * 11 lines
 */