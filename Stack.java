/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;

import java.util.Scanner;

/**
 *
 * @author khyle
 */
public class Stack {

    private int[] stack;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack overflow! Unable to push " + element);
            return;
        }
        stack[++top] = element;
        System.out.println("Pushed " + element + " onto the stack.");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! No element to pop.");
            return -1;
        }
        int poppedElement = stack[top--];
        System.out.println("Popped " + poppedElement + " from the stack.");
        return poppedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! No element to peek.");
            return -1;
        }
        System.out.println("Top element is " + stack[top]);
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the capacity of the stack: ");
        int capacity = scanner.nextInt();
        Stack stack = new Stack(capacity);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push an element");
            System.out.println("2. Pop an element");
            System.out.println("3. Peek the top element");
            System.out.println("4. Check if the stack is empty");
            System.out.println("5. Check if the stack is full");
            System.out.println("6. Get the size of the stack");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    System.out.println("Is the stack empty? " + stack.isEmpty());
                    break;

                case 5:
                    System.out.println("Is the stack full? " + stack.isFull());
                    break;

                case 6:
                    System.out.println("Current stack size: " + stack.size());
                    break;

                case 7:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
