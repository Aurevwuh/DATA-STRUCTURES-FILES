/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylistpracticeprobs;

/**
 *
 * @author khyle
 */

   import java.util.ArrayList;
import java.util.Scanner;

public class GradeTracker {

    public static void main(String[] args) {
        ArrayList<Double> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nGrade Tracker");
            System.out.println("1. Add a grade");
            System.out.println("2. Compute average grade");
            System.out.println("3. Find highest and lowest grades");
            System.out.println("4. Display all grades");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the grade to add: ");
                    double grade = scanner.nextDouble();
                    grades.add(grade);
                    System.out.println("Grade added successfully!");
                    break;

                case 2:
                    if (grades.isEmpty()) {
                        System.out.println("No grades available to calculate average.");
                    } else {
                        double sum = 0;
                        for (double g : grades) {
                            sum += g;
                        }
                        double average = sum / grades.size();
                        System.out.println("Average Grade: " + average);
                    }
                    break;

                case 3:
                    if (grades.isEmpty()) {
                        System.out.println("No grades available to find highest and lowest.");
                    } else {
                        double highest = grades.get(0);
                        double lowest = grades.get(0);
                        for (double g : grades) {
                            if (g > highest) {
                                highest = g;
                            }
                            if (g < lowest) {
                                lowest = g;
                            }
                        }
                        System.out.println("Highest Grade: " + highest);
                        System.out.println("Lowest Grade: " + lowest);
                    }
                    break;

                case 4:
                    if (grades.isEmpty()) {
                        System.out.println("No grades available.");
                    } else {
                        System.out.println("Grades:");
                        for (double g : grades) {
                            System.out.println(g);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting Grade Tracker. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


