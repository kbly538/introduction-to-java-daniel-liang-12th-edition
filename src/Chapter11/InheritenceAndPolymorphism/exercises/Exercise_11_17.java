/*
(Algebra: perfect square) Write a program that prompts the user to enter an integer
m and find the smallest integer n such that m * n is a perfect square. (Hint:
Store all smallest factors of m into an array list. n is the product of the factors that
appear an odd number of times in the array list. For example, consider m = 90,
store the factors 2, 3, 3, and 5 in an array list. 2 and 5 appear an odd number of
times in the array list. Thus, n is 10.)
 */
package Chapter11.InheritenceAndPolymorphism.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer m: ");
        int m = input.nextInt();


        ArrayList<Integer> factors = factorize(m);
        System.out.println("Factors of " + m + ": " + factors.toString());
        ArrayList<Integer> oddTimeFactors = countOdds(factors);
        int n = multiplyIntegerList(oddTimeFactors);

        System.out.println("The smallest number 'n' for m * n to be perfect square is " + n);
        System.out.println("m * n is " + m * n);

    }

    public static ArrayList<Integer> factorize(Integer m) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= m; ) {
            if (m % i == 0 && isPrime(i)) {
                factors.add(i);
                m /= i;
            } else {
                i++;
            }
        }
        return factors;
    }

    public static ArrayList<Integer> countOdds(ArrayList<Integer> list) {
        ArrayList<Integer> fqList = new ArrayList<>();
        for (int i = 0; i < list.size(); ) {
            int numberOfCurrentElement = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    numberOfCurrentElement++;
                    list.remove(j);
                }
            }
            if (numberOfCurrentElement % 2 != 0)
                fqList.add(list.get(i));

            list.remove(i);
        }
        return fqList;
    }

    public static int multiplyIntegerList(ArrayList<Integer> list) {
        int product = 1;
        while (!list.isEmpty()) {
            product *= list.get(list.size() - 1);
            list.remove(list.size() - 1);
        }
        return product;
    }

    public static boolean isPrime(Integer x) {
        for (int i = 2; i < x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
/* OUTPUT
Enter an integer m:
1500
Factors of 1500: [2, 2, 3, 5, 5, 5]
The smallest number 'n' for m * n to be perfect square is 15
m * n is 22500

63
Factors of 63: [3, 3, 7]
The smallest number 'n' for m * n to be perfect square is 7
m * n is 441

 */