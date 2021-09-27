/*
(Display the prime factors) Write a program that prompts the user to enter a
positive integer and displays all its smallest factors in decreasing order. For
example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
retrieve and display them in reverse order.
 */
package chapter10.oothinking.exercises;

import chapter10.oothinking.exercises.Exercise_10_03.MyInteger;
import chapter10.oothinking.listings.StackOfIntegers.StackOfIntegers;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Exercise_10_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer to factorize its primes: ");
        int number = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 2; 1 < number; ) {
            if (MyInteger.isPrime(new MyInteger(i)) && number % i == 0) {
                number /= i;
                stack.push(i);
            } else
                i++;
        }
        System.out.println("Prime factors of are ");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

/* OUTPUT
Enter a positive integer to factorize its primes:
120
Prime factors of are
5 3 2 2 2

Enter a positive integer to factorize its primes:
102
Prime factors of are
17 3 2

Enter a positive integer to factorize its primes:
156723
Prime factors of are
439 17 7 3
 */
