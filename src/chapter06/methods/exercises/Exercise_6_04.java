/*
(Display an integer reversed) Write a method with the following header to display
an integer in reverse order:

public static void reverse(int number)

For example, reverse(3456) displays 6543. Write a test program that prompts
the user to enter an integer then displays its reversal.
 */
package chapter06.methods.exercises;

import java.util.Scanner;

public class Exercise_6_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        System.out.println(number + " in reversed order is " + reverse(number));

    }

    public static int reverse(int number){
        String reversedNumber = "";
        while (number != 0){
            reversedNumber += number % 10;
            number /= 10;
        }
        return Integer.parseInt(reversedNumber);
    }

}

/* OUTPUT
Enter an integer:
1234
1234 in reversed order is 4321

*/