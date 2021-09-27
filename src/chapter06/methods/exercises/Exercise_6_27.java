/*
(Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number
whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so
17 and 71 are emirps. Write a program that displays the first 100 emirps. Display
10 numbers per line, separated by exactly one space, as follows:
13 17 31 37 71 73 79 97 107 113
149 157 167 179 199 311 337 347 359 389
...

 */
package chapter06.methods.exercises;

public class Exercise_6_27 {
    public static void main(String[] args) {

        int emirpMatchCounter = 0;

        for (int i = 10; emirpMatchCounter < 100; i++) {

            if (isEmirp(i)) {
                System.out.printf("%5d ", i);
                emirpMatchCounter++;
                // 10 emirps per line
                if (emirpMatchCounter % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }

    public static boolean isPrime(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;

        }
        return true;
    }

    public static boolean isEmirp(int num) {
        String reverseNum = "";
        String numString = num + "";

        for (int i = 0; i < numString.length(); i++) {
            reverseNum = numString.charAt(i) + reverseNum;
        }

        return isPrime(num)
                && isPrime(Integer.parseInt(reverseNum))
                && num != Integer.parseInt(reverseNum);
    }


}
/* OUTPUT
   13    17    31    37    71    73    79    97   107   113
  149   157   167   179   199   311   337   347   359   389
  701   709   733   739   743   751   761   769   907   937
  941   953   967   971   983   991  1009  1021  1031  1033
 1061  1069  1091  1097  1103  1109  1151  1153  1181  1193
 1201  1213  1217  1223  1229  1231  1237  1249  1259  1279
 1283  1301  1321  1381  1399  1409  1429  1439  1453  1471
 1487  1499  1511  1523  1559  1583  1597  1601  1619  1657
 1669  1723  1733  1741  1753  1789  1811  1831  1847  1867
 1879  1901  1913  1933  1949  1979  3011  3019  3023  3049
*/