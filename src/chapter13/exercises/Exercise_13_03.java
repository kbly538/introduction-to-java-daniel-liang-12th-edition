/*
(Sort ArrayList) Write the following method that sorts an ArrayList of numbers:
public static void sort(ArrayList<Number> list)
 */
package chapter13.exercises;

import java.math.BigInteger;
import java.util.ArrayList;

public class Exercise_13_03 {
    public static void main(String[] args) {
        ArrayList<Number> doubleList = new ArrayList<>();
        doubleList.add(1d);
        doubleList.add(2d);
        doubleList.add(3d);
        doubleList.add(4d);
        doubleList.add(5d);

        System.out.println(doubleList);
        shuffle(doubleList);
        System.out.println(doubleList);
        sort(doubleList);
        System.out.println(doubleList);

        ArrayList<Number> hugeNumberList = new ArrayList<>();
        hugeNumberList.add(new BigInteger("1"));
        hugeNumberList.add(new BigInteger("123213"));
        hugeNumberList.add(new BigInteger("4321431241234"));
        hugeNumberList.add(new BigInteger("542185341534376877712"));
        hugeNumberList.add(new BigInteger("94218376834151345134513512"));
        System.out.println(hugeNumberList);
        shuffle(hugeNumberList);
        System.out.println(hugeNumberList);
        sort(hugeNumberList);
        System.out.println(hugeNumberList);


    }

    public static void shuffle(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int) (Math.random() * list.size());
            Number temp = list.get(randomIndex);
            list.set(randomIndex, list.get(0));
            list.set(0, temp);
        }

    }

    /* EXERCISE HERE */

    public static void sort(ArrayList<Number> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            Number currentMin = list.get(i);
            int currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin.doubleValue() > list.get(j).doubleValue()) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);
            }


        }

    }


}

/* OUTPUT
[1.0, 2.0, 3.0, 4.0, 5.0]
[5.0, 2.0, 1.0, 3.0, 4.0]
[1.0, 2.0, 3.0, 4.0, 5.0]

[1, 123213, 4321431241234, 542185341534376877712, 94218376834151345134513512]
[542185341534376877712, 4321431241234, 123213, 1, 94218376834151345134513512]
[1, 123213, 4321431241234, 542185341534376877712, 94218376834151345134513512]
 */