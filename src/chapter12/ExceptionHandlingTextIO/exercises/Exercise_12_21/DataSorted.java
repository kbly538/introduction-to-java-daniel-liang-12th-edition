package chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataSorted {
    public static void main(String[] args) {
        String path = "src/Chapter12/ExceptionHandlingTextIO/exercises/Exercise_12_21/SortedString.txt";
        File file = new File(path);

        try (Scanner input = new Scanner(file)) {

            String current = "";
            String next = "";
            while (input.hasNext()) {
                current = input.next().trim();
                if (input.hasNext()) {
                    next = input.next().trim();
                }
                if ((current.compareTo(next)) > 0) {
                    System.out.println(current + " and " + next + " are out of order.");
                    System.exit(1);
                }

            }
            System.out.println("No out of order words in the list.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


/* OUTPUT
....
arachnid
clip
bill
clips
clock
clocks
.....

clip and bill are out of order.


....
arachnid
bill
clip
clips
clock
clocks
.....

No out of order words in the list.
 */