/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist;

/**
 *
 * @author khyle
 */

import java.util.Scanner;

class LinkedList {

    // Node class to represent each element in the linked list
    static class Node {

        int data; // Data of the node
        Node next; // Reference to the next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Head (start) of the linked list

    // Add a new element at the end of the linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) { // If the list is empty
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) { // Traverse to the end
                current = current.next;
            }
            current.next = newNode; // Add new node at the end
        }
        System.out.println(data + " added to the list.");
    }

    // Remove the first occurrence of a specified value
    public void remove(int data) {
        if (head == null) { // If the list is empty
            System.out.println("The list is empty. Nothing to remove.");
            return;
        }

        if (head.data == data) { // If the value is in the head
            head = head.next;
            System.out.println(data + " removed from the list.");
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) { // Search for the value
            current = current.next;
        }

        if (current.next == null) { // Value not found
            System.out.println(data + " not found in the list.");
        } else { // Value found
            current.next = current.next.next;
            System.out.println(data + " removed from the list.");
        }
    }

    // Display all elements in the linked list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) { // Traverse and print each node
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method for user interaction
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add an element");
            System.out.println("2. Remove an element");
            System.out.println("3. Display the list");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Add
                    System.out.print("Enter the value to add: ");
                    int addValue = scanner.nextInt();
                    list.add(addValue);
                    break;

                case 2: // Remove
                    System.out.print("Enter the value to remove: ");
                    int removeValue = scanner.nextInt();
                    list.remove(removeValue);
                    break;

                case 3: // Display
                    list.display();
                    break;

                case 4: // Exit
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

    
