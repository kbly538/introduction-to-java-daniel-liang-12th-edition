/* Listing 13.5 */
package chapter13.listings;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(45);
        list.add(3445.53);
        list.add(new BigInteger("32432432423423423423432"));
        list.add(new BigDecimal("2.099999999933333129231731823"));

        System.out.println("The largest number is: " +
                getLargestNumber(list));
    }

    private static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0) {
            return null;
        }

        Number number = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (number.doubleValue() < list.get(i).doubleValue())
                number = list.get(i);
        }

        return number;
    }
}
