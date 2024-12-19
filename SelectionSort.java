/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selectionsort;

/**
 *
 * @author khyle
 */
/**
 * @param args the command line arguments
 */
import java.util.Scanner;

public class SelectionSort {

    // Method to perform Selection Sort and display each step
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        System.out.println("Initial Array: ");
        printArray(arr);

        for (int i = 0; i < n - 1; i++) {
            // Assume the minimum is the first element
            int minIndex = i;

            System.out.println("\nPass " + (i + 1) + ":");

            // Find the minimum element in the remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted array
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

            // Display the array after each pass
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

        // Perform Selection Sort
        selectionSort(arr);

        scanner.close();
    }
}
