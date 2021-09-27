/*
(Sum the digits in an integer) Write a method that computes the sum of the digits
in an integer. Use the following method header:
public static int sumDigits(long n)
For example, sumDigits(234) returns 9 (= 2 + 3 + 4). (Hint: Use the % operator
to extract digits and the / operator to remove the extracted digit. For instance,
to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use
234 / 10 (= 23). Use a loop to repeatedly extract and remove the digit until
all the digits are extracted. Write a test program that prompts the user to enter an
integer then displays the sum of all its digits.
 */
package chapter06.methods.exercises;

import java.util.Scanner;

public class Exercise_6_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("Sum of the digits of " + number + " is " + sumDigits(number));

    }

    public static int sumDigits(long number) {
        int sum = 0;
        while (number != 0){
            sum += (number % 10);
            number /= 10;
        }

        return sum;

    }
}

/* OUTPUT
Enter an integer:
1231245
Sum of the digits of 1231245 is 18
 */