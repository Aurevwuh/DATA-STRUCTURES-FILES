/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARRAYLIST;

/**
 *
 * @author khyle
 */
import java.util.ArrayList;
import java.util.Scanner;

class Student {

    private int id;
    private String name;
    private double grade;

    
    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

   
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}

public class ArrayListACT2 {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student by ID");
            System.out.println("3. Display all students");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: 
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Student Grade: ");
                    double grade = scanner.nextDouble();

                    students.add(new Student(id, name, grade));
                    System.out.println("Student added successfully!");
                    break;

                case 2: 
                    System.out.print("Enter the Student ID to remove: ");
                    int removeId = scanner.nextInt();
                    boolean removed = false;

                  
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getId() == removeId) {
                            students.remove(i);
                            System.out.println("Student with ID " + removeId + " removed.");
                            removed = true;
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Student with ID " + removeId + " not found.");
                    }
                    break;

                case 3: 
                    if (students.isEmpty()) {
                        System.out.println("No students in the list.");
                    } else {
                        System.out.println("Student List:");
                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }
                    break;

                case 4: 
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
