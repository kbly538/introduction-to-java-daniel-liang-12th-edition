/*
(Process string) Write a program that prompts the user to enter a string and displays
the characters at odd positions.
 */

package chapter5.loops.exercises;

import java.util.Scanner;

public class Exercise_5_48 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();

        for (int i = 0; i <= s.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(s.charAt(i));
            }
        }

    }
}

/* OUTPUT
Enter a string:
Beijing Chicago
BiigCiao
*/