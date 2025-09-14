/**
 * This class demonstrates various examples of methods in Java.
 * It includes methods with different parameter and return types,
 * as well as method overloading.
 */

public class Methods
{
    // Main method
    public static void main(String[] args)
    {
        // 1. Call simple method
        sayHello();

        // 2. Call method with parameter
        greet("Alice");

        // 3. Call method with parameters and return value
        int sum = add(5, 10);
        System.out.println("Sum: " + sum);

        // 4. Call method with return value only
        double pi = getPi();
        System.out.println("Value of Pi: " + pi);

        // 5. Method overloading examples
        printInfo(42);
        printInfo("Java is awesome!");
    }

    // 1. A simple method with no parameters and no return value
    public static void sayHello()
    {
        System.out.println("Hello from sayHello()!");
    }

    // 2. A method with parameters but no return value
    public static void greet(String name)
    {
        System.out.println("Hello, " + name + "!");
    }

    // 3. A method with parameters and a return value
    public static int add(int a, int b)
    {
        return a + b;
    }

    // 4. A method with no parameters but a return value
    public static double getPi()
    {
        return 3.14159;
    }

    // 5. Method overloading (same name, different parameter list)
    public static void printInfo(int number)
    {
        System.out.println("Number: " + number);
    }

    public static void printInfo(String text)
    {
        System.out.println("Text: " + text);
    }
}

