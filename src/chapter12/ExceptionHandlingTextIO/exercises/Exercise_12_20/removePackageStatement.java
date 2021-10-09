package chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class removePackageStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 34; i++) {
            String dirName = "chapter" + i;
            String sourceName = "\\Exercise_" + i + ".java";
            File file = new File("" +
                    "D:\\intelij-workspace\\introduction-to-java-daniel-liang-12th-edition\\src\\Chapter12\\ExceptionHandlingTextIO\\exercises\\Exercise_12_20\\srcRootDirectory\\" + dirName + sourceName);
            String newFileContent = "";
            try (Scanner input = new Scanner(file)) {

                while (input.hasNext()) {
                    String nextLine = input.nextLine();
                    if (!nextLine.startsWith("package"))
                        newFileContent += input.nextLine();
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            ;

            try (PrintWriter printWriter = new PrintWriter(file)) {
                printWriter.println(newFileContent);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
