/*
(Game: bean machine) The bean machine, also known as a quincunx or the Galton
box, is a device for statistics experiments named after English scientist Sir
Francis Galton. It consists of an upright board with evenly spaced nails (or pegs)
in a triangular form, as shown in Figure 7.13 Balls are dropped from the opening of the board. Every time a ball hits a nail, it
has a 50% chance of falling to the left or to the right. The piles of balls are accumulated
in the slots at the bottom of the board.
Write a program that simulates the bean machine. Your program should prompt the
user to enter the number of the balls and the number of the slots in the machine.
Simulate the falling of each ball by printing its path. For example, the path for
the ball in Figure 7.13b is LLRRLLR and the path for the ball in Figure 7.13c is
RLRRLRR. Display the final buildup of the balls in the slots in a histogram. Here
is a sample run of the program:
(Hint: Create an array named slots. Each element in slots stores the number of
balls in a slot. Each ball falls into a slot via a path. The number of Rs in a path is the
position of the slot where the ball falls. For example, for the path LRLRLRR, the ball
falls into slots[4], and for the path RRLLLLL, the ball falls into slots[2].)
*/
package chapter7.arrays1d.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_07_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Number of Balls
        System.out.println("Enter number of balls: ");
        int numberOfBalls = input.nextInt();
        // Number of slots
        System.out.println("Enter number of slots: ");
        int numberOfSlots = input.nextInt();

        int[] slots = new int[numberOfSlots];

        for (int i = 0; i < numberOfBalls; i++) {
            int slotIndex = startMachine(numberOfSlots);
            slots[slotIndex]++;
            System.out.println();
        }

        System.out.println(Arrays.toString(slots));


        System.out.println(getMaxInArray(slots));

        int height = getMaxInArray(slots);
        int max = getMaxInArray(slots);
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < slots.length; i++) {
                if (slots[i] == max) {
                    System.out.print(" O ");
                    slots[i] -= 1;
                } else {
                    System.out.print("   ");
                }
            }
            max--;
            System.out.println();

        }


    }

    public static int startMachine(int numberOfSlots) {
        int slotNumber = 0; // 0 left 1 right
        for (int i = 0; i < numberOfSlots; i++) {
            int direction = (int) (Math.random() * 2); // 0 left 1 right
            if (direction == 1) {
                slotNumber++;
                System.out.print("R");
            } else {
                System.out.print("L");
            }
        }
        return slotNumber;
    }

    public static int getMaxInArray(int[] list) {
        int max = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max)
                max = list[i];
        }
        return max;
    }

    public static boolean isEmptyList(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum == 0;
    }

}

/* OUTPUT
Enter number of balls:
10
Enter number of slots:
10
LLRLRLLLRL
LRRRLLRRLR
LLRRLRLRRR
RLLLRLLRRL
LRRLRLRRRL
LLLRLLLLRL
RLRLRLRLLR
RRLLLRLRRL
LLRRLRLRRL
LRRLLLRRRR
[0, 0, 1, 1, 1, 3, 4, 0, 0, 0]
4
                   O
                O  O
                O  O
       O  O  O  O  O
 */