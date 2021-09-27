/*
(Count single digits) Write a program that generates 100 random integers between
0 and 9 and displays the count for each number. (Hint: Use an array of 10 integers,
say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
*/
package chapter07.arrays1d.exercises;

public class Exercise_07_07 {
    public static void main(String[] args) {
        int[] digitList = new int[10];

        for (int i = 0; i < 100; i++) {
            int randomInteger = (int) (Math.random() * 100);
            digitList[randomInteger % 10]++;
            digitList[randomInteger / 10]++;

        }

        for (int i = 0; i < digitList.length; i++) {
            System.out.printf("Number %d : %d times\n", i, digitList[i]);
        }
    }

}

/*
Number 0 : 24 times
Number 1 : 20 times
Number 2 : 26 times
Number 3 : 15 times
Number 4 : 12 times
Number 5 : 16 times
Number 6 : 23 times
Number 7 : 20 times
Number 8 : 22 times
Number 9 : 22 times
 */