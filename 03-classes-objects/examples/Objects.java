/**
 * Example demonstrating Classes and Objects in Java.
 */

public class Objects
{
    public static void main(String[] args)
    {
        // Create objects
        Car car1 = new Car("Toyota", "Red", 2022);
        Car car2 = new Car("Tesla", "Black", 2023);

        // Access fields
        System.out.println("Car 1: " + car1.brand + " - " + car1.color);
        System.out.println("Car 2: " + car2.brand + " - " + car2.color);

        // Call methods
        car1.drive();
        car1.honk();

        car2.drive();
        car2.honk();
    }
}

class Car
{
    // Fields (attributes)
    String brand;
    String color;
    int year;

    // Constructor
    public Car(String brand, String color, int year)
    {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    // Method (behavior)
    public void drive()
    {
        System.out.println(brand + " (" + color + ", " + year + ") is driving...");
    }

    public void honk()
    {
        System.out.println(brand + " says: Beep beep!");
    }
}