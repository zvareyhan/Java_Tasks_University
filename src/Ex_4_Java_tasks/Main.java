package Ex_Java_tasks;

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Ex_Java_tasks.Car car = new Ex_Java_tasks.Car("Model S", "Tesla", 2022, 79999.99, "Red", 10);

        // Calling and printing the toString() method
        System.out.println(car.toString());

        // Calling the sell() method
        car.sell(3);

        // Printing all fields using the get methods
        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        // Changing some fields using the set methods
        car.setModel("Model X");
        car.setBrand("Tesla");
        car.setYear(2023);
        car.setPrice(89999.99);
        car.setColor("Blue");
        car.setQuantity(15);

        // Calling and printing the toString() method again to notice the changes
        System.out.println(car.toString());
    }
}
