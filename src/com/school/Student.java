package com.school;

public class Student {
    private static int nextStudentIdCounter = 1;
    int studentId;
    String name;

    public Student(String name ){
        this.name = name;
        this.studentId = nextStudentIdCounter++;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + this.studentId + ", Name: " + this.name);
    }
}