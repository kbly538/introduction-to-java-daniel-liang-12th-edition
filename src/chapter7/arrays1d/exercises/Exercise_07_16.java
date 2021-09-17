/*
(Execution time) Write a program that randomly generates an array of 100,000
integers and a key. Estimate the execution time of invoking the linearSearch
method in Listing 7.6. Sort the array and estimate the execution time of invoking
the binarySearch method in Listing 7.7. You can use the following code template
to obtain the execution time:
long startTime = System.nanoTime();
perform the task;
long endTime = System.nanoTime();
long executionTime = endTime − startTime;
*/
package chapter7.arrays1d.exercises;


import static chapter7.arrays1d.listings.LinearSearch.linearSearch;
import static chapter7.arrays1d.listings.BinarySearch.binarySearch;

public class Exercise_07_16 {
    public static void main(String[] args) {
        int key = (int) (Math.random() * 100_000); // create a random key

        // create list with a size of 100k;
        int[] list = new int[100_000];
        // fill list with random numbers btwn 0 - 100_000
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100_000);
        }

        long startTime = System.nanoTime();
        linearSearch(list, key);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("Execution time of linear search is: " + executionTime);


        startTime = System.nanoTime();
        binarySearch(list, key);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;

        System.out.println("Execution time of binary search is: " + executionTime);

    }


}

/* OUTPUT
Execution time of linear search is: 2109400
Execution time of binary search is: 780000
 */