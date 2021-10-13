/*
(Shuffle ArrayList) Write the following method that shuffles an ArrayList of
numbers:
public static void shuffle(ArrayList<Number> list)
 */
package chapter13.exercises;

import java.math.BigInteger;
import java.util.ArrayList;

public class Exercise_13_02 {
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

        ArrayList<Number> hugeNumberList = new ArrayList<>();
        hugeNumberList.add(new BigInteger("4218376812"));
        hugeNumberList.add(new BigInteger("142183768123324"));
        hugeNumberList.add(new BigInteger("242183768162"));
        hugeNumberList.add(new BigInteger("54218376877712"));
        hugeNumberList.add(new BigInteger("94218376812"));
        System.out.println(hugeNumberList);
        shuffle(hugeNumberList);
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

}

/* OUTPUT
[1.0, 2.0, 3.0, 4.0, 5.0]
[1.0, 4.0, 3.0, 2.0, 5.0]

[4218376812, 142183768123324, 242183768162, 54218376877712, 94218376812]
[142183768123324, 54218376877712, 242183768162, 4218376812, 94218376812]

 */