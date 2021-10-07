/*
(Reformat Java source code) Write a program that converts the Java source
code from the next-line brace style to the end-of-line brace style. For example,
the following Java source in (a) uses the next-line brace style. Your program
converts it to the end-of-line brace style in (b).
Your program can be invoked from the command line with the Java source-code
file as the argument. It converts the Java source code to a new format. For example,
the following command converts the Java source-code file Test.java to
the end-of-line brace style.
java Exercise12_12 Test.java
 */
package Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReformatJavaSourceCode {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ReformatJavaSourceCode fileName");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File doesn't exist.");
            System.exit(2);
        }

        try (
                Scanner input = new Scanner(file);

        ) {
            String newSourceCode = "";
            while (input.hasNext()) {
                String currentLine = input.nextLine();
                String currentLineInspected = currentLine.trim();
                if (!currentLine.isEmpty() && currentLineInspected.charAt(0) == '{') {
                    newSourceCode += " {";
                    if (currentLine.length() <= 1)
                        newSourceCode += "\r\n";
                } else if (!newSourceCode.isEmpty()) {
                    newSourceCode += "\r\n" + currentLine;
                } else
                    newSourceCode += currentLine;

            }
            PrintWriter output = new PrintWriter(file);
            output.print(newSourceCode);
            output.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

/**
 * OUTPUT
 * package Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_12;
 * <p>
 * public class SourceCodeToReformat {
 * <p>
 * public static void main(String[] args) {
 * // Some statements...
 * // Some more statements....
 * }
 * <p>
 * }
 */