/*
(Remove text) Write a program that removes all the occurrences of a specified
string from a text file. For example, invoking
java Exercise12_11 John filename
removes the string John from the specified file. Your program should get the
arguments from the command line.
 */
package Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveText {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java RemoveText str fileName");
            System.exit(1);
        }

        File file = new File(args[1]);
        if (!file.exists()) {
            System.out.println("File doesn't exist.");
            System.exit(2);
        }

        try (
                Scanner input = new Scanner(file);

        ) {
            String newTxt = "";
            while (input.hasNext()) {
                String nextWord = input.next();
                if (!nextWord.equals(args[0])) {
                    newTxt += nextWord + " ";
                }
            }
            PrintWriter output = new PrintWriter(file);
            output.print(newTxt);
            output.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

/**
 * OUTPUT
 * srcFile: two one one one one one one two one one one one two one one one
 * resulting file: two two two
 */