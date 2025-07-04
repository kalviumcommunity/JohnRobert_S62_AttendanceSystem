package com.school;

import java.util.ArrayList;
import java.util.List;

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

        System.out.println("\nSession 3: New Student and Course Added.");

        // Attendance
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        AttendanceRecord record1 = new AttendanceRecord(student1.getStudentId(), course1.getCourseId(), "Present");
        AttendanceRecord record2 = new AttendanceRecord(student2.getStudentId(), course1.getCourseId(), "Absent");
        AttendanceRecord record3 = new AttendanceRecord(student3.getStudentId(), course2.getCourseId(), "Late");

        attendanceLog.add(record1);
        attendanceLog.add(record2);
        attendanceLog.add(record3);

        System.out.println("\nAttendance Records:");
        for (AttendanceRecord record : attendanceLog) {
            record.displayDetails();
        }
    }
}
