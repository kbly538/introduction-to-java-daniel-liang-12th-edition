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

public class Queue {

    private static final int DEFAULT_CAPACITY = 8;
    private int[] elements;
    private int size;
    private double maxOutThreshold = 0.9;

    public Queue() {
        elements = new int[DEFAULT_CAPACITY];
    }

    public void enqueue(int value) {
        if (size / elements.length > maxOutThreshold) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, size);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int dequeue() {
        if (!empty()) {
            int temp = elements[0];
            for (int i = 0; i < elements.length - 1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
            return temp;
        } else {
            elements = new int[DEFAULT_CAPACITY];
        }
        return -1;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                ", maxOutThreshold=" + maxOutThreshold +
                '}';
    }
}
