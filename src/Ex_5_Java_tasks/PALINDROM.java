package Ex_5_java_tasks;

import java.util.Scanner;

public class PALINDROM {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Convert the word to lowercase
        word = word.toLowerCase();

        // Check if the word is a palindrome
        if (isPalindrome(word)) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // Iterate through the string from both ends
        while (left < right) {
            // If characters at current positions don't match, it's not a palindrome
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true; // If the loop completes, the string is a palindrome
    }
}

