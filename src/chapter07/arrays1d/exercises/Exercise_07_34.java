/*
(Sort characters in a string) Write a method that returns a sorted string using the
following header:
public static String sort(String s)
For example, sort("acb") returns abc.
Write a test program that prompts the user to enter a string and displays the sorted
string.
*/
package chapter07.arrays1d.exercises;

import java.util.Scanner;

public class Exercise_07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = input.nextLine().toLowerCase();
        System.out.println(sort(s));

    }

    public static String sort(String s) {
        char[] str = s.toCharArray();
        String result = "";
        boolean completed = true;
        for (int i = 1; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (str[j - 1] > str[j]) {
                    char temp = str[j - 1];
                    str[j - 1] = str[j];
                    str[j] = temp;
                    i = 1;
                    completed = false;
                    break;
                }
                completed = true;
            }
            if (completed) {
                for (int j = 0; j < str.length; j++) {
                    result += str[j];
                }
                return result.trim();

            } else {
                i = 0;
            }
        }
        return result;
    }

}

/* OUTPUT
Enter a string:
this is gonna be sorted
abdeeghiinnoorssstt
 */