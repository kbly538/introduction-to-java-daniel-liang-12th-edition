/*
(Count occurrence of numbers) Write a program that reads the integers between
1 and 100 and counts the occurrences of each. Assume the input ends with 0. Here
is a sample run of the program: Note that if a number occurs more than one time, the
plural word “times” is used in the output. Numbers are displayed in increasing order.
*/
package chapter07.arrays1d.exercises;

import java.util.Scanner;

public class Exercise_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = -1;

        int[] numbers = new int[101];
        while (number != 0) {
            number = input.nextInt();
            numbers[number] += 1;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0 && numbers[i] > 1) {
                System.out.println(i + " occurs " + numbers[i] + " times");
            } else if (numbers[i] != 0) {
                System.out.println(i + " occurs " + numbers[i] + " time");
            }
        }
    }
}

/*
2 5 6 5 4 3 23 43 2 76 54 3 23 75  98 90 76 65 54 56 79 90 90 65 43 32 32 91 19 6 53 0
0 occurs 1 time
2 occurs 2 times
3 occurs 2 times
4 occurs 1 time
5 occurs 2 times
6 occurs 2 times
19 occurs 1 time
23 occurs 2 times
32 occurs 2 times
43 occurs 2 times
53 occurs 1 time
54 occurs 2 times
56 occurs 1 time
65 occurs 2 times
75 occurs 1 time
76 occurs 2 times
79 occurs 1 time
90 occurs 3 times
91 occurs 1 time
98 occurs 1 time
 */