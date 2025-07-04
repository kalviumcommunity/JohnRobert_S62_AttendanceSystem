
package com.school;

public class Course {
    private static int nextCourseIdCounter = 101;
    String courseId; // e.g., "CS101"
    String courseName;

    public Course(String courseName) {
        this.courseId = "CS" + nextCourseIdCounter++;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayDetails() {
        System.out.println("Course ID: " + this.courseId + ", Name: " + this.courseName);
    }
}