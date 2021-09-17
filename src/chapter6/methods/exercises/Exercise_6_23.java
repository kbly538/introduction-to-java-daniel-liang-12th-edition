/*
(Occurrences of a specified character) Write a method that finds the number of
occurrences of a specified character in a string using the following header:
public static int count(String str, char a)
For example, count("Welcome", 'e') returns 2. Write a test program that
prompts the user to enter a string followed by a character then displays the
number of occurrences of the character in the string.
 */
package chapter6.methods.exercises;


import java.util.Scanner;

public class Exercise_6_23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        System.out.println("Enter a character: ");
        String ch = input.next();

        System.out.println("Number of '" + ch.charAt(0) + "'s in the string is " + count(s, ch.charAt(0)));

    }

    public static int count(String str, char a) {
        int letterCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == a) {
                letterCount++;
            }
        }
        return letterCount;
    }

}

/* OUTPUT
Enter a string:
a random character
Enter a character:
a
Number of 'a's in the string is 4
*/