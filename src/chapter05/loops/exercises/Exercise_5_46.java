/*
(Reverse a string) Write a program that prompts the user to enter a string and
displays the string in reverse order.
 */

package chapter05.loops.exercises;

import java.util.Scanner;

public class Exercise_5_46 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();

        System.out.print("The reversed string is: ");
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}

/* OUTPUT
Enter a string: This one is a reversed string.
The reversed string is: .gnirts desrever a si eno sihT
*/