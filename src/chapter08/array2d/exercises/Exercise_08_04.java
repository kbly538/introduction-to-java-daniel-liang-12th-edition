/*
(Compute the weekly hours for each employee) Suppose the weekly hours for all
employees are stored in a two-dimensional array. Each row records an employee’s
seven-day work hours with seven columns. For example, the following array
stores the work hours for eight employees. Write a program that displays employees
and their total hours in decreasing order of the total hours.
 */
package chapter08.array2d.exercises;

import java.util.Arrays;

public class Exercise_08_04 {
    public static void main(String[] args) {
        int[][] weeklyHoursTable = {{2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 7, 4, 8, 3, 8, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};


        int[] employee = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] totalHours = new int[8];


        for (int i = 0; i < weeklyHoursTable.length; i++) {
            int sum = 0;
            for (int j = 0; j < weeklyHoursTable[0].length; j++) {
                sum += weeklyHoursTable[i][j];
            }
            totalHours[i] = sum;
        }

        System.out.println(Arrays.toString(totalHours));
        System.out.println(Arrays.toString(employee) + " ");

        sortEmployees(totalHours, employee);

        for (int i = employee.length - 1; i >= 0; i--) {
            System.out.println("Employee # " + employee[i] + " has got " + totalHours[i] + " hours.");
        }

    }

    public static void sortEmployees(int[] totalHours, int[] indexList) {
        // Current max
        int currentMax;
        int currentMaxIndex;

        for (int i = totalHours.length - 1; i >= 1; i--) {
            currentMax = totalHours[i];
            currentMaxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < totalHours[j]) {
                    currentMax = totalHours[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                totalHours[currentMaxIndex] = totalHours[i];
                totalHours[i] = currentMax;

                int temp = indexList[i];
                indexList[i] = indexList[currentMaxIndex];
                indexList[currentMaxIndex] = temp;


            }
        }

    }
}


/* OUTPUT
Employee # 8 has got 41 hours.
Employee # 7 has got 37 hours.
Employee # 6 has got 37 hours.
Employee # 1 has got 34 hours.
Employee # 5 has got 32 hours.
Employee # 4 has got 31 hours.
Employee # 2 has got 28 hours.
Employee # 3 has got 20 hours.
* */