/* Listing 11.10 */
package chapter11.InheritenceAndPolymorphism.listings;

import java.util.ArrayList;

public class MyStack {

    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return false;
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
}
