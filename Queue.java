/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue;

/**
 *
 * @author khyle
 */
import java.util.Scanner;

public class Queue {

    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue overflow! Unable to enqueue " + element);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
        System.out.println("Enqueued " + element + " to the queue.");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow! No element to dequeue.");
            return -1;
        }
        int dequeuedElement = queue[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeued " + dequeuedElement + " from the queue.");
        return dequeuedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No element to peek.");
            return -1;
        }
        System.out.println("Front element is " + queue[front]);
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the capacity of the queue: ");
        int capacity = scanner.nextInt();
        Queue queue = new Queue(capacity);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Enqueue an element");
            System.out.println("2. Dequeue an element");
            System.out.println("3. Peek the front element");
            System.out.println("4. Check if the queue is empty");
            System.out.println("5. Check if the queue is full");
            System.out.println("6. Get the size of the queue");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int element = scanner.nextInt();
                    queue.enqueue(element);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.peek();
                    break;

                case 4:
                    System.out.println("Is the queue empty? " + queue.isEmpty());
                    break;

                case 5:
                    System.out.println("Is the queue full? " + queue.isFull());
                    break;

                case 6:
                    System.out.println("Current queue size: " + queue.size());
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
