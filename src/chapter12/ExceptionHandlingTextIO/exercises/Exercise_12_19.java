/*
(Count words) Write a program that counts the number of words in President
Abraham Lincoln’s Gettysburg address from https://liveexample.pearsoncmg
.com/data/Lincoln.txt.
 */
package chapter12.ExceptionHandlingTextIO.exercises;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Exercise_12_19 {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://liveexample.pearsoncmg.com/data/Lincoln.txt");

        try (Scanner input = new Scanner(url.openStream())) {
            int numberOfWords = 0;

            while (input.hasNext()) {
                String line = input.nextLine();
                for (String s : line.split(" ")) {
                    numberOfWords++;
                }
            }
            System.out.println("Number of words: " + numberOfWords);
        }
    }
}
