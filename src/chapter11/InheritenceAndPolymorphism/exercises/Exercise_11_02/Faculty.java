/*
(The Person, Student, Employee, Faculty, and Staff classes) Design a class
named Person and its two subclasses named Student and Employee. Make
Faculty and Staff subclasses of Employee. A person has a name, address,
phone number, and e-mail address. A student has a class status (freshman, sophomore,
junior, or senior). Define the status as a constant. An employee has an
office, salary, and date hired. Use the MyDate class defined in Programming
Exercise 10.14 to create an object for date hired. A faculty member has office
hours and a rank. A staff member has a title. Override the toString method in
each class to display the class name and the person’s name.
Draw the UML diagram for the classes and implement them. Write a test program
that creates a Person, Student, Employee, Faculty, and Staff, and invokes
their toString() methods.
 */
package chapter11.InheritenceAndPolymorphism.exercises.Exercise_11_02;

import chapter10.oothinking.exercises.Exercise_10_14.MyDate;

public class Faculty extends Employee {

    private String officeHours;
    private String rank;


    public Faculty() {
        super(new MyDate());
    }


    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString() {
        return "Class: Person \n" + getClass().getName() +
                "--- Person's name: " + this.getName();
    }
}
