package Ex_5_java_tasks;

import java.util.Scanner;

public class Concatenating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two strings
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        // Concatenate the strings
        String concatenatedString1 = firstString.concat(secondString);
        String concatenatedString2 = secondString.concat(firstString);

        // Check if the compositions are alternating
        boolean isAlternating1 = isAlternating(concatenatedString1);
        boolean isAlternating2 = isAlternating(concatenatedString2);

        // Output the result
        System.out.println("Concatenated string 1: " + concatenatedString1);
        System.out.println("Concatenated string 2: " + concatenatedString2);
        System.out.println("Are the compositions alternating?");
        System.out.println("For concatenated string 1: " + isAlternating1);
        System.out.println("For concatenated string 2: " + isAlternating2);
    }

    // Method to check if a string has alternating characters
    private static boolean isAlternating(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}

