/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;

/**
 *
 * @author khyle
 */
import java.util.Scanner;

public class BubbleSort {

    // Method to perform Bubble Sort and display each step
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        System.out.println("Initial Array: ");
        printArray(arr);

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            System.out.println("\nPass " + (i + 1) + ":");

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
                // Display the array after each comparison
                printArray(arr);
            }

            if (!swapped) {
                // If no two elements were swapped, the array is sorted
                break;
            }
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

        // Perform Bubble Sort
        bubbleSort(arr);

        scanner.close();
    }
}
