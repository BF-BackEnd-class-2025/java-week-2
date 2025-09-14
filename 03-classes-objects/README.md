# Classes and Objects in Java

Java is an **object-oriented programming language** (OOP).  
This means most of the logic is built around **objects** — real-world entities that have **state** (data/fields) and **behavior** (methods).

---

## 🔹 What is a Class?

A **class** is a blueprint or template that defines:
- **Fields (attributes)** → variables that represent the state of an object.
- **Methods (functions)** → actions/behaviors the object can perform.

Think of a **class** as a **recipe** and an **object** as the **dish made from that recipe**.

### Example:
```java
// Class definition
public class Car 
{
    // Fields (attributes)
    String brand;
    String color;
    int year;

    // Method (behavior)
    public void drive() 
    {
        System.out.println("The car is driving...");
    }

    public void honk() 
    {
        System.out.println("Beep beep!");
    }
}
````

---

## 🔹 What is an Object?

An **object** is an instance of a class.
You create objects using the `new` keyword.

### Example:

```java
public class Main 
{
    public static void main(String[] args) 
    {
        // Create an object (instance) of Car
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.color = "Red";
        myCar.year = 2022;

        // Access fields
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Color: " + myCar.color);

        // Call methods
        myCar.drive();
        myCar.honk();
    }
}
```

**Output:**

```
Brand: Toyota
Color: Red
The car is driving...
Beep beep!
```

---

## 🔹 Constructors

A **constructor** is a special method used to initialize objects.
It has the same name as the class and **no return type**.

```java
public class Car 
{
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
}
```

### Usage:

```java
public class Main 
{
    public static void main(String[] args) 
    {
        // Create an object using the constructor
        Car car1 = new Car("Tesla", "Black", 2023);
        System.out.println(car1.brand);  // Tesla
    }
}
```

---

## 🔹 The `this` Keyword

`this` refers to the **current object**.
It is often used to distinguish between **fields** and **parameters** with the same name.

```java
public class Student 
{
    String name;
    int age;

    public Student(String name, int age) 
    {
        this.name = name;  // "this.name" = class field
        this.age = age;    // "age" = constructor parameter
    }
}
```

---

## 🔹 Multiple Objects

You can create multiple objects from the same class.

```java
public class Main 
{
    public static void main(String[] args) 
    {
        Car car1 = new Car("BMW", "Blue", 2020);
        Car car2 = new Car("Audi", "White", 2021);

        System.out.println(car1.brand);  // BMW
        System.out.println(car2.brand);  // Audi
    }
}
```

---

## 🔹 Methods with Parameters and Return Values

```java
public class Calculator 
{
    public int add(int a, int b) 
    {
        return a + b;
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Calculator calc = new Calculator();
        int result = calc.add(5, 7);
        System.out.println("Sum: " + result); // 12
    }
}
```

---

## 🔹 Access Modifiers

Access modifiers control the **visibility** of classes, fields, and methods.

* `public` → accessible from anywhere.
* `private` → accessible only inside the class.
* `protected` → accessible in the same package and subclasses.
* (default) → accessible only within the same package.

```java
public class BankAccount 
{
    private double balance;  // private field

    public BankAccount(double balance) 
    {
        this.balance = balance;
    }

    // Getter method
    public double getBalance() 
    {
        return balance;
    }

    // Setter method
    public void deposit(double amount) 
    {
        balance += amount;
    }
}
```

---

## 🔹 Summary

* A **class** is a blueprint.
* An **object** is an instance of a class.
* **Fields** store object state.
* **Methods** define object behavior.
* **Constructors** initialize objects.
* Use **access modifiers** to control visibility.
