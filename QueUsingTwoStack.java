/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khyle
 */
import java.util.Stack;

class QueueUsingTwoStacks {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int data) {
        stack1.push(data);
        System.out.println("Enqueued " + data);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public void printQueue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Stack<Integer> tempStack = new Stack<>();
        while (!stack2.isEmpty()) {
            tempStack.push(stack2.pop());
        }
        while (!stack1.isEmpty()) {
            tempStack.push(stack1.pop());
        }

        while (!tempStack.isEmpty()) {
            System.out.print(tempStack.pop() + " ");
        }
        System.out.println();
    }
}

public class QueUsingTwoStack {

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.print("Queue after enqueue operations: ");
        queue.printQueue();

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.print("Queue after dequeue: ");
        queue.printQueue();
    }

}
