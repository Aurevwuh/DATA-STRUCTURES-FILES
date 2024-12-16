/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarytree;

/**
 *
 * @author khyle
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {

    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {

    TreeNode root;

    // Insert a new node into the binary tree
    public void insert(int data) {
        if (root == null) {
            root = new TreeNode(data);
        } else {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                TreeNode current = queue.poll();

                if (current.left == null) {
                    current.left = new TreeNode(data);
                    break;
                } else {
                    queue.add(current.left);
                }

                if (current.right == null) {
                    current.right = new TreeNode(data);
                    break;
                } else {
                    queue.add(current.right);
                }
            }
        }
    }

    // Display the binary tree in a tree-like format
    public void displayTree() {
        if (root == null) {
            System.out.println("The tree is empty.");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int level = 0;
        while (!queue.isEmpty()) {
            int nodeCount = queue.size();
            System.out.println("Level " + level + ":");
            level++;

            while (nodeCount > 0) {
                TreeNode current = queue.poll();
                System.out.print(current.data + " ");

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }

                nodeCount--;
            }
            System.out.println(); // Move to the next level
        }
    }
}

public class BinaryTreeShape {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBinary Tree Menu:");
            System.out.println("1. Insert a node");
            System.out.println("2. Display the tree");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to insert: ");
                    int value = scanner.nextInt();
                    tree.insert(value);
                    System.out.println("Value inserted successfully!");
                    break;

                case 2:
                    System.out.println("Current tree structure:");
                    tree.displayTree();
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
