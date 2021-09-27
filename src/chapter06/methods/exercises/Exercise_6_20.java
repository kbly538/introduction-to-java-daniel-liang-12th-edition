/*
(Count the letters in a string) Write a method that counts the number of letters in
a string using the following header:
public static int countLetters(String s)
Write a test program that prompts the user to enter a string and displays the number
of letters in the string.
 */
package chapter06.methods.exercises;


import java.util.Scanner;

public class Exercise_6_20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();

        System.out.println("Number of letters in the string is " + countLetters(s));

    }

    public static int countLetters(String s){
        int letterCount = 0;
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if (Character.isAlphabetic(ch)){
                letterCount++;
            }
        }
        return letterCount;
    }

}

/* OUTPUT
Enter a string:
house
Number of letters in the string is 5

Enter a string:
3 Houses
Number of letters in the string is 6

Enter a string:
123456!.
Number of letters in the string is 0
*/