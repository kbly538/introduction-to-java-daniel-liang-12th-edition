/*
(Occurrences of each letter) Write a program that prompts the user to enter a
file name and displays the occurrences of each letter in the file. Letters are case
insensitive.
 */
package Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class OccurenceCounter {
    public static void main(String[] args) {
        System.out.println("Ente file name: ");
        String fileName = new Scanner(System.in).nextLine();
        String rootPath = "src/Chapter12/ExceptionHandlingTextIO/exercises/Exercise_12_30/";

        File file = new File(rootPath + fileName);
        if (!file.exists()) {
            System.out.println("No such file.");
            System.exit(0);
        }

        try (Scanner fileReader = new Scanner(file)) {
            int[] letters = new int[26];
            while (fileReader.hasNext()) {
                String currentLine = fileReader.nextLine().toUpperCase(Locale.ROOT);
                for (int i = 0; i < currentLine.length(); i++) {
                    char ch = currentLine.charAt(i);
                    if (Character.isAlphabetic(ch))
                        letters[(int) (ch - 65)]++;
                }


            }

            for (int i = 0; i < letters.length; i++) {
                System.out.println("Number of " + Character.toUpperCase((char) (i + 97)) + "'s" + ": " + letters[i]);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
