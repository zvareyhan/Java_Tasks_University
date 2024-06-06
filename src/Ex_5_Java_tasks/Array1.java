package Ex_5_java_tasks;

public class Array1 {
    public static void main(String[] args) {
        // Creating a 10-element array
        int[] numbers = new int[10];

        // Filling the array using a "classic" for loop
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 9 - i;
        }

        // Displaying the values of the array using for-each loop
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
