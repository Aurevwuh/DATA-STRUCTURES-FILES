/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistpracticeprobs;

/**
 *
 * @author khyle
 */
 

 import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTo-Do List Manager");
            System.out.println("1. Add a task");
            System.out.println("2. Remove a completed task");
            System.out.println("3. Display all tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the task to add: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    System.out.print("Enter the task to remove: ");
                    String removeTask = scanner.nextLine();
                    if (tasks.remove(removeTask)) {
                        System.out.println("Task removed successfully!");
                    } else {
                        System.out.println("Task not found!");
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks in the to-do list.");
                    } else {
                        System.out.println("Your tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting To-Do List Manager. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
