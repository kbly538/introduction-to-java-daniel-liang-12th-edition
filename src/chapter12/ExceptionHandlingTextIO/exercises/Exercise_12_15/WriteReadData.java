/*
(Write/read data) Write a program to create a file named Exercise12_15.txt if
it does not exist. Write 100 integers created randomly into the file using text
I/O. Integers are separated by spaces in the file. Read the data back from the
file and display the data in increasing order.
 */
package chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_15;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class WriteReadData {

    public static void main(String[] args) throws IOException {
        // Create file if it doesn't exist
        File file = new File("D:\\intelij-workspace\\introduction-to-java-daniel-liang-12th-edition\\src\\Chapter12\\ExceptionHandlingTextIO\\exercises\\Exercise_12_15\\Exercise_12_15.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        // Write to file
        try (PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 0; i < 100; i++) {
                int randomNumber = (int) (Math.random() * 1000);
                output.print(randomNumber + " ");
            }

        }

        // Read from file
        try (Scanner input = new Scanner(file)) {
            int[] numbers = new int[100];
            int i = 0;
            while (input.hasNext()) {
                numbers[i++] = Integer.parseInt(input.next());
            }

            Arrays.sort(numbers);

            for (int number : numbers) {
                System.out.println(number + " ");
            }

        }
    }
}
