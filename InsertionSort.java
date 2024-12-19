/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertionsort;

/**
 *
 * @author khyle
 */
/**
 * @param args the command line arguments
 */
import java.util.Scanner;

public class InsertionSort {

    // Method to perform Insertion Sort and display each step
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        System.out.println("Initial Array: ");
        printArray(arr);

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            System.out.println("\nPass " + i + ":");

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                printArray(arr); // Display the array after each shift
            }
            arr[j + 1] = key;

            // Display the array after inserting the key
            printArray(arr);
        }

        System.out.println("\nSorted Array: ");
        printArray(arr);
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take array input from the user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Perform Insertion Sort
        insertionSort(arr);

        scanner.close();
    }
}
