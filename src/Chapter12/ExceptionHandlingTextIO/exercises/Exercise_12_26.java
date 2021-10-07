/*
(Create a directory) Write a program that prompts the user to enter a directory
name and creates a directory using the File’s mkdirs method. The program
displays the message “Directory created successfully” if a directory is created
or “Directory already exists” if the directory already exists.
 */
package Chapter12.ExceptionHandlingTextIO.exercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise_12_26 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\intelij-workspace\\introduction-to-java-daniel-liang-12th-edition\\src\\Chapter12\\ExceptionHandlingTextIO\\exercises\\Exercise_12_27\\TestFilesDirectory\\ChapterTest";
        File file = new File(path);
        if (file.exists()) {
            System.out.println("File already exists");
        } else {
            file.mkdir();
            System.out.println("File created successfully");
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                String fileName = "Exercise" + i + "_" + j + ".java";
                File srcFile = new File(path + "\\" + fileName);
                srcFile.createNewFile();
                System.out.println("Source files created successfully.");

                try (PrintWriter output = new PrintWriter(srcFile)) {
                    output.println("package Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_27.TestFilesDirectory.ChapterTest;");
                    output.println("public class Exercise" + i + "_" + j + " {");
                    output.println("\r\n");
                    output.println("}");

                }
            }


        }

    }
}
