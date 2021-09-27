/*
(Longest common prefix) Write a program that prompts the user to enter two
strings and displays the largest common prefix of the two strings. Here are some
sample runs:
Enter the first string: Welcome to C++
Enter the second string: Welcome to programming
The common prefix is Welcome to

Enter the first string: Atlanta
Enter the second string: Macon
Atlanta and Macon have no common prefix
 */

package chapter05.loops.exercises;


import java.util.Scanner;

public class Exercise_5_51 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String firstString = input.nextLine();

        System.out.println("Enter second string: ");
        String secondString = input.nextLine();

        String commonPrefix = "";
        int condition = firstString.compareTo(secondString) > 0 ? firstString.length() : secondString.length();
        for (int i = 0; i < condition; i++) {
            char ch1 = firstString.charAt(i);
            char ch2 = secondString.charAt(i);
            if (ch1 == ch2) {
                commonPrefix += ch1;
            } else {
                break;
            }
        }

        if (!commonPrefix.isBlank()) {
            System.out.println("The common prefix is: " + commonPrefix);
        } else {
            System.out.println(firstString + " and " + secondString + " have no common prefix.");
        }

    }
}

/* OUTPUT
Enter first string: Plural of the prefix must have been prefice.
Enter second string: Plural of the suffix must have been suffice.
The common prefix is: Plural of the
*/