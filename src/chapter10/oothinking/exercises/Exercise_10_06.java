/*
(Display the prime numbers) Write a program that displays all the prime numbers
less than 120 in decreasing order. Use the StackOfIntegers class to
store the prime numbers (e.g., 2, 3, 5, . . . ) and retrieve and display them in
reverse order.
 */
package chapter10.oothinking.exercises;

import chapter10.oothinking.exercises.Exercise_10_03.MyInteger;
import chapter10.oothinking.listings.StackOfIntegers.StackOfIntegers;

import java.util.Scanner;

public class Exercise_10_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 2; i < 120; i++) {
            if (MyInteger.isPrime(new MyInteger(i)))
                stack.push(i);
        }
        System.out.println("Prime numbers less than 120 are ");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }


    }
}

/* OUTPUT
Prime numbers less than 120 are
113 109 107 103 101 97 89 83 79 73 71 67 61 59 53 47 43 41 37 31 29 23 19 17 13 11 7 5 3 2
 */
