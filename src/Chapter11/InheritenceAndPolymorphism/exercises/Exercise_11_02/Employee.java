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
package Chapter11.InheritenceAndPolymorphism.exercises.Exercise_11_02;

import chapter10.oothinking.exercises.Exercise_10_14.MyDate;

public class Employee extends Person {
    private String office;
    private Double salary;
    private MyDate dateHired;


    public Employee(MyDate dateHired) {
        this.dateHired = new MyDate();
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public String toString() {
        return "Class: Person \n" + getClass().getName() +
                "--- Person's name: " + this.getName();
    }
}
