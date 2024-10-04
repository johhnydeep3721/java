import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Car {
    private String brand;
    private String name;
    private int horsepower;
    private double price;

    public Car(String brand, String name, int horsepower, double price) {
        this.brand = brand;
        this.name = name;
        this.horsepower = horsepower;
        this.price = price;
    }

    @Override
    public String toString() {
        return brand + "," + name + "," + horsepower + "," + price;
    }
}

public class CarDealer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cars: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for car " + (i + 1) + ":");
            System.out.print("Brand: ");
            String brand = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Horsepower: ");
            int horsepower = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            cars[i] = new Car(brand, name, horsepower, price);
        }

        // Write cars to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("car.txt"))) {
            for (Car car : cars) {
                writer.write(car.toString());
                writer.newLine();
            }
            System.out.println("Cars saved to car.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving cars to file: " + e.getMessage());
        }

        scanner.close();
    }
}