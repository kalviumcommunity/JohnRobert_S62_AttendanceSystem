package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- School Attendance System ---");

        Student student1 = new Student("Alice Johnson");
        Student student2 = new Student("Bob Smith");
        Student student3 = new Student("Charlie Brown");

        Course course1 = new Course("Intro To Programming");
        Course course2 = new Course("Linear Programming");

        System.out.println("\nRegistered Students:");
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();

        System.out.println("\nAvailable Courses:");
        course1.displayDetails();
        course2.displayDetails();
        System.out.println("\nSession 2: Core Domain Modelling Complete.");

        System.out.println("New Student is added to the system.");
        Student student4 = new Student("New Student");
        Course course3 = new Course("New Course");
        student4.displayDetails();
        course3.displayDetails();

    }
}