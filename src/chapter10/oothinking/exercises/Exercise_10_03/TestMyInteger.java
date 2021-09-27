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

public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger integer1 = new MyInteger(37);
        MyInteger integer2 = new MyInteger(126);
        MyInteger integer3 = new MyInteger(37);


        System.out.println();
        System.out.println("integer1.equals(37):  " + integer1.equals(37));
        System.out.println("integer1.equals(23): " + integer1.equals(23));
        System.out.println("integer2.equals(integer1): " + integer1.equals(integer2));
        System.out.println("integer3.equals(integer1): " + integer3.equals(integer1));
        System.out.println("integer1.equals(integer3): " + integer1.equals(integer3));
        System.out.println();
        System.out.println("getValue() for integer1: " + integer1.getValue());
        System.out.println("getValue() for integer2: " + integer2.getValue());
        System.out.println("getValue() for integer3: " + integer3.getValue());
        System.out.println();
        System.out.println("isEven() for integer1: " + integer1.isEven());
        System.out.println("isEven() for integer2: " + integer2.isEven());
        System.out.println("isEven() for integer3: " + integer3.isEven());
        System.out.println();
        System.out.println("isOdd() for integer1: " + integer1.isOdd());
        System.out.println("isOdd() for integer2: " + integer2.isOdd());
        System.out.println("isOdd() for integer3: " + integer3.isOdd());
        System.out.println();
        System.out.println("isPrime() for integer1: " + integer1.isPrime());
        System.out.println("isPrime() for integer2: " + integer2.isPrime());
        System.out.println("isPrime() for integer3: " + integer3.isPrime());
        System.out.println();
        System.out.println("Static methods: ");
        System.out.println("MyInteger.isEven(integer1): " + MyInteger.isEven(integer1));
        System.out.println("MyInteger.isEven(integer2): " + MyInteger.isEven(integer2));
        System.out.println("MyInteger.isEven(integer3): " + MyInteger.isEven(integer3));
        System.out.println();
        System.out.println("MyInteger.isOdd(integer1): " + MyInteger.isOdd(integer1));
        System.out.println("MyInteger.isOdd(integer2): " + MyInteger.isOdd(integer2));
        System.out.println("MyInteger.isOdd(integer3): " + MyInteger.isOdd(integer3));
        System.out.println();
        System.out.println("MyInteger.isPrime(integer1): " + MyInteger.isPrime(integer1));
        System.out.println("MyInteger.isPrime(integer2): " + MyInteger.isPrime(integer2));
        System.out.println("MyInteger.isPrime(integer3): " + MyInteger.isPrime(integer3));
        System.out.println();
        System.out.println("MyInteger.parseInt(charArray 57): " + MyInteger.parseInt(new char[]{'5', '7'}));
        System.out.println("MyInteger.parseInt(String 57): " + MyInteger.parseInt("57"));

    }
}

/* OUTPUT

integer1.equals(37):  true
integer1.equals(23): false
integer2.equals(integer1): false
integer3.equals(integer1): true
integer1.equals(integer3): true

getValue() for integer1: 37
getValue() for integer2: 126
getValue() for integer3: 37

isEven() for integer1: false
isEven() for integer2: true
isEven() for integer3: false

isOdd() for integer1: true
isOdd() for integer2: false
isOdd() for integer3: true

isPrime() for integer1: true
isPrime() for integer2: false
isPrime() for integer3: true

Static methods:
MyInteger.isEven(integer1): false
MyInteger.isEven(integer2): true
MyInteger.isEven(integer3): false

MyInteger.isOdd(integer1): true
MyInteger.isOdd(integer2): false
MyInteger.isOdd(integer3): true

MyInteger.isPrime(integer1): true
MyInteger.isPrime(integer2): false
MyInteger.isPrime(integer3): true

MyInteger.parseInt(charArray 57): 57
MyInteger.parseInt(String 57): 57
 */