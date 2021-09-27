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
