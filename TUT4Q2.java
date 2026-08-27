import java.util.Scanner;

class Student {
    int rollNumber;
    String studentName;
    double[] marks = new double[3];
    double attendance;
    double total, average;
    String result, scholarship, performance;

    Student(int rollNumber, String studentName, double[] marks, double attendance) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
        this.attendance = attendance;
    }

    void calculate() {
        total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        average = total / marks.length;

        // Single-line decision making using ternary operator
        result = (average >= 50) ? "Pass" : "Fail";
        scholarship = (average >= 75 && attendance >= 80) ? "Eligible" : "Not Eligible";
        performance = (average >= 85) ? "Excellent" : "Good";
    }

    void display() {
        System.out.println("\nRoll Number : " + rollNumber);
        System.out.println("Name : " + studentName);
        System.out.println("Total Marks : " + total);
        System.out.println("Average Marks : " + average);
        System.out.println("Result : " + result);
        System.out.println("Scholarship : " + scholarship);
        System.out.println("Performance : " + performance);
    }
}

public class TUT4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details of Student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            double[] marks = new double[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Marks in Subject " + (j + 1) + ": ");
                marks[j] = sc.nextDouble();
            }

            System.out.print("Attendance Percentage: ");
            double attendance = sc.nextDouble();

            students[i] = new Student(roll, name, marks, attendance);
        }

        Student topper = students[0];

        for (int i = 0; i < 5; i++) {
            students[i].calculate();
            students[i].display();

            if (students[i].average > topper.average) {
                topper = students[i];
            }
        }

        System.out.println("\nStudent with Highest Average: " + topper.studentName +
                " (Average: " + topper.average + ")");

        sc.close();
    }
}
