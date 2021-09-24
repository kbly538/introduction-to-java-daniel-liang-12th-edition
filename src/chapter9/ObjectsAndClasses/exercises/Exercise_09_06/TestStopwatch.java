/*
(Stopwatch) Design a class named StopWatch. The class contains:
■■ Private data fields startTime and endTime with getter methods.
■■ A no-arg constructor that initializes startTime with the current time.
■■ A method named start() that resets the startTime to the current time.
■■ A method named stop() that sets the endTime to the current time.
■■ A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.
Draw the UML diagram for the class then implement the class. Write a test program
that measures the execution time of sorting 100,000 numbers using selection sort.
*/
package chapter9.ObjectsAndClasses.exercises.Exercise_09_06;

import chapter7.arrays1d.listings.SelectionSort;

import java.util.Arrays;

public class TestStopwatch {
    public static void main(String[] args) {
        int numberOfElements = 1_000_000;
        int[] numbers = new int[numberOfElements];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100_000);
        }

        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        SelectionSort.selectionSort(numbers);
        stopwatch.stop();

        System.out.println("The selection sort took " + stopwatch.getElapsedTime()
                + " seconds for " + numberOfElements + " elements.");
    }
}

/* OUTPUT
The selection sort took 367 second for 1 million elements.
 */