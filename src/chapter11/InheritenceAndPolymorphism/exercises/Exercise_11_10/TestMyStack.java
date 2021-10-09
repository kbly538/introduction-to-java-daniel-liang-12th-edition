package chapter11.InheritenceAndPolymorphism.exercises.Exercise_11_10;

import java.util.Scanner;

public class TestMyStack {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");

        MyStack stack = new MyStack();
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }

        System.out.println(stack.toString());

        for (int i = 0; i < 5; i++) {
            System.out.print(stack.pop() + " ");
        }

    }
}

/* OUTPUT
Enter 5 numbers:
1 2 3 4 5
Stack: [1, 2, 3, 4, 5]
5 4 3 2 1
 */
