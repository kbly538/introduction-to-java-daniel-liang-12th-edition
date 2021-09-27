/*
Palindrome integer) Write the methods with the following headers:

// Return the reversal of an integer, e.g., reverse(456) returns 654
public static int reverse(int number)

// Return true if number is a palindrome
public static boolean isPalindrome(int number)

Use the reverse method to implement isPalindrome. A number is a palindrome
if its reversal is the same as itself. Write a test program that prompts the
user to enter an integer and reports whether the integer is a palindrome.
 */
package chapter06.methods.exercises;

import java.util.Scanner;

public class Exercise_6_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        if (isPalindrome(number))
            System.out.println(number + " is a palindrome." );
        else
            System.out.println(number + " is not a palindrome.");

    }

    public static int reverse(int number){
        String reversedNumber = "";
        while (number != 0){
            reversedNumber += number % 10;
            number /= 10;
        }
        return Integer.parseInt(reversedNumber);
    }
    public static boolean isPalindrome(int number){
        return number == reverse(number)? true: false;
    }
}

/* OUTPUT
Enter an integer:
165273
165273 is not a palindrome.

Enter an integer:
123321
123321 is a palindrome.

*/