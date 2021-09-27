/*
(Process a string) Write a program that prompts the user to enter a string and
displays its length and its first character.
 */
package chapter04.mathcharstring.exercises;

import java.util.Scanner;

public class Exercise_4_20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        System.out.println("Length of the string " + str.length());
        System.out.println("First character is " + str.charAt(0));
        input.close();
    }
}
