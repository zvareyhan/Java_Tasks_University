package Ex_5_java_tasks;

public class Array10 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        // Fill the diagonal with numbers from 0 to 9
        for (int i = 0; i < 10; i++) {
            matrix[i][i] = i;
        }

        // Fill the rest of the matrix with 0
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i != j) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Calculate the sum of the diagonal elements
        int sumDiagonal = 0;
        for (int i = 0; i < 10; i++) {
            sumDiagonal += matrix[i][i];
        }

        // Display the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Display the sum of diagonal elements
        System.out.println("Sum of diagonal elements: " + sumDiagonal);
    }
}
