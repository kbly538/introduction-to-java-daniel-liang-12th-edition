/*
(Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are
closed on the first day of school. As the students enter, the first student, denoted
as S1, opens every locker. Then the second student, S2, begins with the second
locker, denoted as L2, and closes every other locker. Student S3 begins with the
third locker and changes every third locker (closes it if it was open and opens it if
it was closed). Student S4 begins with locker L4 and changes every fourth locker.
Student S5 starts with L5 and changes every fifth locker, and so on, until student
S100 changes L100.
After all the students have passed through the building and changed the lockers,
which lockers are open? Write a program to find your answer and display all open
locker numbers separated by exactly one space.
(Hint: Use an array of 100 Boolean elements, each of which indicates whether a
locker is open (true) or closed (false). Initially, all lockers are closed.)

*/
package chapter7.arrays1d.exercises;

import java.util.Arrays;

public class Exercise_07_23 {
    public static void main(String[] args) {
        boolean[] doors = new boolean[100];
        int numOfStudents = 100;
        for (int i = 1; i < numOfStudents + 1; i++) {
            for (int j = i - 1; j < doors.length; j += i) {
                if (doors[j] == true)
                    doors[j] = false;
                else
                    doors[j] = true;
            }
        }

        System.out.println(Arrays.toString(doors));

        for (int i = 0; i < doors.length; i++) {
            if (doors[i] == true) {
                System.out.print((i + 1) + " ");
            }
        }
    }

}

/* OUTPUT
1 4 9 16 25 36 49 64 81 100
 */