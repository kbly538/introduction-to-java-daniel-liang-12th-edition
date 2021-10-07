/*
(OutOfMemoryError) Write a program that causes the JVM to throw an
OutOfMemoryError
and catches and handles this error.
 */
package Chapter12.ExceptionHandlingTextIO.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_12_10 {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<>();
            while (true) {

                String randomNumber = (int) (Math.random() * 12312321111L) + "";
                list.add(randomNumber);

            }
        } catch (OutOfMemoryError e) {
            System.out.println("Exceeded heap limit.");
        }


    }
}

/* OUTPUT
Exceeded heap limit.
 */