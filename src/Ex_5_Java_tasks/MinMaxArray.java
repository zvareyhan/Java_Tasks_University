package Ex_5_java_tasks;

import java.util.Random;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] array = new int[10];

        // Filling the array with random numbers from 1 to 100
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        // Initializing variables to store the minimum and maximum values
        int min = array[0];
        int max = array[0];

        // Finding the minimum and maximum values in the array
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Printing the array
        System.out.println("Generated array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Printing the minimum and maximum values
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}
