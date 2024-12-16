/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortinglabacts;

/**
 *
 * @author khyle
 */

import java.util.Random;
import java.util.Arrays;

public class SortingLabActs {

    // Bubble Sort
    public static void bubbleSort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap array[i] and array[minIndex]
            double temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(double[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            double key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
    // Generate an array of 100 random double values between 0 and 100
    Random random = new Random();
    double[] array = new double[100];
    for (int i = 0; i < array.length; i++) {
        array[i] = random.nextDouble() * 100;
    }

    System.out.println("Original Array:");
    System.out.println(Arrays.toString(array));

    // Measure performance of Bubble Sort
    double[] bubbleArray = Arrays.copyOf(array, array.length);
    long startTime = System.nanoTime();
    bubbleSort(bubbleArray);
    long endTime = System.nanoTime();
    double durationInSeconds = (endTime - startTime) / 1_000_000_000.0;
    System.out.println("\nBubble Sort Result:");
    System.out.println(Arrays.toString(bubbleArray));
    System.out.printf("Bubble Sort Execution Time: %.9f seconds%n", durationInSeconds);

    // Measure performance of Selection Sort
    double[] selectionArray = Arrays.copyOf(array, array.length);
    startTime = System.nanoTime();
    selectionSort(selectionArray);
    endTime = System.nanoTime();
    durationInSeconds = (endTime - startTime) / 1_000_000_000.0;
    System.out.println("\nSelection Sort Result:");
    System.out.println(Arrays.toString(selectionArray));
    System.out.printf("Selection Sort Execution Time: %.9f seconds%n", durationInSeconds);

    // Measure performance of Insertion Sort
    double[] insertionArray = Arrays.copyOf(array, array.length);
    startTime = System.nanoTime();
    insertionSort(insertionArray);
    endTime = System.nanoTime();
    durationInSeconds = (endTime - startTime) / 1_000_000_000.0;
    System.out.println("\nInsertion Sort Result:");
    System.out.println(Arrays.toString(insertionArray));
    System.out.printf("Insertion Sort Execution Time: %.9f seconds%n", durationInSeconds);
}
}