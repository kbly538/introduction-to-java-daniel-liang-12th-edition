/*
(The Queue class) Section 10.6 gives a class for Stack. Design a class named
Queue for storing integers. Like a stack, a queue holds elements. In a stack, the
elements are retrieved in a last-in first-out fashion. In a queue, the elements are
retrieved in a first-in first-out fashion. The class contains:
■■ An int[] data field named elements that stores the int values in the queue.
■■ A data field named size that stores the number of elements in the queue.
■■ A constructor that creates a Queue object with default capacity 8.
■■ The method enqueue(int v) that adds v into the queue.
■■ The method dequeue() that removes and returns the element from the queue.
■■ The method empty() that returns true if the queue is empty.
■■ The method getSize() that returns the size of the queue.
Draw an UML diagram for the class. Implement the class with the initial array size
set to 8. The array size will be doubled once the number of the elements exceeds
the size. After an element is removed from the beginning of the array, you need
to shift all elements in the array one position to the left. Write a test program that
adds 20 numbers from 1 to 20 into the queue then removes these numbers and
displays them.
 */
package chapter10.oothinking.exercises.Exercise_10_10;

import java.util.Arrays;

public class TestQueue {

    public static void main(String[] args) {
        Queue q = new Queue();

        for (int i = 2; i < 20; i++) {
            q.enqueue(i);
        }

        System.out.println(q.toString());
        System.out.println("After dequeue");
        q.dequeue();
        q.dequeue();
        System.out.println(q.toString());

        System.out.println("Empty? " + q.empty());
        for (int i = 0; i < 20; i++) {
            q.dequeue();
        }
        System.out.println(q.toString());
        System.out.println("Empty? " + q.empty());
    }


}


/* OUTPUT
Queue{elements=[2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], size=18, maxOutThreshold=0.9}
After dequeue
Queue{elements=[4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], size=16, maxOutThreshold=0.9}
Empty? false
Queue{elements=[0, 0, 0, 0, 0, 0, 0, 0], size=0, maxOutThreshold=0.9}
Empty? true
 */