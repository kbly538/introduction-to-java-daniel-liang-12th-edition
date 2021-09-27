/*
(The MyInteger class) Design a class named MyInteger. The class contains:
■■ An int data field named value that stores the int value represented by
this object.
■■ A constructor that creates a MyInteger object for the specified int value.
■■ A getter method that returns the int value.
■■ The methods isEven(), isOdd(), and isPrime() that return true if the
value in this object is even, odd, or prime, respectively.
■■ The static methods isEven(int), isOdd(int), and isPrime(int) that
return true if the specified value is even, odd, or prime, respectively.
■■ The static methods isEven(MyInteger), isOdd(MyInteger), and
isPrime(MyInteger) that return true if the specified value is even, odd,
or prime, respectively.
■■ The methods equals(int) and equals(MyInteger) that return true if
the value in this object is equal to the specified value.
■■ A static method parseInt(char[]) that converts an array of numeric
characters
to an int value.
■■ A static method parseInt(String) that converts a string into an int value.
Draw the UML diagram for the class then implement the class. Write a client
program that tests all methods in the class.
 */
package chapter10.oothinking.exercises.Exercise_10_03;

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
        for (int i = 2; i <= Math.sqrt(myInteger.value); i++) {
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
