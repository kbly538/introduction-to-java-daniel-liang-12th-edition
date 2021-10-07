/*
(Replace text) Listing 12.16, ReplaceText.java, gives a program that replaces
text in a source file and saves the change into a new file. Revise the program to
save the change into the original file. For example, invoking
java Exercise12_16 file oldString newString
replaces oldString in the source file with newString.
 */
package Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println(
                    "Usage: java ReplaceText dir oldString newString"
            );
        }

        String directoryPath = "D:\\intelij-workspace\\introduction-to-java-daniel-liang-12th-edition\\src\\Chapter12\\ExceptionHandlingTextIO\\exercises\\" + args[0] + "\\";
        File directory = new File(directoryPath);
        String[] dirs = directory.list();


        for (int i = 0; i < dirs.length; i++) {
            File file = new File(directoryPath + dirs[i]);
            if (!file.exists()) {
                System.out.println("The file does not exist.");
                System.exit(1);
            }

            String newText = "";

            try (Scanner input = new Scanner(file)) {

                String tempString = "";
                String oldString = args[1];
                String newString = args[2];
                while (input.hasNext()) {
                    tempString = input.nextLine();
                    String finalString = tempString.replaceAll(oldString, newString);
                    newText += finalString + "\r\n";
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            try (PrintWriter output = new PrintWriter(file)) {
                output.print(newText);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }


    }
}
