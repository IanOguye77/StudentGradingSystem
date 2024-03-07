package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create an instance of the Scanner
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        char userChoice;

        do {
           // ask the user for the student name
            System.out.print("Enter Student Name: ");
            String name = scanner.next();
            // create a new student object to save the student name
            Student student = new Student(name);

            // get the number of subject of the student
            System.out.print("Enter number of Subjects: ");
            int numSubjects = scanner.nextInt();
            scanner.nextLine();

            for(int i = 1; i < numSubjects; i++){
                System.out.print("Enter grade for subject " + i + ": ");
                int garde = scanner.nextInt();
                student.addGrade(garde);
            }

            students.add(student);

            // Prompt the user if they want to create another student
            System.out.print("Add another student? (y/n): ");
            userChoice = scanner.next().charAt(0);
            scanner.nextLine();

        } while(userChoice == 'y');

        // Display the Student Grades summary
        System.out.print("Students Grade Summary:");
        for (Student student : students){
            System.out.println("Student: " + student.studentName + "Average Grade: " + student.calculateAverage());
        }

        // close the scanner object
        scanner.close();
    }
}