package chapter10.oothinking.exercises.Exercise_10_28;

public class TestMyStringBuilder2 {

    public static void main(String[] args) {

        MyStringBuilder2 myString1 = new MyStringBuilder2();
        MyStringBuilder2 myString2 = new MyStringBuilder2(new char[]{'r', 'a', 'm'});
        MyStringBuilder2 myString3 = new MyStringBuilder2("Remaining");

        System.out.println("Insertion: " + myString2.insert(2, myString3).toString());
        System.out.println("Reverse: " + myString3.reverse().toString());
        System.out.println("Substring: " + myString3.substring(4).toString());
        System.out.println("Uppercase: " + myString2.toUpperCase().toString());
        System.out.println("No arg constructor: " + myString1.toString());
        System.out.println("No arg + insertion: " + myString1.insert(0, myString3));
    }
}

/* OUTPUT
Insertion: raRemainingm
Reverse: gniniameR
Substring: ining
Uppercase: RAM
No arg constructor:
No arg + insertion: Remaining
 */