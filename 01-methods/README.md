# 📘 Methods in Java

Methods in Java (sometimes called *functions* in other programming languages) are blocks of code designed
to perform a specific task. They help us organize programs, avoid code duplication, and improve readability.

---

## 🔹 What is a Method?

A **method** is a collection of statements that are grouped together to perform an operation.
In Java, every method must belong to a class.

✅ Key benefits:

* **Reusability** – write once, use multiple times
* **Readability** – clean and modular code
* **Maintainability** – easy to debug and update

---

## 🔹 Syntax of a Method

```java
public  class ClassName 
{
    // method definition
    modifier returnType methodName(parameters) 
    {
        // method body
        // statements
        return value; // if returnType is not void
    }
}
```

### Components:

* **modifier** → defines access (e.g., `public`, `private`)
* **returnType** → data type of value returned (use `void` if no return)
* **methodName** → should be descriptive and follow camelCase convention
* **parameters** → (optional) values passed into the method

---

## 🔹 Example 1: Simple Method

```java
public class Greeting 
{
    public static void main(String[] args)
    {
        sayHello(); // method call
    }
    // method definition
    public static void sayHello() 
    {
        System.out.println("Hello, Java!");
    }
}
```

📌 Output:

```
Hello, Java!
```

---

## 🔹 Example 2: Method with Parameters

```java
public class MathUtils 
{
    public static void main(String[] args)
    {
        int sum = add(5, 7);
        System.out.println("Sum: " + sum);
    }
    
    public static int add(int a, int b) 
    {
        return a + b;
    }
}
```

📌 Output:

```
Sum: 12
```

---

## 🔹 Example 3: Method Overloading

Java allows multiple methods with the **same name** but different **parameters** (number or type).

```java
public class Printer 
{
    public static void main(String[] args) 
    {
        print(100);
        print("Java is fun!");
    }
    public static void print(int number) 
    {
        System.out.println("Printing integer: " + number);
    }

    public static void print(String text) 
    {
        System.out.println("Printing string: " + text);
    }
}
```

📌 Output:

```
Printing integer: 100
Printing string: Java is fun!
```

---

## 🔹 Types of Methods

1. **Predefined methods** → already available in Java libraries

    * Example: `System.out.println()`, `Math.sqrt()`
2. **User-defined methods** → created by the programmer

---

## 🔹 Best Practices

* Use **descriptive names** for methods (e.g., `calculateArea()` instead of `doStuff()`)
* Keep methods **short and focused** on one task
* Use **camelCase** for method names
* Minimize the number of parameters when possible

