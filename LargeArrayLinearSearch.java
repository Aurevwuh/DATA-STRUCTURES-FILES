/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package largearraylinearsearch;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author khyle
 */
public class LargeArrayLinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final int arraySize = 1000000000;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int number = sc.nextInt();

        System.out.println("Generating the array");
        int[] largeArray = generateLargeArray(arraySize);

        System.out.println("Starting the search...");
        long startTime = System.nanoTime();
        int index = linearSearch(largeArray, number);
        long endTime = System.nanoTime();

        if (index != -1) {
            System.out.println("Target value " + number + " found at index: " + index);
        } else {
            System.out.println("Target value " + number + " not found in the array.");
        }

        double duration = (endTime - startTime) / 1000000000.0;
        System.out.println("Time taken for the search: " + duration + " seconds");

        sc.close();
    }

    public static int[] generateLargeArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(1000000000) + 1;
        }

        return array;
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
    
    

