# Multidimensional Array in Java

In Java, a **multidimensional array** is simply an array of arrays.  
The most common type is the **2D array**, which can be thought of as a table with rows and columns.

---

## Declaring Array

```java
public class Main 
{
    public static void main(String[] args) 
    {
        // Declare a 2D array
        int[][] array;

        // Allocate memory for 3 rows and 4 columns
        array = new int[3][4];

        // Initialize with values
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
    }
}
````

---

## Accessing Elements

```java
public class Main 
{
    public static void main(String[] args) 
    {
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing elements
        System.out.println(numbers[0][1]); // Output: 2
        System.out.println(numbers[2][2]); // Output: 9
    }
}
```
---

## Iterating

```java
public class Main 
{
    public static void main(String[] args) 
    {
        int[][] numbers = 
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Iterating through the array
        for (int i = 0; i < numbers.length; i++) 
        {
            for (int j = 0; j < numbers[i].length; j++) 
            {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---

## Why Use Multidimensional Array?

* Represent grids or tables (e.g., chess board, sudoku, spreadsheets).
* Store images (height × width × RGB).
* Perform mathematical or scientific computations.

---


