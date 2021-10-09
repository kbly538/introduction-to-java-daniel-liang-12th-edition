package chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_27;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceWords {
    public static void main(String[] args) {

        String path = "src/Chapter12/ExceptionHandlingTextIO/exercises/Exercise_12_27/TestFilesDirectory/ChapterTest";
        File srcDirectory = new File(path);
        System.out.println(srcDirectory.isDirectory());
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 1; j++) {
                File srcFile = new File(path + "/" + "Exercise0" + i + "0" + j);
                String newSrcFile = "";
                try (Scanner input = new Scanner(srcFile)) {
                    while (input.hasNext()) {
                        String oldString = "Exercise" + i + "_" + j;
                        String newString = "Exercise0" + i + "0" + j;

                        String currentLine = input.nextLine();
                        if (currentLine.contains(oldString)) {
                            currentLine.replaceAll(oldString, newString);
                            newSrcFile += newString + "\r\n";
                        } else {
                            newSrcFile += currentLine + "\r\n";
                        }
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                try (PrintWriter output = new PrintWriter(srcFile)) {
                    output.print(newSrcFile);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
