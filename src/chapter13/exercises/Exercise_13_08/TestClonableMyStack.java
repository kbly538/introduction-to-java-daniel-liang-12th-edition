/*
(Revise the MyStack class) Rewrite the MyStack class in Listing 11.10 to perform
a deep copy of the list field.
 */
package chapter13.exercises.Exercise_13_08;

public class TestClonableMyStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(3);
        stack.push(24);

        MyStack cloneStack = stack.clone();
        cloneStack.push(12);
        cloneStack.push(666);


        System.out.println("Stack: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("Clone stack: ");
        while (!cloneStack.isEmpty()) {
            System.out.println(cloneStack.pop());
        }


    }
}

/* OUTPUT
Stack:
24
3
1
Clone stack:
666
12
24
3
1
 */
