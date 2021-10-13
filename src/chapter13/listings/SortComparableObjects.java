/* Listing 13.8 */
package chapter13.listings;

import java.math.BigInteger;
import java.util.Arrays;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        Arrays.sort(cities);
        for (String city : cities) {
            System.out.println(city + " ");
        }
        System.out.println();

        BigInteger[] hugeNumbers = {new BigInteger("21736712763812678312"),
                new BigInteger("12938712983718237182"),
                new BigInteger("89218371237162321387127631")};
        Arrays.sort(hugeNumbers);
        for (BigInteger bigInteger : hugeNumbers) {
            System.out.println(bigInteger + " ");
        }
    }
}
