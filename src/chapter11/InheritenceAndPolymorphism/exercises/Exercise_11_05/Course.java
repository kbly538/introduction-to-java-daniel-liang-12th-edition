/*
(The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList
to replace an array to store students. Draw the new UML diagram for the class.
You should not change the original contract of the Course class (i.e., the definition
of the constructors and methods should not be changed, but the private
members may be changed.)
*/
package chapter11.InheritenceAndPolymorphism.exercises.Exercise_11_05;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public void dropStudent(String student) {
        if (students.contains(student))
            students.remove(student);
        else
            System.out.println("Student is not enrolled.");
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<String> getStudents() {
        return (ArrayList<String>) students.clone();
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public void clear() {
        students.clear();
    }

}
