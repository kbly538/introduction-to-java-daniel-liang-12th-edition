package chapter13.exercises.Exercise_13_08;

import java.util.ArrayList;
import java.util.Arrays;

public class MyStack implements Cloneable {

    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(list.size() - 1);
    }

    public Object pop() {
        Object temp = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return temp;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "Stack: " + list.toString();
    }

    public MyStack clone() {

        MyStack cloneStack = new MyStack();
        for (int i = 0; i < this.list.size(); i++) {
            cloneStack.push(this.list.get(i));
        }
        return cloneStack;
    }
}
