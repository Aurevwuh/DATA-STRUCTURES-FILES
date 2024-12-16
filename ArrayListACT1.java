/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ARRAYLIST;

/**
 *
 * @author khyle
 */



  import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListACT1 {

    public static void main(String[] args) {
      
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add an element");
            System.out.println("2. Remove an element");
            System.out.println("3. Update an element");
            System.out.println("4. Display all elements");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: 
                    System.out.print("Enter the element to add: ");
                    int addElement = scanner.nextInt();
                    list.add(addElement);
                    System.out.println(addElement + " added to the list.");
                    break;

                case 2:
                    System.out.print("Enter the index of the element to remove: ");
                    int removeIndex = scanner.nextInt();
                    if (removeIndex >= 0 && removeIndex < list.size()) {
                        int removedElement = list.remove(removeIndex);
                        System.out.println(removedElement + " removed from the list.");
                    } else {
                        System.out.println("Invalid index. No element removed.");
                    }
                    break;

                case 3: 
                    System.out.print("Enter the index of the element to update: ");
                    int updateIndex = scanner.nextInt();
                    if (updateIndex >= 0 && updateIndex < list.size()) {
                        System.out.print("Enter the new value: ");
                        int newValue = scanner.nextInt();
                        list.set(updateIndex, newValue);
                        System.out.println("Element at index " + updateIndex + " updated to " + newValue + ".");
                    } else {
                        System.out.println("Invalid index. No element updated.");
                    }
                    break;

                case 4: 
                    System.out.println("Elements in the ArrayList: " + list);
                    break;

                case 5: 
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
