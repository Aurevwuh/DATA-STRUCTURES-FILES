/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linearsearchuserinputlab;

/**
 *
 * @author khyle
 */
import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchUserInputLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size from 10 to 20: ");
        int size = sc.nextInt();
        if (size < 10 || size > 20) {
            System.out.println("Invalid size. Enter a size between 10 and 20.");
            return;

        }
        int[] array = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the number u want to find: ");
        int number = sc.nextInt();

        ArrayList<Integer> indices = linearSearch(array, number);

        if (indices.isEmpty()) {
            System.out.println("Number(s) " + number + " not found in the array.");
        } else {
            System.out.println("Number(s) " + number + " found at the following indices: " + indices);
        }

        sc.close();
    }

    public static ArrayList<Integer> linearSearch(int[] arr, int target) {
        ArrayList<Integer> indices = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                indices.add(i);
            }
        }

        return indices;
    }
}
