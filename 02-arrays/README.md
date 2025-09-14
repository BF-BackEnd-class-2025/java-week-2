# 📘 Array in Java

An **array** in Java is a data structure used to store multiple values of the same type in a single variable.
Instead of declaring many separate variables, arrays let you group related data together and work with them efficiently.

---

## 🔹 What is an Array?

* Array are **fixed-size** containers that hold multiple elements of the same type.
* Each element in an array is accessed using an **index** (starting at `0`).
* Array are objects in Java, stored on the heap.

✅ Key benefits:

* Store **multiple values** under one variable
* Easy to **iterate** with loops
* Useful for collections of data like scores, names, etc.

---

## 🔹 Declaring and Initializing Array

```java
public class Main 
{
    public static void main(String[] args) 
    {
        // Declaration
        int[] numbers;

        // Initialization with size
        numbers = new int[5]; // creates array of 5 integers (default 0)

        // Declaration + initialization
        int[] values = {10, 20, 30, 40, 50};
    }
}
```
---

## 🔹 Accessing Array Elements

```java
public class Main 
{
    public static void main(String[] args) 
    {
        // Declaration and initialization
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing elements
        System.out.println(numbers[0]); // first element → 1
        System.out.println(numbers[4]); // last element → 5

        // Modifying elements
        numbers[2] = 99; // modify third element
        System.out.println(numbers[2]); // now → 99
    }
}
```

⚠️ Trying to access an index outside the array size (e.g., `numbers[10]`) will 
throw **`ArrayIndexOutOfBoundsException`**.

---

## 🔹 Traversing Array

### Using a `for` loop:

```java
public class Main 
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5};

        // Using a for loop to traverse the array
        for (int i = 0; i < numbers.length; i++) 
        {
            System.out.println(numbers[i]);
        }
    }
}
```

### Using an enhanced `for` loop:

```java
public class Main 
{
    public static void main(String[] args) 
    {
        int[] numbers = {1, 2, 3, 4, 5};

        // Using an enhanced for loop to traverse the array
        for (int num : numbers) 
        {
            System.out.println(num);
        }
    }
}
```

---

## 🔹 Common Operations with Array

```java
import java.util.Array;

public class Example 
{
    public static void main(String[] args) 
    {
        int[] data = {42, 7, 19, 73, 5};

        // Print array as a string
        System.out.println(Array.toString(data));

        // Sort the array
        Array.sort(data);
        System.out.println("Sorted: " + Array.toString(data));

        // Copy the array
        int[] copy = Array.copyOf(data, data.length);
        System.out.println("Copy: " + Array.toString(copy));
    }
}
```

📌 Output:

```
[42, 7, 19, 73, 5]
Sorted: [5, 7, 19, 42, 73]
Copy: [5, 7, 19, 42, 73]
```

---

## 🔹 Example Program

```java
public class AverageCalculator 
{
    public static void main(String[] args)
    {
        int[] scores = {90, 85, 78, 92, 88};
        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        double average = (double) sum / scores.length;
        System.out.println("Average score: " + average);
    }
}
```

📌 Output:

```
Average score: 86.6
```

---

## 🔹 Best Practices

* Always check the **array length** before accessing elements.
* Prefer **enhanced for loops** when you don’t need the index.
* For complex operations, use the **`Array` utility class**.
* Use **collections (like `ArrayList`)** when you need dynamic resizing.
