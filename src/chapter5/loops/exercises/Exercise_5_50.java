/*
(Count uppercase letters) Write a program that prompts the user to enter a string
and displays the number of the uppercase letters in the string.
 */

package chapter5.loops.exercises;


import java.util.Scanner;

public class Exercise_5_50 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        int numberOfUppers = 0;
        for (int i = 0; i < s.length(); i++) {

            if (Character.isUpperCase(s.charAt(i))) {
                numberOfUppers++;
            }
        }

        System.out.println("Number of upper case chars is: " + numberOfUppers);


    }
}

/* OUTPUT
Enter a string:
Welcome to Java
Number of upper case chars is: 2

*/