/*
(Repeat additions) Listing 5.4, SubtractionQuizLoop.java, generates five
random
subtraction questions. Revise the program to generate 10 random addition
questions for two integers between 1 and 15. Display the correct count and
test time.
 */
package chapter5.loops.exercises;

import java.util.Scanner;

public class Exercise_5_02 {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 10;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {

            int number1 = 1 + (int) (Math.random() * 16);
            int number2 = 1 + (int) (Math.random() * 16);


            System.out.println("What is " + number1 + " + " + number2 + "? ");
            int answer = input.nextInt();

            if (number1 + number2 == answer) {
                System.out.println("Correct.");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong. \n" + number1
                        + " + " + number2 + " should be " + (number1 + number2));

                count++;

                output += "\n" + number1 + " + " + number2 + " = " + answer
                        + ((number1 + number2 == answer) ? " correct" : " wrong");
            }


        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Correct count is " + correctCount +
                "\nTest time is " + testTime / 1000 + " seconds\n " + output);
    }
}
