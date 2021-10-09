/*
(Use ArrayList) Write a program that creates an ArrayList and adds a Loan
object, a Date object, a string, and a Circle object to the list, and use a loop to
display all the elements in the list by invoking the object’s toString() method.
 */
package chapter11.InheritenceAndPolymorphism.exercises;

import chapter11.InheritenceAndPolymorphism.listings.GeometricObject.Circle;
import chapter10.oothinking.exercises.Exercise_10_14.MyDate;
import chapter10.oothinking.listings.Loan.Loan;

import java.util.ArrayList;

public class Exercise_11_06 {
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();

        list.add(new MyDate());
        list.add(new Loan());
        list.add(new Circle());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }

    }
}


/* OUTPUT
chapter10.oothinking.exercises.Exercise_10_14.MyDate@2344fc66
chapter10.oothinking.listings.Loan.Loan@458ad742
GeometricObject{color='White', filled=false, dateCreated=Fri Oct 01 14:25:27 EET 2021}
 */