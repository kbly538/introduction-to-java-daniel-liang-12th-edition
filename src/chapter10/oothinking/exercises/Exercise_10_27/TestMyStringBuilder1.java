package chapter10.oothinking.exercises.Exercise_10_27;

public class TestMyStringBuilder1 {

    public static void main(String[] args) {

        MyStringBuilder1 myString1 = new MyStringBuilder1("Java is a typed language.");
        MyStringBuilder1 myString2 = new MyStringBuilder1("Python is not a typed language.");


        System.out.println("Append with another builder: " + myString1.append(myString2));
        System.out.println("Append with int: " + myString1.append(555));
        System.out.println("Length: " + myString1.length());
        System.out.println("Lowercase: " + myString1.toLowerCase());
        System.out.println("Substring: " + myString2.substring(5, 10));
        System.out.println("myString1 to string: " + myString1.toString());
        System.out.println("myString2 to string: " + myString2.toString());


    }

}
