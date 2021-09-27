/*
(Count vowels and consonants) Assume that the letters A, E, I, O, and U are vowels.
Write a program that prompts the user to enter a string, and displays the
number of vowels and consonants in the string.
 */

package chapter05.loops.exercises;


import java.util.Scanner;

public class Exercise_5_49 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine().toLowerCase();
        int numberOfVowels = 0;
        int numberOfConsonants = 0;

        for (int i = 0; i < s.length(); i++) {
            String subString = s.substring(i, i + 1);

            if (!subString.isBlank()) {
                if (subString.contains("a")
                        || subString.contains("e")
                        || subString.contains("o")
                        || subString.contains("i")
                        || subString.contains("u")) {

                    numberOfVowels++;
                } else {
                    numberOfConsonants++;
                }
            }
        }

        System.out.println("The number of vowels is " + numberOfVowels);
        System.out.println("The number of consonants is : " + numberOfConsonants);

    }
}

/* OUTPUT
Enter a string: fun is programming
The number of vowels is 5
The number of consonants is : 11

*/