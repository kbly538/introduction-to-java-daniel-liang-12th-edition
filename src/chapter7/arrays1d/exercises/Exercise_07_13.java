/*
(Random number chooser) Write the following method that returns a random
number between start and end, excluding the numbers.

public static int getRandom(int start, int end, int... numbers)

For example, invoking getRandom(1,100,4,8,95,93) returns a random number
between 1 and 100 excluding 4,8,95,and 93. Write a test program that
invokes getRandom(1,100,4,8,95,93) 45 times and displays the resulting
numbers 15 per line using the format %4d.
*/
package chapter7.arrays1d.exercises;

public class Exercise_07_13 {
    public static void main(String[] args) {

        for (int i = 1; i <= 45; i++) {
            System.out.printf("%4d", getRandom(1, 100, 4, 8, 95, 93));
            if (i % 15 == 0)
                System.out.println();
        }

    }

    public static int getRandom(int start, int end, int... numbers) {
        boolean isInNumbers = false;
        boolean keepLoking = true;
        int number = -1;
        while (keepLoking) {
            isInNumbers = false;
            number = start + 1 + (int) (Math.random() * (end - start - 1));
            for (int i = 0; i < numbers.length; i++) {
                if (number == numbers[i])
                    isInNumbers = true;
            }
            if (isInNumbers == false) {
                keepLoking = false;
            }
        }

        return number;
    }
}

/* OUTPUT
  34  88  27  62  48   9  87  31  40  35  58  63  32  57  75
  87   5  20  38  90  33  66  49  81  10   7  27  25  57  39
  13  14  60  32  21  13  78  63  78  79  75  75  50  62  81
 */