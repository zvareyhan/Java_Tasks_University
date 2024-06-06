package Ex_Java_tasks;

import java.util.Scanner;

public class RectangleArea {
    private double length;
    private double width;
    private double area;

    // Method to get data from the user
    public void getData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        this.length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        this.width = scanner.nextDouble();
    }

    // Method to compute the area of the rectangle
    public void computeField() {
        this.area = this.length * this.width;
    }

    // Method to display the area of the rectangle
    public void fieldDisplay() {
        System.out.println("The area of the rectangle is: " + this.area);
    }

    public static void main(String[] args) {
        // Create an object of RectangleArea
        RectangleArea rectangle = new RectangleArea();

        // Call methods on the rectangle object
        rectangle.getData();
        rectangle.computeField();
        rectangle.fieldDisplay();
    }
}
