/*
(Process scores in a text file on the Web) Suppose the text file on the Web
http://liveexample.pearsoncmg.com/data/Scores.txt contains an unspecified
number of scores separated by spaces. Write a program that reads the scores
from the file and displays their total and average.
 */
package Chapter12.ExceptionHandlingTextIO.exercises;


import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class Exercise_12_23 {
    public static void main(String[] args) throws IOException {

        URL url = new URL("http://liveexample.pearsoncmg.com/data/Scores.txt");

        try (Scanner input = new Scanner(url.openStream())) {
            double sum = 0;
            int numberOfScores = 0;
            while (input.hasNext()) {
                numberOfScores++;
                sum += input.nextDouble();
            }

            System.out.println("The average is " + sum / numberOfScores);
        }
    }
}

/* OUTPUT
The average is 33.333333333333336
 */
