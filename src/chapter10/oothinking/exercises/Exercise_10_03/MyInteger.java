package chapter10.oothinking.exercises.Exercise_10_03;

import java.util.Arrays;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.value % 2 == 0;
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.value % 2 != 0;
    }

    public static boolean isPrime(MyInteger myInteger) {
        for (int i = 2; i < Math.sqrt(myInteger.value); i++) {
            if (myInteger.value % i == 0)
                return false;
        }
        return true;
    }

    public static int parseInt(char[] intArray) {
        int sum = 0;
        for (int ch = intArray.length - 1, order = 0; 0 <= ch; ch--, order++) {
            sum += ((intArray[ch] - 48) * Math.pow(10, order));
        }
        return sum;
    }

    public static int parseInt(String integerString) {
        return parseInt(integerString.toCharArray());
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        for (int i = 2; i < Math.sqrt(value); i++) {
            if (value % i == 0)
                return false;
        }
        return true;
    }

    public boolean equals(int value) {
        return value == this.value;
    }

    public boolean equals(MyInteger myInteger) {
        return myInteger.value == this.value;
    }


}
