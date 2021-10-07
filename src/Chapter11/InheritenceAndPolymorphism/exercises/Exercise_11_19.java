/*
(Bin packing using first fit) The bin packing problem is to pack the objects of various
weights into containers. Assume each container can hold a maximum of 10
pounds. The program uses an algorithm that places an object into the first bin in
which it would fit. Your program should prompt the user to enter the total number
of objects and the weight of each object. The program displays the total number
of containers needed to pack the objects and the contents of each container.
 */
package Chapter11.InheritenceAndPolymorphism.exercises;


import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_19 {
    public static void main(String[] args) {

        final int CONTAINER_LIMIT = 10;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of objects: ");
        int numberOfObjects = input.nextInt();

        System.out.println("Enter the weight of the objects: ");
        ArrayList<Integer> weightOfTheObjects = new ArrayList<>();
        for (int i = 0; i < numberOfObjects; i++) {
            weightOfTheObjects.add(input.nextInt());
        }

        ArrayList<ArrayList<Integer>> bins = new ArrayList<>();
        ArrayList<Integer> bin;

        while (!weightOfTheObjects.isEmpty()) {
            bin = new ArrayList<>();
            for (int i = 0; i < weightOfTheObjects.size(); i++) {
                if (binTotal(bin) + weightOfTheObjects.get(i) <= CONTAINER_LIMIT) {
                    bin.add(weightOfTheObjects.get(i));
                    weightOfTheObjects.remove(i);
                    i--;
                }
            }
            bins.add(bin);
        }

        System.out.println(bins);

    }

    public static int binTotal(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

}
/* OUTPUT
Enter the number of objects:
6
Enter the weight of the objects:
7 5 2 3 5 8
[[7, 2], [5, 3], [5], [8]]
 */