/*
(Check substring) Write a program that prompts the user to enter two strings, and
reports whether the second string is a substring of the first string.
 */
package chapter4.mathcharstring.exercises;

import java.util.Scanner;

public class Exercise_4_22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String str1 = input.next();
        String str2 = input.next();
        input.close();

        boolean isSubstring = str1.contains(str2);

        if (isSubstring) {
            System.out.println(str2 + " is a substring of " + str1);
        } else {
            System.out.println(str2 + " is not a substring of " + str1);
        }
    }
}
